package com.jcirmodelsquad.tcjcir.features.eti;

import com.jcirmodelsquad.tcjcir.models.ModelTrainMonitorSatelite;
import com.jcirmodelsquad.tcjcir.models.containers.ModelA40AFootContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;

public class TrainMonitorItemRender implements IItemRenderer {
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY: {
                renderContainer(0.0F, 0F, 0.0F, item );
                break;
            }
            case EQUIPPED: {
                renderContainer(0.1F, 0.1F, 0.7F, item );
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderContainer(0F, 0.1F, 0F, item );
                return;
            }
            case INVENTORY: {
                renderContainer(0.5F, -0.5F, 0.5F, item );
                break;
            }
            default:
                break;
        }
    }

    private void renderContainer(float f, float g, float h, ItemStack theItem) {
        ModelTrainMonitorSatelite theContainer = new ModelTrainMonitorSatelite();
        Tessellator.bindTexture(new ResourceLocation("tc:textures/blocks/sattelite_dish.png"));

        GL11.glPushMatrix();

        GL11.glTranslatef(f, g + 0.5F, h);
        GL11.glRotatef(180F, 1.0F, 0F, 1F);
        //GL11.glScalef(0.4F, 0.4F, 0.4F);
        theContainer.render(null, 0.7F, 0.7F, 0.7F, 0.7F, 0, 0.0625F);
        GL11.glPopMatrix();
    }
}
