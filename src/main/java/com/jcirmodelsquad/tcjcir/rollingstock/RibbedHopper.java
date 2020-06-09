package com.jcirmodelsquad.tcjcir.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import train.common.api.Freight;

public class RibbedHopper  extends Freight implements IInventory  {
    public RibbedHopper(World world) {
        super(world);
    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0;
    }
}
