package com.jcirmodelsquad.tcjcir.features.eti.jcirmonitor;


public class Station {
    public String stationID = "";
    public String publicName = "";
    public Position position = new Position();
    public int estimatedTimeTo;
    public boolean arrivedAt = false;
    public Station() {

    }

    public Station(String stationID, String publicName, Position position) {
        this.stationID = stationID;
        this.publicName = publicName;
        this.position = position;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public boolean isArrivedAt() {
        return arrivedAt;
    }

    public void setArrivedAt(boolean arrivedAt) {
        this.arrivedAt = arrivedAt;
    }

}
