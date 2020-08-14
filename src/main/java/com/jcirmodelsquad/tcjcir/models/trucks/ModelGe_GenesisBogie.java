//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.06.2020 - 17:19:44
// Last changed on: 29.06.2020 - 17:19:44

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located


import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelGe_GenesisBogie extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelGe_GenesisBogie() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[61];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
        bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 7
        bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
        bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 9
        bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
        bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 11
        bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 12
        bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
        bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 14
        bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
        bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 16
        bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 17
        bodyModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 18
        bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 19
        bodyModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 20
        bodyModel[15] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 21
        bodyModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 28
        bodyModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 29
        bodyModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 30
        bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 31
        bodyModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 32
        bodyModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 33
        bodyModel[22] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 34
        bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 35
        bodyModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 36
        bodyModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 37
        bodyModel[26] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 38
        bodyModel[27] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 39
        bodyModel[28] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 40
        bodyModel[29] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 43
        bodyModel[30] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 45
        bodyModel[31] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 46
        bodyModel[32] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 47
        bodyModel[33] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 48
        bodyModel[34] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 50
        bodyModel[35] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 51
        bodyModel[36] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 52
        bodyModel[37] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 56
        bodyModel[38] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 57
        bodyModel[39] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 62
        bodyModel[40] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 63
        bodyModel[41] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 64
        bodyModel[42] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 65
        bodyModel[43] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 66
        bodyModel[44] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 67
        bodyModel[45] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 68
        bodyModel[46] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 69
        bodyModel[47] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 70
        bodyModel[48] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 73
        bodyModel[49] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 74
        bodyModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 75
        bodyModel[51] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 76
        bodyModel[52] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 78
        bodyModel[53] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 79
        bodyModel[54] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 80
        bodyModel[55] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 81
        bodyModel[56] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 82
        bodyModel[57] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 83
        bodyModel[58] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 84
        bodyModel[59] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 85
        bodyModel[60] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 86

        bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 5
        bodyModel[0].setRotationPoint(-13.5F, -5.5F, -1F);

        bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
        bodyModel[1].setRotationPoint(1F, -3F, -3F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
        bodyModel[2].setRotationPoint(1F, -4F, -3F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
        bodyModel[3].setRotationPoint(3F, -4F, -3F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[4].setRotationPoint(1F, -4F, -2F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        bodyModel[5].setRotationPoint(3F, -4F, -2F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 12
        bodyModel[6].setRotationPoint(2F, -5F, -3F);

        bodyModel[7].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 13
        bodyModel[7].setRotationPoint(-12.5F, -5.25F, -2F);

        bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        bodyModel[8].setRotationPoint(-12F, -4F, -3F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        bodyModel[9].setRotationPoint(-12F, -4F, -2F);

        bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        bodyModel[10].setRotationPoint(-12F, -3F, -3F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 17
        bodyModel[11].setRotationPoint(-11F, -5F, -3F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
        bodyModel[12].setRotationPoint(-10F, -4F, -3F);

        bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[13].setRotationPoint(-10F, -4F, -2F);

        bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 20
        bodyModel[14].setRotationPoint(2F, -3F, -3F);

        bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 21
        bodyModel[15].setRotationPoint(-11F, -3F, -3F);

        bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
        bodyModel[16].setRotationPoint(1F, -3F, 12F);

        bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29
        bodyModel[17].setRotationPoint(1F, -4F, 12F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30
        bodyModel[18].setRotationPoint(3F, -4F, 12F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        bodyModel[19].setRotationPoint(1F, -4F, 11F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
        bodyModel[20].setRotationPoint(3F, -4F, 11F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
        bodyModel[21].setRotationPoint(2F, -5F, 12F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
        bodyModel[22].setRotationPoint(-12F, -3F, 12F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
        bodyModel[23].setRotationPoint(-12F, -4F, 12F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
        bodyModel[24].setRotationPoint(-10F, -4F, 12F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[25].setRotationPoint(-12F, -4F, 11F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
        bodyModel[26].setRotationPoint(-10F, -4F, 11F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 39
        bodyModel[27].setRotationPoint(-11F, -5F, 12F);

        bodyModel[28].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 40
        bodyModel[28].setRotationPoint(-12.5F, -5.25F, 11F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 43
        bodyModel[29].setRotationPoint(2F, -3F, 13F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 45
        bodyModel[30].setRotationPoint(-11F, -3F, 13F);

        bodyModel[31].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 46
        bodyModel[31].setRotationPoint(-1.5F, -5.25F, -2F);

        bodyModel[32].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 47
        bodyModel[32].setRotationPoint(-1.5F, -5.25F, 11F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        bodyModel[33].setRotationPoint(-3.5F, -5.25F, -2F);

        bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
        bodyModel[34].setRotationPoint(-6.5F, -5.25F, -2F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
        bodyModel[35].setRotationPoint(-6.5F, -5.25F, 11F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
        bodyModel[36].setRotationPoint(-3.5F, -5.25F, 11F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 56
        bodyModel[37].setRotationPoint(-2.5F, -4.25F, 11F);

        bodyModel[38].addBox(0F, 0F, 0F, 3, 3, 14, 0F); // Box 57
        bodyModel[38].setRotationPoint(-5.5F, -4.25F, -2F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 62
        bodyModel[39].setRotationPoint(-8.5F, -4.25F, 11F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Box 63
        bodyModel[40].setRotationPoint(-8.5F, -4.25F, -2F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 64
        bodyModel[41].setRotationPoint(-2.5F, -4.25F, -2F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 65
        bodyModel[42].setRotationPoint(-4.5F, -4F, 2F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 66
        bodyModel[43].setRotationPoint(-4.5F, -5F, 11.75F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 67
        bodyModel[44].setRotationPoint(-4.5F, -5F, -2.75F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
        bodyModel[45].setRotationPoint(-4.5F, -3F, -3F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
        bodyModel[46].setRotationPoint(-4.5F, -3F, 11.5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.4F, -0.25F); // Box 70
        bodyModel[47].setRotationPoint(-8.5F, -4F, -2.75F);
        bodyModel[47].rotateAngleY = 0.01745329F;
        bodyModel[47].rotateAngleZ = 1.34390352F;

        bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F); // Box 73
        bodyModel[48].setRotationPoint(0.25F, -5F, -2.75F);
        bodyModel[48].rotateAngleZ = -1.34390352F;

        bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        bodyModel[49].setRotationPoint(0F, -5F, -3F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        bodyModel[50].setRotationPoint(-9F, -5F, -3F);

        bodyModel[51].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 76
        bodyModel[51].setRotationPoint(-11.5F, -3.5F, -1F);

        bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 78
        bodyModel[52].setRotationPoint(1.5F, -3.5F, -1F);

        bodyModel[53].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 79
        bodyModel[53].setRotationPoint(-0.5F, -5.5F, -1F);

        bodyModel[54].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 80
        bodyModel[54].setRotationPoint(-0.5F, -5.5F, 11F);

        bodyModel[55].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 81
        bodyModel[55].setRotationPoint(-13.5F, -5.5F, 11F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.4F, -0.25F); // Box 82
        bodyModel[56].setRotationPoint(-8.5F, -4F, 11.75F);
        bodyModel[56].rotateAngleZ = 1.34390352F;

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        bodyModel[57].setRotationPoint(-9F, -5F, 12F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F); // Box 84
        bodyModel[58].setRotationPoint(0.25F, -5F, 11.75F);
        bodyModel[58].rotateAngleZ = -1.34390352F;

        bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
        bodyModel[59].setRotationPoint(0F, -5F, 12F);

        bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 86
        bodyModel[60].setRotationPoint(-5F, -5F, 4F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 61; i++)
        {
            bodyModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }


}