package com.jcirmodelsquad.tcjcir.features;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import train.common.api.EntityRollingStock;
import train.common.items.ItemTCRail;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

public class TiltingHandler {

    public int maxTilt;
    public float tiltingProgress = 0;
    private boolean tiltingIn = false;
    private boolean tiltingOut = false;
    private boolean tiltingToLeft = false;

    public TiltingHandler() {

    }

    public TiltingHandler(int theMaxTilt) {
        maxTilt = theMaxTilt;
    }

    public void handleTilting(EntityRollingStock rollingStock) {
        int xFloor = MathHelper.floor_double(rollingStock.posX);
        int yFloor = MathHelper.floor_double(rollingStock.posY);
        int zFloor = MathHelper.floor_double(rollingStock.posZ);
        TileTCRail theRail = null;
        TileEntity theTileEntity = rollingStock.worldObj.getTileEntity(xFloor, yFloor, zFloor);

        if (theTileEntity instanceof TileTCRailGag) {
            TileTCRailGag tileGag = (TileTCRailGag) theTileEntity;
            theRail = (TileTCRail) rollingStock.worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);
        } else if (theTileEntity instanceof TileTCRail) {
            theRail = (TileTCRail) rollingStock.worldObj.getTileEntity(xFloor, yFloor, zFloor);
        }

        if (theTileEntity != null) {
            if (theRail != null) {
                System.out.println(theRail.getType());
            }
        }
        if (ItemTCRail.isTCTurnTrack(theRail)) {
            tiltingIn = true;
            tiltingOut = false;
            tiltingToLeft = !theRail.getType().equals("VERY_LARGE_RIGHT_TURN");


        } else if (theRail != null && theRail.getTrackType().getType().contains("STRAIGHT") && tiltingIn) {
            //Tilt out.
            tiltingIn = false;
            tiltingOut = true;
            System.out.println("How do we get here??");
        }

      /*  if (tiltingOut && tiltingIn) {
            tiltingProgress = 0;
        }*/
        //	System.out.println("tilting in: " + tiltingIn);
        //System.out.println("tilting out: " + tiltingOut);
        System.out.println("tilt proogress: " + tiltingProgress);
        System.out.println("Tilting in?" + tiltingIn);
        System.out.println("Tilting out?" + tiltingOut);
        System.out.println("Tilting to the left?" + tiltingToLeft);
        System.out.println("Max tilt: " + maxTilt);
        System.out.println("Inverse of max tilt: " + -maxTilt);
        if ( (tiltingToLeft && tiltingProgress <= maxTilt) || (!tiltingToLeft && tiltingProgress >= -maxTilt) && tiltingIn)  {
            if (tiltingToLeft) {
                tiltingProgress = (float) (tiltingProgress + 0.2);
            } else {
                tiltingProgress = (float) (tiltingProgress - 0.2);
            }

            System.out.println("Starting tilt.");
        }
        System.out.println( Math.round(tiltingProgress) <=0);
        if ( Math.round(tiltingProgress) <= 0 && tiltingOut) {
            if (tiltingToLeft) {
                tiltingProgress = (float) (tiltingProgress - 0.2);
                System.out.println("untilt?");
            } else {
                tiltingProgress = (float) (tiltingProgress + 0.2);
            }

            System.out.println("Starting untilt.");
        }

    }
}
