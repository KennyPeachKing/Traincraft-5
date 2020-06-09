package com.jcirmodelsquad.tcjcir.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.api.Locomotive;
import train.common.library.EnumTrains;

public class DieselAlcoS2 extends DieselTrain {
    public DieselAlcoS2(World world) {
        super(world, EnumTrains.locoDieselSD40.getTankCapacity(), LiquidManager.dieselFilter());
        System.out.println("In Traincraft..");
    }

    public DieselAlcoS2(World world, double d, double d1, double d2) {
        this(world);
    }
    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0;
    }
}
