package com.jcirmodelsquad.tcjcir.features.autotrain;

import train.common.api.Locomotive;

import java.util.ArrayList;

/**
 * Handles AutoTrain stuff that isn't ATO. Although, things might happen to the system, anyway.
 * Stay tuned!
 *
 * Depending on the route, AutoTrain can either be enforced to be on, or optionally be on. It varies on the train
 * and operator, too.
 *
 *
 *
 */
public class AutoTrainHandler {
    /**
     * Different trains do different things.
     * <i>For driver based trains with AutoTrain capabilities (eg. Advanced High Speed Train) </i>
     *
     * 0: Train is inactive, AutoTrain is not on, or the train is being driven manually.
     * 1: AutoTrain is on and activated. Of course, it can be turned off by using the MTC Override Button.
     * (but for the use case on some lines, there is a driver anyway just to watch)
     *
     * <i>For trains designed to be fully automated (eg. PCH-120 Commute) </i>
     *
     *     0: Off, inactive, not doing anything. Normally when a train is out of use at a yard or is being pulled by another train.
     *     1: Yard Shunting Mode: Allows the train to be remotely controlled by a server, backwards, forwards, start coupling, stuff like that.
     *     2: Yard Run Mode: Running at 15km/h, automatically turns off once MTC is activated.
     *     3: Mainline Service Mode: Uses W-MTC ATO to drive the train, stops at stations.
     *     4: Mainline Out of Service Mode: Uses W-MTC ATO to drive the train, but does not stop at any station.
     *     5: At The Back Mode: This is when the train is at the back of a main consist. Just don't do anything, let the front handle it.
     *     6: Manual Control Mode: The train is run manually with a driver. Potentially be used by some of the operators of this train.
     *
     */
    public int operatingMode = 1;

    //Used for full automation.
    public ArrayList<Station> theTimetable = new ArrayList<Station>();
    public Station theNextStation;
    public Station theCurrentStation;
    public Station theLastStation;

    private boolean switchOverAtEnd = true;
    public boolean isLeading = true;
    private long lastMills = 0L;
    private long lastMillsRTD = 0L;
    private boolean readyToDepart;
    public ArrayList<Station> initalTimetable = new ArrayList<Station>();
    public String initalPosition = "n";

    public Locomotive locomotive;
    public boolean isMainlineBased;
    public boolean justLoaded;

    public AutoTrainHandler() {}
    public AutoTrainHandler(Locomotive locoToSet, boolean isDriverless) {locomotive = locoToSet; isMainlineBased = isDriverless;}

    public void handle() {
        if (locomotive.mtcOverridePressed) {operatingMode = 0;}

        if (isMainlineBased && operatingMode == 1 ) {
            //Okay, the operating mode is 1 (for mainline trains.) Do everything AutoTrain related.

        }
    }
}
