package com.jcirmodelsquad.tcjcir.features.betterdetector;

import cpw.mods.fml.common.Optional;
import li.cil.oc.api.Network;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.Environment;
import li.cil.oc.api.network.Message;
import li.cil.oc.api.network.Node;
import li.cil.oc.api.network.Visibility;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

import java.util.List;

public class TileBetterDetector extends TileEntity implements Environment {
    public boolean activated;
    public boolean digitalOutput = true;
    public AxisAlignedBB boundingBox = null;
    public boolean lastStatus;
    protected boolean addedToNetwork = false;
    public Node node;

    private IIcon textureTop;
    private IIcon textureBottom;
    private IIcon textureFront;
    private IIcon textureSide;


    public TileBetterDetector() {
        node = Network.newNode(this, Visibility.Network).withComponent(getComponentName()).withConnector(32).create();
    }

    @Override
    public void updateEntity() {
        if (worldObj == null) {
            return;
        }

        if (!addedToNetwork) {
            addedToNetwork = true;
            Network.joinOrCreateNetwork(this);
        }

        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
        if (list != null && list.size() > 0) {
            for (Object obj : list) {

                activated = obj instanceof EntityRollingStock;

            }
        } else {
            activated = false;
        }

        if (lastStatus != activated) {
            detectorUpdated();
        }
        lastStatus = activated;
    }

    public void updateThings() {
        digitalOutput = !digitalOutput;
        Block b = worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord);
        worldObj.notifyBlocksOfNeighborChange(xCoord + 1, yCoord, zCoord, b);
        worldObj.notifyBlocksOfNeighborChange(xCoord - 1, yCoord, zCoord, b);
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord + 1, b);
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord - 1, b);
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord - 1, zCoord, b);
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord + 1, zCoord, b);
        this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, b);
    }

    @Override
    public boolean canUpdate() {
        return true;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);

      this.digitalOutput = nbttagcompound.getBoolean("digitalOutput");
        //this.trainID = nbttagcompound.getString("trainID");
        if (node != null && node.host() == this) {
            // This restores the node's  address, which is required for networks
            // to continue working without interruption across loads. If the
            // node is a power connector this is also required to restore the
            // internal energy buffer of the node.
            node.load(nbttagcompound.getCompoundTag("oc:node"));
        }
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 2, zCoord + 2);
        }
        return boundingBox;
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setBoolean("digitalOutput", this.digitalOutput);
        if (node != null && node.host() == this) {
            final NBTTagCompound nodeNbt = new NBTTagCompound();
            node.save(nodeNbt);
            nbttagcompound.setTag("oc:node", nodeNbt);
        }
    }


    public void detectorUpdated() {
        if (worldObj.isRemote) {return;}
        if (digitalOutput && node() != null) {
            node().sendToReachable("computer.signal","betterdetector_update", activated);
        } else {
            Block b = worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord);
            worldObj.notifyBlocksOfNeighborChange(xCoord + 1, yCoord, zCoord, b);
            worldObj.notifyBlocksOfNeighborChange(xCoord - 1, yCoord, zCoord, b);
            worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord + 1, b);
            worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord - 1, b);
            worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord - 1, zCoord, b);
            worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord + 1, zCoord, b);
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, b);
        }
    }

    @Override
    public Node node() {
        return node;
    }

    @Override
    public void onConnect(Node node) {}

    @Override
    public void onDisconnect(Node node) {}

    @Override
    public void onMessage(Message message) {}

    public String getComponentName() {
        return "better_detector";
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] getStatus(Context context, Arguments args) {
        return new Object[]{activated};
    }

    @Override
    public void onChunkUnload() {
        super.onChunkUnload();
        if (node != null) node.remove();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        if (node != null) node.remove();
    }
}
