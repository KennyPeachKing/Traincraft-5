package com.jcirmodelsquad.tcjcir.containers;

import com.jcirmodelsquad.tcjcir.models.ModelA40AFootContainer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.common.util.Constants;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

public class TileFortyFootContainer extends TileEntity implements IInventory {
    public ItemStack[] inventory;
    private String customName;
    public int currentColor = 0;

    public TileFortyFootContainer() {
        this.inventory = new ItemStack[this.getSizeInventory()];
    }
        public static final TileEntitySpecialRenderer specialRenderer = new TileEntitySpecialRenderer() {
            @Override
            public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {

                //Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container56_Yellow.png"));
                //This will make your block brightness dependent from surroundings lighting.
                Tessellator tessellator = Tessellator.instance;
                TileFortyFootContainer theTileEntity = (TileFortyFootContainer)tileEntity;
                Block two = tileEntity.getWorldObj().getBlock(tileEntity.xCoord,tileEntity.yCoord - 1,tileEntity.zCoord);
                Block three = tileEntity.getWorldObj().getBlock(tileEntity.xCoord,tileEntity.yCoord - 2,tileEntity.zCoord);
                Block four = tileEntity.getWorldObj().getBlock(tileEntity.xCoord,tileEntity.yCoord - 3,tileEntity.zCoord);
               /* int skyLight = tileEntity.getWorldObj().getSkyBlockTypeBrightness(EnumSkyBlock.Block, (int)x,(int)y,(int)z);

               // skyLight= tileEntity.getWorldObj().getSkyBlockTypeBrightness(EnumSkyBlock.Sky, (int)x, (int)y, (int)z) << 20 | (skyLight<0?0:skyLight) << 4; OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  skyLight % 65536,  skyLight * 0.00001525878f);
                GL11.glColor4f(1,1,1,1);
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                skyLight=tileEntity.getWorldObj().getSkyBlockTypeBrightness(EnumSkyBlock.Sky, (int)x, (int)y, (int)z) << 20 | (Math.max(skyLight, 0)) << 4;
                OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  skyLight % 65536,  skyLight * 0.00001525878f);*/
                GL11.glColor4f(1,1,1,1);
               tmt.Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container40_" + theTileEntity.getAvailableColors().get(theTileEntity.currentColor) + ".png"));
                GL11.glColor4f(1,1,1,1);
                //tessellator.setBrightness(theBlock.getMixedBrightnessForBlock(tileEntity.getWorldObj(), (int)x, (int)y, (int)z));
                tessellator.setBrightness(15);

                if (theTileEntity.currentColor == 1) {
                    System.out.println(three.getUnlocalizedName());
                }
                GL11.glPushMatrix();
                if (two instanceof BlockFortyFootContainer) {
                    GL11.glTranslated(x + 0.5, y + 1.3, z + 0.44F);
                } else if (three instanceof BlockFortyFootContainer) {
                    GL11.glTranslated(x + 0.5, y + 1.3, z + 0.44F);
                } else {
                    GL11.glTranslated(x+ 0.5 ,y + 1, z+ 0.44F);
                }
                if (theTileEntity.currentColor == 1) {

                }
                ModelA40AFootContainer theContainer = new ModelA40AFootContainer();
                theContainer.render(null,10f, 10f, 10f,10f, 0, .0625f);
                GL11.glPopMatrix();
            }

            @Override
            protected void bindTexture(ResourceLocation p_147499_1_){
            }
        };

    @Override
    public int getSizeInventory() {
        return 45;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        if (index < 0 || index >= this.getSizeInventory())
            return null;
        return this.inventory[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if (this.getStackInSlot(index) != null) {
            ItemStack itemstack;

            if (this.getStackInSlot(index).stackSize <= count) {
                itemstack = this.getStackInSlot(index);
                this.setInventorySlotContents(index, null);
                this.markDirty();
                return itemstack;
            } else {
                itemstack = this.getStackInSlot(index).splitStack(count);

                if (this.getStackInSlot(index).stackSize <= 0) {
                    this.setInventorySlotContents(index, null);
                } else {
                    //Just to show that changes happened
                    this.setInventorySlotContents(index, this.getStackInSlot(index));
                }

                this.markDirty();
                return itemstack;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        ItemStack stack = this.getStackInSlot(index);
        this.setInventorySlotContents(index, null);
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        if (index < 0 || index >= this.getSizeInventory())
            return;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
            stack.stackSize = this.getInventoryStackLimit();

        if (stack != null && stack.stackSize == 0)
            stack = null;

        this.inventory[index] = stack;
        this.markDirty();
    }



    @Override
    public String getInventoryName() {
        return "40 Foot Container";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return true;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        System.out.println(nbt.toString());
        super.readFromNBT(nbt);
        NBTTagList list = nbt.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        inventory = new ItemStack[getSizeInventory()];

        for (int i = 0; i < list.tagCount(); ++i) { NBTTagCompound comp = list.getCompoundTagAt(i); int j = comp.getByte("Slot") & 255; if (j >= 0 && j < inventory.length)
        {
            inventory[j] = ItemStack.loadItemStackFromNBT(comp);
        }

        }
        currentColor = nbt.getInteger("currentColor");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < inventory.length; ++i)
        {
            if (inventory[i] != null)
            {
                NBTTagCompound comp = new NBTTagCompound();
                comp.setByte("Slot", (byte)i);
                inventory[i].writeToNBT(comp);
                list.appendTag(comp);
            }
        }

        nbt.setTag("Items", list);
        nbt.setInteger("currentColor", currentColor);
        nbt.setString("currentColorString", getAvailableColors().get(currentColor));
    }

    public ArrayList<String> getAvailableColors() {
        ArrayList<String> leColors = new ArrayList<String>();
        leColors.add("Grey");
        leColors.add("Blue");
        return leColors;
    }

    public void goToNextColor() {
        System.out.println("Going tonext color");
        System.out.println(currentColor);
        if (getAvailableColors().size() > 0) {
            if (currentColor > getAvailableColors().size() -2) {
                currentColor = 0;
            } else {
                currentColor++;
            }
        }

    }

}

