package com.jcirmodelsquad.tcjcir.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.core.util.TraincraftUtil;
import train.common.library.GuiIDs;

public class FRED extends EntityRollingStock{
    public int freightInventorySize;
    public int numFreightSlots;
    public FRED(World world) {
        super(world);

    }

    public FRED(World world, double d, double d1, double d2){
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
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override public boolean interactFirst(EntityPlayer entityplayer) { return false;}

    @Override
    public boolean isStorageCart() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.1F;
    }
}


