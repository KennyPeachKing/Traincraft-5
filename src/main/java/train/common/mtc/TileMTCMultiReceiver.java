package train.common.mtc;

import cpw.mods.fml.common.Optional;
import li.cil.oc.api.Network;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import train.common.api.Locomotive;

import java.util.ArrayList;
import java.util.List;

public class TileMTCMultiReceiver extends TileEntity implements SimpleComponent {
    public boolean isActivated;
    public String trainID = "";
    public int trainLevel = 0;
    public String trainName = "";
    public String trainType = "";

    public String operatorID = ""; //Example: PR for PeachRail, or TXCN for Texas Central
    public String etiTrainName = ""; //May not be used very often, but just in case, include it.
    public String trainNumber = "";

    public String trainDestination = "";
    public ArrayList<String> stations = new ArrayList<>();

    public boolean trainOverSensor = false;

    public AxisAlignedBB boundingBox = null;
    protected boolean addedToNetwork = false;
    public Node node;

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 2, zCoord + 2);
        }
        return boundingBox;
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
        if (isActivated) {
            List<Object> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(null, this.getRenderBoundingBox());
            if (list != null && list.size() > 0) {
                for (Object obj : list) {
                    if (obj instanceof Locomotive) {
                        Locomotive daTrain = (Locomotive) obj;
                        if (daTrain.mtcOverridePressed) {
                            return;
                        }
                        trainID = daTrain.trainID;
                        trainLevel = Integer.parseInt(daTrain.trainLevel);
                        trainType = daTrain.trainType;
                        trainName = daTrain.getTrainName();

                        operatorID = daTrain.operatorID;
                        etiTrainName = daTrain.trainName;
                        trainNumber = daTrain.trainNumber;
                        stations = daTrain.stations;
                        trainDestination = daTrain.getDestination();
                        trainOverSensor = true;
                    }
                }
            } else if (list != null) {
                trainOverSensor = false;
            }
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.isActivated = nbttagcompound.getBoolean("isActivated");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);

        nbttagcompound.setBoolean("isActivated", this.isActivated);
    }

    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] activate(Context context, Arguments args) {
        this.isActivated = true;
        return new Object[]{true};
    }
    @Callback
    @Optional.Method(modid = "OpenComputers")
    public Object[] deactivate(Context context, Arguments args) {
        this.isActivated = false;
        return new Object[]{true};
    }



    public String getComponentName() {
        return "mtc_multi_receiver";
    }
}
