//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Amfleet Wagon
// Model Creator:
// Created on:04.02.2017 - 10:56:06
// Last changed on: 04.02.2017 - 10:56:06

package com.jcirmodelsquad.tcjcir.models;


import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;


public class ModelAmfleet extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelAmfleet()
	{
		amfleetModel = new ModelRendererTurbo[187];
		amfleetModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box
		amfleetModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		amfleetModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		amfleetModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		amfleetModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 9
		amfleetModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 11
		amfleetModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 12
		amfleetModel[7] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 14
		amfleetModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 16
		amfleetModel[9] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 23
		amfleetModel[10] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 17
		amfleetModel[11] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 18
		amfleetModel[12] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 19
		amfleetModel[13] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 20
		amfleetModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		amfleetModel[15] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 24
		amfleetModel[16] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 25
		amfleetModel[17] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 29
		amfleetModel[18] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 31
		amfleetModel[19] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 50
		amfleetModel[20] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 66
		amfleetModel[21] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 67
		amfleetModel[22] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 68
		amfleetModel[23] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 69
		amfleetModel[24] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 70
		amfleetModel[25] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 71
		amfleetModel[26] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 72
		amfleetModel[27] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 80
		amfleetModel[28] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 81
		amfleetModel[29] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 98
		amfleetModel[30] = new ModelRendererTurbo(this, 114, 26, textureX, textureY); // Box 147
		amfleetModel[31] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 154
		amfleetModel[32] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 155
		amfleetModel[33] = new ModelRendererTurbo(this, 184, 24, textureX, textureY); // Box 156
		amfleetModel[34] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 194
		amfleetModel[35] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 100
		amfleetModel[36] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 101
		amfleetModel[37] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 104
		amfleetModel[38] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 105
		amfleetModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 109
		amfleetModel[40] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 110
		amfleetModel[41] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 116
		amfleetModel[42] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 117
		amfleetModel[43] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 118
		amfleetModel[44] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 119
		amfleetModel[45] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 123
		amfleetModel[46] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 124
		amfleetModel[47] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 125
		amfleetModel[48] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 126
		amfleetModel[49] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 127
		amfleetModel[50] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 128
		amfleetModel[51] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 129
		amfleetModel[52] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 130
		amfleetModel[53] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 131
		amfleetModel[54] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 132
		amfleetModel[55] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 144
		amfleetModel[56] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 150
		amfleetModel[57] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 151
		amfleetModel[58] = new ModelRendererTurbo(this, 352, 41, textureX, textureY); // Box 152
		amfleetModel[59] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 153
		amfleetModel[60] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 154
		amfleetModel[61] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 155
		amfleetModel[62] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 162
		amfleetModel[63] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 167
		amfleetModel[64] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 172
		amfleetModel[65] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 173
		amfleetModel[66] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 174
		amfleetModel[67] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 175
		amfleetModel[68] = new ModelRendererTurbo(this, 123, 73, textureX, textureY); // Box 114
		amfleetModel[69] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 115
		amfleetModel[70] = new ModelRendererTurbo(this, 438, 35, textureX, textureY); // Box 116
		amfleetModel[71] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 117
		amfleetModel[72] = new ModelRendererTurbo(this, 392, 49, textureX, textureY); // Box 118
		amfleetModel[73] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 119
		amfleetModel[74] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 120
		amfleetModel[75] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 121
		amfleetModel[76] = new ModelRendererTurbo(this, 94, 44, textureX, textureY); // Box 122
		amfleetModel[77] = new ModelRendererTurbo(this, 39, 239, textureX, textureY); // Box 139
		amfleetModel[78] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // Box 141
		amfleetModel[79] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 142
		amfleetModel[80] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 144
		amfleetModel[81] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 146
		amfleetModel[82] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 148
		amfleetModel[83] = new ModelRendererTurbo(this, 21, 239, textureX, textureY); // Box 150
		amfleetModel[84] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 151
		amfleetModel[85] = new ModelRendererTurbo(this, 27, 239, textureX, textureY); // Box 152
		amfleetModel[86] = new ModelRendererTurbo(this, 270, 244, textureX, textureY); // Box 185
		amfleetModel[87] = new ModelRendererTurbo(this, 136, 188, textureX, textureY); // Box 195
		amfleetModel[88] = new ModelRendererTurbo(this, 136, 188, textureX, textureY); // Box 196
		amfleetModel[89] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 199
		amfleetModel[90] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 201
		amfleetModel[91] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 195
		amfleetModel[92] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 196
		amfleetModel[93] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 197
		amfleetModel[94] = new ModelRendererTurbo(this, 57, 237, textureX, textureY); // Box 188
		amfleetModel[95] = new ModelRendererTurbo(this, 57, 237, textureX, textureY); // Box 189
		amfleetModel[96] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 192
		amfleetModel[97] = new ModelRendererTurbo(this, 57, 237, textureX, textureY); // Box 193
		amfleetModel[98] = new ModelRendererTurbo(this, 9, 260, textureX, textureY); // Box 194
		amfleetModel[99] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 192
		amfleetModel[100] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 195
		amfleetModel[101] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 196
		amfleetModel[102] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 198
		amfleetModel[103] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 199
		amfleetModel[104] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 200
		amfleetModel[105] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 201
		amfleetModel[106] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 202
		amfleetModel[107] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 203
		amfleetModel[108] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 204
		amfleetModel[109] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 205
		amfleetModel[110] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 193
		amfleetModel[111] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 194
		amfleetModel[112] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 195
		amfleetModel[113] = new ModelRendererTurbo(this, 22, 27, textureX, textureY); // Box 196
		amfleetModel[114] = new ModelRendererTurbo(this, 207, 132, textureX, textureY); // Box 197
		amfleetModel[115] = new ModelRendererTurbo(this, 302, 120, textureX, textureY); // Box 198
		amfleetModel[116] = new ModelRendererTurbo(this, 302, 120, textureX, textureY); // Box 199
		amfleetModel[117] = new ModelRendererTurbo(this, 8, 92, textureX, textureY); // Box 197
		amfleetModel[118] = new ModelRendererTurbo(this, 339, 247, textureX, textureY); // Box 198
		amfleetModel[119] = new ModelRendererTurbo(this, 231, 247, textureX, textureY); // Box 199
		amfleetModel[120] = new ModelRendererTurbo(this, 339, 269, textureX, textureY); // Box 200
		amfleetModel[121] = new ModelRendererTurbo(this, 231, 269, textureX, textureY); // Box 201
		amfleetModel[122] = new ModelRendererTurbo(this, 377, 234, textureX, textureY); // Box 202
		amfleetModel[123] = new ModelRendererTurbo(this, 199, 234, textureX, textureY); // Box 204
		amfleetModel[124] = new ModelRendererTurbo(this, 367, 267, textureX, textureY); // Box 206
		amfleetModel[125] = new ModelRendererTurbo(this, 207, 267, textureX, textureY); // Box 207
		amfleetModel[126] = new ModelRendererTurbo(this, 226, 203, textureX, textureY); // Box 208
		amfleetModel[127] = new ModelRendererTurbo(this, 8, 92, textureX, textureY); // Box 209
		amfleetModel[128] = new ModelRendererTurbo(this, 392, 260, textureX, textureY); // Box 210
		amfleetModel[129] = new ModelRendererTurbo(this, 186, 260, textureX, textureY); // Box 211
		amfleetModel[130] = new ModelRendererTurbo(this, 165, 267, textureX, textureY); // Box 212
		amfleetModel[131] = new ModelRendererTurbo(this, 413, 267, textureX, textureY); // Box 213
		amfleetModel[132] = new ModelRendererTurbo(this, 10, 163, textureX, textureY); // Box 200
		amfleetModel[133] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 198
		amfleetModel[134] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 199
		amfleetModel[135] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 200
		amfleetModel[136] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 201
		amfleetModel[137] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 202
		amfleetModel[138] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 204
		amfleetModel[139] = new ModelRendererTurbo(this, 21, 239, textureX, textureY); // Box 205
		amfleetModel[140] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 206
		amfleetModel[141] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 207
		amfleetModel[142] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 208
		amfleetModel[143] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 209
		amfleetModel[144] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 210
		amfleetModel[145] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // Box 211
		amfleetModel[146] = new ModelRendererTurbo(this, 27, 239, textureX, textureY); // Box 213
		amfleetModel[147] = new ModelRendererTurbo(this, 39, 239, textureX, textureY); // Box 214
		amfleetModel[148] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 215
		amfleetModel[149] = new ModelRendererTurbo(this, 1, 239, textureX, textureY); // Box 216
		amfleetModel[150] = new ModelRendererTurbo(this, 33, 239, textureX, textureY); // Box 218
		amfleetModel[151] = new ModelRendererTurbo(this, 21, 239, textureX, textureY); // Box 219
		amfleetModel[152] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 220
		amfleetModel[153] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 221
		amfleetModel[154] = new ModelRendererTurbo(this, 21, 227, textureX, textureY); // Box 222
		amfleetModel[155] = new ModelRendererTurbo(this, 1, 223, textureX, textureY); // Box 223
		amfleetModel[156] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 224
		amfleetModel[157] = new ModelRendererTurbo(this, 11, 239, textureX, textureY); // Box 225
		amfleetModel[158] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 226
		amfleetModel[159] = new ModelRendererTurbo(this, 27, 239, textureX, textureY); // Box 227
		amfleetModel[160] = new ModelRendererTurbo(this, 39, 239, textureX, textureY); // Box 228
		amfleetModel[161] = new ModelRendererTurbo(this, 363, 239, textureX, textureY); // Box 176
		amfleetModel[162] = new ModelRendererTurbo(this, 347, 239, textureX, textureY); // Box 177
		amfleetModel[163] = new ModelRendererTurbo(this, 255, 239, textureX, textureY); // Box 178
		amfleetModel[164] = new ModelRendererTurbo(this, 239, 239, textureX, textureY); // Box 179
		amfleetModel[165] = new ModelRendererTurbo(this, 347, 239, textureX, textureY); // Box 183
		amfleetModel[166] = new ModelRendererTurbo(this, 239, 239, textureX, textureY); // Box 184
		amfleetModel[167] = new ModelRendererTurbo(this, 255, 239, textureX, textureY); // Box 185
		amfleetModel[168] = new ModelRendererTurbo(this, 363, 239, textureX, textureY); // Box 186
		amfleetModel[169] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 188
		amfleetModel[170] = new ModelRendererTurbo(this, 136, 188, textureX, textureY); // Box 292
		amfleetModel[171] = new ModelRendererTurbo(this, 184, 24, textureX, textureY); // Box 293
		amfleetModel[172] = new ModelRendererTurbo(this, 136, 188, textureX, textureY); // Box 294
		amfleetModel[173] = new ModelRendererTurbo(this, 114, 26, textureX, textureY); // Box 295
		amfleetModel[174] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 296
		amfleetModel[175] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 297
		amfleetModel[176] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 298
		amfleetModel[177] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 299
		amfleetModel[178] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 187
		amfleetModel[179] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 188
		amfleetModel[180] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 189
		amfleetModel[181] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 190
		amfleetModel[182] = new ModelRendererTurbo(this, 45, 243, textureX, textureY); // Box 191
		amfleetModel[183] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 192
		amfleetModel[184] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 193
		amfleetModel[185] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 194
		amfleetModel[186] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 195

		amfleetModel[0].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box
		amfleetModel[0].setRotationPoint(-38F, -7.5F, -11.99F);
		amfleetModel[0].rotateAngleX = -3.00196631F;

		amfleetModel[1].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 4
		amfleetModel[1].setRotationPoint(-38F, -15.18F, -13.1F);
		amfleetModel[1].rotateAngleX = -3.24631241F;

		amfleetModel[2].addBox(0F, 2F, 0F, 2, 6, 1, 0F); // Box 5
		amfleetModel[2].setRotationPoint(-38F, -19F, -13.12F);
		amfleetModel[2].rotateAngleX = -3.43829863F;

		amfleetModel[3].addBox(0F, 0F, 0F, 75, 3, 1, 0F); // Box 8
		amfleetModel[3].setRotationPoint(-38F, -26.27F, -10.99F);
		amfleetModel[3].rotateAngleX = 2.40855437F;

		amfleetModel[4].addBox(0F, 0F, 0F, 75, 3, 1, 0F); // Box 9
		amfleetModel[4].setRotationPoint(-38F, -28.29F, -9.24F);
		amfleetModel[4].rotateAngleX = -4.2062435F;

		amfleetModel[5].addBox(0F, 0F, 0F, 75, 3, 1, 0F); // Box 11
		amfleetModel[5].setRotationPoint(37F, -28.29F, 9.24F);
		amfleetModel[5].rotateAngleX = -4.2062435F;
		amfleetModel[5].rotateAngleY = -3.14159265F;

		amfleetModel[6].addBox(0F, 0F, 0F, 75, 3, 1, 0F); // Box 12
		amfleetModel[6].setRotationPoint(37F, -26.27F, 10.99F);
		amfleetModel[6].rotateAngleX = 2.40855437F;
		amfleetModel[6].rotateAngleY = -3.14159265F;

		amfleetModel[7].addBox(0F, 2F, 0F, 57, 6, 1, 0F); // Box 14
		amfleetModel[7].setRotationPoint(28F, -19F, 13.12F);
		amfleetModel[7].rotateAngleX = -3.43829863F;
		amfleetModel[7].rotateAngleY = -3.14159265F;

		amfleetModel[8].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 16
		amfleetModel[8].setRotationPoint(37F, -7.5F, 11.99F);
		amfleetModel[8].rotateAngleX = -3.00196631F;
		amfleetModel[8].rotateAngleY = -3.14159265F;

		amfleetModel[9].addShapeBox(0F, 1F, 0F, 12, 3, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		amfleetModel[9].setRotationPoint(-38F, -3.87F, -10.8F);
		amfleetModel[9].rotateAngleX = -2.82743339F;

		amfleetModel[10].addShapeBox(0F, 1F, 0F, 12, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		amfleetModel[10].setRotationPoint(25F, -3.87F, -10.8F);
		amfleetModel[10].rotateAngleX = -2.82743339F;

		amfleetModel[11].addShapeBox(0F, 1F, 0F, 12, 3, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		amfleetModel[11].setRotationPoint(37F, -3.87F, 10.8F);
		amfleetModel[11].rotateAngleX = -2.82743339F;
		amfleetModel[11].rotateAngleY = -3.14159265F;

		amfleetModel[12].addShapeBox(0F, 1F, 0F, 12, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		amfleetModel[12].setRotationPoint(-26F, -3.87F, 10.8F);
		amfleetModel[12].rotateAngleX = -2.82743339F;
		amfleetModel[12].rotateAngleY = -3.14159265F;

		amfleetModel[13].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 20
		amfleetModel[13].setRotationPoint(-36F, -7.4F, -12F);
		amfleetModel[13].rotateAngleX = -3.00196631F;

		amfleetModel[14].addBox(0F, 0F, 0F, 57, 8, 1, 0F); // Box 21
		amfleetModel[14].setRotationPoint(-29F, -7.5F, -11.99F);
		amfleetModel[14].rotateAngleX = -3.00196631F;

		amfleetModel[15].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 24
		amfleetModel[15].setRotationPoint(28F, -7.4F, -12F);
		amfleetModel[15].rotateAngleX = -3.00196631F;

		amfleetModel[16].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 25
		amfleetModel[16].setRotationPoint(35F, -7.5F, -11.99F);
		amfleetModel[16].rotateAngleX = -3.00196631F;

		amfleetModel[17].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 29
		amfleetModel[17].setRotationPoint(-29F, -15.18F, -13.1F);
		amfleetModel[17].rotateAngleX = -3.24631241F;

		amfleetModel[18].addBox(0F, 2F, 0F, 57, 6, 1, 0F); // Box 31
		amfleetModel[18].setRotationPoint(-29F, -19F, -13.12F);
		amfleetModel[18].rotateAngleX = -3.43829863F;

		amfleetModel[19].addShapeBox(0F, 0F, 0F, 33, 4, 0, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		amfleetModel[19].setRotationPoint(-16.5F, -17F, -13.12F);
		amfleetModel[19].rotateAngleX = -3.24631241F;

		amfleetModel[20].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 66
		amfleetModel[20].setRotationPoint(37F, -15.18F, 13.1F);
		amfleetModel[20].rotateAngleX = -3.24631241F;
		amfleetModel[20].rotateAngleY = -3.14159265F;

		amfleetModel[21].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 67
		amfleetModel[21].setRotationPoint(28F, -15.18F, 13.1F);
		amfleetModel[21].rotateAngleX = -3.24631241F;
		amfleetModel[21].rotateAngleY = -3.14159265F;

		amfleetModel[22].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 68
		amfleetModel[22].setRotationPoint(-36F, -15.18F, 13.1F);
		amfleetModel[22].rotateAngleX = -3.24631241F;
		amfleetModel[22].rotateAngleY = -3.14159265F;

		amfleetModel[23].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Box 69
		amfleetModel[23].setRotationPoint(-36F, -7.5F, 11.99F);
		amfleetModel[23].rotateAngleX = -3.00196631F;
		amfleetModel[23].rotateAngleY = -3.14159265F;

		amfleetModel[24].addBox(0F, 0F, 0F, 57, 8, 1, 0F); // Box 70
		amfleetModel[24].setRotationPoint(28F, -7.5F, 11.99F);
		amfleetModel[24].rotateAngleX = -3.00196631F;
		amfleetModel[24].rotateAngleY = -3.14159265F;

		amfleetModel[25].addBox(0F, 2F, 0F, 2, 6, 1, 0F); // Box 71
		amfleetModel[25].setRotationPoint(37F, -19F, 13.12F);
		amfleetModel[25].rotateAngleX = -3.43829863F;
		amfleetModel[25].rotateAngleY = -3.14159265F;

		amfleetModel[26].addBox(0F, 2F, 0F, 2, 6, 1, 0F); // Box 72
		amfleetModel[26].setRotationPoint(-36F, -19F, 13.12F);
		amfleetModel[26].rotateAngleX = -3.43829863F;
		amfleetModel[26].rotateAngleY = -3.14159265F;

		amfleetModel[27].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 80
		amfleetModel[27].setRotationPoint(35F, -7.4F, 12F);
		amfleetModel[27].rotateAngleX = -3.00196631F;
		amfleetModel[27].rotateAngleY = -3.14159265F;

		amfleetModel[28].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 81
		amfleetModel[28].setRotationPoint(-29F, -7.4F, 12F);
		amfleetModel[28].rotateAngleX = -3.00196631F;
		amfleetModel[28].rotateAngleY = -3.14159265F;

		amfleetModel[29].addShapeBox(0F, 0F, 0F, 33, 4, 0, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
		amfleetModel[29].setRotationPoint(15.5F, -17F, 13.12F);
		amfleetModel[29].rotateAngleX = -3.24631241F;
		amfleetModel[29].rotateAngleY = -3.14159265F;

		amfleetModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 147
		amfleetModel[30].setRotationPoint(-39.05F, -25.6F, -3.5F);

		amfleetModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		amfleetModel[31].setRotationPoint(-39.05F, -25.6F, -5.5F);

		amfleetModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		amfleetModel[32].setRotationPoint(-39.05F, -25.6F, 3.5F);

		amfleetModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 156
		amfleetModel[33].setRotationPoint(-39.05F, -8.6F, -5.5F);

		amfleetModel[34].addBox(0F, 1.5F, 0.5F, 8, 6, 0, 0F); // Box 194
		amfleetModel[34].setRotationPoint(-36.5F, -7.4F, -12F);
		amfleetModel[34].rotateAngleX = -3.00196631F;

		amfleetModel[35].addBox(0F, 0F, 0F, 75, 7, 1, 0F); // Box 100
		amfleetModel[35].setRotationPoint(-38F, -29.62F, -7F);
		amfleetModel[35].rotateAngleX = -4.60766923F;

		amfleetModel[36].addBox(0F, 0F, 0F, 75, 7, 1, 0F); // Box 101
		amfleetModel[36].setRotationPoint(37F, -29.62F, 7F);
		amfleetModel[36].rotateAngleX = -4.60766923F;
		amfleetModel[36].rotateAngleY = -3.14159265F;

		amfleetModel[37].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		amfleetModel[37].setRotationPoint(-36F, -19F, -13.12F);
		amfleetModel[37].rotateAngleX = -3.43829863F;

		amfleetModel[38].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		amfleetModel[38].setRotationPoint(-30F, -19F, -13.12F);
		amfleetModel[38].rotateAngleX = -3.43829863F;

		amfleetModel[39].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		amfleetModel[39].setRotationPoint(-35F, -19F, 13.12F);
		amfleetModel[39].rotateAngleX = -3.43829863F;
		amfleetModel[39].rotateAngleY = -3.14159265F;

		amfleetModel[40].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		amfleetModel[40].setRotationPoint(-29F, -19F, 13.12F);
		amfleetModel[40].rotateAngleX = -3.43829863F;
		amfleetModel[40].rotateAngleY = -3.14159265F;

		amfleetModel[41].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		amfleetModel[41].setRotationPoint(34F, -19F, -13.12F);
		amfleetModel[41].rotateAngleX = -3.43829863F;

		amfleetModel[42].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		amfleetModel[42].setRotationPoint(28F, -19F, -13.12F);
		amfleetModel[42].rotateAngleX = -3.43829863F;

		amfleetModel[43].addBox(0F, 1.5F, 0.5F, 8, 6, 0, 0F); // Box 118
		amfleetModel[43].setRotationPoint(35.5F, -7.4F, 12F);
		amfleetModel[43].rotateAngleX = -3.00196631F;
		amfleetModel[43].rotateAngleY = -3.14159265F;

		amfleetModel[44].addBox(0F, 0F, 0.5F, 7, 7, 0, 0F); // Box 119
		amfleetModel[44].setRotationPoint(35F, -14.69F, 13.04F);
		amfleetModel[44].rotateAngleX = -3.24631241F;
		amfleetModel[44].rotateAngleY = -3.14159265F;

		amfleetModel[45].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		amfleetModel[45].setRotationPoint(35F, -19F, 13.12F);
		amfleetModel[45].rotateAngleX = -3.43829863F;
		amfleetModel[45].rotateAngleY = -3.14159265F;

		amfleetModel[46].addShapeBox(0F, 7F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		amfleetModel[46].setRotationPoint(29F, -19F, 13.12F);
		amfleetModel[46].rotateAngleX = -3.43829863F;
		amfleetModel[46].rotateAngleY = -3.14159265F;

		amfleetModel[47].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 125
		amfleetModel[47].setRotationPoint(22F, -15.18F, -13.1F);
		amfleetModel[47].rotateAngleX = -3.24631241F;

		amfleetModel[48].addBox(0F, 0F, 0F, 45, 2, 1, 0F); // Box 126
		amfleetModel[48].setRotationPoint(-23F, -15.18F, -13.1F);
		amfleetModel[48].rotateAngleX = -3.24631241F;

		amfleetModel[49].addBox(0F, 2F, 0F, 2, 4, 1, 0F); // Box 127
		amfleetModel[49].setRotationPoint(-9F, -15.18F, -13.1F);
		amfleetModel[49].rotateAngleX = -3.24631241F;

		amfleetModel[50].addBox(0F, 2F, 0F, 2, 4, 1, 0F); // Box 128
		amfleetModel[50].setRotationPoint(6F, -15.18F, -13.1F);
		amfleetModel[50].rotateAngleX = -3.24631241F;

		amfleetModel[51].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		amfleetModel[51].setRotationPoint(-23F, -15.18F, -13.1F);
		amfleetModel[51].rotateAngleX = -3.24631241F;

		amfleetModel[52].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		amfleetModel[52].setRotationPoint(-23F, -15.18F, -13.1F);
		amfleetModel[52].rotateAngleX = -3.24631241F;

		amfleetModel[53].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		amfleetModel[53].setRotationPoint(-10F, -15.18F, -13.1F);
		amfleetModel[53].rotateAngleX = -3.24631241F;

		amfleetModel[54].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 132
		amfleetModel[54].setRotationPoint(-10F, -15.18F, -13.1F);
		amfleetModel[54].rotateAngleX = -3.24631241F;

		amfleetModel[55].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 144
		amfleetModel[55].setRotationPoint(-36.5F, -21.69F, -12.8F);
		amfleetModel[55].rotateAngleX = -3.43829863F;

		amfleetModel[56].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 150
		amfleetModel[56].setRotationPoint(35F, -15.18F, -13.1F);
		amfleetModel[56].rotateAngleX = -3.24631241F;

		amfleetModel[57].addBox(0F, 2F, 0F, 2, 6, 1, 0F); // Box 151
		amfleetModel[57].setRotationPoint(35F, -19F, -13.12F);
		amfleetModel[57].rotateAngleX = -3.43829863F;

		amfleetModel[58].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 152
		amfleetModel[58].setRotationPoint(-23F, -15.18F, 13.1F);
		amfleetModel[58].rotateAngleX = -3.24631241F;
		amfleetModel[58].rotateAngleY = -3.14159265F;

		amfleetModel[59].addBox(0F, 0F, 0F, 45, 2, 1, 0F); // Box 153
		amfleetModel[59].setRotationPoint(22F, -15.18F, 13.1F);
		amfleetModel[59].rotateAngleX = -3.24631241F;
		amfleetModel[59].rotateAngleY = -3.14159265F;

		amfleetModel[60].addBox(0F, 2F, 0F, 2, 4, 1, 0F); // Box 154
		amfleetModel[60].setRotationPoint(8F, -15.18F, 13.1F);
		amfleetModel[60].rotateAngleX = -3.24631241F;
		amfleetModel[60].rotateAngleY = -3.14159265F;

		amfleetModel[61].addBox(0F, 2F, 0F, 2, 4, 1, 0F); // Box 155
		amfleetModel[61].setRotationPoint(-7F, -15.18F, 13.1F);
		amfleetModel[61].rotateAngleX = -3.24631241F;
		amfleetModel[61].rotateAngleY = -3.14159265F;

		amfleetModel[62].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		amfleetModel[62].setRotationPoint(6F, -15.18F, 13.1F);
		amfleetModel[62].rotateAngleX = -3.24631241F;
		amfleetModel[62].rotateAngleY = -3.14159265F;

		amfleetModel[63].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 167
		amfleetModel[63].setRotationPoint(35.5F, -21.69F, 12.8F);
		amfleetModel[63].rotateAngleX = -3.43829863F;
		amfleetModel[63].rotateAngleY = -3.14159265F;

		amfleetModel[64].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 172
		amfleetModel[64].setRotationPoint(22F, -15.18F, 13.1F);
		amfleetModel[64].rotateAngleX = -3.24631241F;
		amfleetModel[64].rotateAngleY = -3.14159265F;

		amfleetModel[65].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		amfleetModel[65].setRotationPoint(22F, -15.18F, 13.1F);
		amfleetModel[65].rotateAngleX = -3.24631241F;
		amfleetModel[65].rotateAngleY = -3.14159265F;

		amfleetModel[66].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		amfleetModel[66].setRotationPoint(9F, -15.18F, 13.1F);
		amfleetModel[66].rotateAngleX = -3.24631241F;
		amfleetModel[66].rotateAngleY = -3.14159265F;

		amfleetModel[67].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		amfleetModel[67].setRotationPoint(9F, -15.18F, 13.1F);
		amfleetModel[67].rotateAngleX = -3.24631241F;
		amfleetModel[67].rotateAngleY = -3.14159265F;

		amfleetModel[68].addShapeBox(0F, 0F, 0F, 73, 1, 24, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F); // Box 114
		amfleetModel[68].setRotationPoint(-37.01F, -7.5F, -12F);

		amfleetModel[69].addBox(0F, 0F, 0F, 4, 17, 17, 0F); // Box 115
		amfleetModel[69].setRotationPoint(-28F, -7.51F, -13F);
		amfleetModel[69].rotateAngleX = 1.57079633F;

		amfleetModel[70].addBox(0F, 0F, 0F, 0, 26, 24, 0F); // Box 116
		amfleetModel[70].setRotationPoint(36F, -7.4F, -13F);
		amfleetModel[70].rotateAngleX = 1.57079633F;

		amfleetModel[71].addBox(0F, 0F, 0F, 4, 24, 7, 0F); // Box 117
		amfleetModel[71].setRotationPoint(-28F, -24.52F, -12F);
		amfleetModel[71].rotateAngleX = 1.57079633F;

		amfleetModel[72].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Box 118
		amfleetModel[72].setRotationPoint(-28F, -7.51F, 12F);
		amfleetModel[72].rotateAngleX = 1.57079633F;

		amfleetModel[73].addBox(0F, 0F, 0F, 4, 17, 17, 0F); // Box 119
		amfleetModel[73].setRotationPoint(23F, -7.51F, -13F);
		amfleetModel[73].rotateAngleX = 1.57079633F;

		amfleetModel[74].addBox(0F, 0F, 0F, 4, 24, 7, 0F); // Box 120
		amfleetModel[74].setRotationPoint(23F, -24.4F, -12F);
		amfleetModel[74].rotateAngleX = 1.57079633F;

		amfleetModel[75].addBox(0F, 0F, 0F, 4, 1, 17, 0F); // Box 121
		amfleetModel[75].setRotationPoint(23F, -7.51F, 12F);
		amfleetModel[75].rotateAngleX = 1.57079633F;

		amfleetModel[76].addBox(0F, 0F, 0F, 0, 26, 24, 0F); // Box 122
		amfleetModel[76].setRotationPoint(-37F, -7.4F, -13F);
		amfleetModel[76].rotateAngleX = 1.57079633F;

		amfleetModel[77].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 139
		amfleetModel[77].setRotationPoint(-12.99F, -13.9F, -12.61F);
		amfleetModel[77].rotateAngleZ = 4.71238898F;

		amfleetModel[78].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		amfleetModel[78].setRotationPoint(-11F, -12.4F, -12.6F);
		amfleetModel[78].rotateAngleZ = 4.71238898F;

		amfleetModel[79].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 142
		amfleetModel[79].setRotationPoint(-16.75F, -11.4F, -4.39F);
		amfleetModel[79].rotateAngleZ = 3.40339204F;

		amfleetModel[80].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 144
		amfleetModel[80].setRotationPoint(-18.5F, -17.8F, -4.4F);
		amfleetModel[80].rotateAngleZ = 3.22885912F;

		amfleetModel[81].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 146
		amfleetModel[81].setRotationPoint(-11F, -11.4F, -4.4F);
		amfleetModel[81].rotateAngleZ = 4.71238898F;

		amfleetModel[82].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 148
		amfleetModel[82].setRotationPoint(-11F, -12.4F, 2.6F);
		amfleetModel[82].rotateAngleZ = 4.71238898F;

		amfleetModel[83].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 150
		amfleetModel[83].setRotationPoint(-12F, -13.4F, 2.6F);
		amfleetModel[83].rotateAngleZ = 4.71238898F;

		amfleetModel[84].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 151
		amfleetModel[84].setRotationPoint(-12.99F, -13.9F, 2.59F);
		amfleetModel[84].rotateAngleZ = 4.71238898F;

		amfleetModel[85].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 152
		amfleetModel[85].setRotationPoint(-12F, -13.4F, -12.6F);
		amfleetModel[85].rotateAngleZ = 4.71238898F;

		amfleetModel[86].addBox(0F, 0F, 0F, 20, 6, 16, 0F); // Box 185
		amfleetModel[86].setRotationPoint(-10F, -7F, -8F);

		amfleetModel[87].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 195
		amfleetModel[87].setRotationPoint(-39.05F, -23.6F, 3.5F);

		amfleetModel[88].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 196
		amfleetModel[88].setRotationPoint(-39.05F, -23.6F, -5.5F);

		amfleetModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		amfleetModel[89].setRotationPoint(36.05F, -25.6F, 3.5F);

		amfleetModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		amfleetModel[90].setRotationPoint(36.05F, -25.6F, -5.5F);

		amfleetModel[91].addBox(0F, 0F, 0.5F, 7, 7, 0, 0F); // Box 195
		amfleetModel[91].setRotationPoint(-29F, -14.69F, 13.04F);
		amfleetModel[91].rotateAngleX = -3.24631241F;
		amfleetModel[91].rotateAngleY = -3.14159265F;

		amfleetModel[92].addBox(0F, 0F, 0.5F, 7, 7, 0, 0F); // Box 196
		amfleetModel[92].setRotationPoint(-36F, -14.69F, -13.04F);
		amfleetModel[92].rotateAngleX = -3.24631241F;

		amfleetModel[93].addBox(0F, 0F, 0.5F, 7, 7, 0, 0F); // Box 197
		amfleetModel[93].setRotationPoint(28F, -14.69F, -13.04F);
		amfleetModel[93].rotateAngleX = -3.24631241F;

		amfleetModel[94].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 188
		amfleetModel[94].setRotationPoint(-1F, -26.5F, -3F);
		amfleetModel[94].rotateAngleX = 3.36848546F;

		amfleetModel[95].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 189
		amfleetModel[95].setRotationPoint(-13F, -26.5F, -3F);
		amfleetModel[95].rotateAngleX = 3.36848546F;

		amfleetModel[96].addBox(0F, 0F, 0F, 47, 1, 8, 0F); // Box 192
		amfleetModel[96].setRotationPoint(-24F, -26F, -10.5F);
		amfleetModel[96].rotateAngleX = 0.08726646F;

		amfleetModel[97].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 193
		amfleetModel[97].setRotationPoint(12F, -26.5F, -3F);
		amfleetModel[97].rotateAngleX = 3.36848546F;

		amfleetModel[98].addShapeBox(0F, 0F, 0F, 47, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 194
		amfleetModel[98].setRotationPoint(-24F, -28F, -2.55F);

		amfleetModel[99].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		amfleetModel[99].setRotationPoint(-6F, -15.18F, 13.1F);
		amfleetModel[99].rotateAngleX = -3.24631241F;
		amfleetModel[99].rotateAngleY = -3.14159265F;

		amfleetModel[100].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		amfleetModel[100].setRotationPoint(-9F, -15.18F, 13.1F);
		amfleetModel[100].rotateAngleX = -3.24631241F;
		amfleetModel[100].rotateAngleY = -3.14159265F;

		amfleetModel[101].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		amfleetModel[101].setRotationPoint(-22F, -15.18F, 13.1F);
		amfleetModel[101].rotateAngleX = -3.24631241F;
		amfleetModel[101].rotateAngleY = -3.14159265F;

		amfleetModel[102].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 198
		amfleetModel[102].setRotationPoint(8F, -15.18F, -13.1F);
		amfleetModel[102].rotateAngleX = -3.24631241F;

		amfleetModel[103].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		amfleetModel[103].setRotationPoint(8F, -15.18F, -13.1F);
		amfleetModel[103].rotateAngleX = -3.24631241F;

		amfleetModel[104].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		amfleetModel[104].setRotationPoint(21F, -15.18F, -13.1F);
		amfleetModel[104].rotateAngleX = -3.24631241F;

		amfleetModel[105].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 201
		amfleetModel[105].setRotationPoint(21F, -15.18F, -13.1F);
		amfleetModel[105].rotateAngleX = -3.24631241F;

		amfleetModel[106].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		amfleetModel[106].setRotationPoint(-7F, -15.18F, -13.1F);
		amfleetModel[106].rotateAngleX = -3.24631241F;

		amfleetModel[107].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		amfleetModel[107].setRotationPoint(-7F, -15.18F, -13.1F);
		amfleetModel[107].rotateAngleX = -3.24631241F;

		amfleetModel[108].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 204
		amfleetModel[108].setRotationPoint(5F, -15.18F, -13.1F);
		amfleetModel[108].rotateAngleX = -3.24631241F;

		amfleetModel[109].addShapeBox(0F, 5F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		amfleetModel[109].setRotationPoint(5F, -15.18F, -13.1F);
		amfleetModel[109].rotateAngleX = -3.24631241F;

		amfleetModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 193
		amfleetModel[110].setRotationPoint(36.01F, -22F, -8F);

		amfleetModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 194
		amfleetModel[111].setRotationPoint(36.01F, -22F, 6F);

		amfleetModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 195
		amfleetModel[112].setRotationPoint(-38.01F, -22F, -8F);

		amfleetModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		amfleetModel[113].setRotationPoint(-38.01F, -22F, 6F);

		amfleetModel[114].addShapeBox(0F, 0F, 0F, 75, 1, 26, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 0F, 0F, 0F, 0F); // Box 197
		amfleetModel[114].setRotationPoint(-37.99F, -12.5F, -12.99F);

		amfleetModel[115].addShapeBox(0F, 0F, 0F, 75, 1, 5, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F); // Box 198
		amfleetModel[115].setRotationPoint(-37.99F, -30.5F, 4F);
		amfleetModel[115].rotateAngleX = -1.57079633F;

		amfleetModel[116].addShapeBox(0F, 0F, 0F, 75, 1, 5, 0F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.02F, 0F, 0F, -0.02F, 0F, 1F, 0F, 0F, 1F); // Box 199
		amfleetModel[116].setRotationPoint(-37.99F, -30.5F, -3F);
		amfleetModel[116].rotateAngleX = -1.57079633F;

		amfleetModel[117].addBox(0F, 0F, 0F, 1, 2, 24, 0F); // Box 197
		amfleetModel[117].setRotationPoint(-37F, -6.5F, -12F);

		amfleetModel[118].addBox(0F, 0F, 0F, 14, 3, 8, 0F); // Box 198
		amfleetModel[118].setRotationPoint(-26F, -4F, -4F);

		amfleetModel[119].addBox(0F, 0F, 0F, 14, 3, 8, 0F); // Box 199
		amfleetModel[119].setRotationPoint(12F, -4F, -4F);

		amfleetModel[120].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 200
		amfleetModel[120].setRotationPoint(-21F, -4.5F, -9F);

		amfleetModel[121].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 201
		amfleetModel[121].setRotationPoint(17F, -4.5F, -9F);

		amfleetModel[122].addBox(0F, 0F, 0F, 3, 3, 16, 0F); // Box 202
		amfleetModel[122].setRotationPoint(-20.5F, -7F, -8F);

		amfleetModel[123].addBox(0F, 0F, 0F, 3, 3, 16, 0F); // Box 204
		amfleetModel[123].setRotationPoint(17.5F, -7F, -8F);

		amfleetModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 206
		amfleetModel[124].setRotationPoint(-20.5F, -3.5F, -8.5F);

		amfleetModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 207
		amfleetModel[125].setRotationPoint(17.5F, -3.5F, -8.5F);

		amfleetModel[126].addShapeBox(0F, 0F, 0F, 48, 1, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16.5F, 0F, 0F, -16.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -16.5F, 0F, -0.5F, -16.5F); // Box 208
		amfleetModel[126].setRotationPoint(-24F, -3.25F, -8.25F);

		amfleetModel[127].addBox(0F, 0F, 0F, 1, 2, 24, 0F); // Box 209
		amfleetModel[127].setRotationPoint(35F, -6.5F, -12F);

		amfleetModel[128].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 210
		amfleetModel[128].setRotationPoint(-26F, -7F, -8.5F);
		amfleetModel[128].rotateAngleZ = 0.34906585F;

		amfleetModel[129].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 211
		amfleetModel[129].setRotationPoint(26F, -7F, 8.5F);
		amfleetModel[129].rotateAngleY = -3.14159265F;
		amfleetModel[129].rotateAngleZ = 0.34906585F;

		amfleetModel[130].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 212
		amfleetModel[130].setRotationPoint(20.2F, -6.6F, -8.49F);
		amfleetModel[130].rotateAngleZ = 0.78539816F;

		amfleetModel[131].addBox(0F, 0F, 0F, 1, 5, 17, 0F); // Box 213
		amfleetModel[131].setRotationPoint(-20.2F, -6.6F, 8.51F);
		amfleetModel[131].rotateAngleY = -3.14159265F;
		amfleetModel[131].rotateAngleZ = 0.78539816F;

		amfleetModel[132].addBox(0F, 0F, 0F, 79, 2, 4, 0F); // Box 200
		amfleetModel[132].setRotationPoint(-40F, -7F, -2F);

		amfleetModel[133].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 198
		amfleetModel[133].setRotationPoint(-11F, -11.4F, -11.6F);
		amfleetModel[133].rotateAngleZ = 4.71238898F;

		amfleetModel[134].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 199
		amfleetModel[134].setRotationPoint(-16.75F, -11.4F, -11.59F);
		amfleetModel[134].rotateAngleZ = 3.40339204F;

		amfleetModel[135].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 200
		amfleetModel[135].setRotationPoint(-18.5F, -17.8F, -11.6F);
		amfleetModel[135].rotateAngleZ = 3.22885912F;

		amfleetModel[136].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 201
		amfleetModel[136].setRotationPoint(3F, -11.4F, -4.4F);
		amfleetModel[136].rotateAngleZ = 4.71238898F;

		amfleetModel[137].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 202
		amfleetModel[137].setRotationPoint(3F, -12.4F, 2.6F);
		amfleetModel[137].rotateAngleZ = 4.71238898F;

		amfleetModel[138].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 204
		amfleetModel[138].setRotationPoint(1.01F, -13.9F, 2.59F);
		amfleetModel[138].rotateAngleZ = 4.71238898F;

		amfleetModel[139].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 205
		amfleetModel[139].setRotationPoint(2F, -13.4F, 2.6F);
		amfleetModel[139].rotateAngleZ = 4.71238898F;

		amfleetModel[140].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 206
		amfleetModel[140].setRotationPoint(-2.75F, -11.4F, -4.39F);
		amfleetModel[140].rotateAngleZ = 3.40339204F;

		amfleetModel[141].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 207
		amfleetModel[141].setRotationPoint(-4.5F, -17.8F, -4.4F);
		amfleetModel[141].rotateAngleZ = 3.22885912F;

		amfleetModel[142].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 208
		amfleetModel[142].setRotationPoint(-4.5F, -17.8F, -11.6F);
		amfleetModel[142].rotateAngleZ = 3.22885912F;

		amfleetModel[143].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 209
		amfleetModel[143].setRotationPoint(-2.75F, -11.4F, -11.59F);
		amfleetModel[143].rotateAngleZ = 3.40339204F;

		amfleetModel[144].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 210
		amfleetModel[144].setRotationPoint(3F, -11.4F, -11.6F);
		amfleetModel[144].rotateAngleZ = 4.71238898F;

		amfleetModel[145].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // Box 211
		amfleetModel[145].setRotationPoint(3F, -12.4F, -12.6F);
		amfleetModel[145].rotateAngleZ = 4.71238898F;

		amfleetModel[146].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 213
		amfleetModel[146].setRotationPoint(2F, -13.4F, -12.6F);
		amfleetModel[146].rotateAngleZ = 4.71238898F;

		amfleetModel[147].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 214
		amfleetModel[147].setRotationPoint(1.01F, -13.9F, -12.61F);
		amfleetModel[147].rotateAngleZ = 4.71238898F;

		amfleetModel[148].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 215
		amfleetModel[148].setRotationPoint(17F, -11.4F, -4.4F);
		amfleetModel[148].rotateAngleZ = 4.71238898F;

		amfleetModel[149].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 216
		amfleetModel[149].setRotationPoint(17F, -12.4F, 2.6F);
		amfleetModel[149].rotateAngleZ = 4.71238898F;

		amfleetModel[150].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 218
		amfleetModel[150].setRotationPoint(15.01F, -13.9F, 2.59F);
		amfleetModel[150].rotateAngleZ = 4.71238898F;

		amfleetModel[151].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 219
		amfleetModel[151].setRotationPoint(16F, -13.4F, 2.6F);
		amfleetModel[151].rotateAngleZ = 4.71238898F;

		amfleetModel[152].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 220
		amfleetModel[152].setRotationPoint(11.25F, -11.4F, -4.39F);
		amfleetModel[152].rotateAngleZ = 3.40339204F;

		amfleetModel[153].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 221
		amfleetModel[153].setRotationPoint(9.5F, -17.8F, -4.4F);
		amfleetModel[153].rotateAngleZ = 3.22885912F;

		amfleetModel[154].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 222
		amfleetModel[154].setRotationPoint(9.5F, -17.8F, -11.6F);
		amfleetModel[154].rotateAngleZ = 3.22885912F;

		amfleetModel[155].addBox(0F, 0F, 0F, 2, 7, 7, 0F); // Box 223
		amfleetModel[155].setRotationPoint(11.25F, -11.4F, -11.59F);
		amfleetModel[155].rotateAngleZ = 3.40339204F;

		amfleetModel[156].addBox(0F, 0F, 0F, 1, 7, 7, 0F); // Box 224
		amfleetModel[156].setRotationPoint(17F, -11.4F, -11.6F);
		amfleetModel[156].rotateAngleZ = 4.71238898F;

		amfleetModel[157].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // Box 225
		amfleetModel[157].setRotationPoint(17F, -12.4F, -12.6F);
		amfleetModel[157].rotateAngleZ = 4.71238898F;

		amfleetModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		amfleetModel[158].setRotationPoint(17F, -13.4F, -12.6F);
		amfleetModel[158].rotateAngleZ = 4.71238898F;

		amfleetModel[159].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 227
		amfleetModel[159].setRotationPoint(16F, -13.4F, -12.6F);
		amfleetModel[159].rotateAngleZ = 4.71238898F;

		amfleetModel[160].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 228
		amfleetModel[160].setRotationPoint(15.01F, -13.9F, -12.61F);
		amfleetModel[160].rotateAngleZ = 4.71238898F;

		amfleetModel[161].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 176
		amfleetModel[161].setRotationPoint(24.5F, -3F, 6F);

		amfleetModel[162].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 177
		amfleetModel[162].setRotationPoint(13.5F, -3F, 6F);

		amfleetModel[163].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 178
		amfleetModel[163].setRotationPoint(-13.5F, -3F, 6F);

		amfleetModel[164].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 179
		amfleetModel[164].setRotationPoint(-24.5F, -3F, 6F);

		amfleetModel[165].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 183
		amfleetModel[165].setRotationPoint(13.5F, -3F, -6F);

		amfleetModel[166].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 184
		amfleetModel[166].setRotationPoint(-24.5F, -3F, -6F);

		amfleetModel[167].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 185
		amfleetModel[167].setRotationPoint(-13.5F, -3F, -6F);

		amfleetModel[168].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 186
		amfleetModel[168].setRotationPoint(24.5F, -3F, -6F);

		amfleetModel[169].addBox(0F, 0F, 0F, 75, 1, 1, 0F); // Box 188
		amfleetModel[169].setRotationPoint(37F, -31.35F, 0.5F);
		amfleetModel[169].rotateAngleY = -3.14159265F;

		amfleetModel[170].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 292
		amfleetModel[170].setRotationPoint(35.95F, -23.6F, -5.5F);

		amfleetModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 293
		amfleetModel[171].setRotationPoint(35.95F, -8.6F, -5.5F);

		amfleetModel[172].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 294
		amfleetModel[172].setRotationPoint(35.95F, -23.6F, 3.5F);

		amfleetModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 295
		amfleetModel[173].setRotationPoint(35.95F, -25.6F, -3.5F);

		amfleetModel[174].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 296
		amfleetModel[174].setRotationPoint(-28.5F, -21.69F, 12.8F);
		amfleetModel[174].rotateAngleX = -3.43829863F;
		amfleetModel[174].rotateAngleY = -3.14159265F;

		amfleetModel[175].addBox(0F, 1.5F, 0.5F, 8, 6, 0, 0F); // Box 297
		amfleetModel[175].setRotationPoint(-28.5F, -7.4F, 12F);
		amfleetModel[175].rotateAngleX = -3.00196631F;
		amfleetModel[175].rotateAngleY = -3.14159265F;

		amfleetModel[176].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 298
		amfleetModel[176].setRotationPoint(27.5F, -21.69F, -12.8F);
		amfleetModel[176].rotateAngleX = -3.43829863F;

		amfleetModel[177].addBox(0F, 1.5F, 0.5F, 8, 6, 0, 0F); // Box 299
		amfleetModel[177].setRotationPoint(27.5F, -7.4F, -12F);
		amfleetModel[177].rotateAngleX = -3.00196631F;

		amfleetModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		amfleetModel[178].setRotationPoint(17F, -13.4F, 2.6F);
		amfleetModel[178].rotateAngleZ = 4.71238898F;

		amfleetModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		amfleetModel[179].setRotationPoint(3F, -13.4F, 2.6F);
		amfleetModel[179].rotateAngleZ = 4.71238898F;

		amfleetModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		amfleetModel[180].setRotationPoint(3F, -13.4F, -12.6F);
		amfleetModel[180].rotateAngleZ = 4.71238898F;

		amfleetModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		amfleetModel[181].setRotationPoint(-11F, -13.4F, 2.6F);
		amfleetModel[181].rotateAngleZ = 4.71238898F;

		amfleetModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		amfleetModel[182].setRotationPoint(-11F, -13.4F, -12.6F);
		amfleetModel[182].rotateAngleZ = 4.71238898F;

		amfleetModel[183].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 192
		amfleetModel[183].setRotationPoint(-9F, -15.18F, 13.1F);
		amfleetModel[183].rotateAngleX = -3.24631241F;
		amfleetModel[183].rotateAngleY = -3.14159265F;

		amfleetModel[184].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 193
		amfleetModel[184].setRotationPoint(-22F, -15.18F, 13.1F);
		amfleetModel[184].rotateAngleX = -3.24631241F;
		amfleetModel[184].rotateAngleY = -3.14159265F;

		amfleetModel[185].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 194
		amfleetModel[185].setRotationPoint(6F, -15.18F, 13.1F);
		amfleetModel[185].rotateAngleX = -3.24631241F;
		amfleetModel[185].rotateAngleY = -3.14159265F;

		amfleetModel[186].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 195
		amfleetModel[186].setRotationPoint(-6F, -15.18F, 13.1F);
		amfleetModel[186].rotateAngleX = -3.24631241F;
		amfleetModel[186].rotateAngleY = -3.14159265F;


	}


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 187; i++)
		{
			amfleetModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo amfleetModel[];
}