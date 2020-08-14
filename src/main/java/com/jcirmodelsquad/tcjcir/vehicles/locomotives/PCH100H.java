package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.HydrogenTrain;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class PCH100H extends HydrogenTrain{

    public PCH100H(World world) {
        super(world, EnumTrains.PCH100H.getTankCapacity(), 1000);
        initLoco();
    }
    public PCH100H(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }
    public void initLoco() {
        fuelTrain = 0;
        inventorySize = 10;
        locoInvent = new ItemStack[inventorySize];
    }
    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {return;}
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 2.75;
        double yOffset = 0.4;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
        if(side.isServer()){
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
            anglePitchClient = serverRealPitch*60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance));
        double bogieZ1 = (this.posZ + (rotationSin1* distance));

        if(anglePitchClient>20 && rotationCos1 == 1){
            bogieX1-=pitchRads*2;
            pitch-=pitchRads*1.2;
        }
        if(anglePitchClient>20 && rotationSin1 == 1){
            bogieZ1-=pitchRads*2 + 1;
            pitch-=pitchRads*1.2;
        }
        if (pitchRads == 0.0) {
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }
    /*@Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX +2.5, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5, posZ + 0.3);
            riddenByEntity.setPosition(posX +0, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5, posZ + 0.3);
        }
    }*/
    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public void onUpdate() {
        checkInvent(locoInvent[0]);
        super.onUpdate();
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            ItemStack itemstack = entityplayer.inventory.getCurrentItem();
            if(lockThisCart(itemstack, entityplayer))return true;
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
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
        return 0.9F;
    }

    @Override
    public void pressKey(int i) {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    public int getSizeInventory() {
        return inventorySize;
    }

    @Override
    public String getInventoryName() {
        return "PCH-100H";
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }

    @Override
    public boolean canBeAdjusted(EntityMinecart cart) {
        return canBeAdjusted;
    }

    @Override
    public int refuelingSlurpAmount() {
        return 1;
    }



}