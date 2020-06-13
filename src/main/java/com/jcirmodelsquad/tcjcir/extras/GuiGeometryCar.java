package com.jcirmodelsquad.tcjcir.extras;

import com.jcirmodelsquad.tcjcir.extras.packets.GenerateTrackReport;
import com.jcirmodelsquad.tcjcir.extras.packets.StartMissionPacket;
import com.jcirmodelsquad.tcjcir.extras.packets.UpdateGeometryCar;
import com.jcirmodelsquad.tcjcir.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
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
    private GuiTCTextField railroadType;
    private GuiTCTextField railroadStandard;
    private GuiTCTextField trackReportOutput;
    private GuiButton startStopButton;
    private GuiButton lockButton;
    private GuiButton saveTrackReport;
    private GuiButton saveTrackReportAsFile;
    public int xSize = 305;
    public int ySize = 274;
    public int guiLeft;
    public int guiTop;
    public GuiGeometryCar(EntityPlayer theRider) {
        if (theRider != null && theRider.ridingEntity instanceof ExperimentalGeometryCar) {
            theCar = (ExperimentalGeometryCar)theRider.ridingEntity;
        } else {
            return;
        }
    }
    @Override
    public void initGui() {
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        railroadName = new GuiTCTextField(fontRendererObj, guiLeft + 85, guiTop + 7, 80,15);
        geometryCarName = new GuiTCTextField(fontRendererObj, guiLeft + 110, guiTop + 26, 120,15);
        railroadType = new GuiTCTextField(fontRendererObj, guiLeft + 85, guiTop + 46, 80,15);
        trackReportOutput = new GuiTCTextField(fontRendererObj, guiLeft + 5, guiTop + 130, 160,140);
        railroadStandard = new GuiTCTextField(fontRendererObj, guiLeft + 5, guiTop + 546, 160,140);
        try {
            if (theCar != null  &&  theCar.getDataWatcher().getWatchableObjectString(27).split(":")[0].equals("true")) {
                startStopButton = new GuiButton(1,guiLeft + 188, guiTop + 230,90,20,"Stop Mission");
            } else {
                startStopButton = new GuiButton(1,guiLeft + 188, guiTop + 230,90,20,"Start Mission");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (theCar != null && theCar.getDataWatcher() != null) {
            railroadName.setText(theCar.getDataWatcher().getWatchableObjectString(31));
            geometryCarName.setText(theCar.getDataWatcher().getWatchableObjectString(30));
        }
        saveTrackReport = new GuiButton(2,guiLeft + 188, guiTop + 240,130,20,"Generate Track Report");
        saveTrackReportAsFile = new GuiButton(3,guiLeft + 188, guiTop + 260,170,20,"Generate Track Report as File");
        this.buttonList.add(startStopButton);
        this.buttonList.add(saveTrackReport);
        this.buttonList.add(saveTrackReportAsFile);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        drawDefaultBackground();
        drawTexturedRect(new ResourceLocation("tcjcir:extras/geocar-background.png"), guiLeft, guiTop,0, 0,305,274,305, 274, 1);
        railroadName.drawTextBox();
        geometryCarName.drawTextBox();
        railroadType.drawTextBox();
        trackReportOutput.drawTextBox();
        fontRendererObj.drawString("Railroad Name:", guiLeft + 10, guiTop + 10, 000000);
        fontRendererObj.drawString("Geometry Car Name:", guiLeft + 10, guiTop + 30, 000000);
        fontRendererObj.drawString("Railroad Type: ", guiLeft + 10, guiTop + 50, 000000);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void actionPerformed(GuiButton button) {
        if (button.id == 1) {
           String thing =  theCar.getDataWatcher().getWatchableObjectString(27);
            String thing2 = theCar.getDataWatcher().getWatchableObjectString(27).split(":")[0];
           System.out.println(thing2);
            if (Boolean.valueOf(thing2))  {
                Traincraft.startMissionPacketChannel.sendToServer(new StartMissionPacket(theCar.getEntityId(), false));
            } else {
                Traincraft.startMissionPacketChannel.sendToServer(new StartMissionPacket(theCar.getEntityId(), true));
            }

        } else if (button.id == 2) {
            Traincraft.generateTrackReportChannel.sendToServer(new GenerateTrackReport(theCar.getEntityId(), 1));
        } else {
            Traincraft.generateTrackReportChannel.sendToServer(new GenerateTrackReport(theCar.getEntityId(), 2));
        }
    }
    @Override
    public void updateScreen() {
        super.updateScreen();
        if (railroadName.isFocused()) {
            railroadName.updateCursorCounter();
        }
        if ( theCar.getDataWatcher().getWatchableObjectString(27).split(":")[0].equals("true")) {
            saveTrackReport.enabled = true;
            saveTrackReportAsFile.enabled = true;
            startStopButton.displayString = "Stop Mission";
        } else {
            saveTrackReport.enabled = false;
            saveTrackReportAsFile.enabled = false;
            startStopButton.displayString = "Start Mission";
        }
            trackReportOutput.setText(theCar.getDataWatcher().getWatchableObjectString(27).split(":")[1]);
        ///trackReportOutput.setText(theCar.getDataWatcher().getWatchableObjectString(26));
    }

    @Override
    protected void keyTyped(char par1, int par2) {
        if (par2 == Keyboard.KEY_ESCAPE) {
            System.out.println(theCar==null);
            System.out.println(Traincraft.updateGeometryCarChannel==null);
            System.out.println(railroadName==null);
            System.out.println(geometryCarName==null);
            System.out.println(railroadType==null);
            System.out.println(railroadStandard==null);
            Traincraft.updateGeometryCarChannel.sendToServer(new UpdateGeometryCar(theCar.getEntityId(), railroadName.getText(), geometryCarName.getText(), railroadType.getText(), railroadStandard.getText()));
            mc.thePlayer.closeScreen();
        }

        if (railroadName.isFocused()) {
            railroadName.textboxKeyTyped(par1, par2);
        }

        if (geometryCarName.isFocused()) {
            geometryCarName.textboxKeyTyped(par1, par2);
        }
    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) {
        railroadName.mouseClicked(par1, par2, par3);
        geometryCarName.mouseClicked(par1, par2, par3);
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
