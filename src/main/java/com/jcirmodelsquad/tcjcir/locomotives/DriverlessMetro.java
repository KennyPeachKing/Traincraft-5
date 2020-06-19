package com.jcirmodelsquad.tcjcir.locomotives;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jcirmodelsquad.tcjcir.extras.Station;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import org.apache.commons.lang3.StringUtils;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.api.EntityRollingStock;
import train.common.library.GuiIDs;
import train.common.mtc.PDMMessage;
import train.common.mtc.packets.PacketATO;
import train.common.mtc.packets.PacketATOSetStopPoint;

import java.util.ArrayList;
import java.util.List;

public class DriverlessMetro extends ElectricTrain {
    //DriverlessMetro for JCIR-Traincraft.
    public int currentMode = 0;

    /*Modes:
    0: Off, inactive, not doing anything. Normally when a train is out of use at a yard or is being pulled by another train.
    1: Yard Shunting Mode: Allows the train to be remotely controlled by a server, backwards, forwards, start coupling, stuff like that.
    2: Yard Run Mode: Running at 15km/h, automatically turns off once MTC is activated.
    3: Mainline Service Mode: Uses W-MTC ATO to drive the train, stops at stations.
    4: Mainline Out of Service Mode: Uses W-MTC ATO to drive the train, but does not stop at any station.
    5: At The Back Mode: This is when the train is at the back of a main consist. Just don't do anything, let the front handle it.
    6: Manual Control Mode: The train is run manually with a driver. Potentially be used by some of the operators of this train.
*/

    public int operatingMode = 1;
    /*
        1: Driver/ Driver with W-MTC
        2: Fully Automatic
     */
    public int operation = 0;

    public boolean requestedTimetable = false;

    public ArrayList<Station> theTimetable = new ArrayList<Station>();
    public Station theNextStation;
    public Station theCurrentStation;
    public Station theLastStation;
    public boolean setUUID = false;
    public AxisAlignedBB boundingBox = null;
    public boolean obstacleInWay = false;
    public boolean obstacleBrakeDone = false;
    public DriverlessMetro otherSide;
    public boolean isLeading = true;
    private long lastMills = 0L;
    private long lastMillsRTD = 0L;
    private boolean readyToDepart;

    public DriverlessMetro(World world) {
        super(world);
    }


