package com.jcirmodelsquad.tcjcir.features.geometry;

import com.jcirmodelsquad.tcjcir.extras.packets.GenerateTrackReport;
import com.jcirmodelsquad.tcjcir.extras.packets.StartMissionPacket;
import com.jcirmodelsquad.tcjcir.extras.packets.UpdateGeometryCar;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import train.client.gui.GuiTCTextField;
import train.common.Traincraft;

public class GuiGeometryCar extends GuiScreen {
    private ExperimentalGeometryCar theCar;
    private GuiTCTextField railroadName;
    private GuiTCTextField geometryCarName;
    private GuiTCTextField railroadStandard;
    private GuiButton startStopButton;
    private GuiButton railroadType;
    private GuiButton lockButton;
    private GuiButton allTrackIssues;
    private GuiTCTextField operatingCrew;
    public int xSize = 305;
    public int ySize = 274;
    public int guiLeft;
    public int guiTop;
    public boolean showReports = false;
    public GuiGeometryCar(EntityPlayer theRider) {
        if (theRider != null && theRider.ridingEntity instanceof ExperimentalGeometryCar) {
            theCar = (ExperimentalGeometryCar)theRider.ridingEntity;
        } else {
            return;
        }
    }
    @Override
    public void initGui() {
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();

        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        railroadName = new GuiTCTextField(fontRendererObj, guiLeft + 110, guiTop + 28, 120,15);
        operatingCrew = new GuiTCTextField(fontRendererObj, guiLeft + 110, guiTop + 72, 120, 15);
       // geometryCarName = new GuiTCTextField(fontRendererObj, guiLeft + 110, guiTop + 56, 120,15);
      //  railroadType = new GuiTCTextField(fontRendererObj, guiLeft + 85, guiTop + 46, 80,15);
        railroadType = new GuiButton(0, guiLeft + 110, guiTop + 48, 130, 20, theCar.lineType);

        //railroadStandard = new GuiTCTextField(fontRendererObj, guiLeft + 5, guiTop + 546, 160,140);


        if (theCar.missionStarted) {
            startStopButton = new GuiButton(1,guiLeft + 110, guiTop + 90,90,20,"Stop Recording");
        } else {
            startStopButton = new GuiButton(1,guiLeft + 110, guiTop + 90,90,20,"Start Recording");
        }



        if (theCar.getDataWatcher() != null) {
            railroadName.setText(theCar.railroadLine);
        }
       // saveTrackReport = new GuiButton(2,guiLeft + 110, guiTop + 115,130,20,"Generate Track Report");
        allTrackIssues = new GuiButton(3,guiLeft + 110, guiTop + 115,130,20,"Show all track issues");
        operatingCrew.setText(theCar.operatingCrew);
        this.buttonList.add(startStopButton);
        this.buttonList.add(railroadType);
        buttonList.add(allTrackIssues);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int width = sr.getScaledWidth();
        int height = sr.getScaledHeight();

        this.guiLeft = (sr.getScaledWidth() - this.xSize) / 2;

        int x = width / 2;
        int y = height / 2;

        this.guiTop = (sr.getScaledHeight() - this.ySize) / 2;
        drawDefaultBackground();
        ///drawTexturedRect(new ResourceLocation("tc:textures/gui/geocar_background.png"), guiLeft, guiTop,0, 0, 305,274,305, 274, 1);
        if (!showReports) {
            railroadName.drawTextBox();
            operatingCrew.drawTextBox();
            fontRendererObj.drawString("Railroad Name:", x - 120, y - 107, 0xFFFFFF);
            fontRendererObj.drawString("Railroad Type:", x - 120, y - 84, 0xFFFFFF);
            fontRendererObj.drawString("Operating Crew:", x - 126, y - 62, 0xFFFFFF);
       /* fontRendererObj.drawString("Geometry Car Name:", guiLeft + 10, guiTop + 30, 000000);
        fontRendererObj.drawString("Railroad Type: ", guiLeft + 10, guiTop + 50, 000000);*/
        } else {
            fontRendererObj.drawString(theCar.currentTrackReport, x - 80, y - 107, 0xFFFFFF);
        }
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void actionPerformed(GuiButton button) {
        if (button.id == 1) {
            if (theCar.missionStarted)  {
                theCar.missionStarted = false;
                Traincraft.startMissionPacketChannel.sendToServer(new StartMissionPacket(theCar.getEntityId(), false));
                Traincraft.generateTrackReportChannel.sendToServer(new GenerateTrackReport(theCar.getEntityId(), 1));
            } else {
                theCar.missionStarted = true;
                Traincraft.startMissionPacketChannel.sendToServer(new StartMissionPacket(theCar.getEntityId(), true));
            }

        } else if (button.id == 2) {
            Traincraft.generateTrackReportChannel.sendToServer(new GenerateTrackReport(theCar.getEntityId(), 1));
            Traincraft.generateTrackReportChannel.sendToServer(new GenerateTrackReport(theCar.getEntityId(), 2));
            Traincraft.startMissionPacketChannel.sendToServer(new StartMissionPacket(theCar.getEntityId(), false));
            theCar.missionStarted = false;
        } else if (button.id == 0) {
            if (railroadType.displayString.equals("Mainline")) {
                railroadType.displayString = "Branch";
            } else {
                railroadType.displayString = "Mainline";
            }

        } else if (button.id ==  3) {
            showReports = !showReports;
            if (showReports) {
                allTrackIssues = new GuiButton(3,guiLeft + 110, guiTop + 160,130,20,"Go back");
                buttonList.clear();
                buttonList.add(allTrackIssues);

            } else {
                buttonList.clear();
                allTrackIssues = new GuiButton(3,guiLeft + 110, guiTop + 140,130,20,"Show all track issues");
                buttonList.add(allTrackIssues);
                this.buttonList.add(startStopButton);
                this.buttonList.add(railroadType);
            }


        }
    }
    @Override
    public void updateScreen() {
        super.updateScreen();
        if (railroadName.isFocused()) {
            railroadName.updateCursorCounter();
        }
        if ( theCar.missionStarted) {
            startStopButton.displayString = "Stop Recording";
        } else {
            startStopButton.displayString = "Start Recording";
        }

        ///trackReportOutput.setText(theCar.getDataWatcher().getWatchableObjectString(26));
    }

    @Override
    protected void keyTyped(char par1, int par2) {
        if (par2 == Keyboard.KEY_ESCAPE) {
            theCar.railroadLine = railroadName.getText();
            theCar.lineType = railroadType.displayString;
            theCar.operatingCrew = operatingCrew.getText();
            Traincraft.updateGeometryCarChannel.sendToServer(new UpdateGeometryCar(theCar.getEntityId(), railroadName.getText(), railroadType.displayString, operatingCrew.getText()));
            mc.thePlayer.closeScreen();
        }

        if (railroadName.isFocused()) {
            railroadName.textboxKeyTyped(par1, par2);
        }
        if (operatingCrew.isFocused()) {
            operatingCrew.textboxKeyTyped(par1, par2);
        }


    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) {
        railroadName.mouseClicked(par1, par2, par3);
        operatingCrew.mouseClicked(par1, par2, par3);
        super.mouseClicked(par1, par2, par3);
    }
    @Override
    public boolean doesGuiPauseGame() {
        return false;
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
