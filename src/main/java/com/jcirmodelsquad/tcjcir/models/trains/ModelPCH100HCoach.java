//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:05.06.2020 - 13:20:15
// Last changed on: 05.06.2020 - 13:20:15

package com.jcirmodelsquad.tcjcir.models.trains;

import com.jcirmodelsquad.tcjcir.models.trucks.ModelPCHBogie;
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

        pch100coachModel = new ModelRendererTurbo[105];
        pch100coachModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        pch100coachModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 67
        pch100coachModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 68
        pch100coachModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 70
        pch100coachModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 71
        pch100coachModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 72
        pch100coachModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
        pch100coachModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 76
        pch100coachModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 77
        pch100coachModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 182
        pch100coachModel[10] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 183
        pch100coachModel[11] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 184
        pch100coachModel[12] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 185
        pch100coachModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 186
        pch100coachModel[14] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 187
        pch100coachModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 189
        pch100coachModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 190
        pch100coachModel[17] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 192
        pch100coachModel[18] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 193
        pch100coachModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 195
        pch100coachModel[20] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 196
        pch100coachModel[21] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 197
        pch100coachModel[22] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 198
        pch100coachModel[23] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 199
        pch100coachModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 200
        pch100coachModel[25] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 201
        pch100coachModel[26] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 204
        pch100coachModel[27] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 205
        pch100coachModel[28] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 206
        pch100coachModel[29] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 207
        pch100coachModel[30] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 212
        pch100coachModel[31] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 279
        pch100coachModel[32] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 280
        pch100coachModel[33] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 281 glow
        pch100coachModel[34] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 282 glow
        pch100coachModel[35] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 283 glow
        pch100coachModel[36] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 284 glow
        pch100coachModel[37] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 357
        pch100coachModel[38] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 358
        pch100coachModel[39] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 359
        pch100coachModel[40] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 360
        pch100coachModel[41] = new ModelRendererTurbo(this, 71, 120, textureX, textureY); // Box 361
        pch100coachModel[42] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 362
        pch100coachModel[43] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 363
        pch100coachModel[44] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 364
        pch100coachModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 206
        pch100coachModel[46] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 366
        pch100coachModel[47] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 77
        pch100coachModel[48] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 78
        pch100coachModel[49] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 112
        pch100coachModel[50] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 113
        pch100coachModel[51] = new ModelRendererTurbo(this, 153, 96, textureX, textureY); // Box 112
        pch100coachModel[52] = new ModelRendererTurbo(this, 140, 98, textureX, textureY); // Box 113
        pch100coachModel[53] = new ModelRendererTurbo(this, 131, 100, textureX, textureY); // Box 114
        pch100coachModel[54] = new ModelRendererTurbo(this, -2, 161, textureX, textureY); // Box 96
        pch100coachModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
        pch100coachModel[56] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 100
        pch100coachModel[57] = new ModelRendererTurbo(this, 97, 104, textureX, textureY); // Box 101
        pch100coachModel[58] = new ModelRendererTurbo(this, 59, 111, textureX, textureY); // Box 102
        pch100coachModel[59] = new ModelRendererTurbo(this, 110, 100, textureX, textureY); // Box 103
        pch100coachModel[60] = new ModelRendererTurbo(this, 101, 100, textureX, textureY); // Box 104
        pch100coachModel[61] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 108
        pch100coachModel[62] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 109
        pch100coachModel[63] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 110
        pch100coachModel[64] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 114
        pch100coachModel[65] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 116
        pch100coachModel[66] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 117
        pch100coachModel[67] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 118
        pch100coachModel[68] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 119
        pch100coachModel[69] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 120
        pch100coachModel[70] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 121
        pch100coachModel[71] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 89
        pch100coachModel[72] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 90
        pch100coachModel[73] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 91
        pch100coachModel[74] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 92
        pch100coachModel[75] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 93
        pch100coachModel[76] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 94
        pch100coachModel[77] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 95
        pch100coachModel[78] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 96
        pch100coachModel[79] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 97
        pch100coachModel[80] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 98
        pch100coachModel[81] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 100
        pch100coachModel[82] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 101
        pch100coachModel[83] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 102
        pch100coachModel[84] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 103
        pch100coachModel[85] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 104
        pch100coachModel[86] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 105
        pch100coachModel[87] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 106
        pch100coachModel[88] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 107
        pch100coachModel[89] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 108
        pch100coachModel[90] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 109
        pch100coachModel[91] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 110
        pch100coachModel[92] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 111
        pch100coachModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
        pch100coachModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
        pch100coachModel[95] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 107
        pch100coachModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
        pch100coachModel[97] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 109
        pch100coachModel[98] = new ModelRendererTurbo(this, 71, 150, textureX, textureY); // Box 108
        pch100coachModel[99] = new ModelRendererTurbo(this, 119, 149, textureX, textureY); // Box 109
        pch100coachModel[100] = new ModelRendererTurbo(this, 94, 147, textureX, textureY); // Box 110
        pch100coachModel[101] = new ModelRendererTurbo(this, 164, 157, textureX, textureY); // Box 111
        pch100coachModel[102] = new ModelRendererTurbo(this, 140, 155, textureX, textureY); // Box 112
        pch100coachModel[103] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 113
        pch100coachModel[104] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 115

        pch100coachModel[0].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 0
        pch100coachModel[0].setRotationPoint(0F, 0F, -11F);

        pch100coachModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
        pch100coachModel[1].setRotationPoint(-2F, 0F, -10F);

        pch100coachModel[2].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 68
        pch100coachModel[2].setRotationPoint(0F, -20F, -11F);

        pch100coachModel[3].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 70
        pch100coachModel[3].setRotationPoint(-2F, -20F, -11F);

        pch100coachModel[4].addBox(0F, 0F, 0F, 2, 20, 1, 0F); // Box 71
        pch100coachModel[4].setRotationPoint(-2F, -20F, 10F);

        pch100coachModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
        pch100coachModel[5].setRotationPoint(-2F, 0F, -11F);

        pch100coachModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 73
        pch100coachModel[6].setRotationPoint(-2F, 0F, 10F);

        pch100coachModel[7].addBox(0F, 0F, 0F, 66, 1, 8, 0F); // Box 76
        pch100coachModel[7].setRotationPoint(-2F, -1F, -4F);

        pch100coachModel[8].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 77
        pch100coachModel[8].setRotationPoint(0F, 0F, 10F);

        pch100coachModel[9].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 182
        pch100coachModel[9].setRotationPoint(-2F, -22F, -9F);

        pch100coachModel[10].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        pch100coachModel[10].setRotationPoint(0F, -22F, -11F);

        pch100coachModel[11].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        pch100coachModel[11].setRotationPoint(-2F, -23F, -9F);

        pch100coachModel[12].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        pch100coachModel[12].setRotationPoint(0F, -22F, 9F);

        pch100coachModel[13].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        pch100coachModel[13].setRotationPoint(-2F, -23F, 3F);

        pch100coachModel[14].addBox(0F, 0F, 0F, 66, 1, 6, 0F); // Box 187
        pch100coachModel[14].setRotationPoint(-2F, -23F, -3F);

        pch100coachModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        pch100coachModel[15].setRotationPoint(-2F, -22F, -11F);

        pch100coachModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
        pch100coachModel[16].setRotationPoint(-2F, -22F, 9F);

        pch100coachModel[17].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 192
        pch100coachModel[17].setRotationPoint(14F, -20F, -11F);

        pch100coachModel[18].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 193
        pch100coachModel[18].setRotationPoint(59F, -20F, -11F);

        pch100coachModel[19].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 195
        pch100coachModel[19].setRotationPoint(0F, -1F, -11F);

        pch100coachModel[20].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 196
        pch100coachModel[20].setRotationPoint(0F, -1F, 4F);

        pch100coachModel[21].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 197
        pch100coachModel[21].setRotationPoint(51F, -20F, -11F);

        pch100coachModel[22].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 198
        pch100coachModel[22].setRotationPoint(51F, -20F, 10F);

        pch100coachModel[23].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 199
        pch100coachModel[23].setRotationPoint(59F, -20F, 10F);

        pch100coachModel[24].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 200
        pch100coachModel[24].setRotationPoint(14F, -20F, 10F);

        pch100coachModel[25].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 201
        pch100coachModel[25].setRotationPoint(6F, -20F, 10F);

        pch100coachModel[26].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 204
        pch100coachModel[26].setRotationPoint(63F, -20F, -4F);

        pch100coachModel[27].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 205
        pch100coachModel[27].setRotationPoint(63F, -20F, -10F);

        pch100coachModel[28].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 206
        pch100coachModel[28].setRotationPoint(63F, -20F, 4F);

        pch100coachModel[29].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 207
        pch100coachModel[29].setRotationPoint(63F, -22F, -9F);

        pch100coachModel[30].addShapeBox(0F, 0F, 0F, 64, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        pch100coachModel[30].setRotationPoint(0F, 0F, -4F);

        pch100coachModel[31].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 279
        pch100coachModel[31].setRotationPoint(63F, 0F, 4F);

        pch100coachModel[32].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 280
        pch100coachModel[32].setRotationPoint(63F, 0F, -10F);

        pch100coachModel[33].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 281 glow
        pch100coachModel[33].setRotationPoint(-1F, -22F, -9F);

        pch100coachModel[34].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282 glow
        pch100coachModel[34].setRotationPoint(-1F, -21F, -9F);

        pch100coachModel[35].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 283 glow
        pch100coachModel[35].setRotationPoint(-1F, -22F, 8F);

        pch100coachModel[36].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284 glow
        pch100coachModel[36].setRotationPoint(-1F, -21F, 8F);

        pch100coachModel[37].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 357
        pch100coachModel[37].setRotationPoint(0F, 0F, -10F);

        pch100coachModel[38].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 358
        pch100coachModel[38].setRotationPoint(0F, 0F, 4F);

        pch100coachModel[39].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 359
        pch100coachModel[39].setRotationPoint(0F, 2F, -4F);

        pch100coachModel[40].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 360
        pch100coachModel[40].setRotationPoint(-2F, 3F, -10F);

        pch100coachModel[41].addBox(0F, 0F, 0F, 12, 3, 20, 0F); // Box 361
        pch100coachModel[41].setRotationPoint(20F, 1F, -10F);

        pch100coachModel[42].addBox(0F, 0F, 0F, 4, 3, 20, 0F); // Box 362
        pch100coachModel[42].setRotationPoint(36F, 1F, -10F);

        pch100coachModel[43].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 363
        pch100coachModel[43].setRotationPoint(13F, 0F, -10F);

        pch100coachModel[44].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 364
        pch100coachModel[44].setRotationPoint(50F, 0F, -10F);

        pch100coachModel[45].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 206
        pch100coachModel[45].setRotationPoint(-4F, 0F, -1.5F);

        pch100coachModel[46].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 366
        pch100coachModel[46].setRotationPoint(64F, 0F, -1.5F);

        pch100coachModel[47].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 77
        pch100coachModel[47].setRotationPoint(-2F, -1F, -10F);

        pch100coachModel[48].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 78
        pch100coachModel[48].setRotationPoint(-2F, -1F, 4F);

        pch100coachModel[49].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 112
        pch100coachModel[49].setRotationPoint(-1F, -22F, -3F);

        pch100coachModel[50].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 113
        pch100coachModel[50].setRotationPoint(-1F, -22F, 3F);

        pch100coachModel[51].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 112
        pch100coachModel[51].setRotationPoint(3F, -24F, -3F);

        pch100coachModel[52].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 113
        pch100coachModel[52].setRotationPoint(1F, -24F, -2F);

        pch100coachModel[53].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 114
        pch100coachModel[53].setRotationPoint(-1F, -24F, -1F);

        pch100coachModel[54].addBox(0F, 0F, 0F, 27, 1, 6, 0F); // Box 96
        pch100coachModel[54].setRotationPoint(19F, -24F, -3F);

        pch100coachModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
        pch100coachModel[55].setRotationPoint(0F, 0F, 0F);

        pch100coachModel[56].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        pch100coachModel[56].setRotationPoint(54F, -24F, -3F);

        pch100coachModel[57].addBox(0F, 0F, 0F, 9, 1, 4, 0F); // Box 101
        pch100coachModel[57].setRotationPoint(54F, -24F, -2F);

        pch100coachModel[58].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        pch100coachModel[58].setRotationPoint(54F, -24F, 2F);

        pch100coachModel[59].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 103
        pch100coachModel[59].setRotationPoint(46F, -24F, -1F);

        pch100coachModel[60].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 104
        pch100coachModel[60].setRotationPoint(17F, -24F, -1F);

        pch100coachModel[61].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 108
        pch100coachModel[61].setRotationPoint(17F, -5F, 3F);

        pch100coachModel[62].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 109
        pch100coachModel[62].setRotationPoint(23F, -12F, 3F);

        pch100coachModel[63].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 110
        pch100coachModel[63].setRotationPoint(23F, -4F, 3F);

        pch100coachModel[64].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 114
        pch100coachModel[64].setRotationPoint(19F, -7F, 3F);

        pch100coachModel[65].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 116
        pch100coachModel[65].setRotationPoint(19F, -7F, 9F);

        pch100coachModel[66].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 117
        pch100coachModel[66].setRotationPoint(23F, -4F, -10F);

        pch100coachModel[67].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 118
        pch100coachModel[67].setRotationPoint(19F, -7F, -10F);

        pch100coachModel[68].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 119
        pch100coachModel[68].setRotationPoint(17F, -5F, -10F);

        pch100coachModel[69].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 120
        pch100coachModel[69].setRotationPoint(19F, -7F, -4F);

        pch100coachModel[70].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 121
        pch100coachModel[70].setRotationPoint(23F, -12F, -10F);

        pch100coachModel[71].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 89
        pch100coachModel[71].setRotationPoint(34F, -4F, 3F);

        pch100coachModel[72].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 90
        pch100coachModel[72].setRotationPoint(30F, -7F, 3F);

        pch100coachModel[73].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 91
        pch100coachModel[73].setRotationPoint(28F, -5F, 3F);

        pch100coachModel[74].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 92
        pch100coachModel[74].setRotationPoint(30F, -7F, 9F);

        pch100coachModel[75].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 93
        pch100coachModel[75].setRotationPoint(34F, -12F, 3F);

        pch100coachModel[76].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 94
        pch100coachModel[76].setRotationPoint(30F, -7F, -10F);

        pch100coachModel[77].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 95
        pch100coachModel[77].setRotationPoint(30F, -7F, -4F);

        pch100coachModel[78].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 96
        pch100coachModel[78].setRotationPoint(34F, -12F, -10F);

        pch100coachModel[79].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 97
        pch100coachModel[79].setRotationPoint(28F, -5F, -10F);

        pch100coachModel[80].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 98
        pch100coachModel[80].setRotationPoint(34F, -4F, -10F);

        pch100coachModel[81].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 100
        pch100coachModel[81].setRotationPoint(44F, -4F, 3F);

        pch100coachModel[82].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 101
        pch100coachModel[82].setRotationPoint(40F, -7F, 3F);

        pch100coachModel[83].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 102
        pch100coachModel[83].setRotationPoint(38F, -5F, 3F);

        pch100coachModel[84].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 103
        pch100coachModel[84].setRotationPoint(40F, -7F, 9F);

        pch100coachModel[85].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 104
        pch100coachModel[85].setRotationPoint(44F, -12F, 3F);

        pch100coachModel[86].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 105
        pch100coachModel[86].setRotationPoint(40F, -7F, -10F);

        pch100coachModel[87].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 106
        pch100coachModel[87].setRotationPoint(40F, -7F, -4F);

        pch100coachModel[88].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 107
        pch100coachModel[88].setRotationPoint(44F, -12F, -10F);

        pch100coachModel[89].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 108
        pch100coachModel[89].setRotationPoint(38F, -5F, -10F);

        pch100coachModel[90].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 109
        pch100coachModel[90].setRotationPoint(44F, -4F, -10F);

        pch100coachModel[91].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 110
        pch100coachModel[91].setRotationPoint(49F, -8F, 3F);

        pch100coachModel[92].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 111
        pch100coachModel[92].setRotationPoint(49F, -8F, -10F);

        pch100coachModel[93].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 107
        pch100coachModel[93].setRotationPoint(0F, 0F, 0F);

        pch100coachModel[94].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 106
        pch100coachModel[94].setRotationPoint(3F, -24F, 3F);

        pch100coachModel[95].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        pch100coachModel[95].setRotationPoint(3F, -24F, -9F);

        pch100coachModel[96].addShapeBox(0F, 0F, 0F, 27, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 108
        pch100coachModel[96].setRotationPoint(19F, -24F, 3F);

        pch100coachModel[97].addShapeBox(0F, 0F, 0F, 27, 1, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        pch100coachModel[97].setRotationPoint(19F, -24F, -9F);

        pch100coachModel[98].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 108
        pch100coachModel[98].setRotationPoint(-2F, -20F, -10F);

        pch100coachModel[99].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 109
        pch100coachModel[99].setRotationPoint(-2F, -20F, 4F);

        pch100coachModel[100].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 110
        pch100coachModel[100].setRotationPoint(-2F, -20F, -4F);

        pch100coachModel[101].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 111
        pch100coachModel[101].setRotationPoint(6F, -20F, -11F);

        pch100coachModel[102].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 112
        pch100coachModel[102].setRotationPoint(0F, -20F, 10F);

        pch100coachModel[103].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 113
        pch100coachModel[103].setRotationPoint(13F, -8F, -10F);

        pch100coachModel[104].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 115
        pch100coachModel[104].setRotationPoint(13F, -8F, 3F);

    }
    ModelPCHBogie theBogie = new ModelPCHBogie();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 105; i++)
        {
            pch100coachModel[i].render(f5);
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

    public ModelRendererTurbo pch100coachModel[];
}