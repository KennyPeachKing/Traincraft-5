package com.jcirmodelsquad.tcjcir.geometryvechicle;

public class PotentialIssue {
    public TrackPosition thePosition;
    public IssueType issue;

    public enum IssueType {


        BLOCK_TOO_CLOSE_TO_TRACK_IN_TUNNEL("Block is too close to track", "The side of the tunnel is too close to the track. This may cause survival players to get damaged when they go through the curve."),
        BLOCK_TOO_CLOSE_TO_TRACK_ON_SLOPE("Block is too close to track on a slope", "A block is too close to the track on a slope. This may cause survival players to get damaged when they enter the slope."),
        BLOCK_TOO_CLOSE_TO_TRACK("Block is too close to the track.", "A block is too close to the track. This may cause derailments, and is not allowed by the JCIR Infrastructure standards."),
        WOODEN_SLOPE("Wooden slope on mainline", "The slope is made out of wood. That is not allowed by JCIR Infrastructure standards."),
        CURVE_NOT_VERY_LARGE_ON_MAINLINE("Curve is not very large on a mainline", "The curve is not a very large curve, on a mainline. That is not allowed by JCIR Infrastructure standards."),
        TUNNEL_TOO_DARK("Tunnel does not have lighting", "The tunnel does not have lighting. That is not allowed by JCIR Infrastructure standards."),
        MEDIUM_SWITCH_ON_MAINLINE("Medium Switch on mainline", "There is a medium switch on the mainline. That is not allowed by JCIR Infrastructure standards."),
        MISSION_START("Mission start", "This isn't an issue. it just shows where the mission starts."),
        SMALL_SLOPE_ON_MAINLINE("Standard slope on mainline", "There is a standard slope on the mainline. That is not allowed by JCIR Infrastructure Standards."),
        ;

        private String typeName;
        private String safeMessage;

        IssueType(String tn, String sMessage) {
            typeName = tn;
            safeMessage = sMessage;
        }

        public String getTypeName() {
            return this.typeName;
        }

        public String getSafeMessage() {
            return safeMessage;
        }
    }
    public PotentialIssue(int theX, int theY, int theZ, IssueType iType) {
      thePosition = new TrackPosition(theX, theY, theZ);
        issue = iType;
    }
}
