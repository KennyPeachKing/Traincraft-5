package com.jcirmodelsquad.tcjcir.features.autotrain.modules;

import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2Handler;
import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2Module;
import train.common.api.Locomotive;

public class PitTrainModule extends AutoTrain2Module {

    @Override
    public void doThings(AutoTrain2Handler handler, Locomotive locomotive) {

    }


    @Override
    public String getModuleName() {
        return "Pit Train Module";
    }
}
