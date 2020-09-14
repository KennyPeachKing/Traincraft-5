package com.jcirmodelsquad.tcjcir.features.autotrain;

import train.common.api.Locomotive;

/**
 * A module for AutoTrain-2. This could be for freight, or for passenger..or for a lot of things.
 */
public class AutoTrain2Module {

    public String moduleName;

    public AutoTrain2Module(String moduleName) {
        this.moduleName = moduleName;
    }

    public AutoTrain2Module() {
    }

    public void doThings(AutoTrain2Handler handler, Locomotive locomotive) {

    }

    public String getModuleName() {return moduleName;}
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

}
