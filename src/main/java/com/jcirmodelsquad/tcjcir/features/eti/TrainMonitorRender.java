package com.jcirmodelsquad.tcjcir.features.eti;

import com.jcirmodelsquad.tcjcir.features.containers.BlockFortyFootContainer;
import com.jcirmodelsquad.tcjcir.features.containers.TileFortyFootContainer;
import com.jcirmodelsquad.tcjcir.models.ModelTrainMonitorSatelite;
import com.jcirmodelsquad.tcjcir.models.containers.ModelA40AFootContainer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;

public class TrainMonitorRender extends TileEntitySpecialRenderer {
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {

        //This will make your block brightness dependent from surroundings lighting.
        tmt.Tessellator tessellator = tmt.Tessellator.getInstance();
        Tessellator.bindTexture(new ResourceLocation("tc:textures/blocks/sattelite_dish.png"));
        GL11.glColor4f(1,1,1,1);
        //tmt.Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container40_" + theTileEntity.getAvailableColors().get(theTileEntity.currentColor) + ".png"));
        GL11.glColor4f(1,1,1,1);
        //tessellator.setBrightness(theBlock.getMixedBrightnessForBlock(tileEntity.getWorldObj(), (int)x, (int)y, (int)z));

        GL11.glPushMatrix();
        ModelTrainMonitorSatelite theSat = new ModelTrainMonitorSatelite();
        GL11.glTranslated(x + 0.5, y,z + 0.5);

        int dir = ((TileTrainMonitor)tileEntity).dir;
        switch(dir) {
            case 0: {
                GL11.glRotatef(180F, 1.0F, 0F, 1F);
                //GL11.glRotatef(0F, 1F, 0F, 1F);
                break;
            }
            case 1: {
                GL11.glRotatef(180F, 0, 0F, 1F);
                //GL11.glRotatef(0F, 1F, 0F, 1F);
                break;
            }
            case 2: {
                GL11.glRotatef(180F, 1F, 0F, 1F);
                //GL11.glRotatef(0F, 1F, 0F, 1F);
                break;
            }
            case 3: {
                GL11.glRotatef(180F, 1.0F, 0F, 1F);
                //GL11.glRotatef(0F, 1F, 0F, 1F);
                break;
            }
        }

       // GL11.glRotatef(180F, 0F, 0F, 1F);
        theSat.render(null,0, 0, 0,0, 0, .0625f);
        GL11.glPopMatrix();
    }

    @Override
    protected void bindTexture(ResourceLocation p_147499_1_){
    }
}
