package com.jcirmodelsquad.tcjcir.extras;

import com.jcirmodelsquad.tcjcir.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import train.common.api.Locomotive;

public class HUDGeometryCar extends GuiScreen {
    private Minecraft game;
    @SubscribeEvent
    public void onGameRender(RenderGameOverlayEvent.Text event){

        if (game != null && game.thePlayer != null && game.thePlayer.ridingEntity != null && game.thePlayer.ridingEntity instanceof ExperimentalGeometryCar && Minecraft.isGuiEnabled() && game.currentScreen == null) {
            renderSkillHUD(event, (ExperimentalGeometryCar) game.thePlayer.ridingEntity);
        } else {
            this.game = this.mc = Minecraft.getMinecraft();
            this.fontRendererObj = this.game.fontRenderer;
        }
    }

    public void renderSkillHUD(RenderGameOverlayEvent event, ExperimentalGeometryCar theCar) {

    }


    public static void drawTexturedRect(ResourceLocation texture, double x, double y, int u, int v, int width, int height, int imageWidth, int imageHeight, double scale) {
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        double minU = (double)u / (double)imageWidth;
        double maxU = (double)(u + width) / (double)imageWidth;
        double minV = (double)v / (double)imageHeight;
        double maxV = (double)(v + height) / (double)imageHeight;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + scale*(double)width, y + scale*(double)height, 0, maxU, maxV);
        tessellator.addVertexWithUV(x + scale*(double)width, y, 0, maxU, minV);
        tessellator.addVertexWithUV(x, y, 0, minU, minV);
        tessellator.addVertexWithUV(x, y + scale*(double)height, 0, minU, maxV);
        tessellator.draw();
    }

}
