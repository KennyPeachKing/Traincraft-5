package com.jcirmodelsquad.tcjcir.features;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import train.common.api.EntityRollingStock;
import train.common.items.ItemTCRail;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import static train.common.items.ItemTCRail.isTCStraightTrack;

public class TiltingHandler {

    public int maxTilt;
    public float tiltingProgress = 0;
    public boolean tiltingIn = false;
    public boolean tiltingOut = false;
    public boolean tiltingToLeft = false;
    public boolean testTilting = false;
    public boolean tiltingDisabled = false;
    public String leftOrRight = "";
    public TiltingHandler() {

    }

    public TiltingHandler(int theMaxTilt) {
        maxTilt = theMaxTilt;
    }

    public void handleTilting(EntityRollingStock rollingStock) {
        System.out.println(Math.round(tiltingProgress));
        System.out.println(Math.round(tiltingProgress) <= 0);
        if (!testTilting) {
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
               //     System.out.println(theRail.getType());
                }
            }
            if (ItemTCRail.isTCTurnTrack(theRail)) {
                tiltingIn = true;
                tiltingOut = false;


                tiltingToLeft = !theRail.getType().equals("VERY_LARGE_RIGHT_TURN");


            } else if (isTCStraightTrack(theRail) && tiltingIn) {
                //Tilt out.
                tiltingIn = false;
                tiltingOut = true;
            }
        }
      /*  if (tiltingOut && tiltingIn) {
            tiltingProgress = 0;
        }*/
            if (testTilting) {
                //Tilt to the left, then to the right.
                if (rollingStock.ticksExisted % 100 == 0) {
                    //Left!
                    if (leftOrRight.equals("")) {
                        leftOrRight = "left";
                    }
                    if (tiltingIn) {
                        tiltingOut = true;
                        tiltingIn = false;
                    } else {
                        tiltingOut  = false;
                        tiltingIn = true;
                    }
                    if (leftOrRight.equals("left")) {
                        tiltingToLeft = false;
                    //    tiltToTheRight();
                        leftOrRight = "right";
                    } else {
                        tiltingToLeft = true;
                      //  tiltToTheLeft();
                        leftOrRight = "left";
                    }



                }
            }
         //   System.out.println(tiltingOut);
            //	System.out.println("tilting in: " + tiltingIn);
            //System.out.println("tilting out: " + tiltingOut);
            // System.out.println("Tilting enabled?" + !tiltingDisabled);
            if (!tiltingDisabled) {
             /*   System.out.println("tilt proogress: " + tiltingProgress);
                System.out.println("Tilting in?" + tiltingIn);
                System.out.println("Tilting out?" + tiltingOut);
                if (tiltingToLeft) {
                    System.out.println("Tilting in which direction: left");
                } else {
                    System.out.println("Tilting in which direction: right");
                }*/

               // System.out.println("Max tilt: " + maxTilt);
                // System.out.println(tiltingProgress-1F <= 0);
                if ((tiltingToLeft && tiltingProgress <= maxTilt) || (!tiltingToLeft && tiltingProgress >= -maxTilt) && tiltingIn) {
                    if (tiltingToLeft) {
                        tiltingProgress = (float) (tiltingProgress + 0.2);
                    } else {
                        tiltingProgress = (float) (tiltingProgress - 0.2);
                    }

                    //System.out.println("Starting tilt.");

                } else if (Math.round(tiltingProgress) <= 0 && tiltingOut) {
                    if (tiltingToLeft) {
                        tiltingProgress = (float) (tiltingProgress - 0.2);
                     //   System.out.println("untilt?");
                    } else {
                        tiltingProgress = (float) (tiltingProgress + 0.2);
                    }

                   // System.out.println("Starting untilt.");
                }
            }
    }

    public void tiltToTheLeft() {
        if (tiltingToLeft) {
            tiltingProgress = (float) (tiltingProgress + 0.2);
        } else {
            tiltingProgress = (float) (tiltingProgress - 0.2);
        }
    }

    public void tiltToTheRight() {
        if (tiltingToLeft) {
            tiltingProgress = (float) (tiltingProgress - 0.2);
           // System.out.println("untilt?");
        } else {
            tiltingProgress = (float) (tiltingProgress + 0.2);
        }
    }


}
