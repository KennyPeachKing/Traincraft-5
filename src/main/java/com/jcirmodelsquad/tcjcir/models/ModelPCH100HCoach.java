//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:05.06.2020 - 13:20:15
// Last changed on: 05.06.2020 - 13:20:15

package com.jcirmodelsquad.tcjcir.models;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

public class ModelPCH100HCoach extends ModelBase
{
    int textureX = 512;
    int textureY = 512;

    public ModelPCH100HCoach()
    {
        pch100hcoachModel = new ModelRendererTurbo[106];
        pch100hcoachModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        pch100hcoachModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 67
        pch100hcoachModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 68
        pch100hcoachModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 70
        pch100hcoachModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 71
        pch100hcoachModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 72
        pch100hcoachModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
        pch100hcoachModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 76
        pch100hcoachModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 77
        pch100hcoachModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 182
        pch100hcoachModel[10] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 183
        pch100hcoachModel[11] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 184
        pch100hcoachModel[12] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 185
        pch100hcoachModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 186
        pch100hcoachModel[14] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 187
        pch100hcoachModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 189
        pch100hcoachModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 190
        pch100hcoachModel[17] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 192
        pch100hcoachModel[18] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 193
        pch100hcoachModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 195
        pch100hcoachModel[20] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 196
        pch100hcoachModel[21] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 197
        pch100hcoachModel[22] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 198
        pch100hcoachModel[23] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 199
        pch100hcoachModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 200
        pch100hcoachModel[25] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 201
        pch100hcoachModel[26] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 204
        pch100hcoachModel[27] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 205
        pch100hcoachModel[28] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 206
        pch100hcoachModel[29] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 207
        pch100hcoachModel[30] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 212
        pch100hcoachModel[31] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 279
        pch100hcoachModel[32] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 280
        pch100hcoachModel[33] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 281 glow
        pch100hcoachModel[34] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 282 glow
        pch100hcoachModel[35] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 283 glow
        pch100hcoachModel[36] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 284 glow
        pch100hcoachModel[37] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 357
        pch100hcoachModel[38] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 358
        pch100hcoachModel[39] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 359
        pch100hcoachModel[40] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 360
        pch100hcoachModel[41] = new ModelRendererTurbo(this, 71, 120, textureX, textureY); // Box 361
        pch100hcoachModel[42] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 362
        pch100hcoachModel[43] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 363
        pch100hcoachModel[44] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 364
        pch100hcoachModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 206
        pch100hcoachModel[46] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 366
        pch100hcoachModel[47] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 77
        pch100hcoachModel[48] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 78
        pch100hcoachModel[49] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 112
        pch100hcoachModel[50] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 113
        pch100hcoachModel[51] = new ModelRendererTurbo(this, 153, 96, textureX, textureY); // Box 112
        pch100hcoachModel[52] = new ModelRendererTurbo(this, 140, 98, textureX, textureY); // Box 113
        pch100hcoachModel[53] = new ModelRendererTurbo(this, 131, 100, textureX, textureY); // Box 114
        pch100hcoachModel[54] = new ModelRendererTurbo(this, -2, 161, textureX, textureY); // Box 96
        pch100hcoachModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
        pch100hcoachModel[56] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 100
        pch100hcoachModel[57] = new ModelRendererTurbo(this, 97, 104, textureX, textureY); // Box 101
        pch100hcoachModel[58] = new ModelRendererTurbo(this, 59, 111, textureX, textureY); // Box 102
        pch100hcoachModel[59] = new ModelRendererTurbo(this, 110, 100, textureX, textureY); // Box 103
        pch100hcoachModel[60] = new ModelRendererTurbo(this, 101, 100, textureX, textureY); // Box 104
        pch100hcoachModel[61] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 108
        pch100hcoachModel[62] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 109
        pch100hcoachModel[63] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 110
        pch100hcoachModel[64] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 114
        pch100hcoachModel[65] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 116
        pch100hcoachModel[66] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 117
        pch100hcoachModel[67] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 118
        pch100hcoachModel[68] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 119
        pch100hcoachModel[69] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 120
        pch100hcoachModel[70] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 121
        pch100hcoachModel[71] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 89
        pch100hcoachModel[72] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 90
        pch100hcoachModel[73] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 91
        pch100hcoachModel[74] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 92
        pch100hcoachModel[75] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 93
        pch100hcoachModel[76] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 94
        pch100hcoachModel[77] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 95
        pch100hcoachModel[78] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 96
        pch100hcoachModel[79] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 97
        pch100hcoachModel[80] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 98
        pch100hcoachModel[81] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 100
        pch100hcoachModel[82] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 101
        pch100hcoachModel[83] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 102
        pch100hcoachModel[84] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 103
        pch100hcoachModel[85] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 104
        pch100hcoachModel[86] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 105
        pch100hcoachModel[87] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 106
        pch100hcoachModel[88] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 107
        pch100hcoachModel[89] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 108
        pch100hcoachModel[90] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 109
        pch100hcoachModel[91] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 110
        pch100hcoachModel[92] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 111
        pch100hcoachModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
        pch100hcoachModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
        pch100hcoachModel[95] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 107
        pch100hcoachModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
        pch100hcoachModel[97] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 109
        pch100hcoachModel[98] = new ModelRendererTurbo(this, 71, 150, textureX, textureY); // Box 108
        pch100hcoachModel[99] = new ModelRendererTurbo(this, 119, 149, textureX, textureY); // Box 109
        pch100hcoachModel[100] = new ModelRendererTurbo(this, 94, 147, textureX, textureY); // Box 110
        pch100hcoachModel[101] = new ModelRendererTurbo(this, 164, 157, textureX, textureY); // Box 111
        pch100hcoachModel[102] = new ModelRendererTurbo(this, 140, 155, textureX, textureY); // Box 112
        pch100hcoachModel[103] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 113
        pch100hcoachModel[104] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 114
        pch100hcoachModel[105] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 115

        pch100hcoachModel[0].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 0
        pch100hcoachModel[0].setRotationPoint(0F, 0F, -11F);

        pch100hcoachModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
        pch100hcoachModel[1].setRotationPoint(-2F, 0F, -10F);

        pch100hcoachModel[2].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 68
        pch100hcoachModel[2].setRotationPoint(0F, -20F, -11F);

        pch100hcoachModel[3].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 70
        pch100hcoachModel[3].setRotationPoint(-2F, -20F, -11F);

        pch100hcoachModel[4].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 71
        pch100hcoachModel[4].setRotationPoint(-2F, -20F, 10F);

        pch100hcoachModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
        pch100hcoachModel[5].setRotationPoint(-2F, 0F, -11F);

        pch100hcoachModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 73
        pch100hcoachModel[6].setRotationPoint(-2F, 0F, 10F);

        pch100hcoachModel[7].addBox(0F, 0F, 0F, 66, 1, 8, 0F); // Box 76
        pch100hcoachModel[7].setRotationPoint(-2F, -1F, -4F);

        pch100hcoachModel[8].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 77
        pch100hcoachModel[8].setRotationPoint(0F, 0F, 10F);

        pch100hcoachModel[9].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 182
        pch100hcoachModel[9].setRotationPoint(-2F, -22F, -9F);

        pch100hcoachModel[10].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        pch100hcoachModel[10].setRotationPoint(0F, -22F, -11F);

        pch100hcoachModel[11].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        pch100hcoachModel[11].setRotationPoint(-2F, -23F, -9F);

        pch100hcoachModel[12].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        pch100hcoachModel[12].setRotationPoint(0F, -22F, 9F);

        pch100hcoachModel[13].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        pch100hcoachModel[13].setRotationPoint(-2F, -23F, 3F);

        pch100hcoachModel[14].addBox(0F, 0F, 0F, 66, 1, 6, 0F); // Box 187
        pch100hcoachModel[14].setRotationPoint(-2F, -23F, -3F);

        pch100hcoachModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        pch100hcoachModel[15].setRotationPoint(-2F, -22F, -11F);

        pch100hcoachModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
        pch100hcoachModel[16].setRotationPoint(-2F, -22F, 9F);

        pch100hcoachModel[17].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 192
        pch100hcoachModel[17].setRotationPoint(14F, -20F, -11F);

        pch100hcoachModel[18].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 193
        pch100hcoachModel[18].setRotationPoint(59F, -20F, -11F);

        pch100hcoachModel[19].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 195
        pch100hcoachModel[19].setRotationPoint(0F, -1F, -11F);

        pch100hcoachModel[20].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 196
        pch100hcoachModel[20].setRotationPoint(0F, -1F, 4F);

        pch100hcoachModel[21].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 197
        pch100hcoachModel[21].setRotationPoint(51F, -20F, -11F);

        pch100hcoachModel[22].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 198
        pch100hcoachModel[22].setRotationPoint(51F, -20F, 10F);

        pch100hcoachModel[23].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 199
        pch100hcoachModel[23].setRotationPoint(59F, -20F, 10F);

        pch100hcoachModel[24].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 200
        pch100hcoachModel[24].setRotationPoint(14F, -20F, 10F);

        pch100hcoachModel[25].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 201
        pch100hcoachModel[25].setRotationPoint(6F, -20F, 10F);

        pch100hcoachModel[26].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 204
        pch100hcoachModel[26].setRotationPoint(63F, -20F, -4F);

        pch100hcoachModel[27].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 205
        pch100hcoachModel[27].setRotationPoint(63F, -20F, -10F);

        pch100hcoachModel[28].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 206
        pch100hcoachModel[28].setRotationPoint(63F, -20F, 4F);

        pch100hcoachModel[29].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 207
        pch100hcoachModel[29].setRotationPoint(63F, -22F, -9F);

        pch100hcoachModel[30].addShapeBox(0F, 0F, 0F, 64, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        pch100hcoachModel[30].setRotationPoint(0F, 0F, -4F);

        pch100hcoachModel[31].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 279
        pch100hcoachModel[31].setRotationPoint(63F, 0F, 4F);

        pch100hcoachModel[32].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 280
        pch100hcoachModel[32].setRotationPoint(63F, 0F, -10F);

        pch100hcoachModel[33].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 281 glow
        pch100hcoachModel[33].setRotationPoint(-1F, -22F, -9F);

        pch100hcoachModel[34].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282 glow
        pch100hcoachModel[34].setRotationPoint(-1F, -21F, -9F);

        pch100hcoachModel[35].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 283 glow
        pch100hcoachModel[35].setRotationPoint(-1F, -22F, 8F);

        pch100hcoachModel[36].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284 glow
        pch100hcoachModel[36].setRotationPoint(-1F, -21F, 8F);

        pch100hcoachModel[37].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 357
        pch100hcoachModel[37].setRotationPoint(0F, 0F, -10F);

        pch100hcoachModel[38].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 358
        pch100hcoachModel[38].setRotationPoint(0F, 0F, 4F);

        pch100hcoachModel[39].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 359
        pch100hcoachModel[39].setRotationPoint(0F, 2F, -4F);

        pch100hcoachModel[40].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 360
        pch100hcoachModel[40].setRotationPoint(-2F, 3F, -10F);

        pch100hcoachModel[41].addBox(0F, 0F, 0F, 12, 3, 20, 0F); // Box 361
        pch100hcoachModel[41].setRotationPoint(20F, 1F, -10F);

        pch100hcoachModel[42].addBox(0F, 0F, 0F, 4, 3, 20, 0F); // Box 362
        pch100hcoachModel[42].setRotationPoint(36F, 1F, -10F);

        pch100hcoachModel[43].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 363
        pch100hcoachModel[43].setRotationPoint(13F, 0F, -10F);

        pch100hcoachModel[44].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 364
        pch100hcoachModel[44].setRotationPoint(50F, 0F, -10F);

        pch100hcoachModel[45].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 206
        pch100hcoachModel[45].setRotationPoint(-4F, 0F, -1.5F);

        pch100hcoachModel[46].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 366
        pch100hcoachModel[46].setRotationPoint(64F, 0F, -1.5F);

        pch100hcoachModel[47].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 77
        pch100hcoachModel[47].setRotationPoint(-2F, -1F, -10F);

        pch100hcoachModel[48].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 78
        pch100hcoachModel[48].setRotationPoint(-2F, -1F, 4F);

        pch100hcoachModel[49].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 112
        pch100hcoachModel[49].setRotationPoint(-1F, -22F, -3F);

        pch100hcoachModel[50].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 113
        pch100hcoachModel[50].setRotationPoint(-1F, -22F, 3F);

        pch100hcoachModel[51].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 112
        pch100hcoachModel[51].setRotationPoint(3F, -24F, -3F);

        pch100hcoachModel[52].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 113
        pch100hcoachModel[52].setRotationPoint(1F, -24F, -2F);

        pch100hcoachModel[53].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 114
        pch100hcoachModel[53].setRotationPoint(-1F, -24F, -1F);

        pch100hcoachModel[54].addBox(0F, 0F, 0F, 27, 1, 6, 0F); // Box 96
        pch100hcoachModel[54].setRotationPoint(19F, -24F, -3F);

        pch100hcoachModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
        pch100hcoachModel[55].setRotationPoint(0F, 0F, 0F);

        pch100hcoachModel[56].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        pch100hcoachModel[56].setRotationPoint(54F, -24F, -3F);

        pch100hcoachModel[57].addBox(0F, 0F, 0F, 9, 1, 4, 0F); // Box 101
        pch100hcoachModel[57].setRotationPoint(54F, -24F, -2F);

        pch100hcoachModel[58].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        pch100hcoachModel[58].setRotationPoint(54F, -24F, 2F);

        pch100hcoachModel[59].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 103
        pch100hcoachModel[59].setRotationPoint(46F, -24F, -1F);

        pch100hcoachModel[60].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 104
        pch100hcoachModel[60].setRotationPoint(17F, -24F, -1F);

        pch100hcoachModel[61].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 108
        pch100hcoachModel[61].setRotationPoint(17F, -5F, 3F);

        pch100hcoachModel[62].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 109
        pch100hcoachModel[62].setRotationPoint(23F, -12F, 3F);

        pch100hcoachModel[63].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 110
        pch100hcoachModel[63].setRotationPoint(23F, -4F, 3F);

        pch100hcoachModel[64].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 114
        pch100hcoachModel[64].setRotationPoint(19F, -7F, 3F);

        pch100hcoachModel[65].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 116
        pch100hcoachModel[65].setRotationPoint(19F, -7F, 9F);

        pch100hcoachModel[66].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 117
        pch100hcoachModel[66].setRotationPoint(23F, -4F, -10F);

        pch100hcoachModel[67].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 118
        pch100hcoachModel[67].setRotationPoint(19F, -7F, -10F);

        pch100hcoachModel[68].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 119
        pch100hcoachModel[68].setRotationPoint(17F, -5F, -10F);

        pch100hcoachModel[69].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 120
        pch100hcoachModel[69].setRotationPoint(19F, -7F, -4F);

        pch100hcoachModel[70].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 121
        pch100hcoachModel[70].setRotationPoint(23F, -12F, -10F);

        pch100hcoachModel[71].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 89
        pch100hcoachModel[71].setRotationPoint(34F, -4F, 3F);

        pch100hcoachModel[72].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 90
        pch100hcoachModel[72].setRotationPoint(30F, -7F, 3F);

        pch100hcoachModel[73].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 91
        pch100hcoachModel[73].setRotationPoint(28F, -5F, 3F);

        pch100hcoachModel[74].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 92
        pch100hcoachModel[74].setRotationPoint(30F, -7F, 9F);

        pch100hcoachModel[75].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 93
        pch100hcoachModel[75].setRotationPoint(34F, -12F, 3F);

        pch100hcoachModel[76].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 94
        pch100hcoachModel[76].setRotationPoint(30F, -7F, -10F);

        pch100hcoachModel[77].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 95
        pch100hcoachModel[77].setRotationPoint(30F, -7F, -4F);

        pch100hcoachModel[78].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 96
        pch100hcoachModel[78].setRotationPoint(34F, -12F, -10F);

        pch100hcoachModel[79].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 97
        pch100hcoachModel[79].setRotationPoint(28F, -5F, -10F);

        pch100hcoachModel[80].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 98
        pch100hcoachModel[80].setRotationPoint(34F, -4F, -10F);

        pch100hcoachModel[81].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 100
        pch100hcoachModel[81].setRotationPoint(44F, -4F, 3F);

        pch100hcoachModel[82].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 101
        pch100hcoachModel[82].setRotationPoint(40F, -7F, 3F);

        pch100hcoachModel[83].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 102
        pch100hcoachModel[83].setRotationPoint(38F, -5F, 3F);

        pch100hcoachModel[84].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 103
        pch100hcoachModel[84].setRotationPoint(40F, -7F, 9F);

        pch100hcoachModel[85].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 104
        pch100hcoachModel[85].setRotationPoint(44F, -12F, 3F);

        pch100hcoachModel[86].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 105
        pch100hcoachModel[86].setRotationPoint(40F, -7F, -10F);

        pch100hcoachModel[87].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 106
        pch100hcoachModel[87].setRotationPoint(40F, -7F, -4F);

        pch100hcoachModel[88].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 107
        pch100hcoachModel[88].setRotationPoint(44F, -12F, -10F);

        pch100hcoachModel[89].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 108
        pch100hcoachModel[89].setRotationPoint(38F, -5F, -10F);

        pch100hcoachModel[90].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 109
        pch100hcoachModel[90].setRotationPoint(44F, -4F, -10F);

        pch100hcoachModel[91].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 110
        pch100hcoachModel[91].setRotationPoint(49F, -8F, 3F);

        pch100hcoachModel[92].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 111
        pch100hcoachModel[92].setRotationPoint(49F, -8F, -10F);

        pch100hcoachModel[93].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 107
        pch100hcoachModel[93].setRotationPoint(0F, 0F, 0F);

        pch100hcoachModel[94].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 106
        pch100hcoachModel[94].setRotationPoint(3F, -24F, 3F);

        pch100hcoachModel[95].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        pch100hcoachModel[95].setRotationPoint(3F, -24F, -9F);

        pch100hcoachModel[96].addShapeBox(0F, 0F, 0F, 27, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 108
        pch100hcoachModel[96].setRotationPoint(19F, -24F, 3F);

        pch100hcoachModel[97].addShapeBox(0F, 0F, 0F, 27, 1, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        pch100hcoachModel[97].setRotationPoint(19F, -24F, -9F);

        pch100hcoachModel[98].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 108
        pch100hcoachModel[98].setRotationPoint(-2F, -20F, -10F);

        pch100hcoachModel[99].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 109
        pch100hcoachModel[99].setRotationPoint(-2F, -20F, 4F);

        pch100hcoachModel[100].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 110
        pch100hcoachModel[100].setRotationPoint(-2F, -20F, -4F);

        pch100hcoachModel[101].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 111
        pch100hcoachModel[101].setRotationPoint(6F, -20F, -11F);

        pch100hcoachModel[102].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 112
        pch100hcoachModel[102].setRotationPoint(0F, -20F, 10F);

        pch100hcoachModel[103].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 113
        pch100hcoachModel[103].setRotationPoint(13F, -8F, -10F);

        pch100hcoachModel[104].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 114
        pch100hcoachModel[104].setRotationPoint(27F, -20F, -4F);

        pch100hcoachModel[105].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 115
        pch100hcoachModel[105].setRotationPoint(13F, -8F, 3F);


    }
    ModelPCHBogie theBogie = new ModelPCHBogie();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 106; i++)
        {
            pch100hcoachModel[i].render(f5);
        }
        Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/pch120_bogie.png"));
        GL11.glPushMatrix();
        GL11.glTranslatef(3.3F ,0.1F,0F);
        //GL11.glScalef(0.9f,0.9f,0.8f);
        theBogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(0.7F,0.1F,0);
        theBogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo pch100hcoachModel[];
}