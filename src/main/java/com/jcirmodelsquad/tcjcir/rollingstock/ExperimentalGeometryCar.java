package com.jcirmodelsquad.tcjcir.rollingstock;



import cofh.api.energy.IEnergyHandler;
import com.jcirmodelsquad.tcjcir.geometryvechicle.PotentialIssue;
import com.jcirmodelsquad.tcjcir.geometryvechicle.TrackPosition;
import cpw.mods.fml.common.Loader;
import mods.railcraft.api.signals.ISignalBlockTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.tile.TileTCRailGag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExperimentalGeometryCar extends EntityRollingStock implements IPassenger {

    public String railroadLine = "Bruh Moment Mainline";
    public String geometryCarName = "FRA Geometry Car";
    public String lineType = "mainline";
    public String standard = "JCIR";
    public boolean missionStarted = false;
    private ArrayList<PotentialIssue> problematicTrackLocations = new ArrayList<PotentialIssue>();
    private TrackPosition missionStartLocation;
    private String currentTrackReport;
    private ArrayList<String> accessibleNames = new ArrayList<String>();

    public Block lastBlock;
    public TileEntity lastTileEntity;

    public ExperimentalGeometryCar(World world) {
        super(world);
        dataWatcher.addObject(31, railroadLine);
        dataWatcher.addObject(30, geometryCarName);
        dataWatcher.addObject(29, lineType);
        dataWatcher.addObject(28, standard);
        dataWatcher.addObject(27, missionStarted + ":" + currentTrackReport);
    }

    public ExperimentalGeometryCar(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
        missionStartLocation = new TrackPosition(new Double(posX).intValue(), new Double(posY).intValue(), new Double(posZ).intValue());
        dataWatcher.addObject(31, railroadLine);
        dataWatcher.addObject(30, geometryCarName);
        dataWatcher.addObject(29, lineType);
        dataWatcher.addObject(28, standard);
        dataWatcher.addObject(27, missionStarted + ":" + currentTrackReport);
       // dataWatcher.addObject(32, currentTrackReport);
    }

    //Standard Cart Stuff
    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {
            return;
        }
        riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset(), posZ);
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            ItemStack itemstack = entityplayer.inventory.getCurrentItem();
            ItemStack t = entityplayer.inventory.getStackInSlot(1);
            if (lockThisCart(itemstack, entityplayer)) return true;
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }

            if (itemstack != null && itemstack.getItem() == Items.paper) {
                //Start mission.
                missionStartLocation = new TrackPosition(new Double(posX).intValue(), new Double(posY).intValue(), new Double(posZ).intValue());
                missionStarted = true;
                System.out.println("Started!");
                problematicTrackLocations.clear();
            }

            if (itemstack != null && itemstack.getItem() == Items.sign && missionStarted) {
                //End mission. (implement later)
                System.out.println(createTrackReport());
                ItemStack head = new ItemStack(Items.written_book,1);
                head.setTagCompound(new NBTTagCompound());
                head.stackTagCompound.setString("author", geometryCarName);
                head.stackTagCompound.setString("title", railroadLine + " Track Report");
                NBTTagList bookTagList = new NBTTagList();
                bookTagList.appendTag(new NBTTagString(createTrackReport()));
                head.stackTagCompound.setTag("pages", bookTagList);
                            entityplayer.inventory.addItemStackToInventory(head);
                ItemStack head2 = new ItemStack(Items.skull,1,3);
                head.setTagCompound(new NBTTagCompound());
                head.stackTagCompound.setString("SkullOwner", "iWasHere");
                            entityplayer.inventory.addItemStackToInventory(head2);
                EntityItem item = new EntityItem(worldObj, entityplayer.posX, entityplayer.posY, entityplayer.posZ, head2);
                worldObj.spawnEntityInWorld(item);

                FileWriter myWriter = null;
                try {

                    File myObj = new File(Loader.instance().getConfigDir() + File.separator + "traincraft" + File.separator + railroadLine + " Track Report.txt");
                    System.out.println(Loader.instance().getConfigDir() + File.separator + "traincraft" + File.separator + railroadLine + " Track Report.txt");
                    myObj.createNewFile();

                    myWriter = new FileWriter(myObj);
                    myWriter.write(createTrackReport());
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if (!worldObj.isRemote) {
                entityplayer.mountEntity(this);
            }
        }
        return true;
    }

    @Override
    public boolean canBeRidden() {
        return true;
    }

    @Override
    public boolean isStorageCart() {
        return false;
    }

    @Override
    public boolean isPoweredCart() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.17F;
    }


    //Special Geometry Stuff ooh!
    public void onUpdate() {
        super.onUpdate();
        if (!missionStarted) {
            currentTrackReport = "Mission not started yet.";
        }
        if (missionStarted && worldObj != null && ticksExisted % 20 == 0) {
            currentTrackReport = createTrackReport();
        }
        if (missionStarted && !worldObj.isRemote) {


            Block blockAboveCar = getBlockThatIsntAir(this.posX, this.posY + 2, this.posZ);
            Block blockAboveCar2 = worldObj.getBlock(doubleToInt(this.posX), doubleToInt(this.posY +2), doubleToInt(this.posZ));
            Block blockOneAboveCar = getBlockThatIsntAir(this.posX, this.posY + 3, this.posZ);
            Block blockLeft = null;
            Block blockRight = null;
            Block blockBottom = getBlockThatIsntAir(this.posX, this.posY, this.posZ);
            TileEntity tileBottom = worldObj.getTileEntity(doubleToInt(this.posX), doubleToInt(this.posY - 1), doubleToInt(this.posZ));


            double rotation = this.serverRealRotation;
            // 180 North
            // 90  West
            // -90 East
            // 0 South

            //Determine the blocks to the left and the right.
            if (rotation < 90.0 && rotation > 0 || rotation == 90.0) { // Works
                blockLeft = getBlockThatIsntAir(doubleToInt(posX - 1), doubleToInt(posY + 1), doubleToInt(posZ));
                blockRight = getBlockThatIsntAir(doubleToInt(posX + 1), doubleToInt(posY + 1), doubleToInt(posZ));
            } else if (rotation < 180.0 && rotation > 90.0 || rotation == -180 || rotation == 180) { // Works
                blockLeft = getBlockThatIsntAir(doubleToInt(posX), doubleToInt(posY + 1), doubleToInt(posZ - 1));
                blockRight = getBlockThatIsntAir(doubleToInt(posX), doubleToInt(posY + 1), doubleToInt(posZ + 1));
            } else if (rotation < -90.0 && rotation > -90.0 || rotation == -90.0) {
                blockLeft = getBlockThatIsntAir(doubleToInt(posX + 1), doubleToInt(posY + 1), doubleToInt(posZ));
                blockRight = getBlockThatIsntAir(doubleToInt(posX - 1), doubleToInt(posY + 1), doubleToInt(posZ));

            } else if (rotation < 0 && rotation > -180 || rotation == 0.0) {
                blockLeft = getBlockThatIsntAir(doubleToInt(posX), doubleToInt(posY + 1), doubleToInt(posZ + 1));
                blockRight = getBlockThatIsntAir(doubleToInt(posX), doubleToInt(posY + 1), doubleToInt(posZ - 1));
            }


            if (blockLeft != null && blockRight != null && blockAboveCar != null && blockOneAboveCar != null) {
                System.out.println("Left: " + blockLeft.getLocalizedName());
                System.out.println("Right: " + blockRight.getLocalizedName());
                int light = worldObj.getBlockLightValue(doubleToInt(this.posX), doubleToInt(this.posY) + 2, doubleToInt(this.posZ));
                System.out.println("Above: " + blockAboveCar.getLocalizedName() + ", light level: " + light);
                System.out.println("One above: " + blockOneAboveCar.getLocalizedName());
            }

            //Detect if a block is above, to the right, or to the left of the geometry car, report if there is.
            // Type BLOCK_TOO_CLOSE_TO_TRACK.
            if (blockAboveCar != null && !(blockAboveCar instanceof IEnergyHandler) || blockLeft != null && !(blockLeft instanceof ISignalBlockTile) || blockRight != null && !(blockRight instanceof ISignalBlockTile)) {
                addIssue(new PotentialIssue(doubleToInt(posX), doubleToInt(posY), doubleToInt(posZ), PotentialIssue.IssueType.BLOCK_TOO_CLOSE_TO_TRACK));
            }

            //Detect if there is a block one above the top of the train, and to the left, or, if there is a block one above the train, and to the right, and if there is, report it.
            // Type BLOCK_TOO_CLOSE_TO_TRACK_IN_TUNNEL.
            if ((blockOneAboveCar != null && blockLeft != null) || (blockOneAboveCar != null && blockRight != null)) {
                addIssue(new PotentialIssue(doubleToInt(posX), doubleToInt(posY), doubleToInt(posZ), PotentialIssue.IssueType.BLOCK_TOO_CLOSE_TO_TRACK_IN_TUNNEL));
            }


            //Detect if a block's light level is too low. If so, report it.
            // Type TUNNEL_TOO_DARK.

            if (blockAboveCar2 != null && blockAboveCar2.getLightValue() < 10) {
                addIssue(new PotentialIssue(doubleToInt(posX), doubleToInt(posY), doubleToInt(posZ), PotentialIssue.IssueType.TUNNEL_TOO_DARK));
            }

            //

           /* if (tileBottom instanceof TileTCRail) {
                TileTCRail track = (TileTCRail) tileBottom;
                if (track.getTrackType() == ItemTCRail.TrackTypes.SLOPE_WOOD || track.getTrackType() == ItemTCRail.TrackTypes.LARGE_SLOPE_WOOD || track.getTrackType() == ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_WOOD && !checkForSameIssueType(this.posX, this.posY, this.posZ, PotentialIssue.IssueType.WOODEN_SLOPE)) {
                    addIssue(new PotentialIssue(doubleToInt(posX), doubleToInt(posY), doubleToInt(posZ), PotentialIssue.IssueType.WOODEN_SLOPE));
                }
                if (track.getTrackType() == ItemTCRail.TrackTypes.SLOPE_GRAVEL || track.getTrackType() == ItemTCRail.TrackTypes.SLOPE_BALLAST && lineType.equals("mainline") && !checkForSameIssueType(this.posX, this.posY, this.posZ, PotentialIssue.IssueType.SMALL_SLOPE_ON_MAINLINE)) {
                  addIssue(new PotentialIssue(doubleToInt(posX), doubleToInt(posY), doubleToInt(posZ), PotentialIssue.IssueType.SMALL_SLOPE_ON_MAINLINE));
                }

            }*/



            if (tileBottom instanceof TileTCRailGag) {
                TileTCRailGag track = (TileTCRailGag) tileBottom;

                //Detect if the slope below the train is made out of wood. If so, report it.
                // Type: WOODEN_SLOPE.
                if (track.type.equals("SLOPE_WOOD") || track.type.equals("LARGE_SLOPE_WOOD") || track.type.equals("VERY_LARGE_SLOPE_WOOD")) {
                    addIssue(new PotentialIssue(doubleToInt(posX), doubleToInt(posY), doubleToInt(posZ), PotentialIssue.IssueType.WOODEN_SLOPE));
                }
                // Detect if there are normal slopes on mainlines. If so, report it.
                if (track.type.equals("SLOPE_GRAVEL") || track.type.equals("SLOPE_BALLAST") && lineType.equals("mainline"))  {
                    addIssue(new PotentialIssue(doubleToInt(posX), doubleToInt(posY), doubleToInt(posZ), PotentialIssue.IssueType.SMALL_SLOPE_ON_MAINLINE));
                }

                //Detect if we are on a slope, and there is a block above us, and if so, report it.
                if (track.type.contains("SLOPE") && blockAboveCar != null || blockOneAboveCar != null) {
                    addIssue(new PotentialIssue(doubleToInt(posX), doubleToInt(posY), doubleToInt(posZ), PotentialIssue.IssueType.BLOCK_TOO_CLOSE_TO_TRACK_ON_SLOPE));
                }
            }

            lastTileEntity = tileBottom;
            // if (blockLeft != null && !(blockLeft instanceof BlockAir) && checkForSameIssueType(blockLeft.x, this.posY + 2, this.posZ, PotentialIssue.IssueType.BLOCK_TOO_CLOSE_TO_TRACK)) {
//
            //     }


           /* Block theBlockOnTop = worldObj.getBlock(new Double(this.posX).intValue(), new Double(this.posY).intValue() + 2, new Double(this.posZ).intValue());
            Block theBlockOnTop1 = worldObj.getBlock(new Double(this.posX).intValue(), new Double(this.posY).intValue() + 3, new Double(this.posZ).intValue());
            Block theBlockOnTheLeft = worldObj.getBlock(new Double(this.posX).intValue(), new Double(this.posY + 1).intValue(), new Double(this.posZ + 2).intValue());
            Block theBlockOnTheRight = worldObj.getBlock(new Double(this.posX + 1).intValue(), new Double(this.posY).intValue(), new Double(this.posZ).intValue());
            Block theBottomBlock = worldObj.getBlock(new Double(this.posX).intValue(), new Double(this.posY).intValue() - 1, new Double(posZ).intValue());

            if (theBlockOnTop != null && !(theBlockOnTop instanceof BlockAir) && getPotentialIssueByCoordinates(posX, posY, posZ) == null) {
                System.out.println("Issue found!");
                problematicTrackLocations.add(new PotentialIssue(new Double(this.posX).intValue(), new Double(this.posY).intValue(), new Double(this.posZ).intValue(), PotentialIssue.IssueType.BLOCK_TOO_CLOSE_TO_TRACK));
            }

            if (theBlockOnTheLeft != null && !(theBlockOnTheLeft instanceof BlockAir) && getPotentialIssueByCoordinates(posX, posY, posZ) == null) {
                //  problematicTrackLocations.add(new PotentialIssue(new Double(this.posX).intValue(), new Double(this.posY).intValue(), new Double(this.posZ).intValue(), PotentialIssue.IssueType.BLOCK_TOO_CLOSE_TO_TRACK));
            }

            if (theBlockOnTheRight != null && !(theBlockOnTheRight instanceof BlockAir) && getPotentialIssueByCoordinates(posX, posY, posZ) == null) {
                //problematicTrackLocations.add(new PotentialIssue(new Double(this.posX).intValue(), new Double(this.posY).intValue(), new Double(this.posZ).intValue(), PotentialIssue.IssueType.BLOCK_TOO_CLOSE_TO_TRACK));
            }

            if (theBlockOnTop1 != null && !(theBlockOnTop1 instanceof BlockAir) && theBlockOnTheLeft != null && !(theBlockOnTheLeft instanceof BlockAir) && getPotentialIssueByCoordinates(posX, posY, posZ) == null) {
                System.out.println("Okay..");
                problematicTrackLocations.add(new PotentialIssue(new Double(this.posX).intValue(), new Double(this.posY).intValue(), new Double(this.posZ).intValue(), PotentialIssue.IssueType.BLOCK_TOO_CLOSE_TO_TRACK_IN_TUNNEL));
            }



            if (worldObj.getBlock(new Double(this.posX).intValue(), new Double(this.posY).intValue() + 1, new Double(posZ).intValue()) != null) {
                int light = worldObj.getBlockLightValue(new Double(this.posX).intValue(), new Double(this.posY).intValue() + 1, new Double(posZ).intValue());
                if (light < 10 && getPotentialIssueByCoordinates(posX, posY, posZ) == null) {
                    problematicTrackLocations.add(new PotentialIssue(new Double(this.posX).intValue(), new Double(this.posY).intValue(), new Double(this.posZ).intValue(), PotentialIssue.IssueType.TUNNEL_TOO_DARK));
                }
            }
*/
            // if (theBottomBlock != null && )
            //}


        }

        if (worldObj != null && !worldObj.isRemote && ticksExisted % 5 == 0) {


               dataWatcher.updateObject(31, railroadLine);
                 dataWatcher.updateObject(30, geometryCarName);
                dataWatcher.updateObject(29, lineType);
                 dataWatcher.updateObject(28, standard);
                 dataWatcher.updateObject(27, missionStarted + ":" + currentTrackReport);
//                 dataWatcher.updateObject(26, currentTrackReport);


           // dataWatcher.updateObject(31, railroadLine);
          //  dataWatcher.updateObject(30, geometryCarName);
           // dataWatcher.updateObject(29, lineType);
           // dataWatcher.updateObject(28, standard);
          //  dataWatcher.updateObject(27, Boolean.toString(missionStarted));
           /// dataWatcher.updateObject(26, currentTrackReport);


        }
    }



    public void addIssue(PotentialIssue theIssue) {

        if (!checkForSameIssueType(this.posX, this.posY, this.posZ, theIssue.issue)) {
            if (this.ridingEntity != null && this.ridingEntity instanceof EntityPlayer) {
                ((EntityPlayer) this.ridingEntity).addChatMessage(new ChatComponentText("Track issue found at this position! " + theIssue.issue.getTypeName() + ": " + theIssue.issue.getSafeMessage()));
            }

            problematicTrackLocations.add(theIssue);
        }
    }

    public void startMission() {
        missionStartLocation = new TrackPosition(new Double(posX).intValue(), new Double(posY).intValue(), new Double(posZ).intValue());
        missionStarted = true;
        System.out.println("Started!");
        dataWatcher.updateObject(27, missionStarted + ":" + currentTrackReport);
        problematicTrackLocations.clear();
    }
    public String createTrackReport() {
        StringBuilder theReport = new StringBuilder();
        TrackPosition lastPosition = null;
        theReport = new StringBuilder(geometryCarName + "\n Track Report \n Railroad: " + railroadLine + "(type " + lineType + ")" + "\n Distance from start: " + doubleToInt(getDistance(this.missionStartLocation.x, this.missionStartLocation.y, this.missionStartLocation.z)) + " blocks.");
        theReport.append("\nDetected issues: ");
        for (PotentialIssue issue : problematicTrackLocations) {

            theReport.append("\n ").append(issue.thePosition.x).append(",").append(issue.thePosition.y).append(",").append(issue.thePosition.z).append(": ").append(issue.issue.getTypeName()).append(": ").append(issue.issue.getSafeMessage());
        }

        if (problematicTrackLocations.size() == 0) {
            theReport.append("\nNo detected track issues!");
        }
        theReport.append("\n");
        theReport.append("\n");
        theReport.append("End of track report.");
        return theReport.toString();
    }

    public PotentialIssue getPotentialIssueByCoordinates(double x, double y, double z) {
        for (PotentialIssue temp : problematicTrackLocations) {
            if (temp.thePosition.x == doubleToInt(x) && temp.thePosition.y == doubleToInt(y) && temp.thePosition.z == doubleToInt(z)) {
                return temp;
            }
        }
        return null;
    }

    public void generateTrackReportAsBook() {

    }

    public void generateTrackReportAsFile() {

        FileWriter myWriter = null;
        try {

            File myObj = new File(Loader.instance().getConfigDir() + File.separator + "traincraft" + File.separator + railroadLine + " Track Report.txt");
            System.out.println(Loader.instance().getConfigDir() + File.separator + "traincraft" + File.separator + railroadLine + " Track Report.txt");
            myObj.createNewFile();

            myWriter = new FileWriter(myObj);
            myWriter.write(createTrackReport());
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int doubleToInt(double theInt) {
        //Made this to be a lot more cleaner..
        return net.minecraft.util.MathHelper.floor_double(theInt);
    }


    public Block getBlockWithDouble(double x, double y, double z) {
        return worldObj.getBlock(doubleToInt(x), doubleToInt(y), doubleToInt(z));
    }

    public Boolean checkForSameIssueType(double x, double y, double z, PotentialIssue.IssueType theType) {
        if (getPotentialIssueByCoordinates(x, y, z) != null) {
            return getPotentialIssueByCoordinates(x, y, z).issue == theType;
        }
        return false;
    }

    public Block getBlockThatIsntAir(double x, double y, double z) {
        if (worldObj.getBlock(doubleToInt(x), doubleToInt(y), doubleToInt(z)) != null && !(worldObj.getBlock(doubleToInt(x), doubleToInt(y), doubleToInt(z)) instanceof BlockAir)) {
            return worldObj.getBlock(doubleToInt(x), doubleToInt(y), doubleToInt(z));
        }
        return null;
    }

    public int[] getCoordinatesFromBlockObject(Block theBlock) {

        if (theBlock != null) {

        }
        return null;
    }
}
