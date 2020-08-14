package com.jcirmodelsquad.tcjcir.features.actualsignalblock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.items.ItemSignalPairingDevice;
import train.common.library.Info;

public class BlockActualSignalBlock extends BlockContainer {
    private IIcon textureTop;
    private IIcon textureBottom;
    private IIcon textureFront;
    private IIcon textureSide;

    public BlockActualSignalBlock(Material p_i45386_1_) {
        super(p_i45386_1_);
    }

    @Override
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par6, float par7, float par8, float par9) {
        TileEntity tile = world.getTileEntity(i, j, k);
        if (player.getCurrentEquippedItem().getItem() instanceof ItemSignalPairingDevice && !world.isRemote) {
            if (tile instanceof TileActualSignalBlock) {
                TileActualSignalBlock theActualBlock = (TileActualSignalBlock) tile;
                theActualBlock.activated(player);
                System.out.println("ye.");
            }
        }
        return false;
    }

    @Override
    public IIcon getIcon(int i, int j) {
        if (i == 1) {
            return textureTop;
        }
        if (i == 0) {
            return textureBottom;
        }
        else {
            return textureSide;
        }
    }

    @Override
    public boolean canProvidePower() {
        return true;
    }

    @Override
    public boolean isSideSolid(IBlockAccess world, int i, int j, int k, ForgeDirection side) {
        return side == ForgeDirection.UP;


    }

    @Override
    public boolean isBlockNormalCube() {
        return false;
    }


    @Override
    public int isProvidingStrongPower(IBlockAccess world, int x, int y, int z, int side) {
        return isProvidingWeakPower(world, x, y, z,  side);
    }

    @Override
    public boolean canConnectRedstone(IBlockAccess world, int i, int j, int k, int dir) {
        return true;
    }
    @Override
    public int isProvidingWeakPower(IBlockAccess world, int x, int y, int z, int side) {
        TileEntity t = world.getTileEntity(x, y, z);
        if (t instanceof TileActualSignalBlock) {
            TileActualSignalBlock tile = (TileActualSignalBlock) t;
            if (tile.activated) {
                return 15;
            } else {
                return 0;
            }
        }
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        textureTop = iconRegister.registerIcon(Info.modID.toLowerCase() + ":detector_top");
        textureBottom = iconRegister.registerIcon(Info.modID.toLowerCase() + ":detector_bottom");
        textureSide = iconRegister.registerIcon(Info.modID.toLowerCase() + ":detector_side");
    }

    @Override
    public TileEntity createTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileActualSignalBlock();
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileActualSignalBlock();
    }
}
