package com.jcirmodelsquad.tcjcir.features.eti;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockTrainMonitor extends BlockContainer {
    int dir;
    public BlockTrainMonitor(Material p_i45386_1_) {
        super(p_i45386_1_);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }


    public int getRenderType() {
        return -1;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
//This gets the direction the player is facing as an int from 0 to 3
        dir = MathHelper.floor_double((player.rotationYaw * 4F) / 360F + 0.5D) & 3;
//You can use the block metadata to save the direction
//Or you can save it in a tile entity if you are using one
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileTrainMonitor(dir);
    }
}
