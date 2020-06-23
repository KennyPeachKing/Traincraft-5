package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import train.common.Traincraft;
import train.common.library.Info;

import java.util.List;

public class ItemRemoteControllerModule extends Item {

    public ItemRemoteControllerModule()  {
        setCreativeTab(Traincraft.tcTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":remote_controller_module");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + "Place this any slot of trains inventory.");
        par3List.add("\u00a77" + "Then, use a remote controller to control it.");
        par3List.add("\u00a77" + EnumChatFormatting.LIGHT_PURPLE + "Simple!");
    }

}
