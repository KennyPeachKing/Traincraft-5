package com.jcirmodelsquad.tcjcir.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class DieselCF7 extends DieselTrain {
	public DieselCF7(World world) {
		super(world, EnumTrains.locoDieselSD70.getTankCapacity(), LiquidManager.dieselFilter());
	}



	public DieselCF7(World world, double d, double d1, double d2) {
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
	public float getOptimalDistance(EntityMinecart cart) {
		return 0;
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
}
