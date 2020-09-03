package com.jcirmodelsquad.tcjcir.features.eti;

import com.jcirmodelsquad.tcjcir.extras.packets.UpdateETI;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import train.client.gui.GuiTCTextField;
import train.common.Traincraft;
import train.common.api.Locomotive;

import java.util.ArrayList;
import java.util.Arrays;

public class GuiETI extends GuiScreen {
    Locomotive theLocomotive;
    GuiTCTextField operatorID;
    GuiTCTextField trainName;
    GuiTCTextField trainNumber;
    GuiTCTextField stations;

    public int xSize = 305;
    public int ySize = 274;
    public int guiLeft;
    public int guiTop;

    GuiButton saveAndClose;

    public GuiETI(Locomotive entity) {
        theLocomotive = entity;
    }

    @Override
    public void initGui() {
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        saveAndClose = new GuiButton(0, guiLeft + 90, guiTop + 210, 140, 20, "Save and Close" );

        operatorID = new GuiTCTextField(fontRendererObj, guiLeft + 148, guiTop + 50, 35 ,15);
        operatorID.setMaxStringLength(4);
        trainName = new GuiTCTextField(fontRendererObj, guiLeft + 193, guiTop + 70, 70,15);
        trainNumber = new GuiTCTextField(fontRendererObj, guiLeft + 153, guiTop + 90, 40 ,15);
        stations = new GuiTCTextField(fontRendererObj, guiLeft + 80, guiTop + 125, 160 ,120);

        operatorID.setText(theLocomotive.operatorID);
        trainName.setText(theLocomotive.trainName);
        trainNumber.setText(theLocomotive.trainNumber);
        trainNumber.setMaxStringLength(5);
        stations.setMaxStringLength(500);
        StringBuilder output = new StringBuilder();
        for (String station : theLocomotive.stations) {
            output.append(station).append(",");
        }
        stations.setText(output.toString());
        this.buttonList.add(saveAndClose);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        int x = width / 2;
        int y = height / 2;
        fontRendererObj.drawStringWithShadow("Enhanced Train Information", guiLeft - 70, guiTop - 90, 0xFFFFFF);
        fontRendererObj.drawStringWithShadow("Operator ID:", x - 70, y - 83, 0xFFFFFF);
        fontRendererObj.drawStringWithShadow("Train Name (optional):", x - 70, y - 63, 0xFFFFFF);
        fontRendererObj.drawStringWithShadow("Train Number:", x - 70, y - 43, 0xFFFFFF);
        fontRendererObj.drawStringWithShadow("Stations separated by a comma:", x - 70, y - 23, 0xFFFFFF);
        operatorID.drawTextBox();
        trainName.drawTextBox();
        trainNumber.drawTextBox();
        String[] s = stations.getText().split("\n");
        GL11.glPushMatrix();
        for(String str: s){
            fontRendererObj.drawStringWithShadow(str, x -70, y - 10, 0xFFFFFF);

           // fontRendererObj.drawStringWithShadow("_", x + fontRendererObj.getStringWidth(str) + -68, y - 10, 0xFFFFFF);
            GL11.glTranslatef(0,10,0);
        }
        GL11.glPopMatrix();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void actionPerformed(GuiButton button) {
        System.out.println(button.id);
        if (button.id == 0) {
            //Send the packet and close the menu.
            ArrayList<String> toSend = new ArrayList<String>();
            String[] splitUp = stations.getText().split(",");
            if (!stations.getText().equals("")) {
                for (String str : splitUp) {
                    toSend.add(str.trim());
                }
            }
            theLocomotive.operatorID = operatorID.getText();
            theLocomotive.trainName = trainName.getText();
            theLocomotive.trainNumber = trainNumber.getText();
            String listString = String.join(", ", toSend);
            theLocomotive.stations = new ArrayList<String>(Arrays.asList(listString.split(", ")));
            Traincraft.updateEtiChannel.sendToServer(new UpdateETI(theLocomotive.getEntityId(), operatorID.getText(), trainName.getText(), trainNumber.getText(), listString));
            mc.thePlayer.closeScreen();
        }
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        if (operatorID.isFocused()) {
            operatorID.updateCursorCounter();
        }
        if (trainName.isFocused()) {
            trainName.updateCursorCounter();
        }
        if (trainNumber.isFocused()) {
            trainNumber.updateCursorCounter();
        }
    }

    @Override
    protected void keyTyped(char par1, int par2) {
        if (operatorID.isFocused()) {
            operatorID.textboxKeyTyped(par1, par2);
        }
        if (trainName.isFocused()) {
            trainName.textboxKeyTyped(par1, par2);
        }

        if (trainNumber.isFocused() && par2 == Keyboard.KEY_1 || par2 == Keyboard.KEY_2 || par2 == Keyboard.KEY_3 || par2 == Keyboard.KEY_4 || par2 == Keyboard.KEY_5 || par2 == Keyboard.KEY_6 ||par2 == Keyboard.KEY_7 || par2 == Keyboard.KEY_8 || par2 == Keyboard.KEY_9 || par2 == Keyboard.KEY_0  || par2 == Keyboard.KEY_BACK) {
            trainNumber.textboxKeyTyped(par1, par2);
        }

        if (stations.isFocused()) {
            if (par2 == Keyboard.KEY_RETURN) {
                stations.setText(stations.getText() + "\n");
            } else {
                stations.textboxKeyTyped(par1, par2);
            }

        }

    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) {
        operatorID.mouseClicked(par1, par2, par3);
        trainName.mouseClicked(par1, par2, par3);
        trainNumber.mouseClicked(par1, par2, par3);
        stations.mouseClicked(par1, par2, par3);
        super.mouseClicked(par1, par2, par3);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }


    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}


