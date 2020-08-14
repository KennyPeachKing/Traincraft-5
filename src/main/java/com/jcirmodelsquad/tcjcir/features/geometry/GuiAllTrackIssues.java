package com.jcirmodelsquad.tcjcir.features.geometry;


import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;

public class GuiAllTrackIssues extends GuiScreen {
    ExperimentalGeometryCar theCar;

    public GuiAllTrackIssues(Entity entity) {

        if (entity instanceof ExperimentalGeometryCar) {
            theCar = (ExperimentalGeometryCar)entity;
      }
    }

    @Override
    public void initGui() {
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
         drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, "All detected issues:", this.width / 2, 40, 0xFFFFFFFF);
        this.drawString( this.fontRendererObj,theCar.currentTrackReport, this.width/2 -20, this.height/2 + 3,  0xFFFFFFFF);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();



    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}
