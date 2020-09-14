//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:05.06.2020 - 13:20:15
// Last changed on: 05.06.2020 - 13:20:15

package com.jcirmodelsquad.tcjcir.models.trains;

import com.jcirmodelsquad.tcjcir.models.ModelAutoTrainIndicator;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelPCHBogie;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

public class ModelPCH100H extends ModelBase
{
    int textureX = 512;
    int textureY = 512;

    public ModelPCH100H()
    {
        experimentalhydrogentrainModel = new ModelRendererTurbo[108];
        experimentalhydrogentrainModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        experimentalhydrogentrainModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 67
        experimentalhydrogentrainModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 68
        experimentalhydrogentrainModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 70
        experimentalhydrogentrainModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 71
        experimentalhydrogentrainModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 72
        experimentalhydrogentrainModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
        experimentalhydrogentrainModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 76
        experimentalhydrogentrainModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 77
        experimentalhydrogentrainModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 182
        experimentalhydrogentrainModel[10] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 183
        experimentalhydrogentrainModel[11] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 184
        experimentalhydrogentrainModel[12] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 185
        experimentalhydrogentrainModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 186
        experimentalhydrogentrainModel[14] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 187
        experimentalhydrogentrainModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 189
        experimentalhydrogentrainModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 190
        experimentalhydrogentrainModel[17] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 191 door slide right
        experimentalhydrogentrainModel[18] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 192
        experimentalhydrogentrainModel[19] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 193
        experimentalhydrogentrainModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 195
        experimentalhydrogentrainModel[21] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 196
        experimentalhydrogentrainModel[22] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 197
        experimentalhydrogentrainModel[23] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 198
        experimentalhydrogentrainModel[24] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 199
        experimentalhydrogentrainModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 200
        experimentalhydrogentrainModel[26] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 201
        experimentalhydrogentrainModel[27] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 202
        experimentalhydrogentrainModel[28] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 204
        experimentalhydrogentrainModel[29] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 205
        experimentalhydrogentrainModel[30] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 206
        experimentalhydrogentrainModel[31] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 207
        experimentalhydrogentrainModel[32] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 209
        experimentalhydrogentrainModel[33] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 210
        experimentalhydrogentrainModel[34] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 211
        experimentalhydrogentrainModel[35] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 212
        experimentalhydrogentrainModel[36] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 279
        experimentalhydrogentrainModel[37] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 280
        experimentalhydrogentrainModel[38] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 281 glow
        experimentalhydrogentrainModel[39] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 282 glow
        experimentalhydrogentrainModel[40] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 283 glow
        experimentalhydrogentrainModel[41] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 284 glow
        experimentalhydrogentrainModel[42] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 357
        experimentalhydrogentrainModel[43] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 358
        experimentalhydrogentrainModel[44] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 359
        experimentalhydrogentrainModel[45] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 360
        experimentalhydrogentrainModel[46] = new ModelRendererTurbo(this, 71, 120, textureX, textureY); // Box 361
        experimentalhydrogentrainModel[47] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 362
        experimentalhydrogentrainModel[48] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 363
        experimentalhydrogentrainModel[49] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 364
        experimentalhydrogentrainModel[50] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 206
        experimentalhydrogentrainModel[51] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 366
        experimentalhydrogentrainModel[52] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 77
        experimentalhydrogentrainModel[53] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 78
        experimentalhydrogentrainModel[54] = new ModelRendererTurbo(this, 94, 78, textureX, textureY); // Box 110
        experimentalhydrogentrainModel[55] = new ModelRendererTurbo(this, 79, 80, textureX, textureY); // Box 111
        experimentalhydrogentrainModel[56] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 112
        experimentalhydrogentrainModel[57] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 113
        experimentalhydrogentrainModel[58] = new ModelRendererTurbo(this, 153, 96, textureX, textureY); // Box 112
        experimentalhydrogentrainModel[59] = new ModelRendererTurbo(this, 140, 98, textureX, textureY); // Box 113
        experimentalhydrogentrainModel[60] = new ModelRendererTurbo(this, 131, 100, textureX, textureY); // Box 114
        experimentalhydrogentrainModel[61] = new ModelRendererTurbo(this, -2, 161, textureX, textureY); // Box 96
        experimentalhydrogentrainModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 99
        experimentalhydrogentrainModel[63] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Box 100
        experimentalhydrogentrainModel[64] = new ModelRendererTurbo(this, 97, 104, textureX, textureY); // Box 101
        experimentalhydrogentrainModel[65] = new ModelRendererTurbo(this, 59, 111, textureX, textureY); // Box 102
        experimentalhydrogentrainModel[66] = new ModelRendererTurbo(this, 110, 100, textureX, textureY); // Box 103
        experimentalhydrogentrainModel[67] = new ModelRendererTurbo(this, 101, 100, textureX, textureY); // Box 104
        experimentalhydrogentrainModel[68] = new ModelRendererTurbo(this, 1, 114, textureX, textureY); // Box 105
        experimentalhydrogentrainModel[69] = new ModelRendererTurbo(this, 60, 130, textureX, textureY); // Box 106
        experimentalhydrogentrainModel[70] = new ModelRendererTurbo(this, 51, 130, textureX, textureY); // Box 107
        experimentalhydrogentrainModel[71] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 108
        experimentalhydrogentrainModel[72] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 109
        experimentalhydrogentrainModel[73] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 110
        experimentalhydrogentrainModel[74] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 114
        experimentalhydrogentrainModel[75] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 116
        experimentalhydrogentrainModel[76] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 117
        experimentalhydrogentrainModel[77] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 118
        experimentalhydrogentrainModel[78] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 119
        experimentalhydrogentrainModel[79] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 120
        experimentalhydrogentrainModel[80] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 121
        experimentalhydrogentrainModel[81] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 89
        experimentalhydrogentrainModel[82] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 90
        experimentalhydrogentrainModel[83] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 91
        experimentalhydrogentrainModel[84] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 92
        experimentalhydrogentrainModel[85] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 93
        experimentalhydrogentrainModel[86] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 94
        experimentalhydrogentrainModel[87] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 95
        experimentalhydrogentrainModel[88] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 96
        experimentalhydrogentrainModel[89] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 97
        experimentalhydrogentrainModel[90] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 98
        experimentalhydrogentrainModel[91] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 100
        experimentalhydrogentrainModel[92] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 101
        experimentalhydrogentrainModel[93] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 102
        experimentalhydrogentrainModel[94] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 103
        experimentalhydrogentrainModel[95] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 104
        experimentalhydrogentrainModel[96] = new ModelRendererTurbo(this, 172, 140, textureX, textureY); // Box 105
        experimentalhydrogentrainModel[97] = new ModelRendererTurbo(this, 159, 140, textureX, textureY); // Box 106
        experimentalhydrogentrainModel[98] = new ModelRendererTurbo(this, 140, 128, textureX, textureY); // Box 107
        experimentalhydrogentrainModel[99] = new ModelRendererTurbo(this, 204, 135, textureX, textureY); // Box 108
        experimentalhydrogentrainModel[100] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 109
        experimentalhydrogentrainModel[101] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 110
        experimentalhydrogentrainModel[102] = new ModelRendererTurbo(this, 234, 133, textureX, textureY); // Box 111
        experimentalhydrogentrainModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 107
        experimentalhydrogentrainModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 106
        experimentalhydrogentrainModel[105] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 107
        experimentalhydrogentrainModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 108
        experimentalhydrogentrainModel[107] = new ModelRendererTurbo(this, 260, 138, textureX, textureY); // Box 109

        experimentalhydrogentrainModel[0].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 0
        experimentalhydrogentrainModel[0].setRotationPoint(0F, 0F, -11F);

        experimentalhydrogentrainModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
        experimentalhydrogentrainModel[1].setRotationPoint(-2F, 0F, -10F);

        experimentalhydrogentrainModel[2].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 68
        experimentalhydrogentrainModel[2].setRotationPoint(0F, -20F, -11F);

        experimentalhydrogentrainModel[3].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
        experimentalhydrogentrainModel[3].setRotationPoint(-2F, -20F, -11F);

        experimentalhydrogentrainModel[4].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 71
        experimentalhydrogentrainModel[4].setRotationPoint(-2F, -20F, 10F);

        experimentalhydrogentrainModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
        experimentalhydrogentrainModel[5].setRotationPoint(-2F, 0F, -11F);

        experimentalhydrogentrainModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 73
        experimentalhydrogentrainModel[6].setRotationPoint(-2F, 0F, 10F);

        experimentalhydrogentrainModel[7].addBox(0F, 0F, 0F, 66, 1, 8, 0F); // Box 76
        experimentalhydrogentrainModel[7].setRotationPoint(-2F, -1F, -4F);

        experimentalhydrogentrainModel[8].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 77
        experimentalhydrogentrainModel[8].setRotationPoint(0F, 0F, 10F);

        experimentalhydrogentrainModel[9].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 182
        experimentalhydrogentrainModel[9].setRotationPoint(-2F, -22F, -9F);

        experimentalhydrogentrainModel[10].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        experimentalhydrogentrainModel[10].setRotationPoint(0F, -22F, -11F);

        experimentalhydrogentrainModel[11].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
        experimentalhydrogentrainModel[11].setRotationPoint(-2F, -23F, -9F);

        experimentalhydrogentrainModel[12].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
        experimentalhydrogentrainModel[12].setRotationPoint(0F, -22F, 9F);

        experimentalhydrogentrainModel[13].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
        experimentalhydrogentrainModel[13].setRotationPoint(-2F, -23F, 3F);

        experimentalhydrogentrainModel[14].addBox(0F, 0F, 0F, 66, 1, 6, 0F); // Box 187
        experimentalhydrogentrainModel[14].setRotationPoint(-2F, -23F, -3F);

        experimentalhydrogentrainModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
        experimentalhydrogentrainModel[15].setRotationPoint(-2F, -22F, -11F);

        experimentalhydrogentrainModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
        experimentalhydrogentrainModel[16].setRotationPoint(-2F, -22F, 9F);

        experimentalhydrogentrainModel[17].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 191 door slide right
        experimentalhydrogentrainModel[17].setRotationPoint(6F, -20F, -11F);

        experimentalhydrogentrainModel[18].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 192
        experimentalhydrogentrainModel[18].setRotationPoint(14F, -20F, -11F);

        experimentalhydrogentrainModel[19].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 193
        experimentalhydrogentrainModel[19].setRotationPoint(59F, -20F, -11F);

        experimentalhydrogentrainModel[20].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 195
        experimentalhydrogentrainModel[20].setRotationPoint(0F, -1F, -11F);

        experimentalhydrogentrainModel[21].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 196
        experimentalhydrogentrainModel[21].setRotationPoint(0F, -1F, 4F);

        experimentalhydrogentrainModel[22].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 197
        experimentalhydrogentrainModel[22].setRotationPoint(51F, -20F, -11F);

        experimentalhydrogentrainModel[23].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 198
        experimentalhydrogentrainModel[23].setRotationPoint(51F, -20F, 10F);

        experimentalhydrogentrainModel[24].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 199
        experimentalhydrogentrainModel[24].setRotationPoint(59F, -20F, 10F);

        experimentalhydrogentrainModel[25].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 200
        experimentalhydrogentrainModel[25].setRotationPoint(14F, -20F, 10F);

        experimentalhydrogentrainModel[26].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 201
        experimentalhydrogentrainModel[26].setRotationPoint(6F, -20F, 10F);

        experimentalhydrogentrainModel[27].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 202
        experimentalhydrogentrainModel[27].setRotationPoint(0F, -20F, 10F);

        experimentalhydrogentrainModel[28].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 204
        experimentalhydrogentrainModel[28].setRotationPoint(63F, -20F, -4F);

        experimentalhydrogentrainModel[29].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 205
        experimentalhydrogentrainModel[29].setRotationPoint(63F, -20F, -10F);

        experimentalhydrogentrainModel[30].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 206
        experimentalhydrogentrainModel[30].setRotationPoint(63F, -20F, 4F);

        experimentalhydrogentrainModel[31].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 207
        experimentalhydrogentrainModel[31].setRotationPoint(63F, -22F, -9F);

        experimentalhydrogentrainModel[32].addBox(0F, -1F, 0F, 1, 2, 5, 0F); // Box 209
        experimentalhydrogentrainModel[32].setRotationPoint(-2.25F, -4F, -9.5F);
        experimentalhydrogentrainModel[32].rotateAngleX = -0.31415927F;

        experimentalhydrogentrainModel[33].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 210
        experimentalhydrogentrainModel[33].setRotationPoint(-2.5F, -22.5F, -4.5F);

        experimentalhydrogentrainModel[34].addBox(0F, -1F, 0F, 1, 2, 5, 0F); // Box 211
        experimentalhydrogentrainModel[34].setRotationPoint(-2.25F, -2.5F, 4.5F);
        experimentalhydrogentrainModel[34].rotateAngleX = 0.31415927F;

        experimentalhydrogentrainModel[35].addShapeBox(0F, 0F, 0F, 64, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
        experimentalhydrogentrainModel[35].setRotationPoint(0F, 0F, -4F);

        experimentalhydrogentrainModel[36].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 279
        experimentalhydrogentrainModel[36].setRotationPoint(63F, 0F, 4F);

        experimentalhydrogentrainModel[37].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 280
        experimentalhydrogentrainModel[37].setRotationPoint(63F, 0F, -10F);

        experimentalhydrogentrainModel[38].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 281 glow
        experimentalhydrogentrainModel[38].setRotationPoint(-1F, -22F, -9F);

        experimentalhydrogentrainModel[39].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282 glow
        experimentalhydrogentrainModel[39].setRotationPoint(-1F, -21F, -9F);

        experimentalhydrogentrainModel[40].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 283 glow
        experimentalhydrogentrainModel[40].setRotationPoint(-1F, -22F, 8F);

        experimentalhydrogentrainModel[41].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284 glow
        experimentalhydrogentrainModel[41].setRotationPoint(-1F, -21F, 8F);

        experimentalhydrogentrainModel[42].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 357
        experimentalhydrogentrainModel[42].setRotationPoint(0F, 0F, -10F);

        experimentalhydrogentrainModel[43].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 358
        experimentalhydrogentrainModel[43].setRotationPoint(0F, 0F, 4F);

        experimentalhydrogentrainModel[44].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 359
        experimentalhydrogentrainModel[44].setRotationPoint(0F, 2F, -4F);

        experimentalhydrogentrainModel[45].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 360
        experimentalhydrogentrainModel[45].setRotationPoint(-2F, 3F, -10F);

        experimentalhydrogentrainModel[46].addBox(0F, 0F, 0F, 12, 3, 20, 0F); // Box 361
        experimentalhydrogentrainModel[46].setRotationPoint(20F, 1F, -10F);

        experimentalhydrogentrainModel[47].addBox(0F, 0F, 0F, 4, 3, 20, 0F); // Box 362
        experimentalhydrogentrainModel[47].setRotationPoint(36F, 1F, -10F);

        experimentalhydrogentrainModel[48].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 363
        experimentalhydrogentrainModel[48].setRotationPoint(13F, 0F, -10F);

        experimentalhydrogentrainModel[49].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 364
        experimentalhydrogentrainModel[49].setRotationPoint(50F, 0F, -10F);

        experimentalhydrogentrainModel[50].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 206
        experimentalhydrogentrainModel[50].setRotationPoint(-4F, 0F, -1.5F);

        experimentalhydrogentrainModel[51].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 366
        experimentalhydrogentrainModel[51].setRotationPoint(64F, 0F, -1.5F);

        experimentalhydrogentrainModel[52].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 77
        experimentalhydrogentrainModel[52].setRotationPoint(-1F, -1F, -10F);

        experimentalhydrogentrainModel[53].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 78
        experimentalhydrogentrainModel[53].setRotationPoint(-1F, -1F, 4F);

        experimentalhydrogentrainModel[54].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 110
        experimentalhydrogentrainModel[54].setRotationPoint(0F, -8F, 5.5F);

        experimentalhydrogentrainModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
        experimentalhydrogentrainModel[55].setRotationPoint(0F, -9F, 5.5F);

        experimentalhydrogentrainModel[56].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 112
        experimentalhydrogentrainModel[56].setRotationPoint(-1F, -22F, -3F);

        experimentalhydrogentrainModel[57].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 113
        experimentalhydrogentrainModel[57].setRotationPoint(-1F, -22F, 3F);

        experimentalhydrogentrainModel[58].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 112
        experimentalhydrogentrainModel[58].setRotationPoint(3F, -24F, -3F);

        experimentalhydrogentrainModel[59].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 113
        experimentalhydrogentrainModel[59].setRotationPoint(1F, -24F, -2F);

        experimentalhydrogentrainModel[60].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 114
        experimentalhydrogentrainModel[60].setRotationPoint(-1F, -24F, -1F);

        experimentalhydrogentrainModel[61].addBox(0F, 0F, 0F, 27, 1, 6, 0F); // Box 96
        experimentalhydrogentrainModel[61].setRotationPoint(19F, -24F, -3F);

        experimentalhydrogentrainModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
        experimentalhydrogentrainModel[62].setRotationPoint(0F, 0F, 0F);

        experimentalhydrogentrainModel[63].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        experimentalhydrogentrainModel[63].setRotationPoint(54F, -24F, -3F);

        experimentalhydrogentrainModel[64].addBox(0F, 0F, 0F, 9, 1, 4, 0F); // Box 101
        experimentalhydrogentrainModel[64].setRotationPoint(54F, -24F, -2F);

        experimentalhydrogentrainModel[65].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
        experimentalhydrogentrainModel[65].setRotationPoint(54F, -24F, 2F);

        experimentalhydrogentrainModel[66].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 103
        experimentalhydrogentrainModel[66].setRotationPoint(46F, -24F, -1F);

        experimentalhydrogentrainModel[67].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 104
        experimentalhydrogentrainModel[67].setRotationPoint(17F, -24F, -1F);

        experimentalhydrogentrainModel[68].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Box 105
        experimentalhydrogentrainModel[68].setRotationPoint(-2F, -9F, -10F);

        experimentalhydrogentrainModel[69].addBox(0F, 0F, 0F, 1, 11, 2, 0F); // Box 106
        experimentalhydrogentrainModel[69].setRotationPoint(-2F, -20F, 8F);

        experimentalhydrogentrainModel[70].addBox(0F, 0F, 0F, 1, 11, 2, 0F); // Box 107
        experimentalhydrogentrainModel[70].setRotationPoint(-2F, -20F, -10F);

        experimentalhydrogentrainModel[71].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 108
        experimentalhydrogentrainModel[71].setRotationPoint(17F, -5F, 3F);

        experimentalhydrogentrainModel[72].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 109
        experimentalhydrogentrainModel[72].setRotationPoint(23F, -12F, 3F);

        experimentalhydrogentrainModel[73].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 110
        experimentalhydrogentrainModel[73].setRotationPoint(23F, -4F, 3F);

        experimentalhydrogentrainModel[74].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 114
        experimentalhydrogentrainModel[74].setRotationPoint(19F, -7F, 3F);

        experimentalhydrogentrainModel[75].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 116
        experimentalhydrogentrainModel[75].setRotationPoint(19F, -7F, 9F);

        experimentalhydrogentrainModel[76].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 117
        experimentalhydrogentrainModel[76].setRotationPoint(23F, -4F, -10F);

        experimentalhydrogentrainModel[77].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 118
        experimentalhydrogentrainModel[77].setRotationPoint(19F, -7F, -10F);

        experimentalhydrogentrainModel[78].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 119
        experimentalhydrogentrainModel[78].setRotationPoint(17F, -5F, -10F);

        experimentalhydrogentrainModel[79].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 120
        experimentalhydrogentrainModel[79].setRotationPoint(19F, -7F, -4F);

        experimentalhydrogentrainModel[80].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 121
        experimentalhydrogentrainModel[80].setRotationPoint(23F, -12F, -10F);

        experimentalhydrogentrainModel[81].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 89
        experimentalhydrogentrainModel[81].setRotationPoint(34F, -4F, 3F);

        experimentalhydrogentrainModel[82].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 90
        experimentalhydrogentrainModel[82].setRotationPoint(30F, -7F, 3F);

        experimentalhydrogentrainModel[83].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 91
        experimentalhydrogentrainModel[83].setRotationPoint(28F, -5F, 3F);

        experimentalhydrogentrainModel[84].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 92
        experimentalhydrogentrainModel[84].setRotationPoint(30F, -7F, 9F);

        experimentalhydrogentrainModel[85].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 93
        experimentalhydrogentrainModel[85].setRotationPoint(34F, -12F, 3F);

        experimentalhydrogentrainModel[86].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 94
        experimentalhydrogentrainModel[86].setRotationPoint(30F, -7F, -10F);

        experimentalhydrogentrainModel[87].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 95
        experimentalhydrogentrainModel[87].setRotationPoint(30F, -7F, -4F);

        experimentalhydrogentrainModel[88].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 96
        experimentalhydrogentrainModel[88].setRotationPoint(34F, -12F, -10F);

        experimentalhydrogentrainModel[89].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 97
        experimentalhydrogentrainModel[89].setRotationPoint(28F, -5F, -10F);

        experimentalhydrogentrainModel[90].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 98
        experimentalhydrogentrainModel[90].setRotationPoint(34F, -4F, -10F);

        experimentalhydrogentrainModel[91].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 100
        experimentalhydrogentrainModel[91].setRotationPoint(44F, -4F, 3F);

        experimentalhydrogentrainModel[92].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 101
        experimentalhydrogentrainModel[92].setRotationPoint(40F, -7F, 3F);

        experimentalhydrogentrainModel[93].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 102
        experimentalhydrogentrainModel[93].setRotationPoint(38F, -5F, 3F);

        experimentalhydrogentrainModel[94].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 103
        experimentalhydrogentrainModel[94].setRotationPoint(40F, -7F, 9F);

        experimentalhydrogentrainModel[95].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 104
        experimentalhydrogentrainModel[95].setRotationPoint(44F, -12F, 3F);

        experimentalhydrogentrainModel[96].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 105
        experimentalhydrogentrainModel[96].setRotationPoint(40F, -7F, -10F);

        experimentalhydrogentrainModel[97].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 106
        experimentalhydrogentrainModel[97].setRotationPoint(40F, -7F, -4F);

        experimentalhydrogentrainModel[98].addBox(0F, 0F, 0F, 1, 8, 7, 0F); // Box 107
        experimentalhydrogentrainModel[98].setRotationPoint(44F, -12F, -10F);

        experimentalhydrogentrainModel[99].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 108
        experimentalhydrogentrainModel[99].setRotationPoint(38F, -5F, -10F);

        experimentalhydrogentrainModel[100].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 109
        experimentalhydrogentrainModel[100].setRotationPoint(44F, -4F, -10F);

        experimentalhydrogentrainModel[101].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 110
        experimentalhydrogentrainModel[101].setRotationPoint(49F, -8F, 3F);

        experimentalhydrogentrainModel[102].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 111
        experimentalhydrogentrainModel[102].setRotationPoint(49F, -8F, -10F);

        experimentalhydrogentrainModel[103].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 107
        experimentalhydrogentrainModel[103].setRotationPoint(0F, 0F, 0F);

        experimentalhydrogentrainModel[104].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 106
        experimentalhydrogentrainModel[104].setRotationPoint(3F, -24F, 3F);

        experimentalhydrogentrainModel[105].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        experimentalhydrogentrainModel[105].setRotationPoint(3F, -24F, -9F);

        experimentalhydrogentrainModel[106].addShapeBox(0F, 0F, 0F, 27, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 108
        experimentalhydrogentrainModel[106].setRotationPoint(19F, -24F, 3F);

        experimentalhydrogentrainModel[107].addShapeBox(0F, 0F, 0F, 27, 1, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        experimentalhydrogentrainModel[107].setRotationPoint(19F, -24F, -9F);


    }

    ModelPCHBogie theBogie = new ModelPCHBogie();
    ModelAutoTrainIndicator indicator = new ModelAutoTrainIndicator();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(ModelRendererTurbo m :experimentalhydrogentrainModel) {
            if(m.boxName.equals("light")){
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
            }
            m.render(f5);
            if(m.boxName.equals("light")){
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            }
        }
        for(int i = 0; i < 108; i++)
        {

            experimentalhydrogentrainModel[i].render(f5);
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
      //  indicator.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
/*
        GL11.glPushMatrix();
        GL11.glTranslatef(10F ,20F,10F);
        Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/indicator_off.png"));
        indicator.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();*/
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo experimentalhydrogentrainModel[];
}