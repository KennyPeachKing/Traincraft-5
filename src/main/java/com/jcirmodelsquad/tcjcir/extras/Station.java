package com.jcirmodelsquad.tcjcir.extras;

public class Station {
    public String name;
    public Double stationX;
    public Double stationY;
    public Double stationZ;
    public int dwellTime; //In seconds
    public boolean isFinalStop;
    public Station(String theName, Double sX, Double sY, Double sZ, Integer dt) {
        name = theName;
        stationX = sX;
        stationY = sY;
        stationZ = sZ;
        dwellTime = dt;
    }
    public Station(String theName, Double sX, Double sY, Double sZ, Integer dt, Boolean fs) {
        name = theName;
        stationX = sX;
        stationY = sY;
        stationZ = sZ;
        dwellTime = dt;
        isFinalStop = fs;
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

