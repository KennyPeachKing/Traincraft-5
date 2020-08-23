//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator:
// Created on: 20.08.2020 - 12:59:17
// Last changed on: 20.08.2020 - 12:59:17

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelPCHBogie;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.AipkitExplorer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.entity.rollingStock.EntityPassengerRheingold;

public class ModelAipkitExplorer extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelAipkitExplorer() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[106];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
        bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
        bodyModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
        bodyModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 9
        bodyModel[5] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 10
        bodyModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 13
        bodyModel[7] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 14
        bodyModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 15
        bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
        bodyModel[10] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 17
        bodyModel[11] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 20
        bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 21
        bodyModel[13] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 46
        bodyModel[14] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 47
        bodyModel[15] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 48
        bodyModel[16] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 49
        bodyModel[17] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 50
        bodyModel[18] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 52
        bodyModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 53
        bodyModel[20] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 55
        bodyModel[21] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 56
        bodyModel[22] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 57
        bodyModel[23] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 58
        bodyModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 59
        bodyModel[25] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 60
        bodyModel[26] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 61
        bodyModel[27] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 63
        bodyModel[28] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 64
        bodyModel[29] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 65
        bodyModel[30] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 66
        bodyModel[31] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 67
        bodyModel[32] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 68
        bodyModel[33] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 13
        bodyModel[34] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 17
        bodyModel[35] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 20
        bodyModel[36] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 21
        bodyModel[37] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 53
        bodyModel[38] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 56
        bodyModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 57
        bodyModel[40] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 58
        bodyModel[41] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 59
        bodyModel[42] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 60
        bodyModel[43] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 61
        bodyModel[44] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 63
        bodyModel[45] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 64
        bodyModel[46] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 67
        bodyModel[47] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 68
        bodyModel[48] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 85
        bodyModel[49] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 87
        bodyModel[50] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 88
        bodyModel[51] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 89
        bodyModel[52] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 90
        bodyModel[53] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 91
        bodyModel[54] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 92
        bodyModel[55] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 93
        bodyModel[56] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 94
        bodyModel[57] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 97
        bodyModel[58] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 98
        bodyModel[59] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 99
        bodyModel[60] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 101
        bodyModel[61] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 104
        bodyModel[62] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 106
        bodyModel[63] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 107
        bodyModel[64] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 108
        bodyModel[65] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 109
        bodyModel[66] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 110
        bodyModel[67] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 111
        bodyModel[68] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 112
        bodyModel[69] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 114
        bodyModel[70] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 115
        bodyModel[71] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 118
        bodyModel[72] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 119
        bodyModel[73] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 130
        bodyModel[74] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 131
        bodyModel[75] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 132
        bodyModel[76] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 133
        bodyModel[77] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 136
        bodyModel[78] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 137
        bodyModel[79] = new ModelRendererTurbo(this, 265, 72, textureX, textureY); // Box 138
        bodyModel[80] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 139
        bodyModel[81] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 150
        bodyModel[82] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 104
        bodyModel[83] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 105
        bodyModel[84] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 107
        bodyModel[85] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 109
        bodyModel[86] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 110
        bodyModel[87] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 111
        bodyModel[88] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 112
        bodyModel[89] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 113
        bodyModel[90] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 114
        bodyModel[91] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 115
        bodyModel[92] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 116
        bodyModel[93] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 117
        bodyModel[94] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 118
        bodyModel[95] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 119
        bodyModel[96] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 120
        bodyModel[97] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 121
        bodyModel[98] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 122
        bodyModel[99] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 123
        bodyModel[100] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 124
        bodyModel[101] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 125
        bodyModel[102] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 126
        bodyModel[103] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 127
        bodyModel[104] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 128
        bodyModel[105] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 109

        bodyModel[0].addBox(0F, 0F, 0F, 76, 1, 22, 0F); // Box 0
        bodyModel[0].setRotationPoint(-38F, 0F, -11F);

        bodyModel[1].addBox(0F, 0F, 0F, 3, 20, 1, 0F); // Box 1
        bodyModel[1].setRotationPoint(-38F, -20F, 10F);

        bodyModel[2].addBox(0F, 0F, 0F, 9, 20, 1, 0F); // Box 4
        bodyModel[2].setRotationPoint(-35F, -20F, 10F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 74, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[3].setRotationPoint(-37F, -23F, 9F);

        bodyModel[4].addBox(0F, 0F, 0F, 52, 20, 1, 0F); // Box 9
        bodyModel[4].setRotationPoint(-26F, -20F, 10F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 74, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        bodyModel[5].setRotationPoint(-37F, -25F, 7F);

        bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[6].setRotationPoint(37F, -23F, 9F);

        bodyModel[7].addBox(0F, 0F, 0F, 76, 1, 12, 0F); // Box 14
        bodyModel[7].setRotationPoint(-38F, -26F, -6F);

        bodyModel[8].addBox(0F, 0F, 0F, 3, 20, 1, 0F); // Box 15
        bodyModel[8].setRotationPoint(35F, -20F, 10F);

        bodyModel[9].addBox(0F, 0F, 0F, 9, 20, 1, 0F); // Box 16
        bodyModel[9].setRotationPoint(26F, -20F, 10F);

        bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 17
        bodyModel[10].setRotationPoint(37F, -23F, -9F);

        bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
        bodyModel[11].setRotationPoint(37F, -25F, 7F);

        bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 21
        bodyModel[12].setRotationPoint(37F, -25F, -6F);

        bodyModel[13].addBox(0F, 0F, 0F, 52, 20, 1, 0F); // Box 46
        bodyModel[13].setRotationPoint(-26F, -20F, -11F);

        bodyModel[14].addBox(0F, 0F, 0F, 9, 20, 1, 0F); // Box 47
        bodyModel[14].setRotationPoint(-35F, -20F, -11F);

        bodyModel[15].addBox(0F, 0F, 0F, 3, 20, 1, 0F); // Box 48
        bodyModel[15].setRotationPoint(-38F, -20F, -11F);

        bodyModel[16].addBox(0F, 0F, 0F, 3, 20, 1, 0F); // Box 49
        bodyModel[16].setRotationPoint(35F, -20F, -11F);

        bodyModel[17].addBox(0F, 0F, 0F, 9, 20, 1, 0F); // Box 50
        bodyModel[17].setRotationPoint(26F, -20F, -11F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 74, 2, 2, 0F,0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 52
        bodyModel[18].setRotationPoint(-37F, -25F, -9F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 53
        bodyModel[19].setRotationPoint(37F, -25F, -9F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 74, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
        bodyModel[20].setRotationPoint(-37F, -23F, -11F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        bodyModel[21].setRotationPoint(37F, -23F, -11F);

        bodyModel[22].addBox(0F, 0F, 0F, 1, 20, 4, 0F); // Box 57
        bodyModel[22].setRotationPoint(37F, -20F, 6F);

        bodyModel[23].addBox(0F, 0F, 0F, 1, 20, 4, 0F); // Box 58
        bodyModel[23].setRotationPoint(37F, -20F, -10F);

        bodyModel[24].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 59
        bodyModel[24].setRotationPoint(36F, -20F, 6F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        bodyModel[25].setRotationPoint(36F, -21F, 6F);

        bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 61
        bodyModel[26].setRotationPoint(36F, -21F, -6F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[27].setRotationPoint(36F, -21F, -7F);

        bodyModel[28].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 64
        bodyModel[28].setRotationPoint(36F, -20F, -7F);

        bodyModel[29].addBox(0F, 0F, 0F, 1, 19, 12, 0F); // Box 65
        bodyModel[29].setRotationPoint(-38F, -20F, -6F);

        bodyModel[30].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 66
        bodyModel[30].setRotationPoint(-42F, 0F, -1.5F);

        bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 67
        bodyModel[31].setRotationPoint(-39F, -2F, -6F);

        bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 68
        bodyModel[32].setRotationPoint(37F, -1F, -6F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        bodyModel[33].setRotationPoint(-38F, -23F, 9F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 17
        bodyModel[34].setRotationPoint(-38F, -23F, -9F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
        bodyModel[35].setRotationPoint(-38F, -25F, 7F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 21
        bodyModel[36].setRotationPoint(-38F, -25F, -6F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 53
        bodyModel[37].setRotationPoint(-38F, -25F, -9F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
        bodyModel[38].setRotationPoint(-38F, -23F, -11F);

        bodyModel[39].addBox(0F, 0F, 0F, 1, 20, 4, 0F); // Box 57
        bodyModel[39].setRotationPoint(-38F, -20F, 6F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 20, 4, 0F); // Box 58
        bodyModel[40].setRotationPoint(-38F, -20F, -10F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 59
        bodyModel[41].setRotationPoint(-39F, -20F, 6F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        bodyModel[42].setRotationPoint(-39F, -21F, 6F);

        bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 61
        bodyModel[43].setRotationPoint(-39F, -21F, -6F);

        bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        bodyModel[44].setRotationPoint(-39F, -21F, -7F);

        bodyModel[45].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 64
        bodyModel[45].setRotationPoint(-39F, -20F, -7F);

        bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 67
        bodyModel[46].setRotationPoint(-39F, -2F, -6F);

        bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 68
        bodyModel[47].setRotationPoint(-38F, -1F, -6F);

        bodyModel[48].addBox(0F, 0F, 0F, 1, 19, 12, 0F); // Box 85
        bodyModel[48].setRotationPoint(37F, -20F, -6F);

        bodyModel[49].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 87
        bodyModel[49].setRotationPoint(38F, -20F, 6F);

        bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[50].setRotationPoint(38F, -21F, 6F);

        bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 89
        bodyModel[51].setRotationPoint(38F, -21F, -6F);

        bodyModel[52].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 90
        bodyModel[52].setRotationPoint(38F, -20F, -7F);

        bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 91
        bodyModel[53].setRotationPoint(38F, -2F, -6F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        bodyModel[54].setRotationPoint(38F, -21F, -7F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 93
        bodyModel[55].setRotationPoint(-25F, 1F, 10F);

        bodyModel[56].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 94
        bodyModel[56].setRotationPoint(-37F, 1F, 10F);

        bodyModel[57].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 97
        bodyModel[57].setRotationPoint(-37F, 1F, -11F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
        bodyModel[58].setRotationPoint(-25F, 1F, -11F);

        bodyModel[59].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // Box 99
        bodyModel[59].setRotationPoint(24F, 1F, -11F);

        bodyModel[60].addBox(0F, 0F, 0F, 13, 2, 1, 0F); // Box 101
        bodyModel[60].setRotationPoint(24F, 1F, 10F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 104
        bodyModel[61].setRotationPoint(23F, 1F, 10F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 106
        bodyModel[62].setRotationPoint(23F, 1F, -11F);

        bodyModel[63].addBox(0F, 0F, 0F, 15, 1, 8, 0F); // Box 107
        bodyModel[63].setRotationPoint(-37F, -27F, -4F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[64].setRotationPoint(-38F, 1F, -11F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 109
        bodyModel[65].setRotationPoint(-38F, 1F, 10F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 110
        bodyModel[66].setRotationPoint(37F, 1F, 10F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        bodyModel[67].setRotationPoint(37F, 1F, -11F);

        bodyModel[68].addBox(0F, 0F, 0F, 15, 1, 8, 0F); // Box 112
        bodyModel[68].setRotationPoint(22F, -27F, -4F);

        bodyModel[69].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 114
        bodyModel[69].setRotationPoint(-35F, -26F, -7F);
        bodyModel[69].rotateAngleX = -0.78539816F;

        bodyModel[70].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 115
        bodyModel[70].setRotationPoint(26F, -26F, -7F);
        bodyModel[70].rotateAngleX = -0.78539816F;

        bodyModel[71].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 118
        bodyModel[71].setRotationPoint(-35F, -25F, 7F);
        bodyModel[71].rotateAngleX = 0.62831853F;

        bodyModel[72].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 119
        bodyModel[72].setRotationPoint(26F, -25F, 7F);
        bodyModel[72].rotateAngleX = 0.73303829F;

        bodyModel[73].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 130
        bodyModel[73].setRotationPoint(9F, -13F, -10F);

        bodyModel[74].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 131
        bodyModel[74].setRotationPoint(10F, -7F, -4F);

        bodyModel[75].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 132
        bodyModel[75].setRotationPoint(10F, -5F, -10F);

        bodyModel[76].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 133
        bodyModel[76].setRotationPoint(12F, -4F, -9F);

        bodyModel[77].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 136
        bodyModel[77].setRotationPoint(12F, -4F, 4F);

        bodyModel[78].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 137
        bodyModel[78].setRotationPoint(10F, -7F, 9F);

        bodyModel[79].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 138
        bodyModel[79].setRotationPoint(10F, -5F, 3F);

        bodyModel[80].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 139
        bodyModel[80].setRotationPoint(9F, -13F, 3F);

        bodyModel[81].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 150
        bodyModel[81].setRotationPoint(10F, -7F, 3F);

        bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 104
        bodyModel[82].setRotationPoint(-12F, 1F, -1F);

        bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 105
        bodyModel[83].setRotationPoint(14F, 1F, -1F);

        bodyModel[84].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 107
        bodyModel[84].setRotationPoint(10F, -7F, -10F);

        bodyModel[85].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 109
        bodyModel[85].setRotationPoint(-3F, -7F, -4F);

        bodyModel[86].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 110
        bodyModel[86].setRotationPoint(-4F, -13F, -10F);

        bodyModel[87].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 111
        bodyModel[87].setRotationPoint(-3F, -7F, -10F);

        bodyModel[88].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 112
        bodyModel[88].setRotationPoint(-3F, -5F, -10F);

        bodyModel[89].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 113
        bodyModel[89].setRotationPoint(-1F, -4F, -9F);

        bodyModel[90].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 114
        bodyModel[90].setRotationPoint(-3F, -7F, 3F);

        bodyModel[91].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 115
        bodyModel[91].setRotationPoint(-3F, -5F, 3F);

        bodyModel[92].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 116
        bodyModel[92].setRotationPoint(-2F, -4F, 4F);

        bodyModel[93].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 117
        bodyModel[93].setRotationPoint(-4F, -13F, 3F);

        bodyModel[94].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 118
        bodyModel[94].setRotationPoint(-3F, -7F, 9F);

        bodyModel[95].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 119
        bodyModel[95].setRotationPoint(-16F, -7F, -4F);

        bodyModel[96].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 120
        bodyModel[96].setRotationPoint(-17F, -13F, -10F);

        bodyModel[97].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 121
        bodyModel[97].setRotationPoint(-16F, -7F, -10F);

        bodyModel[98].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 122
        bodyModel[98].setRotationPoint(-16F, -5F, -10F);

        bodyModel[99].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 123
        bodyModel[99].setRotationPoint(-14F, -4F, -9F);

        bodyModel[100].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 124
        bodyModel[100].setRotationPoint(-16F, -7F, 3F);

        bodyModel[101].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 125
        bodyModel[101].setRotationPoint(-16F, -5F, 3F);

        bodyModel[102].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 126
        bodyModel[102].setRotationPoint(-14F, -4F, 4F);

        bodyModel[103].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 127
        bodyModel[103].setRotationPoint(-17F, -13F, 3F);

        bodyModel[104].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 128
        bodyModel[104].setRotationPoint(-16F, -7F, 9F);

        bodyModel[105].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 109
        bodyModel[105].setRotationPoint(38F, 0F, -1.5F);
    }

    ModelPCHBogie theBogie = new ModelPCHBogie();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        GL11.glPushMatrix();
        AipkitExplorer theCoach = (AipkitExplorer)entity;
        if (theCoach.tiltingHandler != null) {
            GL11.glRotatef(theCoach.tiltingHandler.tiltingProgress, 4F, 0, 0);
        }
        for(int i = 0; i < 105; i++)
        {
            bodyModel[i].render(f5);
        }
        GL11.glPopMatrix();
        Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/pch120_bogie.png"));
        GL11.glPushMatrix();
        GL11.glTranslatef(1F ,0.12F,0F);
        //GL11.glScalef(0.9f,0.9f,0.8f);
        theBogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(-0.65F,0.12F,0);
        theBogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

}
