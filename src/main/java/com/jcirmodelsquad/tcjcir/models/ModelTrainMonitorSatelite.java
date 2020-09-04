//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.08.2020 - 20:04:52
// Last changed on: 31.08.2020 - 20:04:52

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTrainMonitorSatelite extends ModelConverter //Same as Filename
{
    int textureX = 64;
    int textureY = 64;

    public ModelTrainMonitorSatelite() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[23];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
        bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
        bodyModel[4] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 4
        bodyModel[5] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 5
        bodyModel[6] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 9
        bodyModel[7] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 10
        bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 11
        bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12
        bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
        bodyModel[11] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 14
        bodyModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 15
        bodyModel[13] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 16
        bodyModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 17
        bodyModel[15] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 18
        bodyModel[16] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 19
        bodyModel[17] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 20
        bodyModel[18] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 21
        bodyModel[19] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 22
        bodyModel[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 23
        bodyModel[21] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 24
        bodyModel[22] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 25

        bodyModel[0].addBox(0F, 0F, 0F, 8, 3, 3, 0F); // Box 0
        bodyModel[0].setRotationPoint(-4F, -3F, 3F);

        bodyModel[1].addBox(0F, 0F, 0F, 12, 4, 8, 0F); // Box 1
        bodyModel[1].setRotationPoint(-6F, -4F, -5F);

        bodyModel[2].addBox(-2F, 0F, -5F, 4, 1, 10, 0F); // Box 2
        bodyModel[2].setRotationPoint(-2F, -12F, 0F);
        bodyModel[2].rotateAngleZ = 0.78539816F;

        bodyModel[3].addBox(-5F, 0F, -2F, 3, 1, 4, 0F); // Box 3
        bodyModel[3].setRotationPoint(-2F, -12F, 0F);
        bodyModel[3].rotateAngleZ = 0.78539816F;

        bodyModel[4].addBox(2F, 0F, -2F, 3, 1, 4, 0F); // Box 4
        bodyModel[4].setRotationPoint(-2F, -12F, 0F);
        bodyModel[4].rotateAngleZ = 0.78539816F;

        bodyModel[5].addShapeBox(-5F, 0F, -5F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        bodyModel[5].setRotationPoint(-2F, -12F, 0F);
        bodyModel[5].rotateAngleZ = 0.78539816F;

        bodyModel[6].addShapeBox(2F, 0F, -5F, 3, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        bodyModel[6].setRotationPoint(-2F, -12F, 0F);
        bodyModel[6].rotateAngleZ = 0.78539816F;

        bodyModel[7].addShapeBox(2F, 0F, 2F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[7].setRotationPoint(-2F, -12F, 0F);
        bodyModel[7].rotateAngleZ = 0.78539816F;

        bodyModel[8].addShapeBox(-5F, 0F, 2F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11
        bodyModel[8].setRotationPoint(-2F, -12F, 0F);
        bodyModel[8].rotateAngleZ = 0.78539816F;

        bodyModel[9].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 12
        bodyModel[9].setRotationPoint(-1F, -13F, -3F);

        bodyModel[10].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 13
        bodyModel[10].setRotationPoint(-1F, -13F, 2F);

        bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 14
        bodyModel[11].setRotationPoint(-1F, -9F, -2F);

        bodyModel[12].addBox(-1F, 0F, 0F, 2, 5, 1, 0F); // Box 15
        bodyModel[12].setRotationPoint(-2F, -12F, -0.5F);
        bodyModel[12].rotateAngleZ = 0.78539816F;

        bodyModel[13].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 16
        bodyModel[13].setRotationPoint(-1F, -8F, -1F);

        bodyModel[14].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 17
        bodyModel[14].setRotationPoint(-2F, -6F, -2F);

        bodyModel[15].addBox(-6F, 0F, -0.5F, 6, 0, 1, 0F); // Box 18
        bodyModel[15].setRotationPoint(1.5F, -15.5F, 0F);

        bodyModel[16].addBox(0F, -6F, -0.5F, 0, 6, 1, 0F); // Box 19
        bodyModel[16].setRotationPoint(-5.5F, -8.5F, 0F);

        bodyModel[17].addBox(-1F, 0F, -1F, 2, 1, 2, 0F); // Box 20
        bodyModel[17].setRotationPoint(-5F, -15F, 0F);
        bodyModel[17].rotateAngleZ = 0.78539816F;

        bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 21
        bodyModel[18].setRotationPoint(-3F, -4F, 3F);

        bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 22
        bodyModel[19].setRotationPoint(2F, -4F, 3F);

        bodyModel[20].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 23
        bodyModel[20].setRotationPoint(-6F, -2F, -6F);

        bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 24
        bodyModel[21].setRotationPoint(-3F, -4F, -6F);

        bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 25
        bodyModel[22].setRotationPoint(2F, -4F, -6F);
    }


}