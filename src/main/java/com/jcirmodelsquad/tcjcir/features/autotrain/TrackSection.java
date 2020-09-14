package com.jcirmodelsquad.tcjcir.features.autotrain;

import com.jcirmodelsquad.tcjcir.features.eti.jcirmonitor.Position;

public class TrackSection {
    public Position startPosition;
    public Position endPosition;
    public boolean alreadyBeenTo;


    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

    public String sectionType;

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;

    }

    public int speedLimit;

    public TrackSection(Position startPosition, Position endPosition, int speedLimit, boolean alreadyBeenTo, String sectionType) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.speedLimit = speedLimit;
        this.alreadyBeenTo = alreadyBeenTo;
        this.sectionType = sectionType;
    }

    public Position getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Position startPosition) {
        this.startPosition = startPosition;
    }

    public Position getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Position endPosition) {
        this.endPosition = endPosition;
    }

    public boolean isAlreadyBeenTo() {
        return alreadyBeenTo;
    }

    public void setAlreadyBeenTo(boolean alreadyBeenTo) {
        this.alreadyBeenTo = alreadyBeenTo;
    }

    @Override
    public String toString() {
        if (getSectionType().equals("station")) {
            return "Station{" +
                    "startPosition=" + startPosition +
                    ", endPosition=" + endPosition +
                    ", alreadyBeenTo=" + alreadyBeenTo +
                    ", speedLimit=" + speedLimit +
                    '}';
        }
        return "TrackSection{" +
                "startPosition=" + startPosition +
                ", endPosition=" + endPosition +
                ", alreadyBeenTo=" + alreadyBeenTo +
                ", speedLimit=" + speedLimit +
                '}';
    }
}
