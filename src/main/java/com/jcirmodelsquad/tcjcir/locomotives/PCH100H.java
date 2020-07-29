package com.jcirmodelsquad.tcjcir.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;
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
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX +2.5, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5, posZ + 0.3);
            riddenByEntity.setPosition(posX +0, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5, posZ + 0.3);
        }
    }
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
