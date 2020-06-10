package com.jcirmodelsquad.tcjcir.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class Amfleet extends EntityRollingStock implements IPassenger {
    public Amfleet(World world) {
        super(world);
    }

    public Amfleet(World world, double d, double d1, double d2){
        this(world);

    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0;
    }
}
