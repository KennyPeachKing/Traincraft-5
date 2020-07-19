//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:07.05.2019 - 11:39:08
// Last changed on: 07.05.2019 - 11:39:08

package com.jcirmodelsquad.tcjcir.models;

import com.jcirmodelsquad.tcjcir.rollingstock.A56AFootWellcar;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelA56AFootWellcar extends ModelBase
{
    int textureX = 512;
    int textureY = 512;

    public ModelA56AFootWellcar()
    {
        a56afootwellcarModel = new ModelRendererTurbo[46];
        a56afootwellcarModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
        a56afootwellcarModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 83
        a56afootwellcarModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 84
        a56afootwellcarModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 89
        a56afootwellcarModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 90
        a56afootwellcarModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 91
        a56afootwellcarModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 92
        a56afootwellcarModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 93
        a56afootwellcarModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 95
        a56afootwellcarModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 96
        a56afootwellcarModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 97
        a56afootwellcarModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 98
        a56afootwellcarModel[12] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 99
        a56afootwellcarModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 100
        a56afootwellcarModel[14] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 102
        a56afootwellcarModel[15] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 103
        a56afootwellcarModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 104
        a56afootwellcarModel[17] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 106
        a56afootwellcarModel[18] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 110
        a56afootwellcarModel[19] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 112
        a56afootwellcarModel[20] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 114
        a56afootwellcarModel[21] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 115
        a56afootwellcarModel[22] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 116
        a56afootwellcarModel[23] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 117
        a56afootwellcarModel[24] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 118
        a56afootwellcarModel[25] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 119
        a56afootwellcarModel[26] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 121
        a56afootwellcarModel[27] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 122
        a56afootwellcarModel[28] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Box 101
        a56afootwellcarModel[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 57
        a56afootwellcarModel[30] = new ModelRendererTurbo(this, 422, 27, textureX, textureY); // Box 58
        a56afootwellcarModel[31] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 69
        a56afootwellcarModel[32] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 70
        a56afootwellcarModel[33] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 71
        a56afootwellcarModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
        a56afootwellcarModel[35] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 45
        a56afootwellcarModel[36] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 46
        a56afootwellcarModel[37] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 47
        a56afootwellcarModel[38] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 48
        a56afootwellcarModel[39] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 49
        a56afootwellcarModel[40] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
        a56afootwellcarModel[41] = new ModelRendererTurbo(this, 163, 25, textureX, textureY); // Box 51
        a56afootwellcarModel[42] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 52
        a56afootwellcarModel[43] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 53
        a56afootwellcarModel[44] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 54
        a56afootwellcarModel[45] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 55

        a56afootwellcarModel[0].addBox(0F, 0F, 0F, 82, 5, 1, 0F); // Box 62
        a56afootwellcarModel[0].setRotationPoint(-41F, -3F, -12F);

        a56afootwellcarModel[1].addBox(0F, 0F, 0F, 7, 1, 22, 0F); // Box 83
        a56afootwellcarModel[1].setRotationPoint(-51F, 1F, -12F);

        a56afootwellcarModel[2].addBox(0F, 0F, 0F, 9, 1, 16, 0F); // Box 84
        a56afootwellcarModel[2].setRotationPoint(-50F, 2F, -9F);

        a56afootwellcarModel[3].addBox(0F, 0F, 0F, 82, 5, 1, 0F); // Box 89
        a56afootwellcarModel[3].setRotationPoint(-41F, -3F, 9F);

        a56afootwellcarModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 90
        a56afootwellcarModel[4].setRotationPoint(-41F, 2F, 9F);

        a56afootwellcarModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
        a56afootwellcarModel[5].setRotationPoint(-41F, 2F, -12F);

        a56afootwellcarModel[6].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 92
        a56afootwellcarModel[6].setRotationPoint(-41F, -1F, -11F);

        a56afootwellcarModel[7].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 93
        a56afootwellcarModel[7].setRotationPoint(-44F, -4F, -2F);

        a56afootwellcarModel[8].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 95
        a56afootwellcarModel[8].setRotationPoint(-36F, -3F, -11F);

        a56afootwellcarModel[9].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 96
        a56afootwellcarModel[9].setRotationPoint(-44F, 0F, -12F);

        a56afootwellcarModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 97
        a56afootwellcarModel[10].setRotationPoint(-44.5F, -4.5F, -0.5F);

        a56afootwellcarModel[11].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 98
        a56afootwellcarModel[11].setRotationPoint(-44.5F, -6F, -2F);

        a56afootwellcarModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 99
        a56afootwellcarModel[12].setRotationPoint(36F, 2F, 9F);

        a56afootwellcarModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        a56afootwellcarModel[13].setRotationPoint(36F, 2F, -12F);

        a56afootwellcarModel[14].addShapeBox(0F, 0F, 0F, 62, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 102
        a56afootwellcarModel[14].setRotationPoint(-31F, 2F, 9F);

        a56afootwellcarModel[15].addShapeBox(0F, 0F, 0F, 62, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
        a56afootwellcarModel[15].setRotationPoint(-31F, 2F, -12F);

        a56afootwellcarModel[16].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F); // Box 104
        a56afootwellcarModel[16].setRotationPoint(-36F, 2F, 9F);

        a56afootwellcarModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 106
        a56afootwellcarModel[17].setRotationPoint(-36F, 2F, -12F);

        a56afootwellcarModel[18].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F); // Box 110
        a56afootwellcarModel[18].setRotationPoint(31F, 2F, 9F);

        a56afootwellcarModel[19].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 112
        a56afootwellcarModel[19].setRotationPoint(31F, 2F, -12F);

        a56afootwellcarModel[20].addBox(0F, 0F, 0F, 9, 1, 16, 0F); // Box 114
        a56afootwellcarModel[20].setRotationPoint(41F, 2F, -9F);

        a56afootwellcarModel[21].addBox(0F, 0F, 0F, 7, 1, 22, 0F); // Box 115
        a56afootwellcarModel[21].setRotationPoint(44F, 1F, -12F);

        a56afootwellcarModel[22].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Box 116
        a56afootwellcarModel[22].setRotationPoint(41F, -4F, -4F);

        a56afootwellcarModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 117
        a56afootwellcarModel[23].setRotationPoint(42.5F, -4.5F, -2.5F);

        a56afootwellcarModel[24].addBox(0F, 0F, 0F, 0, 4, 4, 0F); // Box 118
        a56afootwellcarModel[24].setRotationPoint(44.5F, -6F, -4F);

        a56afootwellcarModel[25].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 119
        a56afootwellcarModel[25].setRotationPoint(31F, -1F, -11F);

        a56afootwellcarModel[26].addBox(0F, 0F, 0F, 4, 1, 20, 0F); // Box 121
        a56afootwellcarModel[26].setRotationPoint(32F, -3F, -11F);

        a56afootwellcarModel[27].addBox(0F, 0F, 0F, 3, 1, 9, 0F); // Box 122
        a56afootwellcarModel[27].setRotationPoint(41F, 0F, 1F);

        a56afootwellcarModel[28].addBox(0F, 0F, 0F, 62, 1, 20, 0F); // Box 101
        a56afootwellcarModel[28].setRotationPoint(-31F, 7F, -11F);

        a56afootwellcarModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 57
        a56afootwellcarModel[29].setRotationPoint(-32F, 2F, -11F);

        a56afootwellcarModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 58
        a56afootwellcarModel[30].setRotationPoint(31F, 2F, -11F);

        a56afootwellcarModel[31].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 69
        a56afootwellcarModel[31].setRotationPoint(-50F, 3F, -3F);

        a56afootwellcarModel[32].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Box 70
        a56afootwellcarModel[32].setRotationPoint(31F, 3F, -3F);

        a56afootwellcarModel[33].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 71
        a56afootwellcarModel[33].setRotationPoint(-53F, 2F, -2.5F);

        a56afootwellcarModel[34].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 72
        a56afootwellcarModel[34].setRotationPoint(50F, 2F, -2.5F);

        a56afootwellcarModel[35].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 45
        a56afootwellcarModel[35].setRotationPoint(34F, -4F, -4F);

        a56afootwellcarModel[36].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 46
        a56afootwellcarModel[36].setRotationPoint(36F, -3F, -2.5F);

        a56afootwellcarModel[37].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 47
        a56afootwellcarModel[37].setRotationPoint(-41F, -3F, -11F);

        a56afootwellcarModel[38].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 48
        a56afootwellcarModel[38].setRotationPoint(-41F, -3F, 7F);

        a56afootwellcarModel[39].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 49
        a56afootwellcarModel[39].setRotationPoint(36F, -3F, 7F);

        a56afootwellcarModel[40].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 50
        a56afootwellcarModel[40].setRotationPoint(36F, -3F, -11F);

        a56afootwellcarModel[41].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 51
        a56afootwellcarModel[41].setRotationPoint(-50F, -7F, -12.01F);

        a56afootwellcarModel[42].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 52
        a56afootwellcarModel[42].setRotationPoint(45F, -7F, -12.01F);

        a56afootwellcarModel[43].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 53
        a56afootwellcarModel[43].setRotationPoint(-40F, -4F, -1F);

        a56afootwellcarModel[44].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 54
        a56afootwellcarModel[44].setRotationPoint(-50F, -7F, 10.01F);

        a56afootwellcarModel[45].addBox(0F, 0F, 0F, 5, 13, 0, 0F); // Box 55
        a56afootwellcarModel[45].setRotationPoint(45F, -7F, 10.01F);


    }

    Model70Truck bogie = new Model70Truck();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 46; i++)
        {
            a56afootwellcarModel[i].render(f5);
        }
        Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70truck_Black.png"));

        GL11.glPushMatrix();
        GL11.glScalef(1,1,0.9f);
        GL11.glTranslated(-2.0,0.55,-0.4);
        bogie.render(entity,f,f1,f2,f3,f4,f5);

        GL11.glTranslated(3.75,0,0.03);
        bogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

        if (entity instanceof A56AFootWellcar) {
            A56AFootWellcar wellcar = (A56AFootWellcar)entity;
            if (wellcar.container1 != null && wellcar.container1.theType.equals("FortyFootContainer")) {
                ModelA40AFootContainer theContainer = new ModelA40AFootContainer();
                Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container40_" + wellcar.container1.color + ".png"));

                GL11.glPushMatrix();
                GL11.glScalef(1,1,0.9f);
                GL11.glTranslated(0,0,0);
                theContainer.render(entity, f, f1, f2, f3, f4, f5);
                GL11.glPopMatrix();
            }
            if (wellcar.container2 != null && wellcar.container2.theType.equals("FortyFootContainer")) {
                ModelA40AFootContainer theContainer = new ModelA40AFootContainer();
                Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/container40_" + wellcar.container2.color + ".png"));

                GL11.glPushMatrix();
                GL11.glScalef(1,1,0.9f);
                GL11.glTranslated(0,-1.3,0);
                theContainer.render(entity, f, f1, f2, f3, f4, f5);
                GL11.glPopMatrix();
            }
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo a56afootwellcarModel[];
}