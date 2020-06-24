//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2019 - 14:12:15
// Last changed on: 27.03.2019 - 14:12:15

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSD45dash2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSD45dash2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[368];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 112
		bodyModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 164
		bodyModel[8] = new ModelRendererTurbo(this, 249, 86, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 246
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 247
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 259
		bodyModel[12] = new ModelRendererTurbo(this, 72, 46, textureX, textureY); // Box 262
		bodyModel[13] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 264
		bodyModel[14] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 265
		bodyModel[15] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 261
		bodyModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 143
		bodyModel[17] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 62
		bodyModel[18] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 61
		bodyModel[19] = new ModelRendererTurbo(this, 138, 11, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 60, 59, textureX, textureY); // Box 98
		bodyModel[22] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 197
		bodyModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 144
		bodyModel[25] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 145
		bodyModel[26] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 147
		bodyModel[27] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 148
		bodyModel[28] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 4
		bodyModel[33] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 159
		bodyModel[36] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 3
		bodyModel[37] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 246
		bodyModel[38] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 164
		bodyModel[39] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 259
		bodyModel[40] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 261
		bodyModel[41] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 262
		bodyModel[42] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 264
		bodyModel[43] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 265
		bodyModel[44] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 266
		bodyModel[45] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 5
		bodyModel[47] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 143
		bodyModel[48] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 81
		bodyModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 179
		bodyModel[54] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 234
		bodyModel[55] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 236
		bodyModel[56] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 134, 46, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 4
		bodyModel[60] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 4
		bodyModel[61] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 4
		bodyModel[62] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 2
		bodyModel[63] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 193
		bodyModel[64] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 52 door swing right
		bodyModel[65] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 190
		bodyModel[68] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 313
		bodyModel[69] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 314 door swing right
		bodyModel[70] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 316
		bodyModel[71] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 201
		bodyModel[72] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 202
		bodyModel[73] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 204
		bodyModel[74] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 206
		bodyModel[75] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 207
		bodyModel[76] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 11
		bodyModel[77] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 210
		bodyModel[78] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 211
		bodyModel[79] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 48 lamp -not a real lamp
		bodyModel[80] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 43
		bodyModel[81] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 44
		bodyModel[82] = new ModelRendererTurbo(this, 297, 33, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[83] = new ModelRendererTurbo(this, 273, 49, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[84] = new ModelRendererTurbo(this, 393, 33, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[85] = new ModelRendererTurbo(this, 481, 33, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[86] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 219
		bodyModel[87] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 220
		bodyModel[88] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 221
		bodyModel[89] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 222
		bodyModel[90] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 223
		bodyModel[91] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 224
		bodyModel[92] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 225
		bodyModel[93] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 226
		bodyModel[94] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 227
		bodyModel[95] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 229
		bodyModel[96] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 230
		bodyModel[97] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 231
		bodyModel[98] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 232
		bodyModel[99] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 233
		bodyModel[100] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 234
		bodyModel[101] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 235
		bodyModel[102] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 236
		bodyModel[103] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 86
		bodyModel[104] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 87
		bodyModel[105] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 255
		bodyModel[106] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 256
		bodyModel[107] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 241
		bodyModel[108] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 242
		bodyModel[109] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 243
		bodyModel[110] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 244
		bodyModel[111] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 245
		bodyModel[112] = new ModelRendererTurbo(this, 150, 88, textureX, textureY); // Box 246
		bodyModel[113] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 81
		bodyModel[114] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 81
		bodyModel[115] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 176
		bodyModel[116] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 177
		bodyModel[117] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 271
		bodyModel[118] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 272
		bodyModel[119] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 273
		bodyModel[120] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 274
		bodyModel[121] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 277
		bodyModel[122] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 278
		bodyModel[123] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 258
		bodyModel[124] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 259
		bodyModel[125] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 260
		bodyModel[126] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 261
		bodyModel[127] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 262
		bodyModel[128] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 264
		bodyModel[129] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 265
		bodyModel[130] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 268
		bodyModel[131] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 269
		bodyModel[132] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 270
		bodyModel[133] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 271
		bodyModel[134] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 272
		bodyModel[135] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 273
		bodyModel[136] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 274
		bodyModel[137] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 275
		bodyModel[138] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 276
		bodyModel[139] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 277
		bodyModel[140] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 278
		bodyModel[141] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 279
		bodyModel[142] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 280
		bodyModel[143] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 281
		bodyModel[144] = new ModelRendererTurbo(this, 124, 47, textureX, textureY); // Box 282
		bodyModel[145] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 285
		bodyModel[146] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 286
		bodyModel[147] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 287
		bodyModel[148] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 288
		bodyModel[149] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 289
		bodyModel[150] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 290
		bodyModel[151] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 291
		bodyModel[152] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 292
		bodyModel[153] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 293
		bodyModel[154] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 294
		bodyModel[155] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 295
		bodyModel[156] = new ModelRendererTurbo(this, 503, 3, textureX, textureY); // Box 296
		bodyModel[157] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 297
		bodyModel[158] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 298
		bodyModel[159] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 299
		bodyModel[160] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 300
		bodyModel[161] = new ModelRendererTurbo(this, 11, 17, textureX, textureY); // Box 301
		bodyModel[162] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 302
		bodyModel[163] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 303
		bodyModel[164] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 304
		bodyModel[165] = new ModelRendererTurbo(this, 305, 65, textureX, textureY, "lamp"); // Box 31 lamp
		bodyModel[166] = new ModelRendererTurbo(this, 105, 65, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[167] = new ModelRendererTurbo(this, 257, 65, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[168] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 308
		bodyModel[169] = new ModelRendererTurbo(this, 153, 28, textureX, textureY); // Box 309
		bodyModel[170] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 310
		bodyModel[171] = new ModelRendererTurbo(this, 65, 106, textureX, textureY); // Box 311
		bodyModel[172] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 312
		bodyModel[173] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 313
		bodyModel[174] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 314
		bodyModel[175] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 315
		bodyModel[176] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 316
		bodyModel[177] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 317
		bodyModel[178] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 318
		bodyModel[179] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 319
		bodyModel[180] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 42
		bodyModel[181] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 45
		bodyModel[182] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 48
		bodyModel[183] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 42
		bodyModel[184] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 42
		bodyModel[185] = new ModelRendererTurbo(this, 369, 25, textureX, textureY, "lamp"); // Box 176 lamp
		bodyModel[186] = new ModelRendererTurbo(this, 33, 49, textureX, textureY, "lamp"); // Box 177 lamp
		bodyModel[187] = new ModelRendererTurbo(this, 105, 49, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[188] = new ModelRendererTurbo(this, 433, 49, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[189] = new ModelRendererTurbo(this, 505, 49, textureX, textureY, "lamp"); // Box 176 lamp
		bodyModel[190] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 42
		bodyModel[191] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 42
		bodyModel[192] = new ModelRendererTurbo(this, 265, 65, textureX, textureY, "lamp"); // Box 48 lamp
		bodyModel[193] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 43
		bodyModel[194] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 43
		bodyModel[195] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 43
		bodyModel[196] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 43
		bodyModel[197] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 43
		bodyModel[198] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 345
		bodyModel[199] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 346 cover
		bodyModel[200] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 100
		bodyModel[201] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 101
		bodyModel[202] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 102
		bodyModel[203] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 103
		bodyModel[204] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 104
		bodyModel[205] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 105
		bodyModel[206] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 354 cnw bELL
		bodyModel[207] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 114
		bodyModel[208] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 74
		bodyModel[209] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 78
		bodyModel[210] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 245
		bodyModel[211] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 364
		bodyModel[212] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 365
		bodyModel[213] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 366
		bodyModel[214] = new ModelRendererTurbo(this, 232, 106, textureX, textureY); // Box 367
		bodyModel[215] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 379
		bodyModel[216] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 380
		bodyModel[217] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 381
		bodyModel[218] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 383
		bodyModel[219] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 384
		bodyModel[220] = new ModelRendererTurbo(this, 245, 97, textureX, textureY); // Box 385
		bodyModel[221] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 386
		bodyModel[222] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 389
		bodyModel[223] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 390
		bodyModel[224] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 391
		bodyModel[225] = new ModelRendererTurbo(this, 389, 89, textureX, textureY, "lamp"); // Box 162 glow
		bodyModel[226] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 165
		bodyModel[227] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 114
		bodyModel[228] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 74
		bodyModel[229] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 78
		bodyModel[230] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 78
		bodyModel[231] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 188
		bodyModel[232] = new ModelRendererTurbo(this, 193, 105, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[233] = new ModelRendererTurbo(this, 465, 105, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[234] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 239
		bodyModel[235] = new ModelRendererTurbo(this, 505, 105, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[236] = new ModelRendererTurbo(this, 137, 113, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[237] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 242
		bodyModel[238] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 114
		bodyModel[239] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 74
		bodyModel[240] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 78
		bodyModel[241] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 245
		bodyModel[242] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 409
		bodyModel[243] = new ModelRendererTurbo(this, 121, 113, textureX, textureY, "lamp"); // Box 410 glow
		bodyModel[244] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 411
		bodyModel[245] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 412
		bodyModel[246] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 413
		bodyModel[247] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 414
		bodyModel[248] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 415
		bodyModel[249] = new ModelRendererTurbo(this, 233, 113, textureX, textureY, "lamp"); // Box 416 lamp
		bodyModel[250] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 417
		bodyModel[251] = new ModelRendererTurbo(this, 249, 113, textureX, textureY, "lamp"); // Box 418 lamp
		bodyModel[252] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 419
		bodyModel[253] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // box64
		bodyModel[254] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // box65
		bodyModel[255] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 350
		bodyModel[256] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 351
		bodyModel[257] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 327
		bodyModel[258] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 328
		bodyModel[259] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 329
		bodyModel[260] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 330
		bodyModel[261] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 331
		bodyModel[262] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 332
		bodyModel[263] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 439
		bodyModel[264] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 86
		bodyModel[265] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 87
		bodyModel[266] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 86
		bodyModel[267] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 87
		bodyModel[268] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 450 extended tank
		bodyModel[269] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 451
		bodyModel[270] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 452
		bodyModel[271] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 453
		bodyModel[272] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 454
		bodyModel[273] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 455
		bodyModel[274] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 456
		bodyModel[275] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 319
		bodyModel[276] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 320
		bodyModel[277] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 321
		bodyModel[278] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 322
		bodyModel[279] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 323
		bodyModel[280] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 324
		bodyModel[281] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 325
		bodyModel[282] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 326
		bodyModel[283] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 327
		bodyModel[284] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 328
		bodyModel[285] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 329
		bodyModel[286] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 330
		bodyModel[287] = new ModelRendererTurbo(this, 25, 57, textureX, textureY, "lamp"); // Box 115 liveryimg 2 glow
		bodyModel[288] = new ModelRendererTurbo(this, 97, 57, textureX, textureY, "lamp"); // Box 116 liveryimg 2 glow
		bodyModel[289] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 19
		bodyModel[290] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 334
		bodyModel[291] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 335
		bodyModel[292] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 336
		bodyModel[293] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 337
		bodyModel[294] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 338
		bodyModel[295] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 339
		bodyModel[296] = new ModelRendererTurbo(this, 49, 129, textureX, textureY, "lamp"); // Box 340 glow
		bodyModel[297] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 341
		bodyModel[298] = new ModelRendererTurbo(this, 134, 107, textureX, textureY); // Box 629
		bodyModel[299] = new ModelRendererTurbo(this, 144, 107, textureX, textureY); // Box 630
		bodyModel[300] = new ModelRendererTurbo(this, 154, 107, textureX, textureY); // Box 726
		bodyModel[301] = new ModelRendererTurbo(this, 164, 107, textureX, textureY); // Box 727
		bodyModel[302] = new ModelRendererTurbo(this, 100, 114, textureX, textureY); // Box 348
		bodyModel[303] = new ModelRendererTurbo(this, 37, 46, textureX, textureY); // Box 349
		bodyModel[304] = new ModelRendererTurbo(this, 31, 46, textureX, textureY); // Box 350
		bodyModel[305] = new ModelRendererTurbo(this, 25, 46, textureX, textureY); // Box 351
		bodyModel[306] = new ModelRendererTurbo(this, 51, 46, textureX, textureY); // Box 352
		bodyModel[307] = new ModelRendererTurbo(this, 381, 61, textureX, textureY); // Box 353
		bodyModel[308] = new ModelRendererTurbo(this, 18, 125, textureX, textureY); // Box 354
		bodyModel[309] = new ModelRendererTurbo(this, 20, 130, textureX, textureY); // Box 355
		bodyModel[310] = new ModelRendererTurbo(this, 43, 125, textureX, textureY); // Box 356
		bodyModel[311] = new ModelRendererTurbo(this, 51, 120, textureX, textureY); // Box 357
		bodyModel[312] = new ModelRendererTurbo(this, 20, 134, textureX, textureY); // Box 358 atsf 5700
		bodyModel[313] = new ModelRendererTurbo(this, 2, 134, textureX, textureY); // Box 359 atsf 5700
		bodyModel[314] = new ModelRendererTurbo(this, 467, 101, textureX, textureY); // Box 360
		bodyModel[315] = new ModelRendererTurbo(this, 419, 84, textureX, textureY); // Box 362
		bodyModel[316] = new ModelRendererTurbo(this, 505, 93, textureX, textureY); // Box 363
		bodyModel[317] = new ModelRendererTurbo(this, 384, 94, textureX, textureY, "lamp"); // Box 364 glow
		bodyModel[318] = new ModelRendererTurbo(this, 419, 80, textureX, textureY); // Box 365
		bodyModel[319] = new ModelRendererTurbo(this, 463, 91, textureX, textureY); // Box 366
		bodyModel[320] = new ModelRendererTurbo(this, 497, 100, textureX, textureY); // Box 367
		bodyModel[321] = new ModelRendererTurbo(this, 395, 91, textureX, textureY, "lamp"); // Box 368 glow
		bodyModel[322] = new ModelRendererTurbo(this, 227, 87, textureX, textureY); // Box 369
		bodyModel[323] = new ModelRendererTurbo(this, 20, 46, textureX, textureY); // Box 370
		bodyModel[324] = new ModelRendererTurbo(this, 7, 47, textureX, textureY); // Box 371
		bodyModel[325] = new ModelRendererTurbo(this, 371, 47, textureX, textureY); // Box 372
		bodyModel[326] = new ModelRendererTurbo(this, 12, 9, textureX, textureY); // Box 373
		bodyModel[327] = new ModelRendererTurbo(this, 11, 7, textureX, textureY); // Box 374
		bodyModel[328] = new ModelRendererTurbo(this, 1, 107, textureX, textureY); // Box 376
		bodyModel[329] = new ModelRendererTurbo(this, 17, 107, textureX, textureY); // Box 377
		bodyModel[330] = new ModelRendererTurbo(this, 65, 128, textureX, textureY); // Box 378
		bodyModel[331] = new ModelRendererTurbo(this, 124, 128, textureX, textureY); // Box 379
		bodyModel[332] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 380
		bodyModel[333] = new ModelRendererTurbo(this, 124, 137, textureX, textureY); // Box 381
		bodyModel[334] = new ModelRendererTurbo(this, 341, 125, textureX, textureY); // Box 382
		bodyModel[335] = new ModelRendererTurbo(this, 320, 132, textureX, textureY); // Box 383
		bodyModel[336] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 384
		bodyModel[337] = new ModelRendererTurbo(this, 96, 91, textureX, textureY, "lamp"); // Box 385 lamp
		bodyModel[338] = new ModelRendererTurbo(this, 104, 91, textureX, textureY, "lamp"); // Box 386 lamp
		bodyModel[339] = new ModelRendererTurbo(this, 279, 116, textureX, textureY); // Box 387
		bodyModel[340] = new ModelRendererTurbo(this, 379, 107, textureX, textureY); // Box 114
		bodyModel[341] = new ModelRendererTurbo(this, 386, 100, textureX, textureY); // Box 74
		bodyModel[342] = new ModelRendererTurbo(this, 385, 108, textureX, textureY); // Box 78
		bodyModel[343] = new ModelRendererTurbo(this, 379, 101, textureX, textureY); // Box 877
		bodyModel[344] = new ModelRendererTurbo(this, 372, 105, textureX, textureY); // Box 332
		bodyModel[345] = new ModelRendererTurbo(this, 367, 105, textureX, textureY); // Box 333
		bodyModel[346] = new ModelRendererTurbo(this, 390, 96, textureX, textureY); // Box 394
		bodyModel[347] = new ModelRendererTurbo(this, 390, 104, textureX, textureY); // Box 395
		bodyModel[348] = new ModelRendererTurbo(this, 393, 108, textureX, textureY); // Box 396
		bodyModel[349] = new ModelRendererTurbo(this, 400, 103, textureX, textureY); // Box 397
		bodyModel[350] = new ModelRendererTurbo(this, 363, 101, textureX, textureY); // Box 398
		bodyModel[351] = new ModelRendererTurbo(this, 364, 97, textureX, textureY); // Box 399
		bodyModel[352] = new ModelRendererTurbo(this, 392, 81, textureX, textureY, "lamp"); // Box 400 lamp
		bodyModel[353] = new ModelRendererTurbo(this, 310, 90, textureX, textureY); // Box 401
		bodyModel[354] = new ModelRendererTurbo(this, 14, 45, textureX, textureY); // Box 402
		bodyModel[355] = new ModelRendererTurbo(this, 445, 62, textureX, textureY); // Box 42
		bodyModel[356] = new ModelRendererTurbo(this, 460, 67, textureX, textureY); // Box 359
		bodyModel[357] = new ModelRendererTurbo(this, 408, 113, textureX, textureY); // Box 357
		bodyModel[358] = new ModelRendererTurbo(this, 409, 116, textureX, textureY); // Box 358
		bodyModel[359] = new ModelRendererTurbo(this, 403, 110, textureX, textureY); // Box 359
		bodyModel[360] = new ModelRendererTurbo(this, 408, 109, textureX, textureY); // Box 360
		bodyModel[361] = new ModelRendererTurbo(this, 407, 90, textureX, textureY); // Box 361
		bodyModel[362] = new ModelRendererTurbo(this, 402, 91, textureX, textureY, "lamp"); // Box 362 glow
		bodyModel[363] = new ModelRendererTurbo(this, 255, 72, textureX, textureY, "lamp"); // Box 363 liveryimg 3 glow
		bodyModel[364] = new ModelRendererTurbo(this, 268, 72, textureX, textureY, "lamp"); // Box 364 liveryimg 3 glow
		bodyModel[365] = new ModelRendererTurbo(this, 383, 89, textureX, textureY, "lamp"); // Box 365 glow
		bodyModel[366] = new ModelRendererTurbo(this, 428, 98, textureX, textureY); // Box 366
		bodyModel[367] = new ModelRendererTurbo(this, 252, 31, textureX, textureY); // Box 367

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, -6F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 88, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-44.5F, -6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(40.5F, -27F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(40.5F, -27F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[4].setRotationPoint(-20.5F, -8F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 61, 21, 14, 0F); // Box 34
		bodyModel[5].setRotationPoint(-20.5F, -27F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 18, 6, 16, 0F); // Box 112
		bodyModel[6].setRotationPoint(-8F, -3F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[7].setRotationPoint(-43.5F, -4F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[8].setRotationPoint(-47.51F, -6F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 246
		bodyModel[9].setRotationPoint(-47.5F, -4F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 247
		bodyModel[10].setRotationPoint(-47.5F, -4F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[11].setRotationPoint(-43.5F, -4F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[12].setRotationPoint(-43.5F, -6F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[13].setRotationPoint(-43.5F, -1F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[14].setRotationPoint(-43.5F, -1F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[15].setRotationPoint(-43.5F, -6F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[16].setRotationPoint(-47.51F, -14F, -8F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[17].setRotationPoint(-47.51F, -14F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[18].setRotationPoint(-47.5F, -8F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[19].setRotationPoint(-47.5F, -8F, -11F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[20].setRotationPoint(-51.5F, -2F, -1.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[21].setRotationPoint(-51.51F, -6F, -2F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 197
		bodyModel[22].setRotationPoint(-47.5F, -6F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[23].setRotationPoint(-47.5F, -14F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[24].setRotationPoint(-47.5F, -14F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[25].setRotationPoint(-48.5F, -14F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[26].setRotationPoint(-47.5F, -14F, 4F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[27].setRotationPoint(-47.5F, -14F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(-50.5F, 1F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[29].setRotationPoint(-50.5F, 0F, 2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[30].setRotationPoint(-50.5F, 2F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[31].setRotationPoint(-50.5F, 1F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[32].setRotationPoint(-51F, 0F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[33].setRotationPoint(-50.5F, 2F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[34].setRotationPoint(-48.5F, -2.5F, -2F);

		bodyModel[35].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[35].setRotationPoint(-42.5F, -6F, 7F);

		bodyModel[36].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[36].setRotationPoint(46.5F, -6F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 246
		bodyModel[37].setRotationPoint(46.51F, -4F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[38].setRotationPoint(41.5F, -4F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[39].setRotationPoint(41.5F, -4F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[40].setRotationPoint(41.5F, -6F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[41].setRotationPoint(41.5F, -6F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[42].setRotationPoint(41.5F, -1F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[43].setRotationPoint(41.5F, -1F, 7F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[44].setRotationPoint(43.5F, -6F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[45].setRotationPoint(41.5F, -4F, -3F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[46].setRotationPoint(46.5F, -2F, -1.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[47].setRotationPoint(46.5F, -14F, -8F);
		bodyModel[47].rotateAngleY = -3.14159265F;

		bodyModel[48].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[48].setRotationPoint(46.51F, -8F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[49].setRotationPoint(46.5F, -14F, 8F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[50].setRotationPoint(46.51F, -8F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[51].setRotationPoint(46.51F, -14F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[52].setRotationPoint(46.51F, -14F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[53].setRotationPoint(47.5F, -6F, -2F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[54].setRotationPoint(47.49F, -14F, -4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[55].setRotationPoint(46.49F, -14F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(46.5F, 1F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(46.5F, 0F, 2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[58].setRotationPoint(46.5F, 2F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[59].setRotationPoint(46.5F, 1F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[60].setRotationPoint(47F, 0F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[61].setRotationPoint(46.5F, 2F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[62].setRotationPoint(46.5F, -2.5F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[63].setRotationPoint(-47.5F, -4F, -3F);

		bodyModel[64].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[64].setRotationPoint(-32F, -24F, -10.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[65].setRotationPoint(-21.5F, -24F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[66].setRotationPoint(-31.5F, -24F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[67].setRotationPoint(-31.5F, -24F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[68].setRotationPoint(-32.5F, -24F, -7F);

		bodyModel[69].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[69].setRotationPoint(-21F, -24F, 10.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[70].setRotationPoint(-32.5F, -10F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 201
		bodyModel[71].setRotationPoint(46.51F, -4F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[72].setRotationPoint(46.5F, -6F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[73].setRotationPoint(46.5F, -6F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[74].setRotationPoint(46.49F, -14F, 4F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[75].setRotationPoint(46.5F, 1F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[76].setRotationPoint(-32.5F, -27F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[77].setRotationPoint(-21.5F, -27F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[78].setRotationPoint(-32.5F, -27F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48 lamp
		bodyModel[79].setRotationPoint(-34.5F, -27F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[80].setRotationPoint(-34.5F, -27F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[81].setRotationPoint(-34.5F, -27F, 1F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[82].setRotationPoint(-32.55F, -25.5F, -6F);
		bodyModel[82].rotateAngleY = 0.38397244F;

		bodyModel[83].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[83].setRotationPoint(-32.55F, -25.5F, 6F);
		bodyModel[83].rotateAngleY = -0.38397244F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[84].setRotationPoint(-35F, -27F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[85].setRotationPoint(-35F, -25F, -1F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[86].setRotationPoint(-21.5F, -27F, -7F);

		bodyModel[87].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[87].setRotationPoint(-31.5F, -27F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[88].setRotationPoint(-31.5F, -27F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[89].setRotationPoint(-31.5F, -27F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[90].setRotationPoint(-21.5F, -27F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[91].setRotationPoint(-32.5F, -27F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[92].setRotationPoint(46.5F, 2F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[93].setRotationPoint(-47.5F, 2F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[94].setRotationPoint(-47.5F, 1F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 229
		bodyModel[95].setRotationPoint(-42.5F, -5F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 230
		bodyModel[96].setRotationPoint(-42.5F, -5F, 7F);

		bodyModel[97].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 231
		bodyModel[97].setRotationPoint(11.5F, -5F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 232
		bodyModel[98].setRotationPoint(11.5F, -5F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 18, 4, 3, 0F); // Box 233
		bodyModel[99].setRotationPoint(-8F, -3F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[100].setRotationPoint(-8F, 1F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 18, 4, 3, 0F); // Box 235
		bodyModel[101].setRotationPoint(-8F, -3F, 8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 18, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 236
		bodyModel[102].setRotationPoint(-8F, 1F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[103].setRotationPoint(-5.5F, -5F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[104].setRotationPoint(-5.5F, -4F, 9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[105].setRotationPoint(-5.5F, -4F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[106].setRotationPoint(-5.5F, -5F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[107].setRotationPoint(-12.5F, -5F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[108].setRotationPoint(-12.5F, -5F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[109].setRotationPoint(10.5F, -5F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[110].setRotationPoint(10.5F, -5F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[111].setRotationPoint(-39.5F, -10F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 246
		bodyModel[112].setRotationPoint(-41.5F, -10F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[113].setRotationPoint(-43.5F, -14F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[114].setRotationPoint(-43.5F, -12F, -11.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[115].setRotationPoint(-43.5F, -16F, 10.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[116].setRotationPoint(-43.5F, -18F, 9F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[117].setRotationPoint(-47.5F, -5F, -8F);

		bodyModel[118].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 272
		bodyModel[118].setRotationPoint(-47.5F, 2F, -11F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 273
		bodyModel[119].setRotationPoint(-47.5F, -1F, -10F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[120].setRotationPoint(-47.5F, -3F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[121].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[122].setRotationPoint(-43.5F, -1F, -10F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 258
		bodyModel[123].setRotationPoint(-43.5F, -14F, -11F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 259
		bodyModel[124].setRotationPoint(-41.5F, -13F, -11F);

		bodyModel[125].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 260
		bodyModel[125].setRotationPoint(-35.5F, -18F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[126].setRotationPoint(-39.5F, -14F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 262
		bodyModel[127].setRotationPoint(-34.5F, -17F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 264
		bodyModel[128].setRotationPoint(-41.5F, -17F, 11F);

		bodyModel[129].addBox(0F, 0F, 0F, 11, 1, 0, 0F); // Box 265
		bodyModel[129].setRotationPoint(-43.5F, -18F, 11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[130].setRotationPoint(-49.5F, -6F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[131].setRotationPoint(-49.5F, -6F, 0F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[132].setRotationPoint(-20.5F, -16F, -10F);

		bodyModel[133].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[133].setRotationPoint(-17.5F, -19F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[134].setRotationPoint(-17.5F, -21F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[135].setRotationPoint(-18.5F, -28F, -6F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[136].setRotationPoint(-9.5F, -28.5F, -2.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[137].setRotationPoint(-10.5F, -27.5F, -4F);

		bodyModel[138].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[138].setRotationPoint(31.5F, -28.5F, -3F);

		bodyModel[139].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[139].setRotationPoint(23.5F, -28.5F, -3F);

		bodyModel[140].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[140].setRotationPoint(-4.5F, -28F, -3F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[141].setRotationPoint(15.5F, -28.5F, -3F);

		bodyModel[142].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[142].setRotationPoint(2.5F, -28F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[143].setRotationPoint(-40.5F, -10F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[144].setRotationPoint(-41.5F, -10F, -11F);

		bodyModel[145].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[145].setRotationPoint(-19.5F, -26.5F, -7.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[146].setRotationPoint(-19.5F, -26.5F, 6.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[147].setRotationPoint(42.5F, -12F, -11.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 288
		bodyModel[148].setRotationPoint(42.5F, -14F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[149].setRotationPoint(42.5F, -12F, 10.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 290
		bodyModel[150].setRotationPoint(42.5F, -14F, 9F);

		bodyModel[151].addBox(0F, 0F, 0F, 58, 8, 0, 0F); // Box 291
		bodyModel[151].setRotationPoint(-15.5F, -14F, 11F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[152].setRotationPoint(-20.5F, -10F, 7F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[153].setRotationPoint(-18.5F, -10F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[154].setRotationPoint(-17.5F, -10F, 11F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[155].setRotationPoint(-20.5F, -18F, 11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[156].setRotationPoint(-19.5F, -16F, 11F);

		bodyModel[157].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 297
		bodyModel[157].setRotationPoint(27F, -26.5F, -7.25F);

		bodyModel[158].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 298
		bodyModel[158].setRotationPoint(13.5F, -26.5F, -7.25F);

		bodyModel[159].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 299
		bodyModel[159].setRotationPoint(27F, -26.5F, 6.25F);

		bodyModel[160].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 300
		bodyModel[160].setRotationPoint(13.5F, -26.5F, 6.25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[161].setRotationPoint(46.5F, -6F, 5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[162].setRotationPoint(-48.5F, -6F, 5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[163].setRotationPoint(-48.5F, -6F, -5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[164].setRotationPoint(-48.5F, -6F, -6F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[165].setRotationPoint(41.75F, -25F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[166].setRotationPoint(43F, -25F, -2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[167].setRotationPoint(43F, -25F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[168].setRotationPoint(-20.5F, -27F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[169].setRotationPoint(-10.5F, -27F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[170].setRotationPoint(-20.5F, -27F, 7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[171].setRotationPoint(-10.5F, -27F, 7F);

		bodyModel[172].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 312
		bodyModel[172].setRotationPoint(-17.5F, -16F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[173].setRotationPoint(-19.5F, -18F, -11F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[174].setRotationPoint(-20.5F, -18F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[175].setRotationPoint(19.5F, -16F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 21, 8, 0, 0F); // Box 316
		bodyModel[176].setRotationPoint(21.5F, -14F, -11F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[177].setRotationPoint(10.5F, -28F, -1F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[178].setRotationPoint(39.5F, -27.5F, -0.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 319
		bodyModel[179].setRotationPoint(-44.5F, -19.5F, -0.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 9, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[180].setRotationPoint(-45.5F, -15F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[181].setRotationPoint(-45.5F, -15F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[182].setRotationPoint(-44.5F, -19F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[183].setRotationPoint(-45.5F, -19F, 1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		bodyModel[184].setRotationPoint(-45.5F, -19F, -7F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 lamp
		bodyModel[185].setRotationPoint(-45.4F, -17.25F, -0.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 177 lamp
		bodyModel[186].setRotationPoint(-45.4F, -16F, -0.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[187].setRotationPoint(-43.4F, -17.5F, 5.5F);
		bodyModel[187].rotateAngleY = -0.43633231F;

		bodyModel[188].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[188].setRotationPoint(-43.4F, -17.5F, -5.5F);
		bodyModel[188].rotateAngleY = 0.43633231F;

		bodyModel[189].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 lamp
		bodyModel[189].setRotationPoint(-45.4F, -18.75F, -0.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		bodyModel[190].setRotationPoint(-45.5F, -16F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[191].setRotationPoint(-45.5F, -16F, -1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48 lamp
		bodyModel[192].setRotationPoint(-45.25F, -19F, -0.75F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[193].setRotationPoint(-42.5F, -19F, -7F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[194].setRotationPoint(-41.5F, -19F, -6F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[195].setRotationPoint(-41.5F, -19F, -7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[196].setRotationPoint(-41F, -14.5F, -7F);

		bodyModel[197].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[197].setRotationPoint(-40.5F, -12.5F, -7F);

		bodyModel[198].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[198].setRotationPoint(-39.5F, -19F, -7F);

		bodyModel[199].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[199].setRotationPoint(-41.5F, -15F, -7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[200].setRotationPoint(-4.5F, -27F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[201].setRotationPoint(-4.5F, -27F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[202].setRotationPoint(-9.5F, -27F, -9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[203].setRotationPoint(8.5F, -27F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[204].setRotationPoint(8.5F, -27F, 7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[205].setRotationPoint(-9.5F, -27F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 cnw bELL
		bodyModel[206].setRotationPoint(-45.5F, -19F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[207].setRotationPoint(-36.5F, -25F, -0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[208].setRotationPoint(-36.5F, -26F, -0.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[209].setRotationPoint(-36.25F, -24.5F, -0.25F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[210].setRotationPoint(-36.5F, -27F, -0.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[211].setRotationPoint(-29.5F, -29F, 2F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[212].setRotationPoint(-30.5F, -29F, 2F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 366
		bodyModel[213].setRotationPoint(-30.5F, -28F, 2F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 367
		bodyModel[214].setRotationPoint(-24.5F, -29F, -5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[215].setRotationPoint(10.5F, -28.5F, -7F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[216].setRotationPoint(9.5F, -29.5F, -6.75F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[217].setRotationPoint(8.5F, -29.5F, -5.25F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[218].setRotationPoint(-34F, -27.5F, -0.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[219].setRotationPoint(-35.5F, -28.5F, -1.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[220].setRotationPoint(-34F, -28.5F, -0.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[221].setRotationPoint(-34.75F, -28.5F, 0.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[222].setRotationPoint(-31.5F, -28F, -9F);

		bodyModel[223].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 390
		bodyModel[223].setRotationPoint(-31.5F, -28F, -9F);

		bodyModel[224].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 391
		bodyModel[224].setRotationPoint(-31.5F, -28F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 glow
		bodyModel[225].setRotationPoint(-31F, -30F, -8.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[226].setRotationPoint(-30.82F, -29F, -8.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[227].setRotationPoint(-13.5F, -3F, -10.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[228].setRotationPoint(-13.5F, -4F, -10.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[229].setRotationPoint(-13.25F, -2.5F, -10.25F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[230].setRotationPoint(-47.5F, -8F, 4.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[231].setRotationPoint(-47.5F, -8F, -6.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[232].setRotationPoint(-47.75F, -8F, 4.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[233].setRotationPoint(-47.75F, -8F, -6.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[234].setRotationPoint(45.5F, -8F, -6.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[235].setRotationPoint(45.75F, -8F, -6.75F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[236].setRotationPoint(45.75F, -8F, 4.75F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[237].setRotationPoint(45.5F, -8F, 4.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[238].setRotationPoint(-20.5F, -25F, -8.7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[239].setRotationPoint(-20.5F, -26F, -8.7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[240].setRotationPoint(-20.25F, -24.5F, -8.45F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[241].setRotationPoint(-20.5F, -27F, -8.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[242].setRotationPoint(-31.82F, -28F, -0.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow
		bodyModel[243].setRotationPoint(-32F, -29F, -0.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[244].setRotationPoint(-28.5F, -4F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[245].setRotationPoint(-28.5F, -4F, 7F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[246].setRotationPoint(25.5F, -4F, 7F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[247].setRotationPoint(25.5F, -4F, -11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[248].setRotationPoint(-25.5F, -28F, -5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 lamp
		bodyModel[249].setRotationPoint(-48.25F, -5F, -6.75F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[250].setRotationPoint(-48F, -5F, -6.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 lamp
		bodyModel[251].setRotationPoint(-48.25F, -5F, 4.75F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[252].setRotationPoint(-48F, -5F, 4.75F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[253].setRotationPoint(-30.5F, -24F, 11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[254].setRotationPoint(-30.5F, -24F, -12F);

		bodyModel[255].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[255].setRotationPoint(-31.5F, -22F, -12F);

		bodyModel[256].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[256].setRotationPoint(-31.5F, -22F, 11F);

		bodyModel[257].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[257].setRotationPoint(2F, -28.5F, -8.5F);

		bodyModel[258].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[258].setRotationPoint(3F, -28.25F, -7.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[259].setRotationPoint(2.5F, -28.25F, -9.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[260].setRotationPoint(4.5F, -27.5F, -8.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[261].setRotationPoint(3.5F, -29.5F, -7.75F);

		bodyModel[262].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[262].setRotationPoint(3.5F, -29.5F, -9F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[263].setRotationPoint(-16.5F, -29F, -3F);

		bodyModel[264].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[264].setRotationPoint(-31.6F, -18F, -5F);
		bodyModel[264].rotateAngleY = -0.38397244F;

		bodyModel[265].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[265].setRotationPoint(-31.5F, -19F, -4F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[266].setRotationPoint(-28.5F, -20F, -5.5F);
		bodyModel[266].rotateAngleY = -0.38397244F;

		bodyModel[267].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[267].setRotationPoint(-30.5F, -19.75F, -4F);
		bodyModel[267].rotateAngleY = -0.38397244F;

		bodyModel[268].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 450 extended tank
		bodyModel[268].setRotationPoint(-11F, -5F, -11F);

		bodyModel[269].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[269].setRotationPoint(-47.5F, -3F, 7F);

		bodyModel[270].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 452
		bodyModel[270].setRotationPoint(-47.5F, -5F, 7F);

		bodyModel[271].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 453
		bodyModel[271].setRotationPoint(-47.5F, -1F, 8F);

		bodyModel[272].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 454
		bodyModel[272].setRotationPoint(-47.5F, 2F, 9F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[273].setRotationPoint(-43.5F, 2F, 9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[274].setRotationPoint(-43.5F, -1F, 9F);

		bodyModel[275].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 319
		bodyModel[275].setRotationPoint(42.5F, 2F, 9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[276].setRotationPoint(41.5F, 2F, 9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 321
		bodyModel[277].setRotationPoint(41.5F, -1F, 9F);

		bodyModel[278].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 322
		bodyModel[278].setRotationPoint(42.5F, -1F, 8F);

		bodyModel[279].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 323
		bodyModel[279].setRotationPoint(42.5F, -3F, 7F);

		bodyModel[280].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 324
		bodyModel[280].setRotationPoint(42.5F, -5F, 7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 325
		bodyModel[281].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 326
		bodyModel[282].setRotationPoint(42.5F, 2F, -11F);

		bodyModel[283].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[283].setRotationPoint(42.5F, -1F, -10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 328
		bodyModel[284].setRotationPoint(41.5F, -1F, -10F);

		bodyModel[285].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 329
		bodyModel[285].setRotationPoint(42.5F, -3F, -9F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 330
		bodyModel[286].setRotationPoint(42.5F, -5F, -8F);

		bodyModel[287].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2 glow
		bodyModel[287].setRotationPoint(40.95F, -22F, -6F);
		bodyModel[287].rotateAngleY = -0.41887902F;

		bodyModel[288].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2 glow
		bodyModel[288].setRotationPoint(40.95F, -22F, 6F);
		bodyModel[288].rotateAngleY = 0.41887902F;

		bodyModel[289].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[289].setRotationPoint(-8F, -4F, -11.5F);
		bodyModel[289].rotateAngleX = 0.87266463F;

		bodyModel[290].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[290].setRotationPoint(-8F, -2.5F, 8.75F);
		bodyModel[290].rotateAngleX = 0.87266463F;

		bodyModel[291].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 335
		bodyModel[291].setRotationPoint(-11F, -3F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[292].setRotationPoint(-11F, 1F, -11F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 337
		bodyModel[293].setRotationPoint(-11F, -3F, -8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 338
		bodyModel[294].setRotationPoint(-11F, 1F, 8F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 339
		bodyModel[295].setRotationPoint(-11F, -3F, 8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow
		bodyModel[296].setRotationPoint(-28F, -29F, -0.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[297].setRotationPoint(-27.82F, -28F, -0.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[298].setRotationPoint(-26.5F, -2F, -1F);

		bodyModel[299].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[299].setRotationPoint(-33.5F, -2F, -1F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[300].setRotationPoint(30.5F, -2F, -1F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[301].setRotationPoint(23.5F, -2F, -1F);

		bodyModel[302].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 348
		bodyModel[302].setRotationPoint(-30F, -29F, -5F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 349
		bodyModel[303].setRotationPoint(-21.5F, -29F, -5F);

		bodyModel[304].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 350
		bodyModel[304].setRotationPoint(-24.5F, -29F, -5F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 351
		bodyModel[305].setRotationPoint(-24.5F, -29F, -1F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 352
		bodyModel[306].setRotationPoint(-21.5F, -29F, -1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[307].setRotationPoint(-24.5F, -30F, -3F);

		bodyModel[308].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[308].setRotationPoint(-35F, -28.5F, 4.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[309].setRotationPoint(-34F, -28.25F, 5.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[310].setRotationPoint(-34.5F, -28.25F, 3.5F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[311].setRotationPoint(-32.5F, -27.5F, 4.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 358 atsf 5700
		bodyModel[312].setRotationPoint(-20.5F, -15F, 11.05F);

		bodyModel[313].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 359 atsf 5700
		bodyModel[313].setRotationPoint(-20.5F, -15F, -11.05F);

		bodyModel[314].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 360
		bodyModel[314].setRotationPoint(-30.5F, -26F, -10F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 362
		bodyModel[315].setRotationPoint(-30.5F, -26F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 363
		bodyModel[316].setRotationPoint(-29.82F, -27F, -9.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 364 glow
		bodyModel[317].setRotationPoint(-30F, -28F, -9.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 365
		bodyModel[318].setRotationPoint(-30.5F, -26F, 10F);

		bodyModel[319].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 366
		bodyModel[319].setRotationPoint(-30.5F, -26F, 8F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 367
		bodyModel[320].setRotationPoint(-29.82F, -27F, 8.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 368 glow
		bodyModel[321].setRotationPoint(-30F, -28F, 8.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[322].setRotationPoint(-21.5F, -29F, 2F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[323].setRotationPoint(-21.5F, -29F, 2F);

		bodyModel[324].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[324].setRotationPoint(-21.5F, -29F, 6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[325].setRotationPoint(-21.5F, -30F, 4F);

		bodyModel[326].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[326].setRotationPoint(-18.5F, -29F, 6F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[327].setRotationPoint(-18.5F, -29F, 2F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[328].setRotationPoint(8.5F, -27F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 377
		bodyModel[329].setRotationPoint(8.5F, -27F, 7F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 26, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[330].setRotationPoint(13.5F, -27F, -9F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[331].setRotationPoint(39.5F, -27F, -9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 26, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 380
		bodyModel[332].setRotationPoint(13.5F, -27F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 381
		bodyModel[333].setRotationPoint(39.5F, -27F, 7F);

		bodyModel[334].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[334].setRotationPoint(-42.5F, -27F, -7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[335].setRotationPoint(-45.5F, -27F, -7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[336].setRotationPoint(-45.5F, -27F, 0F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 lamp
		bodyModel[337].setRotationPoint(-46F, -25F, 0F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 lamp
		bodyModel[338].setRotationPoint(-46F, -25F, -2F);

		bodyModel[339].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[339].setRotationPoint(-45.75F, -25F, -2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[340].setRotationPoint(-47F, -28F, -0.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[341].setRotationPoint(-47F, -29F, -0.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[342].setRotationPoint(-46.75F, -27.5F, -0.25F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[343].setRotationPoint(-46.75F, -29.51F, -1.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 332
		bodyModel[344].setRotationPoint(-46F, -29F, -1F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 333
		bodyModel[345].setRotationPoint(-46F, -29F, 1F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[346].setRotationPoint(44F, -29F, -0.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 395
		bodyModel[347].setRotationPoint(44F, -28F, -0.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 396
		bodyModel[348].setRotationPoint(43.75F, -27.5F, -0.25F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 397
		bodyModel[349].setRotationPoint(43.75F, -29.51F, -1.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 398
		bodyModel[350].setRotationPoint(42F, -29F, 1F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 399
		bodyModel[351].setRotationPoint(42F, -29F, -1F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 400 lamp
		bodyModel[352].setRotationPoint(-45.5F, -19.75F, -1F);

		bodyModel[353].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 401
		bodyModel[353].setRotationPoint(-45F, -19.75F, -1F);

		bodyModel[354].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 402
		bodyModel[354].setRotationPoint(-32F, -29F, 0F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		bodyModel[355].setRotationPoint(-45.5F, -19F, 0F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[356].setRotationPoint(-45.5F, -19F, -1F);

		bodyModel[357].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 357
		bodyModel[357].setRotationPoint(12.5F, -29F, 0.5F);

		bodyModel[358].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[358].setRotationPoint(13.25F, -29F, -0.5F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 359
		bodyModel[359].setRotationPoint(13.25F, -28F, -0.5F);

		bodyModel[360].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 360
		bodyModel[360].setRotationPoint(11.75F, -29F, -1.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 361
		bodyModel[361].setRotationPoint(38.18F, -28F, -5.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 362 glow
		bodyModel[362].setRotationPoint(38F, -29F, -5.5F);

		bodyModel[363].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 363 liveryimg 3 glow
		bodyModel[363].setRotationPoint(-43F, -22F, -6F);
		bodyModel[363].rotateAngleY = 0.40142573F;

		bodyModel[364].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 364 liveryimg 3 glow
		bodyModel[364].setRotationPoint(-43F, -22F, 6F);
		bodyModel[364].rotateAngleY = -0.40142573F;

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 365 glow
		bodyModel[365].setRotationPoint(-43F, -29F, 3.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 366
		bodyModel[366].setRotationPoint(-42.82F, -28F, 3.5F);

		bodyModel[367].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 367
		bodyModel[367].setRotationPoint(-42.5F, -27.5F, -0.5F);
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 357; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-2F, -0.32F, 0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.95F, -0.32F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo SD45dash2Model[];

}