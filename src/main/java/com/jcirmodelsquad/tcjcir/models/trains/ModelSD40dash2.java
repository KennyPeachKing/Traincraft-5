//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2019 - 14:12:15
// Last changed on: 27.03.2019 - 14:12:15

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSD40dash2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSD40dash2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[363];

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
		bodyModel[8] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 246
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 247
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 259
		bodyModel[12] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 262
		bodyModel[13] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 264
		bodyModel[14] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 265
		bodyModel[15] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 261
		bodyModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 143
		bodyModel[17] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 62
		bodyModel[18] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 61
		bodyModel[19] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 98
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
		bodyModel[57] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 4
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
		bodyModel[79] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 48 lamp except not
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
		bodyModel[112] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 246
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
		bodyModel[128] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 263
		bodyModel[129] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 264
		bodyModel[130] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 265
		bodyModel[131] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 266
		bodyModel[132] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 267
		bodyModel[133] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 268
		bodyModel[134] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 269
		bodyModel[135] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 270
		bodyModel[136] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 271
		bodyModel[137] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 272
		bodyModel[138] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 273
		bodyModel[139] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 274
		bodyModel[140] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 275
		bodyModel[141] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 276
		bodyModel[142] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 277
		bodyModel[143] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 278
		bodyModel[144] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 279
		bodyModel[145] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 280
		bodyModel[146] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 281
		bodyModel[147] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 282
		bodyModel[148] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 283
		bodyModel[149] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 284
		bodyModel[150] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 285
		bodyModel[151] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 286
		bodyModel[152] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 287
		bodyModel[153] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 288
		bodyModel[154] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 289
		bodyModel[155] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 290
		bodyModel[156] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 291
		bodyModel[157] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 292
		bodyModel[158] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 293
		bodyModel[159] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 294
		bodyModel[160] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 295
		bodyModel[161] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 296
		bodyModel[162] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 297
		bodyModel[163] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 298
		bodyModel[164] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 299
		bodyModel[165] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 300
		bodyModel[166] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 301
		bodyModel[167] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 302
		bodyModel[168] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 303
		bodyModel[169] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 304
		bodyModel[170] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 31 lamp but not really
		bodyModel[171] = new ModelRendererTurbo(this, 105, 65, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[172] = new ModelRendererTurbo(this, 257, 65, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[173] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 308
		bodyModel[174] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 309
		bodyModel[175] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 310
		bodyModel[176] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 311
		bodyModel[177] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 312
		bodyModel[178] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 313
		bodyModel[179] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 314
		bodyModel[180] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 315
		bodyModel[181] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 316
		bodyModel[182] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 317
		bodyModel[183] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 318
		bodyModel[184] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 319
		bodyModel[185] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 320 ptc forehead
		bodyModel[186] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 321 ptc forehead
		bodyModel[187] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 322 ptc forehead
		bodyModel[188] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 42
		bodyModel[189] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 45
		bodyModel[190] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 48 lamp except not
		bodyModel[191] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 42
		bodyModel[192] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 42
		bodyModel[193] = new ModelRendererTurbo(this, 369, 25, textureX, textureY, "lamp"); // Box 176 lamp
		bodyModel[194] = new ModelRendererTurbo(this, 33, 49, textureX, textureY, "lamp"); // Box 177 lamp
		bodyModel[195] = new ModelRendererTurbo(this, 105, 49, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[196] = new ModelRendererTurbo(this, 433, 49, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[197] = new ModelRendererTurbo(this, 505, 49, textureX, textureY, "lamp"); // Box 176 lamp
		bodyModel[198] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 42
		bodyModel[199] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 42
		bodyModel[200] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 48 lamp except not
		bodyModel[201] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 43
		bodyModel[202] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 43
		bodyModel[203] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 43
		bodyModel[204] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 43
		bodyModel[205] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 43
		bodyModel[206] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 345
		bodyModel[207] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 346 cover
		bodyModel[208] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 100
		bodyModel[209] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 101
		bodyModel[210] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 102
		bodyModel[211] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 103
		bodyModel[212] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 104
		bodyModel[213] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 105
		bodyModel[214] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 354 cnw bELL
		bodyModel[215] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 355
		bodyModel[216] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 356
		bodyModel[217] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 114
		bodyModel[218] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 74
		bodyModel[219] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 78
		bodyModel[220] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 245
		bodyModel[221] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 361
		bodyModel[222] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 362
		bodyModel[223] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 363
		bodyModel[224] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 364
		bodyModel[225] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 365
		bodyModel[226] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 366
		bodyModel[227] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 367
		bodyModel[228] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 368
		bodyModel[229] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 369
		bodyModel[230] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 370
		bodyModel[231] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 371
		bodyModel[232] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 372
		bodyModel[233] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 373
		bodyModel[234] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 374
		bodyModel[235] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 375
		bodyModel[236] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 376
		bodyModel[237] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 377
		bodyModel[238] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 378
		bodyModel[239] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 379
		bodyModel[240] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 380
		bodyModel[241] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 381
		bodyModel[242] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 382
		bodyModel[243] = new ModelRendererTurbo(this, 297, 81, textureX, textureY, "lamp"); // Box 383 glow
		bodyModel[244] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 384
		bodyModel[245] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 385
		bodyModel[246] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 386
		bodyModel[247] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 387
		bodyModel[248] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 388
		bodyModel[249] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 389
		bodyModel[250] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 390
		bodyModel[251] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 391
		bodyModel[252] = new ModelRendererTurbo(this, 377, 89, textureX, textureY, "lamp"); // Box 162 light
		bodyModel[253] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 165
		bodyModel[254] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 114
		bodyModel[255] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 74
		bodyModel[256] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 78
		bodyModel[257] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 78
		bodyModel[258] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 188
		bodyModel[259] = new ModelRendererTurbo(this, 193, 105, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[260] = new ModelRendererTurbo(this, 465, 105, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[261] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 239
		bodyModel[262] = new ModelRendererTurbo(this, 505, 105, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[263] = new ModelRendererTurbo(this, 137, 113, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[264] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 242
		bodyModel[265] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 114
		bodyModel[266] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 74
		bodyModel[267] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 78
		bodyModel[268] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 245
		bodyModel[269] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 409
		bodyModel[270] = new ModelRendererTurbo(this, 121, 113, textureX, textureY, "lamp"); // Box 410 glow
		bodyModel[271] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 411
		bodyModel[272] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 412
		bodyModel[273] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 413
		bodyModel[274] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 414
		bodyModel[275] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 415
		bodyModel[276] = new ModelRendererTurbo(this, 233, 113, textureX, textureY, "lamp"); // Box 416 lamp
		bodyModel[277] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 417
		bodyModel[278] = new ModelRendererTurbo(this, 249, 113, textureX, textureY, "lamp"); // Box 418 lamp
		bodyModel[279] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 419
		bodyModel[280] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // box64
		bodyModel[281] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // box65
		bodyModel[282] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 350
		bodyModel[283] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 351
		bodyModel[284] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 336
		bodyModel[285] = new ModelRendererTurbo(this, 425, 113, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[286] = new ModelRendererTurbo(this, 1, 121, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[287] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 327
		bodyModel[288] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 328
		bodyModel[289] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 329
		bodyModel[290] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 330
		bodyModel[291] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 331
		bodyModel[292] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 332
		bodyModel[293] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 894
		bodyModel[294] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 895
		bodyModel[295] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 202
		bodyModel[296] = new ModelRendererTurbo(this, 105, 121, textureX, textureY, "lamp"); // Box 438 lamp
		bodyModel[297] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 439
		bodyModel[298] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 440
		bodyModel[299] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 441
		bodyModel[300] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 442
		bodyModel[301] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 443
		bodyModel[302] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 444
		bodyModel[303] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 445
		bodyModel[304] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 86
		bodyModel[305] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 87
		bodyModel[306] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 86
		bodyModel[307] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 87
		bodyModel[308] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 450 extended tank
		bodyModel[309] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 451
		bodyModel[310] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 452
		bodyModel[311] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 453
		bodyModel[312] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 454
		bodyModel[313] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 455
		bodyModel[314] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 456
		bodyModel[315] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 319
		bodyModel[316] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 320
		bodyModel[317] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 321
		bodyModel[318] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 322
		bodyModel[319] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 323
		bodyModel[320] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 324
		bodyModel[321] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 325
		bodyModel[322] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 326
		bodyModel[323] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 327
		bodyModel[324] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 328
		bodyModel[325] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 329
		bodyModel[326] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 330
		bodyModel[327] = new ModelRendererTurbo(this, 25, 57, textureX, textureY, "lamp"); // Box 115 liveryimg 2 glow
		bodyModel[328] = new ModelRendererTurbo(this, 97, 57, textureX, textureY, "lamp"); // Box 116 liveryimg 2 glow
		bodyModel[329] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 19
		bodyModel[330] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 334
		bodyModel[331] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 335
		bodyModel[332] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 336
		bodyModel[333] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 337
		bodyModel[334] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 338
		bodyModel[335] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 339
		bodyModel[336] = new ModelRendererTurbo(this, 49, 129, textureX, textureY, "lamp"); // Box 340 glow
		bodyModel[337] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 341
		bodyModel[338] = new ModelRendererTurbo(this, 134, 107, textureX, textureY); // Box 629
		bodyModel[339] = new ModelRendererTurbo(this, 144, 107, textureX, textureY); // Box 630
		bodyModel[340] = new ModelRendererTurbo(this, 154, 107, textureX, textureY); // Box 726
		bodyModel[341] = new ModelRendererTurbo(this, 164, 107, textureX, textureY); // Box 727
		bodyModel[342] = new ModelRendererTurbo(this, 341, 125, textureX, textureY); // Box 382
		bodyModel[343] = new ModelRendererTurbo(this, 320, 132, textureX, textureY); // Box 383
		bodyModel[344] = new ModelRendererTurbo(this, 299, 132, textureX, textureY); // Box 384
		bodyModel[345] = new ModelRendererTurbo(this, 94, 91, textureX, textureY, "lamp"); // Box 385 lamp
		bodyModel[346] = new ModelRendererTurbo(this, 101, 91, textureX, textureY, "lamp"); // Box 386 lamp
		bodyModel[347] = new ModelRendererTurbo(this, 288, 127, textureX, textureY); // Box 387
		bodyModel[348] = new ModelRendererTurbo(this, 466, 67, textureX, textureY); // Box 42
		bodyModel[349] = new ModelRendererTurbo(this, 460, 67, textureX, textureY); // Box 359
		bodyModel[350] = new ModelRendererTurbo(this, 266, 72, textureX, textureY, "lamp"); // Box 350 liveryimg 3 glow
		bodyModel[351] = new ModelRendererTurbo(this, 253, 72, textureX, textureY, "lamp"); // Box 351 liveryimg 3 glow
		bodyModel[352] = new ModelRendererTurbo(this, 258, 30, textureX, textureY); // Box 352
		bodyModel[353] = new ModelRendererTurbo(this, 57, 108, textureX, textureY); // Box 354
		bodyModel[354] = new ModelRendererTurbo(this, 48, 108, textureX, textureY); // Box 355
		bodyModel[355] = new ModelRendererTurbo(this, 68, 107, textureX, textureY); // Box 356
		bodyModel[356] = new ModelRendererTurbo(this, 41, 108, textureX, textureY); // Box 357
		bodyModel[357] = new ModelRendererTurbo(this, 109, 83, textureX, textureY); // Box 369
		bodyModel[358] = new ModelRendererTurbo(this, 20, 46, textureX, textureY); // Box 370
		bodyModel[359] = new ModelRendererTurbo(this, 7, 47, textureX, textureY); // Box 371
		bodyModel[360] = new ModelRendererTurbo(this, 371, 47, textureX, textureY); // Box 372
		bodyModel[361] = new ModelRendererTurbo(this, 12, 12, textureX, textureY); // Box 373
		bodyModel[362] = new ModelRendererTurbo(this, 11, 7, textureX, textureY); // Box 374

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, -6F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 88, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-44.5F, -6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(37.5F, -27F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(37.5F, -27F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[4].setRotationPoint(-17.5F, -8F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 34
		bodyModel[5].setRotationPoint(-17.5F, -27F, -7F);

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
		bodyModel[64].setRotationPoint(-29F, -24F, -10.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[65].setRotationPoint(-18.5F, -24F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[66].setRotationPoint(-28.5F, -24F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[67].setRotationPoint(-28.5F, -24F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[68].setRotationPoint(-29.5F, -24F, -7F);

		bodyModel[69].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[69].setRotationPoint(-18F, -24F, 10.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[70].setRotationPoint(-29.5F, -10F, -11F);

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
		bodyModel[76].setRotationPoint(-29.5F, -27F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[77].setRotationPoint(-18.5F, -27F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[78].setRotationPoint(-29.5F, -27F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48 lamp
		bodyModel[79].setRotationPoint(-31.5F, -27F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[80].setRotationPoint(-31.5F, -27F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[81].setRotationPoint(-31.5F, -27F, 1F);

		bodyModel[82].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[82].setRotationPoint(-29.55F, -25.5F, -6F);
		bodyModel[82].rotateAngleY = 0.38397244F;

		bodyModel[83].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[83].setRotationPoint(-29.55F, -25.5F, 6F);
		bodyModel[83].rotateAngleY = -0.38397244F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[84].setRotationPoint(-32F, -27F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[85].setRotationPoint(-32F, -25F, -1F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[86].setRotationPoint(-18.5F, -27F, -7F);

		bodyModel[87].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[87].setRotationPoint(-28.5F, -27F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[88].setRotationPoint(-28.5F, -27F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[89].setRotationPoint(-28.5F, -27F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[90].setRotationPoint(-18.5F, -27F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[91].setRotationPoint(-29.5F, -27F, 7F);

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
		bodyModel[111].setRotationPoint(-36.5F, -10F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[112].setRotationPoint(-36.5F, -10F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[113].setRotationPoint(-43.5F, -14F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[114].setRotationPoint(-43.5F, -12F, -11.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[115].setRotationPoint(-43.5F, -12F, 10.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[116].setRotationPoint(-43.5F, -14F, 9F);

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

		bodyModel[125].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 260
		bodyModel[125].setRotationPoint(-35.5F, -18F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[126].setRotationPoint(-39.5F, -14F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 262
		bodyModel[127].setRotationPoint(-34.5F, -17F, -11F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 263
		bodyModel[128].setRotationPoint(-34.5F, -17F, 11F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 264
		bodyModel[129].setRotationPoint(-41.5F, -13F, 11F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 265
		bodyModel[130].setRotationPoint(-43.5F, -14F, 11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[131].setRotationPoint(-39.5F, -14F, 11F);

		bodyModel[132].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 267
		bodyModel[132].setRotationPoint(-35.5F, -18F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[133].setRotationPoint(-49.5F, -6F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[134].setRotationPoint(-49.5F, -6F, 0F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[135].setRotationPoint(-17.5F, -16F, -10F);

		bodyModel[136].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[136].setRotationPoint(-14.5F, -19F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[137].setRotationPoint(-14.5F, -21F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[138].setRotationPoint(-15.5F, -28F, -6F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[139].setRotationPoint(-6.5F, -28.5F, -2.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[140].setRotationPoint(-7.5F, -27.5F, -4F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[141].setRotationPoint(30.5F, -28.5F, -3F);

		bodyModel[142].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[142].setRotationPoint(23.5F, -28.5F, -3F);

		bodyModel[143].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[143].setRotationPoint(-1.5F, -28F, -3F);

		bodyModel[144].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[144].setRotationPoint(16.5F, -28.5F, -3F);

		bodyModel[145].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[145].setRotationPoint(5.5F, -28F, -3F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[146].setRotationPoint(-37.5F, -10F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[147].setRotationPoint(-38.5F, -10F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[148].setRotationPoint(-38.5F, -10F, 11F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[149].setRotationPoint(-37.5F, -10F, 11F);

		bodyModel[150].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[150].setRotationPoint(-16.5F, -26.5F, -7.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[151].setRotationPoint(-16.5F, -26.5F, 6.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[152].setRotationPoint(42.5F, -12F, -11.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 288
		bodyModel[153].setRotationPoint(42.5F, -14F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[154].setRotationPoint(42.5F, -12F, 10.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 290
		bodyModel[155].setRotationPoint(42.5F, -14F, 9F);

		bodyModel[156].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 291
		bodyModel[156].setRotationPoint(-13.5F, -14F, 11F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[157].setRotationPoint(-17.5F, -10F, 7F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[158].setRotationPoint(-15.5F, -10F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[159].setRotationPoint(-14.5F, -10F, 11F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[160].setRotationPoint(-17.5F, -18F, 11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[161].setRotationPoint(-16.5F, -16F, 11F);

		bodyModel[162].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 297
		bodyModel[162].setRotationPoint(27F, -26.5F, -7.25F);

		bodyModel[163].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 298
		bodyModel[163].setRotationPoint(16.5F, -26.5F, -7.25F);

		bodyModel[164].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 299
		bodyModel[164].setRotationPoint(27F, -26.5F, 6.25F);

		bodyModel[165].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 300
		bodyModel[165].setRotationPoint(16.5F, -26.5F, 6.25F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[166].setRotationPoint(46.5F, -6F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[167].setRotationPoint(-48.5F, -6F, 5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[168].setRotationPoint(-48.5F, -6F, -5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[169].setRotationPoint(-48.5F, -6F, -6F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31 lamp
		bodyModel[170].setRotationPoint(38.75F, -25F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[171].setRotationPoint(40F, -25F, -2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[172].setRotationPoint(40F, -25F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[173].setRotationPoint(-17.5F, -27F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[174].setRotationPoint(-7.5F, -27F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[175].setRotationPoint(-17.5F, -27F, 7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[176].setRotationPoint(-7.5F, -27F, 7F);

		bodyModel[177].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 312
		bodyModel[177].setRotationPoint(-14.5F, -16F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[178].setRotationPoint(-16.5F, -18F, -11F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[179].setRotationPoint(-17.5F, -18F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[180].setRotationPoint(21.5F, -16F, -11F);

		bodyModel[181].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[181].setRotationPoint(23.5F, -14F, -11F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[182].setRotationPoint(13.5F, -28F, -1F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[183].setRotationPoint(38.5F, -27.5F, -0.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 319
		bodyModel[184].setRotationPoint(-40.5F, -19.5F, -0.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 320 ptc forehead
		bodyModel[185].setRotationPoint(-33.5F, -27F, -7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321 ptc forehead
		bodyModel[186].setRotationPoint(-34.5F, -27F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322 ptc forehead
		bodyModel[187].setRotationPoint(-34.5F, -27F, 0F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 9, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[188].setRotationPoint(-42.5F, -15F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[189].setRotationPoint(-42.5F, -15F, 0F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48 lamp
		bodyModel[190].setRotationPoint(-41.5F, -19F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[191].setRotationPoint(-42.5F, -19F, 1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		bodyModel[192].setRotationPoint(-42.5F, -19F, -7F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 lamp
		bodyModel[193].setRotationPoint(-42.4F, -17.25F, -0.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 177 lamp
		bodyModel[194].setRotationPoint(-42.4F, -16F, -0.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[195].setRotationPoint(-40.4F, -17.5F, 5.5F);
		bodyModel[195].rotateAngleY = -0.43633231F;

		bodyModel[196].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[196].setRotationPoint(-40.4F, -17.5F, -5.5F);
		bodyModel[196].rotateAngleY = 0.43633231F;

		bodyModel[197].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 lamp
		bodyModel[197].setRotationPoint(-42.4F, -18.75F, -0.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		bodyModel[198].setRotationPoint(-42.5F, -16F, 0F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[199].setRotationPoint(-42.5F, -16F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48 lamp
		bodyModel[200].setRotationPoint(-42.25F, -19F, -0.75F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[201].setRotationPoint(-39.5F, -19F, -7F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[202].setRotationPoint(-38.5F, -19F, -6F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[203].setRotationPoint(-38.5F, -19F, -7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[204].setRotationPoint(-38F, -14.5F, -7F);

		bodyModel[205].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[205].setRotationPoint(-37.5F, -12.5F, -7F);

		bodyModel[206].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[206].setRotationPoint(-36.5F, -19F, -7F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[207].setRotationPoint(-38.5F, -15F, -7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[208].setRotationPoint(-1.5F, -27F, -9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[209].setRotationPoint(-1.5F, -27F, 7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[210].setRotationPoint(-6.5F, -27F, -9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[211].setRotationPoint(11.5F, -27F, -9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[212].setRotationPoint(11.5F, -27F, 7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[213].setRotationPoint(-6.5F, -27F, 7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354 cnw bELL
		bodyModel[214].setRotationPoint(-42.5F, -19F, -1F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[215].setRotationPoint(-38.5F, -18F, -7.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[216].setRotationPoint(-37.5F, -17F, -7.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[217].setRotationPoint(-33.5F, -25F, -0.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[218].setRotationPoint(-33.5F, -26F, -0.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[219].setRotationPoint(-33.25F, -24.5F, -0.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[220].setRotationPoint(-33.5F, -27F, -0.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[221].setRotationPoint(-26.5F, -29F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[222].setRotationPoint(-27.5F, -29F, -6F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 363
		bodyModel[223].setRotationPoint(-27.5F, -28F, -6F);

		bodyModel[224].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[224].setRotationPoint(-26.5F, -29F, 2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[225].setRotationPoint(-27.5F, -29F, 2F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 366
		bodyModel[226].setRotationPoint(-27.5F, -28F, 2F);

		bodyModel[227].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // Box 367
		bodyModel[227].setRotationPoint(-26.5F, -28F, -9F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 368
		bodyModel[228].setRotationPoint(-26.5F, -28F, -9F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 369
		bodyModel[229].setRotationPoint(-21.5F, -28F, -9F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 370
		bodyModel[230].setRotationPoint(-21.5F, -28F, -7F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 371
		bodyModel[231].setRotationPoint(-26.5F, -28F, -7F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 372
		bodyModel[232].setRotationPoint(-21.5F, -28F, 7F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 373
		bodyModel[233].setRotationPoint(-26.5F, -28F, 7F);

		bodyModel[234].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // Box 374
		bodyModel[234].setRotationPoint(-26.5F, -28F, 7F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 375
		bodyModel[235].setRotationPoint(-26.5F, -28F, 9F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 376
		bodyModel[236].setRotationPoint(-21.5F, -28F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[237].setRotationPoint(-26.5F, -29F, 8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[238].setRotationPoint(-23.5F, -29F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[239].setRotationPoint(13.5F, -28.5F, -7F);

		bodyModel[240].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[240].setRotationPoint(12.5F, -29.5F, -6.75F);

		bodyModel[241].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[241].setRotationPoint(11.5F, -29.5F, -5.25F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 382
		bodyModel[242].setRotationPoint(-24F, -28F, -8F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383 glow
		bodyModel[243].setRotationPoint(-31F, -27.5F, -0.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[244].setRotationPoint(-32.5F, -29F, -1.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[245].setRotationPoint(-31F, -29F, -0.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[246].setRotationPoint(-31.75F, -29F, 0.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[247].setRotationPoint(-30.75F, -28.5F, -0.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 388
		bodyModel[248].setRotationPoint(-26.5F, -28.5F, 0F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[249].setRotationPoint(-28.5F, -28F, -9F);

		bodyModel[250].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 390
		bodyModel[250].setRotationPoint(-28.5F, -28F, -9F);

		bodyModel[251].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 391
		bodyModel[251].setRotationPoint(-28.5F, -28F, -7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 light
		bodyModel[252].setRotationPoint(-28F, -30F, -8.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[253].setRotationPoint(-27.82F, -29F, -8.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[254].setRotationPoint(-13.5F, -3F, -10.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[255].setRotationPoint(-13.5F, -4F, -10.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[256].setRotationPoint(-13.25F, -2.5F, -10.25F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[257].setRotationPoint(-47.5F, -8F, 4.75F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[258].setRotationPoint(-47.5F, -8F, -6.75F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[259].setRotationPoint(-47.75F, -8F, 4.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[260].setRotationPoint(-47.75F, -8F, -6.75F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[261].setRotationPoint(45.5F, -8F, -6.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[262].setRotationPoint(45.75F, -8F, -6.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[263].setRotationPoint(45.75F, -8F, 4.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[264].setRotationPoint(45.5F, -8F, 4.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[265].setRotationPoint(-17.5F, -25F, -8.7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[266].setRotationPoint(-17.5F, -26F, -8.7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[267].setRotationPoint(-17.25F, -24.5F, -8.45F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[268].setRotationPoint(-17.5F, -27F, -8.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[269].setRotationPoint(-28.82F, -28F, -0.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow
		bodyModel[270].setRotationPoint(-29F, -29F, -0.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[271].setRotationPoint(-28.5F, -4F, -11F);

		bodyModel[272].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[272].setRotationPoint(-28.5F, -4F, 7F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[273].setRotationPoint(25.5F, -4F, 7F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[274].setRotationPoint(25.5F, -4F, -11F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[275].setRotationPoint(-22.5F, -28F, -5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 lamp
		bodyModel[276].setRotationPoint(-48.25F, -5F, -6.75F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[277].setRotationPoint(-48F, -5F, -6.75F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 lamp
		bodyModel[278].setRotationPoint(-48.25F, -5F, 4.75F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[279].setRotationPoint(-48F, -5F, 4.75F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[280].setRotationPoint(-27.5F, -24F, 11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[281].setRotationPoint(-27.5F, -24F, -12F);

		bodyModel[282].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[282].setRotationPoint(-28.5F, -22F, -12F);

		bodyModel[283].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[283].setRotationPoint(-28.5F, -22F, 11F);

		bodyModel[284].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[284].setRotationPoint(-31.5F, -29F, -2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[285].setRotationPoint(-32.25F, -29F, 0F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[286].setRotationPoint(-32.25F, -29F, -2F);

		bodyModel[287].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[287].setRotationPoint(5F, -28.5F, -8.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[288].setRotationPoint(6F, -28.25F, -7.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[289].setRotationPoint(5.5F, -28.25F, -9.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[290].setRotationPoint(7.5F, -27.5F, -8.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[291].setRotationPoint(6.5F, -29.5F, -7.75F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[292].setRotationPoint(6.5F, -29.5F, -9F);

		bodyModel[293].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[293].setRotationPoint(34.5F, -29F, 4.5F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[294].setRotationPoint(34.5F, -28F, 4.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[295].setRotationPoint(35.5F, -29.5F, 3.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 438 lamp
		bodyModel[296].setRotationPoint(40F, -25F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[297].setRotationPoint(-13.5F, -29F, -3F);

		bodyModel[298].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 440
		bodyModel[298].setRotationPoint(-43.5F, -13F, -2F);

		bodyModel[299].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 441
		bodyModel[299].setRotationPoint(-44F, -12.5F, -0.5F);

		bodyModel[300].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 442
		bodyModel[300].setRotationPoint(-44F, -13.5F, -1.5F);

		bodyModel[301].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 443
		bodyModel[301].setRotationPoint(42F, -13.5F, -1.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 444
		bodyModel[302].setRotationPoint(41F, -12.5F, -0.5F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 445
		bodyModel[303].setRotationPoint(40.5F, -13F, -2F);

		bodyModel[304].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[304].setRotationPoint(-28.6F, -18F, -5F);
		bodyModel[304].rotateAngleY = -0.38397244F;

		bodyModel[305].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[305].setRotationPoint(-28.5F, -19F, -4F);

		bodyModel[306].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[306].setRotationPoint(-25.5F, -20F, -5.5F);
		bodyModel[306].rotateAngleY = -0.38397244F;

		bodyModel[307].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[307].setRotationPoint(-27.5F, -19.75F, -4F);
		bodyModel[307].rotateAngleY = -0.38397244F;

		bodyModel[308].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 450 extended tank
		bodyModel[308].setRotationPoint(-11F, -5F, -11F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[309].setRotationPoint(-47.5F, -3F, 7F);

		bodyModel[310].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 452
		bodyModel[310].setRotationPoint(-47.5F, -5F, 7F);

		bodyModel[311].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 453
		bodyModel[311].setRotationPoint(-47.5F, -1F, 8F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 454
		bodyModel[312].setRotationPoint(-47.5F, 2F, 9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[313].setRotationPoint(-43.5F, 2F, 9F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[314].setRotationPoint(-43.5F, -1F, 9F);

		bodyModel[315].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 319
		bodyModel[315].setRotationPoint(42.5F, 2F, 9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[316].setRotationPoint(41.5F, 2F, 9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 321
		bodyModel[317].setRotationPoint(41.5F, -1F, 9F);

		bodyModel[318].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 322
		bodyModel[318].setRotationPoint(42.5F, -1F, 8F);

		bodyModel[319].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 323
		bodyModel[319].setRotationPoint(42.5F, -3F, 7F);

		bodyModel[320].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 324
		bodyModel[320].setRotationPoint(42.5F, -5F, 7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 325
		bodyModel[321].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 326
		bodyModel[322].setRotationPoint(42.5F, 2F, -11F);

		bodyModel[323].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[323].setRotationPoint(42.5F, -1F, -10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 328
		bodyModel[324].setRotationPoint(41.5F, -1F, -10F);

		bodyModel[325].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 329
		bodyModel[325].setRotationPoint(42.5F, -3F, -9F);

		bodyModel[326].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 330
		bodyModel[326].setRotationPoint(42.5F, -5F, -8F);

		bodyModel[327].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2 glow
		bodyModel[327].setRotationPoint(37.95F, -22F, -6F);
		bodyModel[327].rotateAngleY = -0.41887902F;

		bodyModel[328].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2 glow
		bodyModel[328].setRotationPoint(37.95F, -22F, 6F);
		bodyModel[328].rotateAngleY = 0.41887902F;

		bodyModel[329].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[329].setRotationPoint(-8F, -4F, -11.5F);
		bodyModel[329].rotateAngleX = 0.87266463F;

		bodyModel[330].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[330].setRotationPoint(-8F, -2.5F, 8.75F);
		bodyModel[330].rotateAngleX = 0.87266463F;

		bodyModel[331].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 335
		bodyModel[331].setRotationPoint(-11F, -3F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[332].setRotationPoint(-11F, 1F, -11F);

		bodyModel[333].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 337
		bodyModel[333].setRotationPoint(-11F, -3F, -8F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 338
		bodyModel[334].setRotationPoint(-11F, 1F, 8F);

		bodyModel[335].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 339
		bodyModel[335].setRotationPoint(-11F, -3F, 8F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow
		bodyModel[336].setRotationPoint(-25F, -29F, -0.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[337].setRotationPoint(-24.82F, -28F, -0.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[338].setRotationPoint(-26.5F, -2F, -1F);

		bodyModel[339].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[339].setRotationPoint(-33.5F, -2F, -1F);

		bodyModel[340].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[340].setRotationPoint(30.5F, -2F, -1F);

		bodyModel[341].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[341].setRotationPoint(23.5F, -2F, -1F);

		bodyModel[342].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[342].setRotationPoint(-39.5F, -27F, -7F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[343].setRotationPoint(-42.5F, -27F, -7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[344].setRotationPoint(-42.5F, -27F, 0F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 lamp
		bodyModel[345].setRotationPoint(-43F, -25F, 0F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 lamp
		bodyModel[346].setRotationPoint(-43F, -25F, -2F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[347].setRotationPoint(-42.75F, -25F, -2F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		bodyModel[348].setRotationPoint(-42.5F, -19F, 0F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[349].setRotationPoint(-42.5F, -19F, -1F);

		bodyModel[350].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 350 liveryimg 3 glow
		bodyModel[350].setRotationPoint(-40F, -22F, 6F);
		bodyModel[350].rotateAngleY = -0.40142573F;

		bodyModel[351].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 351 liveryimg 3 glow
		bodyModel[351].setRotationPoint(-40F, -22F, -6F);
		bodyModel[351].rotateAngleY = 0.40142573F;

		bodyModel[352].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 352
		bodyModel[352].setRotationPoint(-39.5F, -27.5F, -0.5F);

		bodyModel[353].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[353].setRotationPoint(-42F, -29F, -5.5F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[354].setRotationPoint(-41F, -28.75F, -4.5F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[355].setRotationPoint(-41.5F, -28.75F, -6.5F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[356].setRotationPoint(-39.5F, -28F, -5.5F);

		bodyModel[357].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[357].setRotationPoint(-18.5F, -29F, 2F);

		bodyModel[358].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[358].setRotationPoint(-18.5F, -29F, 2F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[359].setRotationPoint(-18.5F, -29F, 6F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[360].setRotationPoint(-18.5F, -30F, 4F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[361].setRotationPoint(-15.5F, -29F, 6F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[362].setRotationPoint(-15.5F, -29F, 2F);
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 363; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Blue.png"));
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

	public ModelRendererTurbo SD40dash2Model[];

}