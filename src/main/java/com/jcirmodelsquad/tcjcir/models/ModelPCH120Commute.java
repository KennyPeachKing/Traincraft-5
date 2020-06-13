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
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;


public class ModelPCH120Commute extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public ModelPCH120Commute()
	{
		pch120commuteModel = new ModelRendererTurbo[112];
		pch120commuteModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		pch120commuteModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 67
		pch120commuteModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 68
		pch120commuteModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 70
		pch120commuteModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 71
		pch120commuteModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 72
		pch120commuteModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 73
		pch120commuteModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 74
		pch120commuteModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 75
		pch120commuteModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 76
		pch120commuteModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 77
		pch120commuteModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 182
		pch120commuteModel[12] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 183
		pch120commuteModel[13] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 184
		pch120commuteModel[14] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 185
		pch120commuteModel[15] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 186
		pch120commuteModel[16] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 187
		pch120commuteModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 189
		pch120commuteModel[18] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 190
		pch120commuteModel[19] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 191 door slide right
		pch120commuteModel[20] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 192
		pch120commuteModel[21] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 193
		pch120commuteModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 195
		pch120commuteModel[23] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 196
		pch120commuteModel[24] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 197
		pch120commuteModel[25] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 198
		pch120commuteModel[26] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 199
		pch120commuteModel[27] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 200
		pch120commuteModel[28] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 201
		pch120commuteModel[29] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 202
		pch120commuteModel[30] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 203
		pch120commuteModel[31] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 204
		pch120commuteModel[32] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 205
		pch120commuteModel[33] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 206
		pch120commuteModel[34] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 207
		pch120commuteModel[35] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 208
		pch120commuteModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 209
		pch120commuteModel[37] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 210
		pch120commuteModel[38] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 211
		pch120commuteModel[39] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 212
		pch120commuteModel[40] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 279
		pch120commuteModel[41] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 280
		pch120commuteModel[42] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 281 glow
		pch120commuteModel[43] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 282 glow
		pch120commuteModel[44] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 283 glow
		pch120commuteModel[45] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 284 glow
		pch120commuteModel[46] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 357
		pch120commuteModel[47] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 358
		pch120commuteModel[48] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 359
		pch120commuteModel[49] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 360
		pch120commuteModel[50] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 361
		pch120commuteModel[51] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 362
		pch120commuteModel[52] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 363
		pch120commuteModel[53] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 364
		pch120commuteModel[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 206
		pch120commuteModel[55] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 366
		pch120commuteModel[56] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 186
		pch120commuteModel[57] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 109
		pch120commuteModel[58] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 110
		pch120commuteModel[59] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 118
		pch120commuteModel[60] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 119
		pch120commuteModel[61] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 149
		pch120commuteModel[62] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 150
		pch120commuteModel[63] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 227
		pch120commuteModel[64] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 228
		pch120commuteModel[65] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 229
		pch120commuteModel[66] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 230
		pch120commuteModel[67] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 231
		pch120commuteModel[68] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 232
		pch120commuteModel[69] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 383
		pch120commuteModel[70] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 384
		pch120commuteModel[71] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 385
		pch120commuteModel[72] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 387
		pch120commuteModel[73] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 388
		pch120commuteModel[74] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 389
		pch120commuteModel[75] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 390
		pch120commuteModel[76] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 391
		pch120commuteModel[77] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 77
		pch120commuteModel[78] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 78
		pch120commuteModel[79] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 80
		pch120commuteModel[80] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 81
		pch120commuteModel[81] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 82
		pch120commuteModel[82] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 84
		pch120commuteModel[83] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 85
		pch120commuteModel[84] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 86
		pch120commuteModel[85] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 87
		pch120commuteModel[86] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 88
		pch120commuteModel[87] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 89
		pch120commuteModel[88] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 90
		pch120commuteModel[89] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 91
		pch120commuteModel[90] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 92
		pch120commuteModel[91] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 93
		pch120commuteModel[92] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 94
		pch120commuteModel[93] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 95
		pch120commuteModel[94] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 96
		pch120commuteModel[95] = new ModelRendererTurbo(this, 79, 90, textureX, textureY); // Box 97
		pch120commuteModel[96] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 98
		pch120commuteModel[97] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 99
		pch120commuteModel[98] = new ModelRendererTurbo(this, 59, 87, textureX, textureY); // Box 100
		pch120commuteModel[99] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 101
		pch120commuteModel[100] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 102
		pch120commuteModel[101] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 103
		pch120commuteModel[102] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 104
		pch120commuteModel[103] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 105
		pch120commuteModel[104] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 106
		pch120commuteModel[105] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 107
		pch120commuteModel[106] = new ModelRendererTurbo(this, 124, 78, textureX, textureY); // Box 108
		pch120commuteModel[107] = new ModelRendererTurbo(this, 4, 73, textureX, textureY); // Box 109
		pch120commuteModel[108] = new ModelRendererTurbo(this, 94, 78, textureX, textureY); // Box 110
		pch120commuteModel[109] = new ModelRendererTurbo(this, 79, 80, textureX, textureY); // Box 111
		pch120commuteModel[110] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 112
		pch120commuteModel[111] = new ModelRendererTurbo(this, 163, 77, textureX, textureY); // Box 113

		pch120commuteModel[0].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 0
		pch120commuteModel[0].setRotationPoint(-31F, 0F, -11F);

		pch120commuteModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
		pch120commuteModel[1].setRotationPoint(-33F, 0F, -10F);

		pch120commuteModel[2].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 68
		pch120commuteModel[2].setRotationPoint(-31F, -20F, -11F);

		pch120commuteModel[3].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		pch120commuteModel[3].setRotationPoint(-33F, -20F, -11F);

		pch120commuteModel[4].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 71
		pch120commuteModel[4].setRotationPoint(-33F, -20F, 10F);

		pch120commuteModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
		pch120commuteModel[5].setRotationPoint(-33F, 0F, -11F);

		pch120commuteModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 73
		pch120commuteModel[6].setRotationPoint(-33F, 0F, 10F);

		pch120commuteModel[7].addBox(0F, 0F, 0F, 1, 20, 6, 0F); // Box 74
		pch120commuteModel[7].setRotationPoint(-33F, -20F, -10F);

		pch120commuteModel[8].addBox(0F, 0F, 0F, 1, 20, 6, 0F); // Box 75
		pch120commuteModel[8].setRotationPoint(-33F, -20F, 4F);

		pch120commuteModel[9].addBox(0F, 0F, 0F, 66, 1, 8, 0F); // Box 76
		pch120commuteModel[9].setRotationPoint(-33F, -1F, -4F);

		pch120commuteModel[10].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 77
		pch120commuteModel[10].setRotationPoint(-31F, 0F, 10F);

		pch120commuteModel[11].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 182
		pch120commuteModel[11].setRotationPoint(-33F, -22F, -9F);

		pch120commuteModel[12].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		pch120commuteModel[12].setRotationPoint(-31F, -22F, -11F);

		pch120commuteModel[13].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		pch120commuteModel[13].setRotationPoint(-33F, -23F, -9F);

		pch120commuteModel[14].addShapeBox(0F, 0F, 0F, 64, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		pch120commuteModel[14].setRotationPoint(-31F, -22F, 9F);

		pch120commuteModel[15].addShapeBox(0F, 0F, 0F, 66, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		pch120commuteModel[15].setRotationPoint(-33F, -23F, 3F);

		pch120commuteModel[16].addBox(0F, 0F, 0F, 66, 1, 6, 0F); // Box 187
		pch120commuteModel[16].setRotationPoint(-33F, -23F, -3F);

		pch120commuteModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		pch120commuteModel[17].setRotationPoint(-33F, -22F, -11F);

		pch120commuteModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
		pch120commuteModel[18].setRotationPoint(-33F, -22F, 9F);

		pch120commuteModel[19].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 191 door slide right
		pch120commuteModel[19].setRotationPoint(-25F, -20F, -11F);

		pch120commuteModel[20].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 192
		pch120commuteModel[20].setRotationPoint(-17F, -20F, -11F);

		pch120commuteModel[21].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 193
		pch120commuteModel[21].setRotationPoint(28F, -20F, -11F);

		pch120commuteModel[22].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 195
		pch120commuteModel[22].setRotationPoint(-31F, -1F, -11F);

		pch120commuteModel[23].addBox(0F, 0F, 0F, 64, 1, 7, 0F); // Box 196
		pch120commuteModel[23].setRotationPoint(-31F, -1F, 4F);

		pch120commuteModel[24].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 197
		pch120commuteModel[24].setRotationPoint(20F, -20F, -11F);

		pch120commuteModel[25].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 198
		pch120commuteModel[25].setRotationPoint(20F, -20F, 10F);

		pch120commuteModel[26].addBox(0F, 0F, 0F, 5, 19, 1, 0F); // Box 199
		pch120commuteModel[26].setRotationPoint(28F, -20F, 10F);

		pch120commuteModel[27].addBox(0F, 0F, 0F, 37, 19, 1, 0F); // Box 200
		pch120commuteModel[27].setRotationPoint(-17F, -20F, 10F);

		pch120commuteModel[28].addShapeBox(0F, 0F, 0F, 8, 19, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 201
		pch120commuteModel[28].setRotationPoint(-25F, -20F, 10F);

		pch120commuteModel[29].addBox(0F, 0F, 0F, 6, 19, 1, 0F); // Box 202
		pch120commuteModel[29].setRotationPoint(-31F, -20F, 10F);

		pch120commuteModel[30].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 203
		pch120commuteModel[30].setRotationPoint(-33F, -20F, -4F);

		pch120commuteModel[31].addShapeBox(0F, 0F, 0F, 1, 19, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 204
		pch120commuteModel[31].setRotationPoint(32F, -20F, -4F);

		pch120commuteModel[32].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 205
		pch120commuteModel[32].setRotationPoint(32F, -20F, -10F);

		pch120commuteModel[33].addBox(0F, 0F, 0F, 1, 19, 6, 0F); // Box 206
		pch120commuteModel[33].setRotationPoint(32F, -20F, 4F);

		pch120commuteModel[34].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 207
		pch120commuteModel[34].setRotationPoint(32F, -22F, -9F);

		pch120commuteModel[35].addBox(0F, 0F, 0F, 1, 9, 5, 0F); // Box 208
		pch120commuteModel[35].setRotationPoint(-33.5F, -18F, -9.5F);

		pch120commuteModel[36].addBox(0F, -1F, 0F, 1, 2, 5, 0F); // Box 209
		pch120commuteModel[36].setRotationPoint(-33.25F, -3F, -9.5F);
		pch120commuteModel[36].rotateAngleX = -0.31415927F;

		pch120commuteModel[37].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 210
		pch120commuteModel[37].setRotationPoint(-33.5F, -22.5F, -4.5F);

		pch120commuteModel[38].addBox(0F, -1F, 0F, 1, 2, 5, 0F); // Box 211
		pch120commuteModel[38].setRotationPoint(-33.25F, -1.5F, 4.5F);
		pch120commuteModel[38].rotateAngleX = 0.31415927F;

		pch120commuteModel[39].addShapeBox(0F, 0F, 0F, 64, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		pch120commuteModel[39].setRotationPoint(-31F, 0F, -4F);

		pch120commuteModel[40].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 279
		pch120commuteModel[40].setRotationPoint(32F, 0F, 4F);

		pch120commuteModel[41].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 280
		pch120commuteModel[41].setRotationPoint(32F, 0F, -10F);

		pch120commuteModel[42].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 281 glow
		pch120commuteModel[42].setRotationPoint(-32F, -22F, -9F);

		pch120commuteModel[43].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282 glow
		pch120commuteModel[43].setRotationPoint(-32F, -21F, -9F);

		pch120commuteModel[44].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 283 glow
		pch120commuteModel[44].setRotationPoint(-32F, -22F, 8F);

		pch120commuteModel[45].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284 glow
		pch120commuteModel[45].setRotationPoint(-32F, -21F, 8F);

		pch120commuteModel[46].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 357
		pch120commuteModel[46].setRotationPoint(-31F, 0F, -10F);

		pch120commuteModel[47].addBox(0F, 0F, 0F, 1, 3, 6, 0F); // Box 358
		pch120commuteModel[47].setRotationPoint(-31F, 0F, 4F);

		pch120commuteModel[48].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 359
		pch120commuteModel[48].setRotationPoint(-31F, 2F, -4F);

		pch120commuteModel[49].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 360
		pch120commuteModel[49].setRotationPoint(-33F, 3F, -10F);

		pch120commuteModel[50].addBox(0F, 0F, 0F, 7, 3, 20, 0F); // Box 361
		pch120commuteModel[50].setRotationPoint(-6F, 1F, -10F);

		pch120commuteModel[51].addBox(0F, 0F, 0F, 4, 3, 20, 0F); // Box 362
		pch120commuteModel[51].setRotationPoint(5F, 1F, -10F);

		pch120commuteModel[52].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 363
		pch120commuteModel[52].setRotationPoint(-18F, 0F, -10F);

		pch120commuteModel[53].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 364
		pch120commuteModel[53].setRotationPoint(19F, 0F, -10F);

		pch120commuteModel[54].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 206
		pch120commuteModel[54].setRotationPoint(-35F, 0F, -1.5F);

		pch120commuteModel[55].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 366
		pch120commuteModel[55].setRotationPoint(33F, 0F, -1.5F);

		pch120commuteModel[56].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 186
		pch120commuteModel[56].setRotationPoint(18F, -24F, -4F);

		pch120commuteModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		pch120commuteModel[57].setRotationPoint(32.3F, -27.5F, 1F);
		pch120commuteModel[57].rotateAngleY = -3.14159265F;
		pch120commuteModel[57].rotateAngleZ = -0.27925268F;

		pch120commuteModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 110
		pch120commuteModel[58].setRotationPoint(33F, -27.5F, 3F);
		pch120commuteModel[58].rotateAngleY = -3.14159265F;
		pch120commuteModel[58].rotateAngleZ = 0.78539816F;

		pch120commuteModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		pch120commuteModel[59].setRotationPoint(24F, -34F, 2.5F);

		pch120commuteModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 119
		pch120commuteModel[60].setRotationPoint(24F, -33.5F, -5.5F);

		pch120commuteModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		pch120commuteModel[61].setRotationPoint(24F, -34F, -5.5F);

		pch120commuteModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		pch120commuteModel[62].setRotationPoint(24F, -34.5F, -2.5F);

		pch120commuteModel[63].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 227
		pch120commuteModel[63].setRotationPoint(17F, -24.5F, -5F);

		pch120commuteModel[64].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 228
		pch120commuteModel[64].setRotationPoint(29F, -24.5F, -5F);

		pch120commuteModel[65].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 229
		pch120commuteModel[65].setRotationPoint(29F, -24.5F, 4F);

		pch120commuteModel[66].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 230
		pch120commuteModel[66].setRotationPoint(17F, -24.5F, 4F);

		pch120commuteModel[67].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 231
		pch120commuteModel[67].setRotationPoint(19F, -24.5F, 4F);

		pch120commuteModel[68].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 232
		pch120commuteModel[68].setRotationPoint(19F, -24.5F, -5F);

		pch120commuteModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 383
		pch120commuteModel[69].setRotationPoint(26F, -34F, -6.5F);

		pch120commuteModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 384
		pch120commuteModel[70].setRotationPoint(26F, -33.5F, -6.5F);

		pch120commuteModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		pch120commuteModel[71].setRotationPoint(26F, -34.5F, -3.5F);

		pch120commuteModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 387
		pch120commuteModel[72].setRotationPoint(26F, -34F, 3.5F);

		pch120commuteModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 388
		pch120commuteModel[73].setRotationPoint(24F, -33.5F, 4.5F);

		pch120commuteModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 389
		pch120commuteModel[74].setRotationPoint(26F, -33.5F, 5.5F);

		pch120commuteModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 390
		pch120commuteModel[75].setRotationPoint(33F, -27.5F, -2F);
		pch120commuteModel[75].rotateAngleY = -3.14159265F;
		pch120commuteModel[75].rotateAngleZ = 0.78539816F;

		pch120commuteModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		pch120commuteModel[76].setRotationPoint(25F, -34.5F, -2.5F);

		pch120commuteModel[77].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 77
		pch120commuteModel[77].setRotationPoint(-32F, -1F, -10F);

		pch120commuteModel[78].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 78
		pch120commuteModel[78].setRotationPoint(-32F, -1F, 4F);

		pch120commuteModel[79].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 80
		pch120commuteModel[79].setRotationPoint(-16F, -10F, -10F);

		pch120commuteModel[80].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 81
		pch120commuteModel[80].setRotationPoint(-16F, -4F, -10F);

		pch120commuteModel[81].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		pch120commuteModel[81].setRotationPoint(-17F, -9F, -10F);

		pch120commuteModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		pch120commuteModel[82].setRotationPoint(-5F, -9F, -10F);

		pch120commuteModel[83].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 85
		pch120commuteModel[83].setRotationPoint(-17F, -22F, -3.99F);

		pch120commuteModel[84].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 86
		pch120commuteModel[84].setRotationPoint(-5F, -22F, -3.99F);

		pch120commuteModel[85].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 87
		pch120commuteModel[85].setRotationPoint(-4F, -10F, -10F);

		pch120commuteModel[86].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 88
		pch120commuteModel[86].setRotationPoint(-4F, -4F, -10F);

		pch120commuteModel[87].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		pch120commuteModel[87].setRotationPoint(7F, -9F, -10F);

		pch120commuteModel[88].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 90
		pch120commuteModel[88].setRotationPoint(7F, -22F, -3.99F);

		pch120commuteModel[89].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 91
		pch120commuteModel[89].setRotationPoint(8F, -10F, -10F);

		pch120commuteModel[90].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 92
		pch120commuteModel[90].setRotationPoint(8F, -4F, -10F);

		pch120commuteModel[91].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		pch120commuteModel[91].setRotationPoint(19F, -9F, -10F);

		pch120commuteModel[92].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 94
		pch120commuteModel[92].setRotationPoint(19F, -22F, -3.99F);

		pch120commuteModel[93].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 95
		pch120commuteModel[93].setRotationPoint(-4F, -4F, 4F);

		pch120commuteModel[94].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 96
		pch120commuteModel[94].setRotationPoint(8F, -4F, 4F);

		pch120commuteModel[95].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 97
		pch120commuteModel[95].setRotationPoint(-16F, -4F, 4F);

		pch120commuteModel[96].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		pch120commuteModel[96].setRotationPoint(-16F, -10F, 9F);

		pch120commuteModel[97].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		pch120commuteModel[97].setRotationPoint(-4F, -10F, 9F);

		pch120commuteModel[98].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		pch120commuteModel[98].setRotationPoint(8F, -10F, 9F);

		pch120commuteModel[99].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 101
		pch120commuteModel[99].setRotationPoint(7F, -9F, 4F);

		pch120commuteModel[100].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 102
		pch120commuteModel[100].setRotationPoint(19F, -9F, 4F);

		pch120commuteModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 103
		pch120commuteModel[101].setRotationPoint(-5F, -9F, 4F);

		pch120commuteModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 104
		pch120commuteModel[102].setRotationPoint(-17F, -9F, 4F);

		pch120commuteModel[103].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 105
		pch120commuteModel[103].setRotationPoint(7F, -22F, 3.99F);

		pch120commuteModel[104].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 106
		pch120commuteModel[104].setRotationPoint(19F, -22F, 3.99F);

		pch120commuteModel[105].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 107
		pch120commuteModel[105].setRotationPoint(-17F, -22F, 3.99F);

		pch120commuteModel[106].addBox(0F, 0F, 0F, 1, 21, 0, 0F); // Box 108
		pch120commuteModel[106].setRotationPoint(-5F, -22F, 3.99F);

		pch120commuteModel[107].addBox(0F, 0F, 0F, 2, 13, 4, 0F); // Box 109
		pch120commuteModel[107].setRotationPoint(-32F, -17F, -9F);

		pch120commuteModel[108].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 110
		pch120commuteModel[108].setRotationPoint(-32F, -8F, 5.5F);

		pch120commuteModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		pch120commuteModel[109].setRotationPoint(-32F, -9F, 5.5F);

		pch120commuteModel[110].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 112
		pch120commuteModel[110].setRotationPoint(-32F, -22F, -3F);

		pch120commuteModel[111].addBox(0F, 0F, 0F, 64, 2, 0, 0F); // Box 113
		pch120commuteModel[111].setRotationPoint(-32F, -22F, 3F);


	}

	ModelPCHBogie theBogie = new ModelPCHBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 112; i++)
		{
			pch120commuteModel[i].render(f5);
		}
		Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/pch120_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(0.86F ,0.14F,0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0.9F,0.14F,0);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo pch120commuteModel[];
}