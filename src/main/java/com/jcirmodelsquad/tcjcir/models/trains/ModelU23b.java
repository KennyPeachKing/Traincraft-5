//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.08.2019 - 11:21:12
// Last changed on: 26.08.2019 - 11:21:12

package com.jcirmodelsquad.tcjcir.models.trains;


import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeB;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelU23b extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelU23b() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[295];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 361, 2, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 31
		bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 46
		bodyModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 47
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 379, 59, textureX, textureY); // Box 63
		bodyModel[31] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 65
		bodyModel[32] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 67
		bodyModel[33] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 68
		bodyModel[34] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 97
		bodyModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 101
		bodyModel[36] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 106
		bodyModel[37] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 107
		bodyModel[38] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 122
		bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 123
		bodyModel[40] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 144
		bodyModel[41] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 145
		bodyModel[42] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 146
		bodyModel[43] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 147
		bodyModel[44] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 148
		bodyModel[45] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 149
		bodyModel[46] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 150
		bodyModel[47] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 152
		bodyModel[48] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 153
		bodyModel[49] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 154
		bodyModel[50] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 155
		bodyModel[51] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 156
		bodyModel[52] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 157
		bodyModel[53] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 158
		bodyModel[54] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 159
		bodyModel[55] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 160
		bodyModel[56] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 161
		bodyModel[57] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 162
		bodyModel[58] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 163
		bodyModel[59] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 164
		bodyModel[60] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 165
		bodyModel[61] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 166
		bodyModel[62] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 167
		bodyModel[63] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 168
		bodyModel[64] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 169
		bodyModel[65] = new ModelRendererTurbo(this, 273, 8, textureX, textureY); // Box 48
		bodyModel[66] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 43
		bodyModel[67] = new ModelRendererTurbo(this, 313, 41, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[68] = new ModelRendererTurbo(this, 393, 41, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[69] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 175
		bodyModel[70] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 180
		bodyModel[71] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 182
		bodyModel[72] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 184
		bodyModel[73] = new ModelRendererTurbo(this, 189, 74, textureX, textureY); // Box 185
		bodyModel[74] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 194
		bodyModel[75] = new ModelRendererTurbo(this, 202, 82, textureX, textureY); // Box 195
		bodyModel[76] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 196
		bodyModel[77] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 197
		bodyModel[78] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 198
		bodyModel[79] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 199
		bodyModel[80] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 200
		bodyModel[81] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 201
		bodyModel[82] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 202
		bodyModel[83] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 203
		bodyModel[84] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 204
		bodyModel[85] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 205
		bodyModel[86] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 206
		bodyModel[87] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 207
		bodyModel[88] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 208
		bodyModel[89] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // box65
		bodyModel[90] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 215
		bodyModel[91] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 217
		bodyModel[92] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 218
		bodyModel[93] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 219
		bodyModel[94] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 220
		bodyModel[95] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 221
		bodyModel[96] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 222
		bodyModel[97] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 223
		bodyModel[98] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 224
		bodyModel[99] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 225
		bodyModel[100] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 226
		bodyModel[101] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 227
		bodyModel[102] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 228
		bodyModel[103] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 229
		bodyModel[104] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 230
		bodyModel[105] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 231
		bodyModel[106] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 232
		bodyModel[107] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 233
		bodyModel[108] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 234
		bodyModel[109] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 2
		bodyModel[110] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 143
		bodyModel[111] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 61
		bodyModel[112] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 62
		bodyModel[113] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 63
		bodyModel[114] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 79
		bodyModel[115] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 80
		bodyModel[116] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 81
		bodyModel[117] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 82
		bodyModel[118] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 83
		bodyModel[119] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 84
		bodyModel[120] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 246
		bodyModel[121] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 247
		bodyModel[122] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 249
		bodyModel[123] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 250
		bodyModel[124] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 251
		bodyModel[125] = new ModelRendererTurbo(this, 323, 49, textureX, textureY); // Box 252
		bodyModel[126] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 256
		bodyModel[127] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 257
		bodyModel[128] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 258
		bodyModel[129] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 259
		bodyModel[130] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 260
		bodyModel[131] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 261
		bodyModel[132] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 262
		bodyModel[133] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 263
		bodyModel[134] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 264
		bodyModel[135] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 265
		bodyModel[136] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 266
		bodyModel[137] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 267
		bodyModel[138] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 268
		bodyModel[139] = new ModelRendererTurbo(this, 254, 57, textureX, textureY); // Box 269
		bodyModel[140] = new ModelRendererTurbo(this, 449, 49, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[141] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 165
		bodyModel[142] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 148
		bodyModel[143] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 150
		bodyModel[144] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 152
		bodyModel[145] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 275
		bodyModel[146] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 276
		bodyModel[147] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 277
		bodyModel[148] = new ModelRendererTurbo(this, 449, 65, textureX, textureY, "lamp"); // Box 278 glow
		bodyModel[149] = new ModelRendererTurbo(this, 505, 65, textureX, textureY, "lamp"); // Box 279 glow
		bodyModel[150] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 280
		bodyModel[151] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 281
		bodyModel[152] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 284
		bodyModel[153] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 285
		bodyModel[154] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 286
		bodyModel[155] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 287
		bodyModel[156] = new ModelRendererTurbo(this, 240, 89, textureX, textureY); // Box 288
		bodyModel[157] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 297
		bodyModel[158] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 298
		bodyModel[159] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 299
		bodyModel[160] = new ModelRendererTurbo(this, 49, 82, textureX, textureY); // Box 300
		bodyModel[161] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 301
		bodyModel[162] = new ModelRendererTurbo(this, 3, 130, textureX, textureY); // Box 303
		bodyModel[163] = new ModelRendererTurbo(this, 449, 95, textureX, textureY); // Box 296
		bodyModel[164] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 19
		bodyModel[165] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 19
		bodyModel[166] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 305
		bodyModel[167] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 305
		bodyModel[168] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 19
		bodyModel[169] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 19
		bodyModel[170] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 19
		bodyModel[171] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 305
		bodyModel[172] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 305
		bodyModel[173] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 440
		bodyModel[174] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 441
		bodyModel[175] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 293
		bodyModel[176] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 293
		bodyModel[177] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 293
		bodyModel[178] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 293
		bodyModel[179] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 293
		bodyModel[180] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 293
		bodyModel[181] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 293
		bodyModel[182] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 293
		bodyModel[183] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 19
		bodyModel[184] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 19
		bodyModel[185] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 293
		bodyModel[186] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 293
		bodyModel[187] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 293
		bodyModel[188] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 293o00
		bodyModel[189] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 293
		bodyModel[190] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 293
		bodyModel[191] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 84
		bodyModel[192] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 84
		bodyModel[193] = new ModelRendererTurbo(this, 327, 91, textureX, textureY); // Box 101
		bodyModel[194] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 101
		bodyModel[195] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 101
		bodyModel[196] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 101
		bodyModel[197] = new ModelRendererTurbo(this, 419, 55, textureX, textureY, "lamp"); // Box 240 glow liveryimg 2
		bodyModel[198] = new ModelRendererTurbo(this, 324, 41, textureX, textureY, "lamp"); // Box 241 glow liveryimg 2
		bodyModel[199] = new ModelRendererTurbo(this, 364, 4, textureX, textureY); // Box 114
		bodyModel[200] = new ModelRendererTurbo(this, 364, 4, textureX, textureY); // Box 74
		bodyModel[201] = new ModelRendererTurbo(this, 411, 43, textureX, textureY); // Box 78
		bodyModel[202] = new ModelRendererTurbo(this, 52, 30, textureX, textureY); // Box 245
		bodyModel[203] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 246
		bodyModel[204] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 247
		bodyModel[205] = new ModelRendererTurbo(this, 14, 5, textureX, textureY); // Box 248
		bodyModel[206] = new ModelRendererTurbo(this, 283, 30, textureX, textureY); // Box 249
		bodyModel[207] = new ModelRendererTurbo(this, 338, 30, textureX, textureY); // Box 250
		bodyModel[208] = new ModelRendererTurbo(this, 15, 27, textureX, textureY); // Box 248
		bodyModel[209] = new ModelRendererTurbo(this, 119, 45, textureX, textureY); // Box 250
		bodyModel[210] = new ModelRendererTurbo(this, 253, 67, textureX, textureY); // Box 249
		bodyModel[211] = new ModelRendererTurbo(this, 204, 116, textureX, textureY); // Box 205
		bodyModel[212] = new ModelRendererTurbo(this, 152, 116, textureX, textureY); // Box 205
		bodyModel[213] = new ModelRendererTurbo(this, 384, 115, textureX, textureY); // Box 36
		bodyModel[214] = new ModelRendererTurbo(this, 453, 109, textureX, textureY); // Box 114
		bodyModel[215] = new ModelRendererTurbo(this, 453, 99, textureX, textureY); // Box 74
		bodyModel[216] = new ModelRendererTurbo(this, 506, 111, textureX, textureY); // Box 78
		bodyModel[217] = new ModelRendererTurbo(this, 464, 110, textureX, textureY); // Box 78
		bodyModel[218] = new ModelRendererTurbo(this, 379, 59, textureX, textureY); // Box 2603
		bodyModel[219] = new ModelRendererTurbo(this, 138, 108, textureX, textureY); // Box 261
		bodyModel[220] = new ModelRendererTurbo(this, 191, 71, textureX, textureY); // Box 262
		bodyModel[221] = new ModelRendererTurbo(this, 334, 115, textureX, textureY); // Box 263
		bodyModel[222] = new ModelRendererTurbo(this, 325, 115, textureX, textureY); // Box 264
		bodyModel[223] = new ModelRendererTurbo(this, 191, 116, textureX, textureY); // Box 265
		bodyModel[224] = new ModelRendererTurbo(this, 13, 45, textureX, textureY); // Box 193
		bodyModel[225] = new ModelRendererTurbo(this, 408, 113, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[226] = new ModelRendererTurbo(this, 415, 113, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[227] = new ModelRendererTurbo(this, 36, 45, textureX, textureY); // Box 273
		bodyModel[228] = new ModelRendererTurbo(this, 429, 113, textureX, textureY, "lamp"); // Box 274 lamp
		bodyModel[229] = new ModelRendererTurbo(this, 422, 113, textureX, textureY, "lamp"); // Box 275 lamp
		bodyModel[230] = new ModelRendererTurbo(this, 415, 118, textureX, textureY, "lamp"); // Box 276 lamp
		bodyModel[231] = new ModelRendererTurbo(this, 408, 118, textureX, textureY, "lamp"); // Box 277 lamp
		bodyModel[232] = new ModelRendererTurbo(this, 422, 118, textureX, textureY, "lamp"); // Box 278 lamp
		bodyModel[233] = new ModelRendererTurbo(this, 429, 118, textureX, textureY, "lamp"); // Box 279 lamp
		bodyModel[234] = new ModelRendererTurbo(this, 436, 119, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[235] = new ModelRendererTurbo(this, 443, 119, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[236] = new ModelRendererTurbo(this, 450, 124, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[237] = new ModelRendererTurbo(this, 450, 119, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[238] = new ModelRendererTurbo(this, 443, 124, textureX, textureY, "lamp"); // Box 284 lamp
		bodyModel[239] = new ModelRendererTurbo(this, 436, 124, textureX, textureY, "lamp"); // Box 285 lamp
		bodyModel[240] = new ModelRendererTurbo(this, 95, 44, textureX, textureY); // Box 4
		bodyModel[241] = new ModelRendererTurbo(this, 46, 58, textureX, textureY); // Box 4
		bodyModel[242] = new ModelRendererTurbo(this, 61, 50, textureX, textureY); // Box 4
		bodyModel[243] = new ModelRendererTurbo(this, 78, 46, textureX, textureY); // Box 4
		bodyModel[244] = new ModelRendererTurbo(this, 80, 61, textureX, textureY); // Box 4
		bodyModel[245] = new ModelRendererTurbo(this, 96, 56, textureX, textureY); // Box 4
		bodyModel[246] = new ModelRendererTurbo(this, 394, 78, textureX, textureY); // Box 2
		bodyModel[247] = new ModelRendererTurbo(this, 490, 80, textureX, textureY); // Box 267
		bodyModel[248] = new ModelRendererTurbo(this, 379, 59, textureX, textureY); // Box 270434
		bodyModel[249] = new ModelRendererTurbo(this, 325, 115, textureX, textureY); // Box 271
		bodyModel[250] = new ModelRendererTurbo(this, 92, 106, textureX, textureY); // Box 81
		bodyModel[251] = new ModelRendererTurbo(this, 502, 27, textureX, textureY); // Box 81
		bodyModel[252] = new ModelRendererTurbo(this, 502, 33, textureX, textureY); // Box 275
		bodyModel[253] = new ModelRendererTurbo(this, 502, 24, textureX, textureY); // Box 276
		bodyModel[254] = new ModelRendererTurbo(this, 482, 89, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[255] = new ModelRendererTurbo(this, 490, 89, textureX, textureY); // Box 165
		bodyModel[256] = new ModelRendererTurbo(this, 108, 77, textureX, textureY); // Box 279
		bodyModel[257] = new ModelRendererTurbo(this, 502, 18, textureX, textureY); // Box 280
		bodyModel[258] = new ModelRendererTurbo(this, 502, 18, textureX, textureY); // Box 281
		bodyModel[259] = new ModelRendererTurbo(this, 492, 103, textureX, textureY); // Box 282
		bodyModel[260] = new ModelRendererTurbo(this, 256, 116, textureX, textureY); // Box 283
		bodyModel[261] = new ModelRendererTurbo(this, 229, 129, textureX, textureY); // Box 284
		bodyModel[262] = new ModelRendererTurbo(this, 256, 129, textureX, textureY); // Box 285
		bodyModel[263] = new ModelRendererTurbo(this, 229, 116, textureX, textureY); // Box 286
		bodyModel[264] = new ModelRendererTurbo(this, 283, 118, textureX, textureY); // Box 287
		bodyModel[265] = new ModelRendererTurbo(this, 283, 129, textureX, textureY); // Box 288
		bodyModel[266] = new ModelRendererTurbo(this, 1, 139, textureX, textureY); // Box 289
		bodyModel[267] = new ModelRendererTurbo(this, 294, 128, textureX, textureY); // Box 291
		bodyModel[268] = new ModelRendererTurbo(this, 371, 11, textureX, textureY); // Box 292
		bodyModel[269] = new ModelRendererTurbo(this, 371, 1, textureX, textureY); // Box 293
		bodyModel[270] = new ModelRendererTurbo(this, 369, 5, textureX, textureY); // Box 294
		bodyModel[271] = new ModelRendererTurbo(this, 96, 142, textureX, textureY); // Box 295
		bodyModel[272] = new ModelRendererTurbo(this, 27, 139, textureX, textureY); // Box 296
		bodyModel[273] = new ModelRendererTurbo(this, 79, 140, textureX, textureY); // Box 297
		bodyModel[274] = new ModelRendererTurbo(this, 429, 124, textureX, textureY, "lamp"); // Box 298 lamp
		bodyModel[275] = new ModelRendererTurbo(this, 422, 124, textureX, textureY, "lamp"); // Box 299 lamp
		bodyModel[276] = new ModelRendererTurbo(this, 126, 143, textureX, textureY); // Box 300 ignore dis
		bodyModel[277] = new ModelRendererTurbo(this, 124, 149, textureX, textureY); // Box 301 ignore dis
		bodyModel[278] = new ModelRendererTurbo(this, 126, 157, textureX, textureY); // Box 302 ignore dis
		bodyModel[279] = new ModelRendererTurbo(this, 61, 145, textureX, textureY); // Box 303
		bodyModel[280] = new ModelRendererTurbo(this, 79, 150, textureX, textureY); // Box 304
		bodyModel[281] = new ModelRendererTurbo(this, 44, 146, textureX, textureY); // Box 305
		bodyModel[282] = new ModelRendererTurbo(this, 85, 147, textureX, textureY); // Box 306
		bodyModel[283] = new ModelRendererTurbo(this, 88, 148, textureX, textureY); // Box 307
		bodyModel[284] = new ModelRendererTurbo(this, 88, 148, textureX, textureY); // Box 308
		bodyModel[285] = new ModelRendererTurbo(this, 89, 156, textureX, textureY); // Box 309
		bodyModel[286] = new ModelRendererTurbo(this, 165, 143, textureX, textureY); // Box 310
		bodyModel[287] = new ModelRendererTurbo(this, 57, 108, textureX, textureY); // Box 354
		bodyModel[288] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 355
		bodyModel[289] = new ModelRendererTurbo(this, 68, 107, textureX, textureY); // Box 356
		bodyModel[290] = new ModelRendererTurbo(this, 41, 108, textureX, textureY); // Box 357
		bodyModel[291] = new ModelRendererTurbo(this, 47, 112, textureX, textureY); // Box 286
		bodyModel[292] = new ModelRendererTurbo(this, 78, 109, textureX, textureY); // Box 287
		bodyModel[293] = new ModelRendererTurbo(this, 69, 112, textureX, textureY); // Box 288
		bodyModel[294] = new ModelRendererTurbo(this, 57, 112, textureX, textureY); // Box 289

		bodyModel[0].addBox(0F, 0F, 0F, 74, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-37F, -6F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 18, 7, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-9F, -3F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 3
		bodyModel[2].setRotationPoint(-41.01F, -6F, -9F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 13, 14, 0F); // Box 5
		bodyModel[3].setRotationPoint(-37F, -19F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 55, 20, 14, 0F); // Box 6
		bodyModel[4].setRotationPoint(-18F, -26F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[5].setRotationPoint(-30F, -24F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 8
		bodyModel[6].setRotationPoint(-41F, -6F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 18, 4, 3, 0F); // Box 10
		bodyModel[7].setRotationPoint(-9F, -3F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 20, 2, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		bodyModel[8].setRotationPoint(17F, -28.5F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[9].setRotationPoint(12.5F, -29F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[10].setRotationPoint(10F, -2F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[11].setRotationPoint(12F, -28F, -2.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23
		bodyModel[12].setRotationPoint(17F, -28.5F, 0F);

		bodyModel[13].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[13].setRotationPoint(-30F, -24F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[14].setRotationPoint(-31F, -10F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 26
		bodyModel[15].setRotationPoint(-31F, -24F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 18, 3, 0F); // Box 27
		bodyModel[16].setRotationPoint(-31F, -24F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 28
		bodyModel[17].setRotationPoint(-19F, -24F, 7F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[18].setRotationPoint(-19F, -24F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 5, 14, 0F); // Box 30
		bodyModel[19].setRotationPoint(-31F, -24F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 31
		bodyModel[20].setRotationPoint(-34F, -10F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 32
		bodyModel[21].setRotationPoint(-35F, -8F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 33
		bodyModel[22].setRotationPoint(-35F, -10F, 7F);

		bodyModel[23].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 35
		bodyModel[23].setRotationPoint(-18F, -10F, 7F);

		bodyModel[24].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 36
		bodyModel[24].setRotationPoint(-18F, -10F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 37
		bodyModel[25].setRotationPoint(-8F, -8F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 38
		bodyModel[26].setRotationPoint(-8F, -8F, 7F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 46
		bodyModel[27].setRotationPoint(-15.5F, -29F, -2.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 47
		bodyModel[28].setRotationPoint(-14.5F, -29F, 0.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 61
		bodyModel[29].setRotationPoint(-45F, -2F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[30].setRotationPoint(-37F, -4F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 65
		bodyModel[31].setRotationPoint(-14F, -28F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[32].setRotationPoint(-31F, -27F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[33].setRotationPoint(-31F, -27F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 97
		bodyModel[34].setRotationPoint(-31F, -24F, 10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[35].setRotationPoint(-41F, -9F, 4.75F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[36].setRotationPoint(-19F, -27F, -7F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[37].setRotationPoint(-31F, -27F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[38].setRotationPoint(-29F, -24F, 11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[39].setRotationPoint(-29F, -24F, -12F);

		bodyModel[40].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 144
		bodyModel[40].setRotationPoint(17F, -27F, -8F);

		bodyModel[41].addBox(0F, 0F, 0F, 20, 2, 1, 0F); // Box 145
		bodyModel[41].setRotationPoint(17F, -27F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 20, 19, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[42].setRotationPoint(17F, -25F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 147
		bodyModel[43].setRotationPoint(17F, -25F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[44].setRotationPoint(37F, -27F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[45].setRotationPoint(37F, -27F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[46].setRotationPoint(37F, -27F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[47].setRotationPoint(37F, -28F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[48].setRotationPoint(37F, -28F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[49].setRotationPoint(37F, -28F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[50].setRotationPoint(37F, -28F, 1F);

		bodyModel[51].addBox(0F, 0F, 0F, 27, 1, 4, 0F); // Box 156
		bodyModel[51].setRotationPoint(-37F, -4F, -11.01F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[52].setRotationPoint(-9F, 1F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 158
		bodyModel[53].setRotationPoint(-9F, 1F, 8F);

		bodyModel[54].addBox(0F, 0F, 0F, 18, 4, 3, 0F); // Box 159
		bodyModel[54].setRotationPoint(-9F, -3F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[55].setRotationPoint(-30F, -28F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[56].setRotationPoint(-31F, -28F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[57].setRotationPoint(-19F, -28F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[58].setRotationPoint(-31F, -28F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[59].setRotationPoint(-19F, -28F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[60].setRotationPoint(-30F, -27F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[61].setRotationPoint(-19F, -27F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[62].setRotationPoint(-30F, -27F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[63].setRotationPoint(-19F, -27F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[64].setRotationPoint(-30F, -28F, 0F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[65].setRotationPoint(-32F, -28F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[66].setRotationPoint(-32F, -27F, -6F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[67].setRotationPoint(-31.05F, -27F, -6F);
		bodyModel[67].rotateAngleY = 0.19198622F;

		bodyModel[68].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[68].setRotationPoint(-31.05F, -27F, 6F);
		bodyModel[68].rotateAngleY = -0.19198622F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[69].setRotationPoint(-32F, -27F, 1F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 9, 14, 0F); // Box 180
		bodyModel[70].setRotationPoint(-31F, -19F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 13, 14, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 182
		bodyModel[71].setRotationPoint(-38F, -19F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[72].setRotationPoint(-37F, -20F, 0F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[73].setRotationPoint(-37.25F, -20.05F, -2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[74].setRotationPoint(-37F, -20F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[75].setRotationPoint(-38F, -6F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[76].setRotationPoint(-38F, 2F, 10F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[77].setRotationPoint(-41F, 3F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[78].setRotationPoint(-38F, 2F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[79].setRotationPoint(-41F, -6F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[80].setRotationPoint(-41F, -3F, 7F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[81].setRotationPoint(-41F, 0F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[82].setRotationPoint(-41F, 0F, -9F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[83].setRotationPoint(-41F, -6F, -8F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[84].setRotationPoint(-41F, -3F, -9F);

		bodyModel[85].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[85].setRotationPoint(-41F, 3F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[86].setRotationPoint(-38F, -2F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[87].setRotationPoint(-38F, -2F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F); // Box 208
		bodyModel[88].setRotationPoint(-42F, -6F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[89].setRotationPoint(-42F, 3F, -9F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 215
		bodyModel[90].setRotationPoint(38F, -6F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[91].setRotationPoint(37F, -2F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[92].setRotationPoint(37F, 2F, 10F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 219
		bodyModel[93].setRotationPoint(38F, 3F, 8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[94].setRotationPoint(37F, 2F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[95].setRotationPoint(37F, -2F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 222
		bodyModel[96].setRotationPoint(38F, 3F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 223
		bodyModel[97].setRotationPoint(38F, 0F, -9F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 224
		bodyModel[98].setRotationPoint(38F, -3F, -9F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 225
		bodyModel[99].setRotationPoint(38F, -6F, -8F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 226
		bodyModel[100].setRotationPoint(38F, 0F, 7F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 227
		bodyModel[101].setRotationPoint(38F, -3F, 7F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 228
		bodyModel[102].setRotationPoint(38F, -6F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F); // Box 229
		bodyModel[103].setRotationPoint(40F, -6F, -7F);

		bodyModel[104].addBox(0F, 0F, 0F, 6, 2, 3, 0F); // Box 230
		bodyModel[104].setRotationPoint(39F, -2F, -1.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 231
		bodyModel[105].setRotationPoint(41F, 3F, -9F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 15, 0, 0F); // Box 232
		bodyModel[106].setRotationPoint(-38F, -17F, 11F);

		bodyModel[107].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 233
		bodyModel[107].setRotationPoint(-38F, -18F, 11F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 234
		bodyModel[108].setRotationPoint(-35F, -17F, 11F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Box 2
		bodyModel[109].setRotationPoint(-41F, -14F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[110].setRotationPoint(-41.01F, -14F, -8F);
		bodyModel[110].rotateAngleY = -3.14159265F;

		bodyModel[111].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[111].setRotationPoint(-41F, -8F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[112].setRotationPoint(-41.01F, -14F, 8F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[113].setRotationPoint(-41F, -8F, -11F);

		bodyModel[114].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Box 79
		bodyModel[114].setRotationPoint(-41F, -14F, 2F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[115].setRotationPoint(-41F, -14F, -8F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[116].setRotationPoint(-41F, -14F, 7F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 82
		bodyModel[117].setRotationPoint(-41F, -13F, 2F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 83
		bodyModel[118].setRotationPoint(-41F, -13F, -3F);

		bodyModel[119].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 84
		bodyModel[119].setRotationPoint(-41F, -14F, -2F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 246
		bodyModel[120].setRotationPoint(-41F, -4F, -10F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 247
		bodyModel[121].setRotationPoint(-41F, -4F, 9F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 249
		bodyModel[122].setRotationPoint(-35F, -17F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 7, 1, 0, 0F); // Box 250
		bodyModel[123].setRotationPoint(-38F, -18F, -11F);

		bodyModel[124].addBox(0F, 0F, 0F, 74, 2, 16, 0F); // Box 251
		bodyModel[124].setRotationPoint(-37F, -4F, -8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[125].setRotationPoint(-41F, -9F, -6.75F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 9, 18, 0F); // Box 256
		bodyModel[126].setRotationPoint(41.01F, -6F, -9F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 257
		bodyModel[127].setRotationPoint(41.01F, -4F, -10F);

		bodyModel[128].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 258
		bodyModel[128].setRotationPoint(41.01F, -4F, 9F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[129].setRotationPoint(41.01F, -8F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[130].setRotationPoint(41F, -14F, 8F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 261
		bodyModel[131].setRotationPoint(41.01F, -14F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Box 262
		bodyModel[132].setRotationPoint(41.01F, -14F, 2F);

		bodyModel[133].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 263
		bodyModel[133].setRotationPoint(41.01F, -14F, -2F);

		bodyModel[134].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 264
		bodyModel[134].setRotationPoint(41.01F, -13F, 2F);

		bodyModel[135].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 265
		bodyModel[135].setRotationPoint(41.01F, -13F, -3F);

		bodyModel[136].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Box 266
		bodyModel[136].setRotationPoint(41.01F, -14F, -7F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 267
		bodyModel[137].setRotationPoint(41.01F, -14F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[138].setRotationPoint(41F, -14F, -8F);
		bodyModel[138].rotateAngleY = -3.14159265F;

		bodyModel[139].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[139].setRotationPoint(41.01F, -8F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 162 light
		bodyModel[140].setRotationPoint(-27.68F, -29.5F, -0.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F); // Box 165
		bodyModel[141].setRotationPoint(-27.5F, -29F, -0.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 8, 9, 2, 0F); // Box 148
		bodyModel[142].setRotationPoint(-31F, -18.01F, -3F);
		bodyModel[142].rotateAngleY = -0.61086524F;

		bodyModel[143].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 150
		bodyModel[143].setRotationPoint(-28F, -20.01F, -5.25F);
		bodyModel[143].rotateAngleY = -0.57595865F;

		bodyModel[144].addBox(0F, 0F, 0F, 2, 10, 6, 0F); // Box 152
		bodyModel[144].setRotationPoint(-30F, -19.01F, -3F);
		bodyModel[144].rotateAngleY = 0.15707963F;

		bodyModel[145].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 275
		bodyModel[145].setRotationPoint(-30F, -19F, 3F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 276
		bodyModel[146].setRotationPoint(-35F, -18F, 7.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[147].setRotationPoint(-34F, -17F, 6.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 278 glow
		bodyModel[148].setRotationPoint(-37.25F, -18.6F, -6.75F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 279 glow
		bodyModel[149].setRotationPoint(-37.25F, -18.6F, 5.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 280
		bodyModel[150].setRotationPoint(40F, -9F, 4.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[151].setRotationPoint(40F, -9F, -6.75F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 284
		bodyModel[152].setRotationPoint(-23F, -29.5F, 3F);

		bodyModel[153].addBox(0F, 0F, 0F, 11, 1, 0, 0F); // Box 285
		bodyModel[153].setRotationPoint(-18F, -18F, 11F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 286
		bodyModel[154].setRotationPoint(-8F, -17F, 11F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 287
		bodyModel[155].setRotationPoint(-13.5F, -17F, 11F);

		bodyModel[156].addBox(0F, 0F, 0F, 41, 8, 0, 0F); // Box 288
		bodyModel[156].setRotationPoint(-3F, -14F, 11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 297
		bodyModel[157].setRotationPoint(-7F, -18F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 298
		bodyModel[158].setRotationPoint(-7F, -18F, -11F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 299
		bodyModel[159].setRotationPoint(-8F, -17F, -11F);

		bodyModel[160].addBox(0F, 0F, 0F, 11, 1, 0, 0F); // Box 300
		bodyModel[160].setRotationPoint(-18F, -18F, -11F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 301
		bodyModel[161].setRotationPoint(-13.5F, -17F, -11.01F);

		bodyModel[162].addBox(0F, 0F, 0F, 41, 8, 0, 0F); // Box 303
		bodyModel[162].setRotationPoint(-3F, -14F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 296
		bodyModel[163].setRotationPoint(38.01F, -14F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[164].setRotationPoint(11F, -2F, -9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[165].setRotationPoint(9F, -2F, -9F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[166].setRotationPoint(10F, -4F, -9.01F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[167].setRotationPoint(10F, -4F, 9.01F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[168].setRotationPoint(-11F, -2F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[169].setRotationPoint(-10F, -2F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[170].setRotationPoint(-12F, -2F, -9F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 305
		bodyModel[171].setRotationPoint(-11F, -3F, -9.01F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[172].setRotationPoint(-11F, -4F, 9.01F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 440
		bodyModel[173].setRotationPoint(-25.5F, -2F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 441
		bodyModel[174].setRotationPoint(23.5F, -2F, -1F);

		bodyModel[175].addBox(0F, 0F, 0F, 10, 7, 1, 0F); // Box 293
		bodyModel[175].setRotationPoint(26F, -20F, 6.75F);

		bodyModel[176].addBox(0F, 0F, 0F, 10, 7, 1, 0F); // Box 293
		bodyModel[176].setRotationPoint(26F, -20F, -7.75F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[177].setRotationPoint(23.5F, -20F, -7.75F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[178].setRotationPoint(21F, -20F, -7.75F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[179].setRotationPoint(17.5F, -13F, -7.75F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[180].setRotationPoint(23.5F, -20F, 6.75F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[181].setRotationPoint(21F, -20F, 6.75F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[182].setRotationPoint(17.5F, -13F, 6.75F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[183].setRotationPoint(-5F, -4F, -11.75F);
		bodyModel[183].rotateAngleX = 0.71558499F;

		bodyModel[184].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[184].setRotationPoint(-5F, -4F, 11.75F);
		bodyModel[184].rotateAngleX = -0.71558499F;

		bodyModel[185].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 293
		bodyModel[185].setRotationPoint(-17F, -25F, -7.25F);

		bodyModel[186].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 293
		bodyModel[186].setRotationPoint(-17F, -22.5F, -7.25F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 293
		bodyModel[187].setRotationPoint(-13F, -22.5F, -7.25F);

		bodyModel[188].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 293o00
		bodyModel[188].setRotationPoint(-17F, -25F, 6.25F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 293
		bodyModel[189].setRotationPoint(-17F, -22.5F, 6.25F);

		bodyModel[190].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 293
		bodyModel[190].setRotationPoint(-13F, -22.5F, 6.25F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 84
		bodyModel[191].setRotationPoint(-43F, -7.4F, -2F);
		bodyModel[191].rotateAngleZ = 0.78539816F;

		bodyModel[192].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 84
		bodyModel[192].setRotationPoint(43F, -7.4F, -2F);
		bodyModel[192].rotateAngleZ = -0.78539816F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[193].setRotationPoint(-41.5F, -5F, 4.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[194].setRotationPoint(-41.5F, -5F, -6.75F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[195].setRotationPoint(41F, -5F, 4.75F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[196].setRotationPoint(41F, -5F, -6.75F);

		bodyModel[197].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 240 glow liveryimg 2
		bodyModel[197].setRotationPoint(37.25F, -24.5F, 6F);
		bodyModel[197].rotateAngleY = 0.15707963F;

		bodyModel[198].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 241 glow liveryimg 2
		bodyModel[198].setRotationPoint(37.25F, -24.5F, -6F);
		bodyModel[198].rotateAngleY = -0.15707963F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[199].setRotationPoint(-17F, -25F, -8.75F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[200].setRotationPoint(-17F, -26F, -8.75F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[201].setRotationPoint(-16.75F, -24.5F, -8.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[202].setRotationPoint(-17F, -27F, -8.55F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 246
		bodyModel[203].setRotationPoint(-15F, -29F, -1F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 247
		bodyModel[204].setRotationPoint(-31F, -29.5F, -2.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[205].setRotationPoint(-30.5F, -29.5F, -1F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 249
		bodyModel[206].setRotationPoint(-29.5F, -28.5F, -2F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[207].setRotationPoint(-30F, -29.5F, 0.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[208].setRotationPoint(-32F, -29F, 3F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[209].setRotationPoint(-31.5F, -29F, 4.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 249
		bodyModel[210].setRotationPoint(-30F, -28F, 3.25F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[211].setRotationPoint(-43F, 3F, -10F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[212].setRotationPoint(41F, 3F, -10F);

		bodyModel[213].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36
		bodyModel[213].setRotationPoint(-17F, -14F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[214].setRotationPoint(-11F, -2F, 9.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[215].setRotationPoint(-11F, -3F, 9.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[216].setRotationPoint(-10.75F, -1.5F, 9.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[217].setRotationPoint(-10.75F, -4F, 7.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[218].setRotationPoint(-37F, -4F, 7F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[219].setRotationPoint(-38F, -6F, 7F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 262
		bodyModel[220].setRotationPoint(-38F, -6F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 263
		bodyModel[221].setRotationPoint(36F, -4F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[222].setRotationPoint(37F, -6F, -10F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 265
		bodyModel[223].setRotationPoint(37F, -6F, -7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[224].setRotationPoint(-41F, -4F, -3F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[225].setRotationPoint(-41.25F, -9F, 4.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[226].setRotationPoint(-41.25F, -9F, -6.75F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[227].setRotationPoint(36F, -4F, -3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 274 lamp
		bodyModel[228].setRotationPoint(-41.75F, -5F, 4.75F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 lamp
		bodyModel[229].setRotationPoint(-41.75F, -5F, -6.75F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 lamp
		bodyModel[230].setRotationPoint(40.75F, -9F, -6.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 277 lamp
		bodyModel[231].setRotationPoint(40.75F, -9F, 4.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 lamp
		bodyModel[232].setRotationPoint(41.25F, -5F, -6.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 279 lamp
		bodyModel[233].setRotationPoint(41.25F, -5F, 4.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[234].setRotationPoint(-32.5F, -28F, -1F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[235].setRotationPoint(-32.5F, -26F, -1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[236].setRotationPoint(-38F, -20F, -2F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[237].setRotationPoint(-38F, -20F, 0F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 lamp
		bodyModel[238].setRotationPoint(37.5F, -23.5F, -1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 lamp
		bodyModel[239].setRotationPoint(37.5F, -25.5F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[240].setRotationPoint(-44F, 0F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[241].setRotationPoint(-44F, -1F, 2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[242].setRotationPoint(-44F, 2F, 0F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[243].setRotationPoint(-44F, 0F, -10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[244].setRotationPoint(-44.5F, -1F, -10F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[245].setRotationPoint(-44F, 2F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[246].setRotationPoint(-42F, -2.5F, -2F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[247].setRotationPoint(41F, -2.5F, -2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 270434
		bodyModel[248].setRotationPoint(36F, -4F, 7F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[249].setRotationPoint(37F, -6F, 7F);

		bodyModel[250].addBox(0F, 0F, 0F, 0, 11, 2, 0F); // Box 81
		bodyModel[250].setRotationPoint(-38.01F, -13F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[251].setRotationPoint(-38.01F, -10F, -11.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[252].setRotationPoint(-38F, -17F, -9.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[253].setRotationPoint(-38F, -18F, -11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 light
		bodyModel[254].setRotationPoint(-21F, -29.8F, -0.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[255].setRotationPoint(-20.82F, -28.8F, -0.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[256].setRotationPoint(-25F, -29.5F, 0F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[257].setRotationPoint(38.01F, -10F, -11.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[258].setRotationPoint(38.01F, -10F, 10.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 0, 12, 2, 0F); // Box 282
		bodyModel[259].setRotationPoint(38.01F, -14F, 9F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 283
		bodyModel[260].setRotationPoint(41F, 2F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 284
		bodyModel[261].setRotationPoint(41F, 2F, -10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 285
		bodyModel[262].setRotationPoint(41F, 0F, -10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[263].setRotationPoint(41F, 0F, 0F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[264].setRotationPoint(41F, -1F, 2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 288
		bodyModel[265].setRotationPoint(41.5F, -1F, -10F);

		bodyModel[266].addBox(0F, 0F, 0F, 6, 7, 14, 0F); // Box 289
		bodyModel[266].setRotationPoint(-37F, -26F, -7F);

		bodyModel[267].addBox(0F, 0F, 0F, 20, 1, 14, 0F); // Box 291
		bodyModel[267].setRotationPoint(17F, -27F, -7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[268].setRotationPoint(-18F, -27F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[269].setRotationPoint(-18F, -27F, 3F);

		bodyModel[270].addBox(0F, 0F, 0F, 55, 1, 6, 0F); // Box 294
		bodyModel[270].setRotationPoint(-18F, -27F, -3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[271].setRotationPoint(-37F, -27F, -7F);

		bodyModel[272].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 296
		bodyModel[272].setRotationPoint(-37F, -27F, -3F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[273].setRotationPoint(-37F, -27F, 3F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 298 lamp
		bodyModel[274].setRotationPoint(-38.5F, -25.5F, -1F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299 lamp
		bodyModel[275].setRotationPoint(-38.5F, -23.5F, -1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300 ignore dis
		bodyModel[276].setRotationPoint(-31F, -27F, -7F);

		bodyModel[277].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 301 ignore dis
		bodyModel[277].setRotationPoint(-31F, -27F, -3F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302 ignore dis
		bodyModel[278].setRotationPoint(-31F, -27F, 3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[279].setRotationPoint(-38F, -26F, 1F);

		bodyModel[280].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 304
		bodyModel[280].setRotationPoint(-38F, -26F, -1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[281].setRotationPoint(-38F, -26F, -7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[282].setRotationPoint(-38F, -27F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[283].setRotationPoint(-38F, -27F, -7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 308
		bodyModel[284].setRotationPoint(-38F, -27F, 1F);

		bodyModel[285].addBox(0F, 0F, 0F, 13, 16, 0, 0F); // Box 309
		bodyModel[285].setRotationPoint(-31F, -26F, 7F);

		bodyModel[286].addBox(0F, 0F, 0F, 13, 16, 0, 0F); // Box 310
		bodyModel[286].setRotationPoint(-31F, -26F, -7F);

		bodyModel[287].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[287].setRotationPoint(-39F, -28F, -6.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[288].setRotationPoint(-38F, -27.75F, -5.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[289].setRotationPoint(-38.5F, -27.75F, -7.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[290].setRotationPoint(-36.5F, -27F, -6.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[291].setRotationPoint(36F, -29.7F, 0.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[292].setRotationPoint(36.5F, -28.95F, -0.5F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[293].setRotationPoint(36.5F, -29.7F, -1.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[294].setRotationPoint(36F, -29.95F, -0.5F);
	}
	ModelTypeB theTrucks1 = new ModelTypeB();
	ModelFB2 theTrucks2 = new ModelFB2();

	//color 14 is orange, color 0 is black, 7 is LG

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 295; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.52, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo u23bModel[];
}