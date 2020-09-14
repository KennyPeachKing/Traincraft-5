package com.jcirmodelsquad.tcjcir.features.autotrain.modules;

import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2Handler;
import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2Module;
import train.common.api.Locomotive;

public class PassengerTrainModule extends AutoTrain2Module {

    @Override
    public void doThings(AutoTrain2Handler handler, Locomotive locomotive) {

        if (handler.currentTrackSection != null && handler.currentTrackSection.getSectionType().equals("station") || handler.nextTrackSection != null && handler.nextTrackSection.getSectionType().equals("station")) {
            if (handler.currentTrackSection != null) {
                locomotive.xStationStop = (double)handler.currentTrackSection.getEndPosition().getX();
                locomotive.yStationStop = (double)handler.currentTrackSection.getEndPosition().getY();
                locomotive.zStationStop = (double)handler.currentTrackSection.getEndPosition().getZ();
            } else {
                locomotive.xStationStop = (double)handler.nextTrackSection.getEndPosition().getX();
                locomotive.yStationStop = (double)handler.nextTrackSection.getEndPosition().getY();
                locomotive.zStationStop = (double)handler.nextTrackSection.getEndPosition().getZ();
            }
        }
        if (!locomotive.stationStop) {
            locomotive.atoStatus = 1;
        } else {
            locomotive.atoStatus = 0;
        }
    }


    @Override
    public String getModuleName() {
        return "Passenger Train Module";
    }
}
