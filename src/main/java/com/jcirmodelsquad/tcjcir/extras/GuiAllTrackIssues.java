package com.jcirmodelsquad.tcjcir.extras;


import com.jcirmodelsquad.tcjcir.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import org.lwjgl.input.Keyboard;
import train.client.gui.GuiTCTextField;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.core.network.PacketDestination;
import train.common.core.network.PacketUpdateTrainID;
import train.common.mtc.packets.PacketMTCLevelUpdate;

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
