package com.jcirmodelsquad.tcjcir.features.autotrain;

import net.minecraft.util.Vec3;
import train.common.api.Locomotive;

import java.util.ArrayList;

/**
 * AutoTrain-2 Concept:
 * Automated operation of a train including station stops, speed changes, and unexpected things happening.
 *
 * This enhanced system will most likely be applied to non metro trains, such as the PCH120, and more designed for regional trains.
 * Most likely going to test on the Advanced High Speed Train when that comes.
 * A way to get automation instead of being forced to install W-MTC on routes, as that is seeming more and more unlikely at the current moment on mainlines.
 * Instead of relying on a server, track, speed limit, and station information will be loaded in a database that's stored on a train
 * (or in a book?)
 *
 * The previous AutoTrain system will still be supported, but this is just an upgrade to the system to test out with.
 *
 * No, this won't be a replacement for drivers, just a cool thing to try and experiment with.
 *
 * Features:
 * - Automated operation of the train.
 * - As in, stopping where it needs to, as well as adjusting the speed of the train.
 * - Train Integrity Detection: Detects if the consist has been broken up somehow and stops the train when it does.
 *
 * Use Cases:
 * Intercity or Regional Passenger trains: The operation of the train with passengers, stopping at where it needs to go to and reversing at the ends.
 *
 * General Freight Trains: The trains going where they need to go, as well as stopping in yards.
 * Open Pit Mine Trains: Bidas sweet idea, making the trains stop somewhere, fill up, go somewhere else to drop off the cargo, then head back down.
 *
 * (this will still in some cases require a driver due to chunk loading)
 */
public class AutoTrain2Handler {

    public boolean autoTrainActivated = false;
    public AutoTrain2Module loadedModule;
    public ArrayList<TrackSection> loadedTrackDatabase;
    public ArrayList<TrackSection> originalLoadedTrackDatabase;
    public TrackSection currentTrackSection;
    public TrackSection nextTrackSection;

    public int initialCount;
    /**
     *  Could be a number of things! Such as!
     *  inoperation: The system is running fine and nothing bad has happened.
     *  expectedstop: The train has stopped at a station, or is loading up with something.
     *  integrityfault: The consist broke apart. Stop stop stop!!!
     *  unexpectedstop: A number of things, such as the consist breaking apart. Must be manually resumed.
     */
    public String currentStatus;

    public void operateAutoTrain(Locomotive locomotive) {
        if (autoTrainActivated) {
            //Start everything, and go!
            //First, do all of the main things for the system. Like the consist integrity.

            if (locomotive.currentNumCartsPulled < initialCount && !currentStatus.equals("integrityfault")) {
                //woah woah woah, the consist fell apart! Stop stop stop!!!
                currentStatus = "integrityfault";
            }

            if (currentStatus.equals( "integrityfault")) {
                locomotive.motionX *= locomotive.brake;
                locomotive.motionZ *= locomotive.brake;

                if (locomotive.getSpeed() < 3) {
                    locomotive.parkingBrake = true;
                    currentStatus = "unexpectedstop";
                }
            }
            System.out.println(Vec3.createVectorHelper(locomotive.posX, locomotive.posY, locomotive.posZ).distanceTo(Vec3.createVectorHelper(currentTrackSection.getEndPosition().x, currentTrackSection.getEndPosition().y, currentTrackSection.getEndPosition().z)));
            if (Vec3.createVectorHelper(locomotive.posX, locomotive.posY, locomotive.posZ).distanceTo(Vec3.createVectorHelper(currentTrackSection.getEndPosition().x, currentTrackSection.getEndPosition().y, currentTrackSection.getEndPosition().z)) < 5) {
                if (loadedTrackDatabase.size() != 1) {
                    currentTrackSection = loadedTrackDatabase.get(1);
                } else {
                    currentTrackSection = loadedTrackDatabase.get(0);
                }
                loadedTrackDatabase.remove(currentTrackSection);
            }

            if (1 < loadedTrackDatabase.size()  && loadedTrackDatabase.get(1) != null) {
                nextTrackSection = loadedTrackDatabase.get(1);
            }

            if (currentTrackSection != null && !locomotive.speedGoingDown) {
                locomotive.speedLimit = currentTrackSection.getSpeedLimit();
            }

            if (nextTrackSection != null && currentTrackSection != null && nextTrackSection.speedLimit < currentTrackSection.speedLimit) {
                locomotive.nextSpeedLimit = nextTrackSection.speedLimit;
                locomotive.xSpeedLimitChange = (double) currentTrackSection.getEndPosition().getX();
                locomotive.ySpeedLimitChange = (double) currentTrackSection.getEndPosition().getY();
                locomotive.zSpeedLimitChange = (double) currentTrackSection.getEndPosition().getZ();
            }
            System.out.println("All current: =================");
            for (TrackSection section : loadedTrackDatabase) {
                System.out.println(section);
            }
            System.out.println("=======================");
            loadedModule.doThings(this, locomotive);





        }
    }

    public String startAutoTrain(ArrayList<TrackSection> database, Locomotive locomotive) {
        //First, make sure everything is right.
        //Oh yeah, return an error if something goes wrong.
        if (loadedModule == null) {
            return "No module is inserted. Have you put it inside the train's inventory?";
        } else {
            System.out.println("Loaded database: " + loadedModule.getModuleName());
        }
        //Next, load the track database.
        if (database == null) {
            return "No database is available. Have you put it inside the train's inventory?";
        } else {
            loadedTrackDatabase = database;
            currentTrackSection = database.get(0);
        }
        //We got here? Good, everything is ready to go! Start the system.
        autoTrainActivated = true;
        currentStatus = "inoperation";
        initialCount = locomotive.currentNumCartsPulled;
        return "Success starting the system. Train is now in AutoTrain-2 mode.";
    }

    /**
     * It should come in like this:
     * TrackSection: <94, 40, 10> -> <49, 60, 90> | 90
     * In order: <Start, Coord, Anites> -> <End, Coord, Anites>  | speedLimit
     * And so on and so forth.
     * @param databaseString
     * @return
     */
    public ArrayList<TrackSection> parseDatabase(String databaseString) {
        ArrayList<TrackSection> output = new ArrayList<>();
        for (String section : databaseString.split("\n")) {

        }
        return null;
    }

    public void informClient() {
        //To be done!
    }
}
