package com.jcirmodelsquad.tcjcir.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;

public class DriverlessMetro extends ElectricTrain {

    public DriverlessMetro(World world) {
        super(world);
    }

    public DriverlessMetro(World world, double d, double d1, double d2) {
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
