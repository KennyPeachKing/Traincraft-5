package com.jcirmodelsquad.tcjcir.features.eti;


import com.jcirmodelsquad.tcjcir.features.eti.jcirmonitor.AdvancedDetailsObject;

public class BasicallyLocomotive {

    public int entityID;
    public String driverName;
    public String trainName;
    public int speed;
    public String destination;
    public long outputMessageId;
    public AdvancedDetailsObject details;
    public BasicallyLocomotive() {

    }
    public BasicallyLocomotive(int ei, String dn, String tn, int s, String des) {
        entityID = ei;
        driverName = dn;
        trainName = tn;
        speed = s;
        destination = des;
    }
    public BasicallyLocomotive(int ei, String dn, String tn, int s, String des, AdvancedDetailsObject adv) {
        entityID = ei;
        driverName = dn;
        trainName = tn;
        speed = s;
        destination = des;
        details = adv;
    }
}
