package com.jcirmodelsquad.tcjcir.features.eti;


import com.jcirmodelsquad.tcjcir.features.eti.jcirmonitor.Station;
import cpw.mods.fml.common.Loader;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;

public class TileTrainMonitor extends TileEntity implements SimpleComponent {
    public boolean isScanning = false;
    public int dir;

    public TileTrainMonitor(int dir) {
        this.dir = dir;
    }

    @Override
    public String getComponentName() {
        return "jcir_trainmonitor";
    }

    @Callback
    public Object[] scanForTrains(Context context, Arguments args) {
        //Scan for all of the trains on the server using JCIR-Monitor.
        try {
            if (Loader.isModLoaded("jcirmonitor")) {
                Class theActualMonitor = Class.forName("com.peachmaster.jcirmonitor.TheActualMonitor");
                //example output:
                // {<trainID> = {operatorID = <opID>, player = <player>, locomotive = <locomotive>, speed = <speed in int), stations = {<stationname> = {estimaedTimeTo = <estimatedTimeto>}}}

                Field allDrivenTrainsOB = theActualMonitor.getDeclaredField("allDrivenTrains");
                ArrayList<BasicallyLocomotive> allTrains = (ArrayList<BasicallyLocomotive>) allDrivenTrainsOB.get(theActualMonitor);

                HashMap<String, HashMap> output = new HashMap<>();
                int elapsed = 0;
                for (BasicallyLocomotive basically : allTrains) {
                    elapsed++;
                    HashMap toAddMap = new HashMap<>();
                    if (basically.details != null) {
                        toAddMap.put("operatorID", basically.details.trainType);
                        toAddMap.put("trainNumber", basically.details.trainNumber);
                        toAddMap.put("trainName", basically.details.trainName);
                        if (basically.details.stations != null) {
                            HashMap<String, HashMap<String, String>> stations = new HashMap<>();
                            for (Station station : basically.details.stations) {
                                HashMap<String, String> againToAgain = new HashMap<>();
                                againToAgain.put("stationID", station.getStationID());
                                againToAgain.put("publicName", station.getPublicName());
                                againToAgain.put("arrivedAt", String.valueOf(station.arrivedAt));
                                againToAgain.put("estimatedTimeTo", String.valueOf(station.estimatedTimeTo));
                                stations.put(station.getStationID(), againToAgain);
                            }
                            toAddMap.put("stations", stations);

                        }
                        //toAddMap.put("stations", )
                    }
                    toAddMap.put("playerName", basically.driverName);
                    toAddMap.put("trainType", basically.trainName);
                    toAddMap.put("speed", String.valueOf(basically.speed));
                    output.put(String.valueOf(elapsed), toAddMap);
                }
                return new HashMap[]{output};
            }
        } catch (IllegalAccessException | NoSuchFieldException | ClassNotFoundException e) {
            e.printStackTrace();
            return new String[]{"JCIR-Monitor not found"};
        }
        return new String[]{"JCIR-Monitor not found"};
    }
    @Override
    public void readFromNBT(NBTTagCompound nbttagcompound) {
        super.readFromNBT(nbttagcompound);
        this.dir = nbttagcompound.getInteger("dir");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setInteger("dir", this.dir);
    }
}