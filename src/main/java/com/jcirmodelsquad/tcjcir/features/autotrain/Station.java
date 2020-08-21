package com.jcirmodelsquad.tcjcir.features.autotrain;

public class Station {
    public String name;
    public Double stationX;
    public Double stationY;
    public Double stationZ;
    public int dwellTime; //In seconds
    public boolean isFinalStop;
    public Station(String theName, Double stationX, Double stationY, Double stationZ, Integer dwellTime) {
        name = theName;
        this.stationX = stationX;
        this.stationY = stationY;
        this.stationZ = stationZ;
        this.dwellTime = dwellTime;
    }
    public Station(String theName, Double stationX, Double stationY, Double stationZ) {
        name = theName;
        this.stationX = stationX;
        this.stationY = stationY;
        this.stationZ = stationZ;
    }
    public Station(String theName, Double stationX, Double stationY, Double stationZ, Integer dwellTime, Boolean isFinalStop) {
        name = theName;
        this.stationX = stationX;
        this.stationY = stationY;
        this.stationZ = stationZ;
        this.dwellTime = dwellTime;
        this.isFinalStop = isFinalStop;
    }

    public String getStationName() {return name;}
    public Double getStationX() {return stationX;}
    public Double getStationY() {return stationY;}
    public Double getStationZ() {return stationZ;}
    public int getDwellTime() {return dwellTime;}
    public boolean isFinalStop() {
        return isFinalStop;
    }
}