    public DriverlessMetro(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {
            return;
        }
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 0.3;
        double yOffset = 0.2;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
        if (side.isServer()) {
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
            anglePitchClient = serverRealPitch * 60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance));
        double bogieZ1 = (this.posZ + (rotationSin1 * distance));
        //System.out.println(rotationCos1+" "+rotationSin1);
        if (anglePitchClient > 20 && rotationCos1 == 1) {
            bogieX1 -= pitchRads * 2;
            pitch -= pitchRads * 1.2;
        }
        if (anglePitchClient > 20 && rotationSin1 == 1) {
            bogieZ1 -= pitchRads * 2;
            pitch -= pitchRads * 1.2;
        }
        if (pitchRads == 0.0) {
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public void pressKey(int i) {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);

        nbttagcompound.setShort("fuelTrain", (short) fuelTrain);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < locoInvent.length; i++) {
            if (locoInvent[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                locoInvent[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbttagcompound.setTag("Items", nbttaglist);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);

        fuelTrain = nbttagcompound.getShort("fuelTrain");
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        locoInvent = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < locoInvent.length) {
                locoInvent[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    @Override
    public int getSizeInventory() {
        return inventorySize;
    }

    @Override
    public String getInventoryName() {
        return "PCH-120 Commute";
    }


    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }
            entityplayer.mountEntity(this);
        }
        return true;
    }

    @Override
    public void receiveMessage(PDMMessage message) {
        super.receiveMessage(message);
        JsonParser parser = new JsonParser();
        JsonObject thing = parser.parse(message.message.toString()).getAsJsonObject();
        if (message != null && this.worldObj != null && !worldObj.isRemote) {
            if (thing.get("funct").getAsString().equals("response")) {
                if (thing.get("trainMode") != null) {
                    //Update the train mode.
                    currentMode = thing.get("trainMode").getAsInt();
                }
            } else if (thing.get("funct").getAsString().equals("startlevel2")) {
                if (thing.get("trainMode") != null) {
                    //Update the train mode.
                    currentMode = thing.get("trainMode").getAsInt();
                    System.out.println("Current mode: " + currentMode);
                    if (riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
                        ((EntityPlayer) riddenByEntity).addChatMessage(new ChatComponentText("Connected to main server successfully!"));
                    }
                }
            } else if (thing.get("funct").getAsString().equals("startCoupling")) {
                this.isAttaching = true;
                //Because we will be remotely controlled, set the mode to mode 1
                currentMode = 1;
            } else if (thing.get("funct").getAsString().equals("newTimetable") && theTimetable.size() == 0) {
                //We have a new timetable? Let's decompile it.
                JsonArray theArray = thing.get("theTimetable").getAsJsonArray();

                for (JsonElement pa : theArray) {
                    JsonObject theStation = pa.getAsJsonObject();
                    theTimetable.add(new Station(theStation.get("stationName").getAsString(), theStation.get("stationX").getAsDouble(), theStation.get("stationY").getAsDouble(), theStation.get("stationZ").getAsDouble(), theStation.get("dwellTime").getAsInt(), theStation.get("isEndOfLine").getAsBoolean()));
                    if (theStation.get("isEndOfLine").getAsBoolean()) {
                        destination = theStation.get("stationName").getAsString();
                        theLastStation = new Station(theStation.get("stationName").getAsString(), theStation.get("stationX").getAsDouble(), theStation.get("stationY").getAsDouble(), theStation.get("stationZ").getAsDouble(), theStation.get("dwellTime").getAsInt(), true);
                    }
                    theNextStation = theTimetable.get(0);
                    System.out.println("Added station " + theStation.get("stationName"));
                }

                System.out.println("Timetable created! Stations:");

                for (Station pa : theTimetable) {

                    if (theLastStation.name.equals(pa.getStationName())) {
                        System.out.println("Final station:" + pa.name);
                    } else {
                        System.out.println(pa.name);
                    }
                }
                System.out.println("Timetable received! Next stop, " + theNextStation.getStationName() + "!");
                operation = 1;
            }


        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        //Whatever, handle current W-MTC stuff. But here, let's add a couple of new things.
        if (!worldObj.isRemote) {

            if (rotation < 90.0 && rotation > 0 || rotation == 90.0) { // Works
                boundingBox = AxisAlignedBB.getBoundingBox(posX, posY, posZ, posX - 5, posY + 2, posZ);
            } else if (rotation < 180.0 && rotation > 90.0 || rotation == -180 || rotation == 180) { // Works
                boundingBox = AxisAlignedBB.getBoundingBox(posX, posY, posZ, posX, posY + 2, posZ - 5);
            } else if (rotation < -90.0 && rotation > -90.0 || rotation == -90.0) {
                boundingBox = AxisAlignedBB.getBoundingBox(posX, posY, posZ, posX + 5, posY + 2, posZ);
            } else if (rotation < 0 && rotation > -180 || rotation == 0.0) {
                boundingBox = AxisAlignedBB.getBoundingBox(posX - 10, posY, posZ, posX - 1, posY + 2, posZ);
            }
            List playerEntityList = worldObj.getEntitiesWithinAABBExcludingEntity(null, boundingBox);
            List animalEntityList = worldObj.getEntitiesWithinAABB(EntityAnimal.class, AxisAlignedBB.getBoundingBox(
                    this.posX - 5, this.posY - 5, this.posZ - 5,
                    this.posX + 5, this.posY + 5, this.posZ + 5));

            if (playerEntityList != null && playerEntityList.size() > 0) {

                for (Object obj : playerEntityList) {
                    if (!this.getClass().isInstance(obj)) {
                        if (obj instanceof EntityPlayer) {
                            EntityPlayer thePlayer = (EntityPlayer) obj;
                            obstacleInWay = true;
                            obstacleBrakeDone = false;
                        }
                    }
                }
            }

            if (animalEntityList != null && animalEntityList.size() > 0) {

                for (Object obj : animalEntityList) {
                    System.out.println(obj.getClass().getName());
                    if (!this.getClass().isInstance(obj)) {
                        System.out.println("something 2");
                        if (obj instanceof EntityAnimal) {
                            soundHorn();
                        }
                    }
                }
            }
          /*  if (obstacleInWay && !obstacleBrakeDone) {
                motionX *= brake;
                motionZ *= brake;
                if (this.getSpeed() == 3) {
                    parkingBrake = true;
                    obstacleBrakeDone = true;
                    System.out.println("Braking!");
                }
            }*/

            if (riddenByEntity != null) {
                int dir = MathHelper
                        .floor_double((((EntityPlayer) riddenByEntity).rotationYaw * 4F) / 360F + 0.5D) & 3;
            }

            //	if (mtcOverridePressed) {currentMode = 0;}
            switch (currentMode) {
                case 0: { // Off. However, still transmit to the server. You never know when it might ask you to start.
                    speedLimit = 0;
                    nextSpeedLimit = 0;
                    xStationStop = 0.0;
                    yStationStop = 0.0;
                    zStationStop = 0.0;
                    xSpeedLimitChange = 0.0;
                    ySpeedLimitChange = 0.0;
                    zSpeedLimitChange = 0.0;
                    xStationStop = 0.0;
                    yStationStop = 0.0;
                    zStationStop = 0.0;
                    atoStatus = 0;
                    theTimetable.clear();
                    //Just off doo.
                    break;
                }

                case 1: { // Sure it's being remotely controlled, but it is not ATO. Just being moved around n' stuff.
                    mtcStatus = 1;
                    atoStatus = 0;
                    break;
                }

                case 2: { //Just moving at 15km/h. Nothing too crazy.
                    mtcStatus = 1;
                    atoStatus = 1;
                    speedLimit = 15;
                    boolean hadSent = false;
                    if (!hadSent) {
                        //Traincraft.itsChannel.sendToAllAround(new PacketSetSpeed(15, 0,0,0, this.getEntityId()) , new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                        hadSent = true;
                    }
                    break;
                }
                case 3: {
                    mtcStatus = 1;
                    if (operation == 1) {
                        double distanceFromNextStation = 0.0;
                        if ( theTimetable.size() != 0) {
                            theNextStation = theTimetable.get(0);
                        } else {
                            theNextStation = null;
                        }
                        if (theNextStation != null) {
                            distanceFromNextStation = this.getDistance(this.theNextStation.stationX, this.theNextStation.stationY, this.theNextStation.stationZ);
                            //Handle normal MTC stuff. Use W-MTC station stops and stuff.. Ooh, speaking of those, set the station stop once the train is close enough.
                        }

                        if (distanceFromNextStation < this.getSpeed() + 5 && !stationStop && theNextStation != null) {
                            this.xStationStop = theNextStation.stationX;
                            this.yStationStop = theNextStation.stationY;
                            this.zStationStop = theNextStation.stationZ;
                            Traincraft.atoSetStopPoint.sendToAllAround(new PacketATOSetStopPoint(this.getEntityId(), xFromStopPoint, yFromStopPoint, zFromStopPoint, xStationStop, yStationStop, zStationStop), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                        }
                        if (theCurrentStation != null && stationStop) {
                            int timeUntilDeparture = theCurrentStation.getDwellTime() * 1000;
                            int timeUntilRTD = (theCurrentStation.getDwellTime() - 10) * 1000;



                            if (System.currentTimeMillis() > lastMillsRTD+timeUntilRTD && !readyToDepart) {
                                //Send "readyToDepart" message to the server.
                                JsonObject sendingObj = new JsonObject();
                                sendingObj.addProperty("funct", "readyToDepart");
                                sendingObj.addProperty("stationName", theCurrentStation.getStationName());
                                System.out.println("Ready to depart!");
                                sendMessage(new PDMMessage(this.trainID, serverUUID, sendingObj.toString(), 0));
                                lastMillsRTD=0L;
                                readyToDepart = true;
                            }

                            if (System.currentTimeMillis() > lastMills+timeUntilDeparture) {
                                if (theCurrentStation.isFinalStop() && otherSide != null) {
                                    System.out.println("Final stop!");
                                    //Do switching over code soon
                                    System.out.println("Switching over!");
                                    otherSide.isConnected = true;
                                    otherSide.serverUUID = this.serverUUID;
                                    JsonObject sendingObj = new JsonObject();
                                    sendingObj.addProperty("funct", "newtimetable");
                                    sendingObj.addProperty("position", theCurrentStation.getStationName());
                                    sendMessage(new PDMMessage(otherSide.trainID, serverUUID, sendingObj.toString(), 0));
                                    Traincraft.atoChannel.sendToAllAround(new PacketATO(this.getEntityId(), 0), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
                                    this.canBePulled = true;
                                    this.setCanBeAdjusted(true);
                                    this.parkingBrake = false;
                                    otherSide.canBePulled = false;
                                    otherSide.canBeAdjusted = false;
                                    //Now, just kinda shut down and do nothing.
                                    currentMode = 5;
                                    atoStatus = 0;
                                    stationStop = false;
                                    theCurrentStation = null;
                                    operation = 0;
                                } else {
                                    //No? It isn't the final stop? Okay, continue on the route.
                                    System.out.println("Departing!");

                                    if (isLeading) {
                                        stationStop = false;
                                        stationStopping = true;
                                        atoStatus = 1;
                                        JsonObject sendingObj = new JsonObject();
                                        sendingObj.addProperty("funct", "trainDeparting");
                                        sendingObj.addProperty("stationName", theCurrentStation.getStationName());
                                        sendMessage(new PDMMessage(this.trainID, serverUUID, sendingObj.toString(), 0));
                                        theCurrentStation = null;
                                        readyToDepart = false;
                                    }


                                }
                                lastMills= 0L;

                            }
                        } else {
                            atoStatus = 1;
                        }

                    }

                    // 180 North
                    // 90  West
                    // -90 East
                    // 0 South
                    //Additional safety metehods:

                }


                case 5: {
                    //It's at the back of the train. Remain connected to the server, but keep your ATO status set to 0.
                    break;
                }

            }

            if (this.getInventory()[1] != null && this.getInventory()[1].hasDisplayName() && !setUUID) {
                // System.out.println(this.getInventory()[whichOneToCheck].getItem().getClass().getName());
                if (this.getInventory()[1].getDisplayName().startsWith("uuid=")) {
                    attemptConnection(this.getInventory()[1].getDisplayName().split("uuid=")[1]);
                    setUUID = true;
                    System.out.println("Attempting!");
                }
            }
        }
    }

    public AxisAlignedBB getDetectionBoundingBox() {
        if (boundingBox == null) {
            // boundingBox = AxisAlignedBB.getBoundingBox(posX, posY, posZ, );
        }
        return boundingBox;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.8F;
    }

    @Override
    public boolean canBeAdjusted(EntityMinecart cart) {
        return canBeAdjusted;
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }

    @Override
    public void setLocoTurnedOnFromPacket(boolean set) {
        super.setLocoTurnedOnFromPacket(set);
        if (riddenByEntity != null && riddenByEntity instanceof EntityPlayer && set) {
            EntityPlayer thePlayer = (EntityPlayer) riddenByEntity;
            thePlayer.addChatMessage(new ChatComponentText("Starting self-test, this shouldn't take too long."));
            //Check for configuration book.
            try {


                if (this.getInventory()[1] != null && this.getInventory()[1].getItem() == Items.written_book) {
                    NBTTagCompound compound = this.getInventory()[1].getTagCompound();
                    NBTTagList list = compound.getTagList("pages", Constants.NBT.TAG_STRING);
                    if (list != null) {
                        String theBook = list.getStringTagAt(0);
                        operatingMode = Integer.valueOf(StringUtils.substringBetween(theBook, "/", "/"));
                        thePlayer.addChatMessage(new ChatComponentText("Operating mode: " + operatingMode));
                        if (operatingMode == 2) {
                            if (cartLinked1 != null) {

                                if ((cartLinked1).train != null && (cartLinked1).train.getTrains().size() != 0 && (cartLinked1).train.getTrains().size() > 1) {

                                    for (int i = 0; i < (cartLinked1).train.getTrains().size(); i++) {
                                        EntityRollingStock stock = (cartLinked1).train.getTrains().get(i);
                                        if (stock instanceof DriverlessMetro && stock.uniqueID != (cartLinked1).uniqueID && stock.uniqueID != this.uniqueID) {
                                            otherSide = (DriverlessMetro) stock;
                                            break;
                                        }
                                    }
                                }
                            }

                            if (otherSide != null) {
                                thePlayer.addChatMessage(new ChatComponentText("Other side of consist confirmed. Train ID: " + otherSide.trainID));
                            } else {
                                thePlayer.addChatMessage(new ChatComponentText("There is no other side on the consist. This shouldn't be used for service consists."));
                            }
                            System.out.println(StringUtils.substringBetween(theBook, "|", "|"));
                            attemptConnection(StringUtils.substringBetween(theBook, "|", "|"));
                            thePlayer.addChatMessage(new ChatComponentText("Attempting connection to server."));
                        } else {
                            currentMode = 6;
                        }
                        thePlayer.addChatMessage(new ChatComponentText("Test completed! Ready to use."));
                    }


                }
            } catch (Exception e) {
                thePlayer.addChatMessage(new ChatComponentText("Something happened. Self-test failed. " + e.getMessage()));
            }
        } else if (!set) {
            disconnectFromServer();
        }

    }


    /*@Override
    public void accel(Integer desiredSpeed) {
        if (this.worldObj != null) {

            if (this.getSpeed() != desiredSpeed) {
                if ((int) this.getSpeed() <= this.speedLimit) {


                    double rotation = this.serverRealRotation;
                    if (rotation == 90.0) {

                        this.motionX -= 0.0095 * this.accelerate;

                    } else if (rotation == -90.0) {

                        this.motionX += 0.0095 * this.accelerate;

                    } else if (rotation == 0.0) {

                        this.motionZ -= 0.0095 * this.accelerate;

                    } else if (rotation == -180.0) {

                        this.motionZ += 0.0075 * this.accelerate;
                    }


                }

            }


        }
    }*/

    @Override
    public void stationStopComplete() {
        theCurrentStation = theNextStation;
        theTimetable.remove(theNextStation);
        atoStatus = 0;
        this.xStationStop = 0.0;
        this.yStationStop = 0.0;
        this.zStationStop = 0.0;
        lastMills = System.currentTimeMillis();
        lastMillsRTD = System.currentTimeMillis();
        Traincraft.atoSetStopPoint.sendToAllAround(new PacketATOSetStopPoint(this.getEntityId(), xFromStopPoint, yFromStopPoint, zFromStopPoint, xStationStop, yStationStop, zStationStop), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0D));
    }
}