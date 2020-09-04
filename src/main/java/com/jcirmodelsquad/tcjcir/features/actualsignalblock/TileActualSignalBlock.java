package com.jcirmodelsquad.tcjcir.features.actualsignalblock;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Vec3;
import train.common.api.EntityRollingStock;

import java.util.List;

public class TileActualSignalBlock extends TileEntity {

    public boolean isPairedToAnother;
    public boolean isPairing;
    public int pairedX;
    public int pairedY;
    public int pairedZ;
    public AxisAlignedBB boundingBox = null;
    public boolean activated;
    public boolean lastStatus;

    @Override
    public void updateEntity() {
        if (worldObj == null) {
            return;
        }
        if (worldObj.isRemote) { return;}
       // System.out.println(xCoord + ": " + isPairedToAnother);
        //System.out.println("activ:" + xCoord + ": " + activated);
      //  System.out.println(xCoord + ":" + this.getRenderBoundingBox());
        //System.out.println(AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, pairedX, pairedY + 4, pairedZ).intersectsWith(AxisAlignedBB.getBoundingBox(pairedX, pairedY, pairedZ, xCoord, yCoord, zCoord)));
        /*if (list != null && list.size() > 0) {
            for (Object obj : list) {
                activated = obj instanceof EntityRollingStock;
            }
        } else {
            activated = false;
        }
*/
        if (lastStatus != activated) {
            updateThings();
        }
        lastStatus = activated;
      /*  if (worldObj.getTileEntity(pairedX,pairedY,pairedZ) instanceof TileActualSignalBlock) {
            ((TileActualSignalBlock)worldObj.getTileEntity(pairedX,pairedY,pairedZ)).activated = activated;
            ((TileActualSignalBlock)worldObj.getTileEntity(pairedX,pairedY,pairedZ)).lastStatus = activated;
        }*/
    }


    public void activated(EntityPlayer thePlayerThatActivated) {
        ItemStack thePairDevice = thePlayerThatActivated.getHeldItem();
            if (thePairDevice.getTagCompound() != null && thePairDevice.getTagCompound().hasKey("currentPairing") && thePairDevice.getTagCompound().getBoolean("isPairing")) {
                int x = thePairDevice.getTagCompound().getCompoundTag("currentPairing").getInteger("x");
                int y = thePairDevice.getTagCompound().getCompoundTag("currentPairing").getInteger("y");
                int z = thePairDevice.getTagCompound().getCompoundTag("currentPairing").getInteger("z");
               // if (worldObj.getTileEntity(x,y,z) != null) { System.out.println(worldObj.getTileEntity(x,y,z)); };
               // System.out.println(x==xCoord);
                //System.out.println(y==yCoord);
                //System.out.println(z==zCoord);
                if (worldObj.getTileEntity(x,y,z) instanceof TileActualSignalBlock && worldObj.getTileEntity(x,y,z) != this) {
                    //Alright, this is a different one that we are pairing with. Do the paring!
                    TileActualSignalBlock theThing = (TileActualSignalBlock)worldObj.getTileEntity(x,y,z);
                    isPairing = false;
                    isPairedToAnother = true;
                    pairedX = x;
                    pairedY = y;
                    pairedZ = z;

                    theThing.isPairing = false;
                    theThing.pairedX = xCoord;
                    theThing.pairedY = yCoord;
                    theThing.pairedZ = zCoord;
                    theThing.isPairedToAnother = true;

                    thePairDevice.getTagCompound().removeTag("currentPairing");
                    thePairDevice.getTagCompound().removeTag("isPairing");
                    thePairDevice.getTagCompound().setBoolean("isPairing", false);
                    sendLitChatMessage(thePlayerThatActivated, new ChatComponentText(EnumChatFormatting.GREEN + "Paired successfully!"));
                } else if (x == xCoord && y == yCoord && z == zCoord) {
                    //Stop pairing.
                    thePairDevice.getTagCompound().removeTag("currentPairing");
                    thePairDevice.getTagCompound().removeTag("isPairing");
                    thePairDevice.getTagCompound().setBoolean("isPairing", false);
                    isPairing = false;
                    sendChatMessage(thePlayerThatActivated, "Stopped pairing.");
                }


            } else if (thePairDevice.getTagCompound() == null || (thePairDevice.getTagCompound().hasKey("isPairing") && !thePairDevice.getTagCompound().getBoolean("isPairing"))){
                //Start pairing!
                isPairing = true;
                if (thePairDevice.getTagCompound() != null) {
                    thePairDevice.getTagCompound().removeTag("isPairing");
                }

                NBTTagCompound theCompound = new NBTTagCompound();
                theCompound.setBoolean("isPairing", true);

                NBTTagCompound theSecond = new NBTTagCompound();
                theSecond.setInteger("x", xCoord);
                theSecond.setInteger("y", yCoord);
                theSecond.setInteger("z", zCoord);
                theCompound.setTag("currentPairing", theSecond);
                thePairDevice.setTagCompound(theCompound);
                sendChatMessage(thePlayerThatActivated, "Started pairing.");
            }

    }

    //Idk why I made this function
    public void sendChatMessage(EntityPlayer player, String text) {
        player.addChatComponentMessage(new ChatComponentText(text));
    }

    public void sendLitChatMessage(EntityPlayer player, ChatComponentText text) {
        player.addChatComponentMessage(text);
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (isPairedToAnother) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, pairedX, pairedY + 3, pairedZ);
        } else {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord, yCoord, zCoord);
        }
        return boundingBox;
    }

    public void updateThings() {
        if (worldObj.isRemote) {return;}
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
