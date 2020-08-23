package train.common.mtc;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.network.NetworkRegistry;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.packets.*;

import java.util.List;



    public class BlockMTCMultiTransmitter extends BlockContainer {
        public BlockMTCMultiTransmitter(Material p_i45386_1_) {
            super(p_i45386_1_);
        }

        @Override
        public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
            return new TileMTCMultiTransmitter();
        }
    }



