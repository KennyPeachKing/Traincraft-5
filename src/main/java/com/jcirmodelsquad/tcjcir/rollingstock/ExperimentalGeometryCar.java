package com.jcirmodelsquad.tcjcir.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.api.IPassenger;

public class ExperimentalGeometryCar extends EntityRollingStock implements IPassenger {


    public ExperimentalGeometryCar(World world) {
        super(world);
    }

    public ExperimentalGeometryCar(World world, double d, double d1, double d2) {
        this(world);
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0;
    }
}
