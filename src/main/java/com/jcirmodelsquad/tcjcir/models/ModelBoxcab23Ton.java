//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.07.2020 - 21:13:23
// Last changed on: 18.07.2020 - 21:13:23

package com.jcirmodelsquad.tcjcir.models; //Path where the bawx be located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBoxcab23Ton extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBoxcab23Ton() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[144];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 16
		bodyModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 30
		bodyModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 39
		bodyModel[16] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 46
		bodyModel[18] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 47
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 48
		bodyModel[21] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 49
		bodyModel[22] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 52
		bodyModel[23] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 53
		bodyModel[24] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 55
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "lamp"); // Box 59 lamp
		bodyModel[26] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "lamp"); // Box 60 lamp
		bodyModel[27] = new ModelRendererTurbo(this, 233, 1, textureX, textureY, "lamp"); // Box 61 lamp
		bodyModel[28] = new ModelRendererTurbo(this, 249, 1, textureX, textureY, "lamp"); // Box 62 lamp
		bodyModel[29] = new ModelRendererTurbo(this, 257, 1, textureX, textureY, "lamp"); // Box 63 lamp
		bodyModel[30] = new ModelRendererTurbo(this, 273, 1, textureX, textureY, "lamp"); // Box 64 lamp
		bodyModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY, "lamp"); // Box 65 lamp
		bodyModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY, "lamp"); // Box 66 lamp
		bodyModel[33] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 68
		bodyModel[35] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 69
		bodyModel[36] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 70
		bodyModel[37] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 71
		bodyModel[38] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 72
		bodyModel[39] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 73
		bodyModel[40] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 74
		bodyModel[41] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 75
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 76
		bodyModel[43] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 77
		bodyModel[44] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 78
		bodyModel[45] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 82
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 107
		bodyModel[47] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 108
		bodyModel[48] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 109
		bodyModel[49] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 110
		bodyModel[50] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 111
		bodyModel[51] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 112
		bodyModel[52] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 114
		bodyModel[53] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 115
		bodyModel[54] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 116
		bodyModel[55] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 117
		bodyModel[56] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 149
		bodyModel[57] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 151
		bodyModel[58] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 152
		bodyModel[59] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 162
		bodyModel[60] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 163
		bodyModel[61] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 164
		bodyModel[62] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 165
		bodyModel[63] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 166
		bodyModel[64] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 167
		bodyModel[65] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 168
		bodyModel[66] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 169
		bodyModel[67] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 170
		bodyModel[68] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 171
		bodyModel[69] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 172
		bodyModel[70] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 173
		bodyModel[71] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 174
		bodyModel[72] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 175
		bodyModel[73] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 176
		bodyModel[74] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 177
		bodyModel[75] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 178
		bodyModel[76] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 179
		bodyModel[77] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 180
		bodyModel[78] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 181
		bodyModel[79] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 182
		bodyModel[80] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 183
		bodyModel[81] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 184
		bodyModel[82] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 185
		bodyModel[83] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 186
		bodyModel[84] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 187
		bodyModel[85] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 188
		bodyModel[86] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 189
		bodyModel[87] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 190
		bodyModel[88] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 191
		bodyModel[89] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 192
		bodyModel[90] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 193
		bodyModel[91] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 194
		bodyModel[92] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 195
		bodyModel[93] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 200
		bodyModel[94] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 203
		bodyModel[95] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 204
		bodyModel[96] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 205
		bodyModel[97] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 206
		bodyModel[98] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 207
		bodyModel[99] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 208
		bodyModel[100] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 209
		bodyModel[101] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 210
		bodyModel[102] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 211
		bodyModel[103] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 212
		bodyModel[104] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 213
		bodyModel[105] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 214
		bodyModel[106] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 215
		bodyModel[107] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 216
		bodyModel[108] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 51
		bodyModel[109] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 222
		bodyModel[113] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 223
		bodyModel[114] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 224
		bodyModel[115] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 225
		bodyModel[116] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 226
		bodyModel[117] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 227
		bodyModel[118] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 228
		bodyModel[119] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 229
		bodyModel[120] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 230
		bodyModel[121] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 231
		bodyModel[122] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 232
		bodyModel[123] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 233
		bodyModel[124] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 234
		bodyModel[125] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 235
		bodyModel[126] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 236
		bodyModel[127] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 237
		bodyModel[128] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 238
		bodyModel[129] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 239
		bodyModel[130] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 240
		bodyModel[131] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 241
		bodyModel[132] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 242
		bodyModel[133] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 243
		bodyModel[134] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 244
		bodyModel[135] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 245
		bodyModel[136] = new ModelRendererTurbo(this, 433, 36, textureX, textureY, "lamp"); // Box 162 glowey
		bodyModel[137] = new ModelRendererTurbo(this, 99, 35, textureX, textureY); // Box 165
		bodyModel[138] = new ModelRendererTurbo(this, 135, 35, textureX, textureY); // Box 76
		bodyModel[139] = new ModelRendererTurbo(this, 145, 34, textureX, textureY); // Box 79
		bodyModel[140] = new ModelRendererTurbo(this, 185, 43, textureX, textureY); // Box 116
		bodyModel[141] = new ModelRendererTurbo(this, 225, 45, textureX, textureY); // Box 117
		bodyModel[142] = new ModelRendererTurbo(this, 190, 64, textureX, textureY); // Box 301
		bodyModel[143] = new ModelRendererTurbo(this, 59, 61, textureX, textureY); // Box 302

		bodyModel[0].addBox(0F, 0F, 0F, 36, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-18F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(-16F, -17F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(-16F, -17F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(3F, -17F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(3F, -17F, -11F);

		bodyModel[5].addBox(0F, 0F, 1F, 1, 3, 20, 0F); // Box 8
		bodyModel[5].setRotationPoint(-16F, -3F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 10
		bodyModel[6].setRotationPoint(-16F, -10F, -3.5F);
		bodyModel[6].rotateAngleZ = -0.26179939F;

		bodyModel[7].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 12
		bodyModel[7].setRotationPoint(-16F, -9F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 13
		bodyModel[8].setRotationPoint(-16F, -9F, 3F);

		bodyModel[9].addBox(0F, 0F, 0F, 34, 1, 14, 0F); // Box 16
		bodyModel[9].setRotationPoint(-17F, -19F, -7F);

		bodyModel[10].addBox(0F, 0F, 1F, 26, 7, 10, 0F); // Box 20
		bodyModel[10].setRotationPoint(-13F, 1F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[11].setRotationPoint(-17F, -19F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 34, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[12].setRotationPoint(-17F, -19F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 9, 20, 0F); // Box 31
		bodyModel[13].setRotationPoint(-16F, -18F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 32
		bodyModel[14].setRotationPoint(15F, -18F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[15].setRotationPoint(-13F, 3F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 40
		bodyModel[16].setRotationPoint(6F, 3F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 46
		bodyModel[17].setRotationPoint(-13F, 3F, 6F);

		bodyModel[18].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 47
		bodyModel[18].setRotationPoint(6F, 3F, 6F);

		bodyModel[19].addBox(0F, 0F, 0F, 42, 2, 3, 0F); // Box 48
		bodyModel[19].setRotationPoint(-21F, 3F, -1.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 26, 7, 1, 0F); // Box 48
		bodyModel[20].setRotationPoint(-13F, 1F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 26, 7, 1, 0F); // Box 49
		bodyModel[21].setRotationPoint(-13F, 1F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[22].setRotationPoint(13F, -9F, -4F);

		bodyModel[23].addBox(0F, 0F, 0F, 16, 1, 5, 0F); // Box 53
		bodyModel[23].setRotationPoint(-13F, -1F, -2.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 12, 8, 0F); // Box 55
		bodyModel[24].setRotationPoint(-14.5F, -12F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59 lamp
		bodyModel[25].setRotationPoint(-17F, -17F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 60 lamp
		bodyModel[26].setRotationPoint(-17F, -17F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61 lamp
		bodyModel[27].setRotationPoint(-17F, -18F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62 lamp
		bodyModel[28].setRotationPoint(-17F, -18F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63 lamp
		bodyModel[29].setRotationPoint(16F, -18F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 64 lamp
		bodyModel[30].setRotationPoint(16F, -17F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65 lamp
		bodyModel[31].setRotationPoint(16F, -17F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66 lamp
		bodyModel[32].setRotationPoint(16F, -18F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[33].setRotationPoint(-12F, -21F, 3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 68
		bodyModel[34].setRotationPoint(-12F, -20F, 3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[35].setRotationPoint(-12F, -20F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[36].setRotationPoint(-12F, -21F, 2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[37].setRotationPoint(-12F, -20F, -3.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 72
		bodyModel[38].setRotationPoint(-12F, -20F, -2.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[39].setRotationPoint(-12F, -21F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[40].setRotationPoint(-12F, -21F, -3.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[41].setRotationPoint(-13F, -21F, 2.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[42].setRotationPoint(-13F, -21F, -3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[43].setRotationPoint(8F, -21F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[44].setRotationPoint(8F, -21F, 2.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 82
		bodyModel[45].setRotationPoint(-3.5F, -16F, 10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 107
		bodyModel[46].setRotationPoint(16F, -3F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 108
		bodyModel[47].setRotationPoint(16.75F, -1.5F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 109
		bodyModel[48].setRotationPoint(16.75F, -2.5F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F); // Box 110
		bodyModel[49].setRotationPoint(16.75F, -3.2F, -4.6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F); // Box 111
		bodyModel[50].setRotationPoint(16.75F, -3.2F, -5.4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, 0.4F, -0.4F, -0.8F, 0.4F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F); // Box 112
		bodyModel[51].setRotationPoint(16.75F, -2.8F, -5.4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F); // Box 114
		bodyModel[52].setRotationPoint(16.75F, -1.1F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 2F, -0.25F, -1.5F, 2F, -0.25F, -1.5F, 2F, -0.25F, 0F, 2F, -0.25F); // Box 115
		bodyModel[53].setRotationPoint(16F, -3F, -5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 116
		bodyModel[54].setRotationPoint(13.5F, -9.8F, 0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 117
		bodyModel[55].setRotationPoint(-14F, -13F, 1F);

		bodyModel[56].addBox(0F, 0F, 0F, 12, 3, 3, 0F); // Box 149
		bodyModel[56].setRotationPoint(-13F, -5F, -1.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 151
		bodyModel[57].setRotationPoint(-10.5F, 5.5F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 152
		bodyModel[58].setRotationPoint(8.5F, 5.5F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[59].setRotationPoint(13F, 1F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 6, 16, 0F); // Box 163
		bodyModel[60].setRotationPoint(17F, 1F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[61].setRotationPoint(13F, 1F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 165
		bodyModel[62].setRotationPoint(-17F, 1F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 166
		bodyModel[63].setRotationPoint(-17F, 1F, 7F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 6, 16, 0F); // Box 167
		bodyModel[64].setRotationPoint(-18F, 1F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 168
		bodyModel[65].setRotationPoint(17F, 1F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 169
		bodyModel[66].setRotationPoint(17F, 1F, 8F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 170
		bodyModel[67].setRotationPoint(-18F, 1F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 6, 2, 0F); // Box 171
		bodyModel[68].setRotationPoint(-18F, 1F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 1F, 4, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 172
		bodyModel[69].setRotationPoint(-17F, 1F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 1F, 4, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[70].setRotationPoint(13F, 1F, -6F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 174
		bodyModel[71].setRotationPoint(-17F, 1F, 11F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 175
		bodyModel[72].setRotationPoint(13F, 1F, 11F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 176
		bodyModel[73].setRotationPoint(13F, 1F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 177
		bodyModel[74].setRotationPoint(-17F, 1F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 7, 0, 0F); // Box 178
		bodyModel[75].setRotationPoint(-3F, 1F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 6, 7, 0, 0F); // Box 179
		bodyModel[76].setRotationPoint(-3F, 1F, 11F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 180
		bodyModel[77].setRotationPoint(-3F, 1F, 9F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 181
		bodyModel[78].setRotationPoint(3F, 1F, 9F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 182
		bodyModel[79].setRotationPoint(3F, 1F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 7, 2, 0F); // Box 183
		bodyModel[80].setRotationPoint(-3F, 1F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[81].setRotationPoint(-17F, -18F, 10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[82].setRotationPoint(-17F, -18F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 186
		bodyModel[83].setRotationPoint(-17F, -18F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[84].setRotationPoint(-17F, -18F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[85].setRotationPoint(16F, -18F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 189
		bodyModel[86].setRotationPoint(16F, -18F, -10F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 190
		bodyModel[87].setRotationPoint(-17F, -17F, 10F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 191
		bodyModel[88].setRotationPoint(16F, -17F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 192
		bodyModel[89].setRotationPoint(16F, -17F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 193
		bodyModel[90].setRotationPoint(-17F, -17F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 194
		bodyModel[91].setRotationPoint(-3F, -17F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 17, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 195
		bodyModel[92].setRotationPoint(-3F, -17F, -11F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 200
		bodyModel[93].setRotationPoint(18F, 7F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 203
		bodyModel[94].setRotationPoint(-20F, 7F, -10F);

		bodyModel[95].addBox(0F, 0F, 0F, 5, 6, 6, 0F); // Box 204
		bodyModel[95].setRotationPoint(-2F, -7F, -3F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 205
		bodyModel[96].setRotationPoint(-13F, -8F, -1F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 206
		bodyModel[97].setRotationPoint(-10F, -8F, -1F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 207
		bodyModel[98].setRotationPoint(-7F, -8F, -1F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 208
		bodyModel[99].setRotationPoint(-4F, -8F, -1F);

		bodyModel[100].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 209
		bodyModel[100].setRotationPoint(-13F, -2F, -1F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 13, 2, 0F); // Box 210
		bodyModel[101].setRotationPoint(-5F, -21.5F, -1F);

		bodyModel[102].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 211
		bodyModel[102].setRotationPoint(-12.5F, -9F, -0.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 212
		bodyModel[103].setRotationPoint(-13F, -2F, -3F);

		bodyModel[104].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 213
		bodyModel[104].setRotationPoint(-13F, -2F, 2F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 214
		bodyModel[105].setRotationPoint(13F, -8F, 0F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 215
		bodyModel[106].setRotationPoint(14F, -6F, 0F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 216
		bodyModel[107].setRotationPoint(-1F, -8F, -2F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 51
		bodyModel[108].setRotationPoint(-13.55F, -21F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[109].setRotationPoint(-13.55F, -13F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[110].setRotationPoint(-13.55F, -13F, -3F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 111
		bodyModel[111].setRotationPoint(-13.55F, -13F, -6F);

		bodyModel[112].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 222
		bodyModel[112].setRotationPoint(-16.5F, -6.5F, -11.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 223
		bodyModel[113].setRotationPoint(-16.5F, -6.5F, 8.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 224
		bodyModel[114].setRotationPoint(11.5F, -6.5F, -11.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 5, 0, 3, 0F); // Box 225
		bodyModel[115].setRotationPoint(11.5F, -6.5F, 8.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 226
		bodyModel[116].setRotationPoint(3.5F, -16F, 10.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 227
		bodyModel[117].setRotationPoint(3.5F, -16F, -11.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 15, 1, 0F); // Box 228
		bodyModel[118].setRotationPoint(-3.5F, -16F, -11.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 229
		bodyModel[119].setRotationPoint(15.5F, -8F, -6.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 230
		bodyModel[120].setRotationPoint(15.5F, -8F, 6.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 231
		bodyModel[121].setRotationPoint(-16.5F, -8F, 6.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 232
		bodyModel[122].setRotationPoint(-16.5F, -8F, -6.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 233
		bodyModel[123].setRotationPoint(-1F, -6F, -4F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 234
		bodyModel[124].setRotationPoint(-1F, -6F, 3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[125].setRotationPoint(4F, 1F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[126].setRotationPoint(4F, 1F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 237
		bodyModel[127].setRotationPoint(4F, 2F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[128].setRotationPoint(4F, 2F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[129].setRotationPoint(4F, 1F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[130].setRotationPoint(4F, 1F, 9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 241
		bodyModel[131].setRotationPoint(4F, 2F, 9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[132].setRotationPoint(4F, 2F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 0, 8, 0F); // Box 243
		bodyModel[133].setRotationPoint(16F, -1F, -11F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 0, 8, 0F); // Box 244
		bodyModel[134].setRotationPoint(16F, -1F, 3F);

		bodyModel[135].addBox(0F, 0F, 0F, 0, 1, 8, 0F); // Box 245
		bodyModel[135].setRotationPoint(18F, -1F, -4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 glowey
		bodyModel[136].setRotationPoint(13F, -20F, -0.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[137].setRotationPoint(13.15F, -20F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[138].setRotationPoint(-10.5F, 5.5F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[139].setRotationPoint(8.5F, 5.5F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 116
		bodyModel[140].setRotationPoint(8.5F, 5.5F, 9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 117
		bodyModel[141].setRotationPoint(-10.5F, 5.5F, 9F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[142].setRotationPoint(11F, -21F, 4.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[143].setRotationPoint(11F, -20F, 4.5F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 144; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
	}
}