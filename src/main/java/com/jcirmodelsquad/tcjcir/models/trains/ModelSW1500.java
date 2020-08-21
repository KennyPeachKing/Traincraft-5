//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.06.2020 - 21:45:38
// Last changed on: 19.06.2020 - 21:45:38

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeASmol;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil2;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelSW1500 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSW1500() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[312];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1() {
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 53
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 146
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 246
		bodyModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 143
		bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 62
		bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 61
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 63
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 197
		bodyModel[11] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 144
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 226
		bodyModel[13] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 227
		bodyModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 45
		bodyModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 46
		bodyModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 47
		bodyModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 48
		bodyModel[19] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 49
		bodyModel[20] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 50
		bodyModel[21] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 55
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 62
		bodyModel[29] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 202
		bodyModel[30] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 204
		bodyModel[31] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 301
		bodyModel[32] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 66
		bodyModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 68
		bodyModel[35] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 5
		bodyModel[36] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 19
		bodyModel[37] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 20
		bodyModel[38] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 138
		bodyModel[39] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 240
		bodyModel[40] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 241
		bodyModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 242
		bodyModel[42] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 243
		bodyModel[43] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 244
		bodyModel[44] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 245
		bodyModel[45] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 246
		bodyModel[46] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 247
		bodyModel[47] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 248
		bodyModel[48] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 249
		bodyModel[49] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 250
		bodyModel[50] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 251
		bodyModel[51] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 252
		bodyModel[52] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 253
		bodyModel[53] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 254
		bodyModel[54] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 255
		bodyModel[55] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 256
		bodyModel[56] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 257
		bodyModel[57] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 258
		bodyModel[58] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 259
		bodyModel[59] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 260
		bodyModel[60] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 261
		bodyModel[61] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 262
		bodyModel[62] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 264
		bodyModel[63] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 265
		bodyModel[64] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 266
		bodyModel[65] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 267
		bodyModel[66] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 268
		bodyModel[67] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 269
		bodyModel[68] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 270
		bodyModel[69] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 271
		bodyModel[70] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 274
		bodyModel[71] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 275
		bodyModel[72] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 17
		bodyModel[73] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 47
		bodyModel[74] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 107
		bodyModel[75] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 279
		bodyModel[76] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 281
		bodyModel[77] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 282
		bodyModel[78] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 290
		bodyModel[79] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 291
		bodyModel[80] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 293
		bodyModel[81] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 294
		bodyModel[82] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 295
		bodyModel[83] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 298
		bodyModel[84] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 299
		bodyModel[85] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 301
		bodyModel[86] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 302
		bodyModel[87] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 303
		bodyModel[88] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 304
		bodyModel[89] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 305
		bodyModel[90] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 307
		bodyModel[91] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 315
		bodyModel[92] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 316
		bodyModel[93] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 318
		bodyModel[94] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 319
		bodyModel[95] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 320
		bodyModel[96] = new ModelRendererTurbo(this, 353, 17, textureX, textureY, "lamp"); // Box 385 lamp
		bodyModel[97] = new ModelRendererTurbo(this, 441, 17, textureX, textureY, "lamp"); // Box 386 lamp
		bodyModel[98] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 387
		bodyModel[99] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 326
		bodyModel[100] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 327
		bodyModel[101] = new ModelRendererTurbo(this, 361, 9, textureX, textureY, "lamp"); // Box 328 glow
		bodyModel[102] = new ModelRendererTurbo(this, 169, 17, textureX, textureY, "lamp"); // Box 328 glow
		bodyModel[103] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 330
		bodyModel[104] = new ModelRendererTurbo(this, 449, 17, textureX, textureY, "lamp"); // Box 331 lamp
		bodyModel[105] = new ModelRendererTurbo(this, 505, 17, textureX, textureY, "lamp"); // Box 332 lamp
		bodyModel[106] = new ModelRendererTurbo(this, 417, 25, textureX, textureY, "lamp"); // Box 333 lamp
		bodyModel[107] = new ModelRendererTurbo(this, 449, 25, textureX, textureY, "lamp"); // Box 334 lamp
		bodyModel[108] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 335
		bodyModel[109] = new ModelRendererTurbo(this, 505, 25, textureX, textureY, "lamp"); // Box 336 glow
		bodyModel[110] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 337 why are you like this SP
		bodyModel[111] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 338
		bodyModel[112] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 339
		bodyModel[113] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 340
		bodyModel[114] = new ModelRendererTurbo(this, 41, 9, textureX, textureY, "lamp"); // Box 341 liveryimg 2 glow
		bodyModel[115] = new ModelRendererTurbo(this, 505, 9, textureX, textureY, "lamp"); // Box 342 liveryimg 2 glow
		bodyModel[116] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 132
		bodyModel[117] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 135
		bodyModel[118] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 57
		bodyModel[119] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 350
		bodyModel[120] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 351
		bodyModel[121] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 352
		bodyModel[122] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 353
		bodyModel[123] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 354
		bodyModel[124] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 355
		bodyModel[125] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 356
		bodyModel[126] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 357
		bodyModel[127] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 358
		bodyModel[128] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 359
		bodyModel[129] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 360
		bodyModel[130] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 361
		bodyModel[131] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 362
		bodyModel[132] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 363
		bodyModel[133] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 364
		bodyModel[134] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 365
		bodyModel[135] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 315 door swing right
		bodyModel[136] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 61
		bodyModel[137] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 368
		bodyModel[138] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 369
		bodyModel[139] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 370
		bodyModel[140] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 371
		bodyModel[141] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 372
		bodyModel[142] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 283
		bodyModel[143] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 284
		bodyModel[144] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 375
		bodyModel[145] = new ModelRendererTurbo(this, 81, 33, textureX, textureY, "lamp"); // Box 376 liveryimg 2 glow
		bodyModel[146] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 377
		bodyModel[147] = new ModelRendererTurbo(this, 129, 33, textureX, textureY, "lamp"); // Box 378 lamp
		bodyModel[148] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 379
		bodyModel[149] = new ModelRendererTurbo(this, 241, 33, textureX, textureY, "lamp"); // Box 380 lamp
		bodyModel[150] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 381
		bodyModel[151] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 382
		bodyModel[152] = new ModelRendererTurbo(this, 505, 33, textureX, textureY, "lamp"); // Box 385 liveryimg 2 glow
		bodyModel[153] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 386
		bodyModel[154] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 33
		bodyModel[155] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 89
		bodyModel[156] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 395
		bodyModel[157] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 396
		bodyModel[158] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 397
		bodyModel[159] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 398
		bodyModel[160] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 399
		bodyModel[161] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 287
		bodyModel[162] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 288
		bodyModel[163] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 289
		bodyModel[164] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 290
		bodyModel[165] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 78
		bodyModel[166] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 188
		bodyModel[167] = new ModelRendererTurbo(this, 57, 41, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[168] = new ModelRendererTurbo(this, 73, 41, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[169] = new ModelRendererTurbo(this, 305, 41, textureX, textureY, "lamp"); // Box 416 lamp
		bodyModel[170] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 417
		bodyModel[171] = new ModelRendererTurbo(this, 201, 57, textureX, textureY, "lamp"); // Box 418 lamp
		bodyModel[172] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 419
		bodyModel[173] = new ModelRendererTurbo(this, 257, 57, textureX, textureY, "lamp"); // Box 180 lamp
		bodyModel[174] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 181
		bodyModel[175] = new ModelRendererTurbo(this, 393, 57, textureX, textureY, "lamp"); // Box 182 lamp
		bodyModel[176] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 183
		bodyModel[177] = new ModelRendererTurbo(this, 417, 57, textureX, textureY, "lamp"); // Box 184 lamp
		bodyModel[178] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 185
		bodyModel[179] = new ModelRendererTurbo(this, 433, 57, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[180] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 187
		bodyModel[181] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 188
		bodyModel[182] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 189
		bodyModel[183] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 190
		bodyModel[184] = new ModelRendererTurbo(this, 17, 65, textureX, textureY, "lamp"); // Box 193 liveryimg 3 glow
		bodyModel[185] = new ModelRendererTurbo(this, 33, 65, textureX, textureY, "lamp"); // Box 194 liveryimg 3 glow
		bodyModel[186] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 195
		bodyModel[187] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 196
		bodyModel[188] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 197
		bodyModel[189] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 198
		bodyModel[190] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 199
		bodyModel[191] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 200
		bodyModel[192] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 201
		bodyModel[193] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 202
		bodyModel[194] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 203
		bodyModel[195] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 204
		bodyModel[196] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 205
		bodyModel[197] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 206
		bodyModel[198] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 207
		bodyModel[199] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 208
		bodyModel[200] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 209
		bodyModel[201] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 210
		bodyModel[202] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 367
		bodyModel[203] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 368
		bodyModel[204] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 335
		bodyModel[205] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 336
		bodyModel[206] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 338
		bodyModel[207] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 339
		bodyModel[208] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 86
		bodyModel[209] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 87
		bodyModel[210] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 375
		bodyModel[211] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 376
		bodyModel[212] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 377
		bodyModel[213] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 261
		bodyModel[214] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 379
		bodyModel[215] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 380
		bodyModel[216] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 381
		bodyModel[217] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 382
		bodyModel[218] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 383
		bodyModel[219] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 384
		bodyModel[220] = new ModelRendererTurbo(this, 289, 65, textureX, textureY, "lamp"); // Box 385 lamp
		bodyModel[221] = new ModelRendererTurbo(this, 353, 65, textureX, textureY, "lamp"); // Box 386 lamp
		bodyModel[222] = new ModelRendererTurbo(this, 377, 65, textureX, textureY, "lamp"); // Box 387 lamp
		bodyModel[223] = new ModelRendererTurbo(this, 321, 25, textureX, textureY, "lamp"); // Box 388 glow
		bodyModel[224] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 389
		bodyModel[225] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 390
		bodyModel[226] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 391
		bodyModel[227] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 392
		bodyModel[228] = new ModelRendererTurbo(this, 97, 73, textureX, textureY, "lamp"); // Box 393 lamp
		bodyModel[229] = new ModelRendererTurbo(this, 105, 73, textureX, textureY, "lamp"); // Box 394 lamp
		bodyModel[230] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, "lamp"); // Box 395 glow
		bodyModel[231] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 396
		bodyModel[232] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 397
		bodyModel[233] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 398
		bodyModel[234] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 399
		bodyModel[235] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 400
		bodyModel[236] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 401
		bodyModel[237] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 402
		bodyModel[238] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 403
		bodyModel[239] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 404
		bodyModel[240] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 405
		bodyModel[241] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 406
		bodyModel[242] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 364
		bodyModel[243] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 365
		bodyModel[244] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 366
		bodyModel[245] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 354
		bodyModel[246] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 355
		bodyModel[247] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 356
		bodyModel[248] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 357
		bodyModel[249] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 114
		bodyModel[250] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 74
		bodyModel[251] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 78
		bodyModel[252] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 245
		bodyModel[253] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 418
		bodyModel[254] = new ModelRendererTurbo(this, 481, 81, textureX, textureY, "cull"); // Box 419
		bodyModel[255] = new ModelRendererTurbo(this, 497, 81, textureX, textureY, "cull"); // Box 420
		bodyModel[256] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 164
		bodyModel[257] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 165
		bodyModel[258] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 166
		bodyModel[259] = new ModelRendererTurbo(this, 65, 41, textureX, textureY, "lamp"); // Box 162 glow
		bodyModel[260] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 165
		bodyModel[261] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 426
		bodyModel[262] = new ModelRendererTurbo(this, 81, 41, textureX, textureY, "lamp"); // Box 427 glow
		bodyModel[263] = new ModelRendererTurbo(this, 489, 41, textureX, textureY, "lamp"); // Box 428 glow
		bodyModel[264] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 429
		bodyModel[265] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 430
		bodyModel[266] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 360
		bodyModel[267] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 362
		bodyModel[268] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 363
		bodyModel[269] = new ModelRendererTurbo(this, 345, 49, textureX, textureY, "lamp"); // Box 364 glow
		bodyModel[270] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 365
		bodyModel[271] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 366
		bodyModel[272] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 367
		bodyModel[273] = new ModelRendererTurbo(this, 385, 49, textureX, textureY, "lamp"); // Box 368 glow
		bodyModel[274] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 439
		bodyModel[275] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 440
		bodyModel[276] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 353
		bodyModel[277] = new ModelRendererTurbo(this, 97, 57, textureX, textureY, "lamp"); // Box 383 glow
		bodyModel[278] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 384
		bodyModel[279] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 385
		bodyModel[280] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 386
		bodyModel[281] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 50 OPTIONAL
		bodyModel[282] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 175
		bodyModel[283] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 178
		bodyModel[284] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 179
		bodyModel[285] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 19
		bodyModel[286] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 334
		bodyModel[287] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 452
		bodyModel[288] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 453
		bodyModel[289] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 122
		bodyModel[290] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 123
		bodyModel[291] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 456
		bodyModel[292] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 457
		bodyModel[293] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 67
		bodyModel[294] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 70
		bodyModel[295] = new ModelRendererTurbo(this, 425, 89, textureX, textureY, "lamp"); // Box 71 glow
		bodyModel[296] = new ModelRendererTurbo(this, 473, 89, textureX, textureY, "lamp"); // Box 78 glow
		bodyModel[297] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 462
		bodyModel[298] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 463
		bodyModel[299] = new ModelRendererTurbo(this, 509, 1, textureX, textureY); // Box 299
		bodyModel[300] = new ModelRendererTurbo(this, 502, 38, textureX, textureY); // Box 303
		bodyModel[301] = new ModelRendererTurbo(this, 482, 35, textureX, textureY); // Box 306
		bodyModel[302] = new ModelRendererTurbo(this, 26, 19, textureX, textureY); // Box 307
		bodyModel[303] = new ModelRendererTurbo(this, 13, 19, textureX, textureY); // Box 308
		bodyModel[304] = new ModelRendererTurbo(this, 482, 26, textureX, textureY); // Box 309
		bodyModel[305] = new ModelRendererTurbo(this, 32, 43, textureX, textureY); // Box 310 nasa cap
		bodyModel[306] = new ModelRendererTurbo(this, 32, 43, textureX, textureY); // Box 311 nasa cap
		bodyModel[307] = new ModelRendererTurbo(this, 11, 43, textureX, textureY); // Box 312
		bodyModel[308] = new ModelRendererTurbo(this, 11, 43, textureX, textureY); // Box 313
		bodyModel[309] = new ModelRendererTurbo(this, 10, 44, textureX, textureY); // Box 314
		bodyModel[310] = new ModelRendererTurbo(this, 65, 37, textureX, textureY, "lamp"); // Box 315 glow
		bodyModel[311] = new ModelRendererTurbo(this, 55, 38, textureX, textureY); // Box 316

		bodyModel[0].addBox(0F, 0F, 0F, 54, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-27F, -3F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 52
		bodyModel[1].setRotationPoint(-34F, 0F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 53
		bodyModel[2].setRotationPoint(32F, 0F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-32F, -0.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[4].setRotationPoint(31F, -0.5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 5, 20, 0F); // Box 246
		bodyModel[5].setRotationPoint(-31.01F, -1F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[6].setRotationPoint(-31.02F, -11F, -8F);
		bodyModel[6].rotateAngleY = -3.14159265F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[7].setRotationPoint(-31.02F, -11F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[8].setRotationPoint(-31.01F, -5F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[9].setRotationPoint(-31.01F, -5F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 62, 3, 14, 0F); // Box 197
		bodyModel[10].setRotationPoint(-31F, -3F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 0, 10, 16, 0F); // Box 144
		bodyModel[11].setRotationPoint(-31.01F, -11F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[12].setRotationPoint(-31.01F, 5F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[13].setRotationPoint(-31.01F, 4F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 54, 1, 4, 0F); // Box 40
		bodyModel[14].setRotationPoint(-27F, -3F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 45
		bodyModel[15].setRotationPoint(27F, -2F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[16].setRotationPoint(27F, -3F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 47
		bodyModel[17].setRotationPoint(27F, 2F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 48
		bodyModel[18].setRotationPoint(27F, 5F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[19].setRotationPoint(28F, 0F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[20].setRotationPoint(28F, -2F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 5, 20, 0F); // Box 55
		bodyModel[21].setRotationPoint(31.01F, -1F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 56
		bodyModel[22].setRotationPoint(31.01F, 4F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		bodyModel[23].setRotationPoint(31.01F, 5F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 10, 16, 0F); // Box 58
		bodyModel[24].setRotationPoint(31.01F, -11F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 59
		bodyModel[25].setRotationPoint(31.01F, -5F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[26].setRotationPoint(31F, -11F, 8F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[27].setRotationPoint(31.01F, -5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[28].setRotationPoint(31F, -11F, -8F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[29].setRotationPoint(31F, -3F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[30].setRotationPoint(31F, -3F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[31].setRotationPoint(31F, -3F, 4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[32].setRotationPoint(-32F, -3F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 67
		bodyModel[33].setRotationPoint(-32F, -3F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[34].setRotationPoint(-32F, -3F, -5F);

		bodyModel[35].addBox(0F, 0F, 0F, 27, 15, 14, 0F); // Box 5
		bodyModel[35].setRotationPoint(-24F, -18F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 30, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[36].setRotationPoint(-27F, -20F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 30, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[37].setRotationPoint(-27F, -20F, 1F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 138
		bodyModel[38].setRotationPoint(-28F, -16F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 15, 5, 22, 0F); // Box 240
		bodyModel[39].setRotationPoint(11F, -8F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 241
		bodyModel[40].setRotationPoint(27F, 0F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 242
		bodyModel[41].setRotationPoint(27F, 2F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[42].setRotationPoint(27F, 5F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 244
		bodyModel[43].setRotationPoint(28F, 0F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 245
		bodyModel[44].setRotationPoint(28F, -2F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[45].setRotationPoint(27F, -3F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[46].setRotationPoint(27F, -2F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[47].setRotationPoint(27F, 0F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[48].setRotationPoint(-31F, 0F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[49].setRotationPoint(-31F, -2F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[50].setRotationPoint(-28F, -3F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[51].setRotationPoint(-28F, -2F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F); // Box 253
		bodyModel[52].setRotationPoint(-28F, 0F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[53].setRotationPoint(-31F, 2F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[54].setRotationPoint(-31F, 5F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[55].setRotationPoint(-31F, 5F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[56].setRotationPoint(-31F, 2F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[57].setRotationPoint(-31F, 0F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[58].setRotationPoint(-31F, -2F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 260
		bodyModel[59].setRotationPoint(-28F, -3F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 261
		bodyModel[60].setRotationPoint(-28F, -2F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[61].setRotationPoint(-28F, 0F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[62].setRotationPoint(26F, -8F, -7F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 265
		bodyModel[63].setRotationPoint(26F, -6F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[64].setRotationPoint(26F, -6F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[65].setRotationPoint(26F, -8F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[66].setRotationPoint(26F, -8F, 7F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 269
		bodyModel[67].setRotationPoint(26F, -6F, 2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[68].setRotationPoint(26F, -8F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[69].setRotationPoint(26F, -6F, 7F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 274
		bodyModel[70].setRotationPoint(26F, -7F, -2F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 275
		bodyModel[71].setRotationPoint(26F, -5F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[72].setRotationPoint(3F, -19F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[73].setRotationPoint(3F, -19F, 1F);

		bodyModel[74].addBox(0F, 0F, 0F, 8, 14, 14, 0F); // Box 107
		bodyModel[74].setRotationPoint(3F, -17F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 279
		bodyModel[75].setRotationPoint(12F, -23F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 30, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[76].setRotationPoint(-27F, -20F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[77].setRotationPoint(3F, -18F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 290
		bodyModel[78].setRotationPoint(-29F, -20F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 291
		bodyModel[79].setRotationPoint(-29F, -20F, 1F);

		bodyModel[80].addBox(0F, 0F, 0F, 30, 1, 12, 0F); // Box 293
		bodyModel[80].setRotationPoint(-27F, -19F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[81].setRotationPoint(-27F, -19F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[82].setRotationPoint(-27F, -19F, 6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[83].setRotationPoint(-28F, -19F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[84].setRotationPoint(-28F, -19F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[85].setRotationPoint(-28F, -20F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[86].setRotationPoint(-28F, -20F, 1F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 303
		bodyModel[87].setRotationPoint(-29F, -19.51F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[88].setRotationPoint(-29F, -17.01F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 305
		bodyModel[89].setRotationPoint(-29F, -17.01F, 1F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 307
		bodyModel[90].setRotationPoint(-29F, -16.99F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[91].setRotationPoint(-29F, -20F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[92].setRotationPoint(-28F, -20F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[93].setRotationPoint(-28F, -20F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[94].setRotationPoint(-29F, -20F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 320
		bodyModel[95].setRotationPoint(-29F, -20F, 1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 lamp
		bodyModel[96].setRotationPoint(-29.5F, -19.25F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 lamp
		bodyModel[97].setRotationPoint(-29.5F, -19.25F, -2F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 387
		bodyModel[98].setRotationPoint(-29.25F, -19.25F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[99].setRotationPoint(3F, -18F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[100].setRotationPoint(3F, -18F, 6F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 328 glow
		bodyModel[101].setRotationPoint(-28.5F, -18.25F, -6.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 328 glow
		bodyModel[102].setRotationPoint(-28.5F, -18.25F, 5.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 330
		bodyModel[103].setRotationPoint(-28F, -19F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 331 lamp
		bodyModel[104].setRotationPoint(-28.5F, -19.25F, -5.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332 lamp
		bodyModel[105].setRotationPoint(-28.5F, -19.25F, -3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 333 lamp
		bodyModel[106].setRotationPoint(-29F, -19.25F, 1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 334 lamp
		bodyModel[107].setRotationPoint(-29F, -19.25F, 3.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 335
		bodyModel[108].setRotationPoint(-28F, -19F, 1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 336 glow
		bodyModel[109].setRotationPoint(-29.5F, -19.25F, -1F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 337 why are you like this SP
		bodyModel[110].setRotationPoint(-29F, -19.25F, -1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[111].setRotationPoint(-28F, -20F, -6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[112].setRotationPoint(-28F, -20F, 1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[113].setRotationPoint(-28F, -20F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341 liveryimg 2 glow
		bodyModel[114].setRotationPoint(-28.1F, -19F, -5.5F);
		bodyModel[114].rotateAngleY = 0.20943951F;

		bodyModel[115].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 342 liveryimg 2 glow
		bodyModel[115].setRotationPoint(-28.1F, -19F, 5.5F);
		bodyModel[115].rotateAngleY = -0.20943951F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		bodyModel[116].setRotationPoint(11F, -25.5F, 3F);

		bodyModel[117].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		bodyModel[117].setRotationPoint(11F, -25.5F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[118].setRotationPoint(11F, -25.5F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[119].setRotationPoint(11F, -24F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[120].setRotationPoint(11F, -24F, 9F);

		bodyModel[121].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 352
		bodyModel[121].setRotationPoint(12F, -23F, 10F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 353
		bodyModel[122].setRotationPoint(23F, -23F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 354
		bodyModel[123].setRotationPoint(23F, -23F, 3F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 355
		bodyModel[124].setRotationPoint(11F, -23F, -7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[125].setRotationPoint(10F, -25.5F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[126].setRotationPoint(10F, -24F, -11F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 358
		bodyModel[127].setRotationPoint(10F, -25.5F, -3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 359
		bodyModel[128].setRotationPoint(10F, -25.5F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 360
		bodyModel[129].setRotationPoint(10F, -24F, 9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[130].setRotationPoint(24F, -25.5F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[131].setRotationPoint(24F, -24F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 363
		bodyModel[132].setRotationPoint(24F, -25.5F, -3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 364
		bodyModel[133].setRotationPoint(24F, -25.5F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[134].setRotationPoint(24F, -24F, 9F);

		bodyModel[135].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 315 door swing right
		bodyModel[135].setRotationPoint(11.5F, -23F, -10.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[136].setRotationPoint(23F, -22F, -3F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 368
		bodyModel[137].setRotationPoint(11F, -24F, -9F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 369
		bodyModel[138].setRotationPoint(11F, -25F, -5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 370
		bodyModel[139].setRotationPoint(23F, -24F, -9F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 371
		bodyModel[140].setRotationPoint(23F, -25F, -5F);

		bodyModel[141].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 372
		bodyModel[141].setRotationPoint(8F, -8F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[142].setRotationPoint(6F, -8F, -11F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 284
		bodyModel[143].setRotationPoint(7F, -8F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 375
		bodyModel[144].setRotationPoint(7F, -6F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, -3F, 0, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 376 liveryimg 2 glow
		bodyModel[145].setRotationPoint(25.1F, -24F, 5.5F);
		bodyModel[145].rotateAngleY = 0.20943951F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[146].setRotationPoint(25F, -25F, 1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 378 lamp
		bodyModel[147].setRotationPoint(25.5F, -24.25F, 0F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 379
		bodyModel[148].setRotationPoint(25.25F, -24.25F, -2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 380 lamp
		bodyModel[149].setRotationPoint(25.5F, -24.25F, -2F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[150].setRotationPoint(24F, -25F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[151].setRotationPoint(25F, -25F, -6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 385 liveryimg 2 glow
		bodyModel[152].setRotationPoint(25.11F, -24F, -5.5F);
		bodyModel[152].rotateAngleY = -0.20943951F;

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 386
		bodyModel[153].setRotationPoint(23F, -23F, -3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 33
		bodyModel[154].setRotationPoint(1F, -25F, -1F);

		bodyModel[155].addBox(0F, 0F, 0F, 10, 5, 16, 0F); // Box 89
		bodyModel[155].setRotationPoint(-5F, 0F, -8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 395
		bodyModel[156].setRotationPoint(25F, -25.5F, 3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[157].setRotationPoint(25F, -25.5F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[158].setRotationPoint(24F, -25F, -6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[159].setRotationPoint(24F, -25F, 1F);

		bodyModel[160].addBox(0F, 0F, 0F, 39, 8, 0, 0F); // Box 399
		bodyModel[160].setRotationPoint(-28F, -11F, 11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[161].setRotationPoint(-28F, -9F, -11.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 0, 12, 3, 0F); // Box 288
		bodyModel[162].setRotationPoint(-28F, -11F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[163].setRotationPoint(-28F, -9F, 10.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 0, 12, 3, 0F); // Box 290
		bodyModel[164].setRotationPoint(-28F, -11F, 8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[165].setRotationPoint(-31F, -5F, 4.75F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[166].setRotationPoint(-31F, -5F, -6.75F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[167].setRotationPoint(-31.25F, -5F, 4.75F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[168].setRotationPoint(-31.25F, -5F, -6.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 lamp
		bodyModel[169].setRotationPoint(-32.25F, -3F, -6.75F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 417
		bodyModel[170].setRotationPoint(-32F, -3F, -6.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 lamp
		bodyModel[171].setRotationPoint(-32.25F, -3F, 4.75F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 419
		bodyModel[172].setRotationPoint(-32F, -3F, 4.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 180 lamp
		bodyModel[173].setRotationPoint(31.25F, -3F, -6.75F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 181
		bodyModel[174].setRotationPoint(31F, -3F, -6.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 182 lamp
		bodyModel[175].setRotationPoint(30.25F, -5F, -6.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[176].setRotationPoint(30F, -5F, -6.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 184 lamp
		bodyModel[177].setRotationPoint(31.25F, -3F, 4.75F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 185
		bodyModel[178].setRotationPoint(31F, -3F, 4.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[179].setRotationPoint(30.25F, -5F, 4.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 187
		bodyModel[180].setRotationPoint(30F, -5F, 4.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[181].setRotationPoint(9F, -26F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[182].setRotationPoint(9F, -26F, -6F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 190
		bodyModel[183].setRotationPoint(9F, -26F, 1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 193 liveryimg 3 glow
		bodyModel[184].setRotationPoint(10.8F, -25F, -5.5F);
		bodyModel[184].rotateAngleY = 0.40142573F;

		bodyModel[185].addShapeBox(0F, 0F, -4F, 0, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194 liveryimg 3 glow
		bodyModel[185].setRotationPoint(10.8F, -25F, 5.5F);
		bodyModel[185].rotateAngleY = -0.40142573F;

		bodyModel[186].addBox(0F, 0F, 0F, 1, 15, 14, 0F); // Box 195
		bodyModel[186].setRotationPoint(-27F, -18F, -7F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 196
		bodyModel[187].setRotationPoint(-26F, -18F, -7F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 10, 14, 0F); // Box 197
		bodyModel[188].setRotationPoint(-26F, -13F, -7F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 198
		bodyModel[189].setRotationPoint(-26F, -16F, -5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[190].setRotationPoint(-26F, -14F, -7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[191].setRotationPoint(-26F, -14F, 5F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 201
		bodyModel[192].setRotationPoint(-25.5F, -14F, -6.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 202
		bodyModel[193].setRotationPoint(-25.5F, -14F, 5.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[194].setRotationPoint(-31F, 4F, 9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[195].setRotationPoint(-31F, 1F, 8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[196].setRotationPoint(-31F, 1F, -8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[197].setRotationPoint(-31F, 4F, -9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 207
		bodyModel[198].setRotationPoint(28F, 4F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 208
		bodyModel[199].setRotationPoint(28F, 1F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 209
		bodyModel[200].setRotationPoint(28F, 1F, 8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 210
		bodyModel[201].setRotationPoint(28F, 4F, 9F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 367
		bodyModel[202].setRotationPoint(-19F, 0F, -2F);

		bodyModel[203].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 368
		bodyModel[203].setRotationPoint(15F, 0F, -2F);

		bodyModel[204].addBox(0F, 0F, 0F, 10, 3, 3, 0F); // Box 335
		bodyModel[204].setRotationPoint(-5F, 0F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[205].setRotationPoint(-5F, 3F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 338
		bodyModel[206].setRotationPoint(-5F, 3F, 8F);

		bodyModel[207].addBox(0F, 0F, 0F, 10, 3, 3, 0F); // Box 339
		bodyModel[207].setRotationPoint(-5F, 0F, 8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[208].setRotationPoint(-10F, -2F, 9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[209].setRotationPoint(-10F, -1F, 9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyModel[210].setRotationPoint(-10F, -1F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[211].setRotationPoint(-10F, -2F, -11F);

		bodyModel[212].addBox(0F, 0F, 0F, 34, 8, 0, 0F); // Box 377
		bodyModel[212].setRotationPoint(-28F, -11F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[213].setRotationPoint(6F, -11F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 379
		bodyModel[214].setRotationPoint(24F, -12F, -3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 380
		bodyModel[215].setRotationPoint(24F, -12F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[216].setRotationPoint(27F, -12F, -3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[217].setRotationPoint(27F, -12F, 3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 383
		bodyModel[218].setRotationPoint(-11F, -25F, -1F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 384
		bodyModel[219].setRotationPoint(25F, -24.25F, -1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 385 lamp
		bodyModel[220].setRotationPoint(25.5F, -24.25F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 386 lamp
		bodyModel[221].setRotationPoint(24F, -24.25F, -5.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 387 lamp
		bodyModel[222].setRotationPoint(24F, -24.25F, -3.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 388 glow
		bodyModel[223].setRotationPoint(24.5F, -23.25F, 5.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[224].setRotationPoint(24F, -24F, 6F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 390
		bodyModel[225].setRotationPoint(24F, -24F, 1F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[226].setRotationPoint(24F, -25F, -1F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 392
		bodyModel[227].setRotationPoint(24F, -24F, -6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 393 lamp
		bodyModel[228].setRotationPoint(24.5F, -24.25F, 3.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 lamp
		bodyModel[229].setRotationPoint(24.5F, -24.25F, 1.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 395 glow
		bodyModel[230].setRotationPoint(24.5F, -23.25F, -6.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[231].setRotationPoint(24F, -24F, -7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[232].setRotationPoint(24F, -25F, -6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[233].setRotationPoint(24F, -25F, 1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[234].setRotationPoint(25F, -22.01F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[235].setRotationPoint(25F, -22.01F, 1F);

		bodyModel[236].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 401
		bodyModel[236].setRotationPoint(24F, -21.99F, -1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 402
		bodyModel[237].setRotationPoint(25F, -25F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[238].setRotationPoint(25F, -25F, 1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[239].setRotationPoint(24F, -25F, 1F);

		bodyModel[240].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 405
		bodyModel[240].setRotationPoint(24F, -24.51F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
		bodyModel[241].setRotationPoint(24F, -25F, -6F);

		bodyModel[242].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[242].setRotationPoint(15.5F, -27.5F, -2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[243].setRotationPoint(21.5F, -27.5F, -2F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 366
		bodyModel[244].setRotationPoint(21.5F, -26.5F, -2F);

		bodyModel[245].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[245].setRotationPoint(9F, -27F, -0.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[246].setRotationPoint(10F, -26.75F, 0.5F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[247].setRotationPoint(9.5F, -26.75F, -1.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[248].setRotationPoint(11.5F, -26F, -0.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[249].setRotationPoint(-13F, -21.5F, -0.75F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[250].setRotationPoint(-13F, -22.5F, -0.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[251].setRotationPoint(-12.75F, -21F, -0.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[252].setRotationPoint(-13F, -23.5F, -0.550000000000001F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[253].setRotationPoint(-13F, -22.5F, 0.45F);

		bodyModel[254].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 419
		bodyModel[254].setRotationPoint(-11.5F, -26F, -1.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 420
		bodyModel[255].setRotationPoint(0.5F, -26F, -1.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
		bodyModel[256].setRotationPoint(8.5F, -24.5F, -0.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
		bodyModel[257].setRotationPoint(9.5F, -24.5F, -0.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[258].setRotationPoint(10.5F, -24.5F, -0.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 glow
		bodyModel[259].setRotationPoint(13.5F, -27.5F, -0.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[260].setRotationPoint(13.68F, -26.5F, -0.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 426
		bodyModel[261].setRotationPoint(18.68F, -26.5F, -0.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 427 glow
		bodyModel[262].setRotationPoint(18.5F, -27.5F, -0.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 428 glow
		bodyModel[263].setRotationPoint(22.5F, -27.5F, -0.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 429
		bodyModel[264].setRotationPoint(22.68F, -26.5F, -0.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 430
		bodyModel[265].setRotationPoint(16F, -27.5F, 0F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 360
		bodyModel[266].setRotationPoint(17.5F, -24.5F, -10F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 362
		bodyModel[267].setRotationPoint(17.5F, -24.5F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 363
		bodyModel[268].setRotationPoint(18.18F, -25.5F, -9.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 364 glow
		bodyModel[269].setRotationPoint(18F, -26.5F, -9.5F);

		bodyModel[270].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 365
		bodyModel[270].setRotationPoint(17.5F, -24.5F, 10F);

		bodyModel[271].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 366
		bodyModel[271].setRotationPoint(17.5F, -24.5F, 8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 367
		bodyModel[272].setRotationPoint(18.18F, -25.5F, 8.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 368 glow
		bodyModel[273].setRotationPoint(18F, -26.5F, 8.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 439
		bodyModel[274].setRotationPoint(17.5F, -24.5F, 8F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 440
		bodyModel[275].setRotationPoint(17.5F, -24.5F, -8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[276].setRotationPoint(22.5F, -26.5F, 0F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383 glow
		bodyModel[277].setRotationPoint(11F, -25F, 6.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[278].setRotationPoint(9.5F, -26F, 5.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[279].setRotationPoint(11F, -26F, 6.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[280].setRotationPoint(10.25F, -26F, 7.5F);

		bodyModel[281].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 50 OPTIONAL
		bodyModel[281].setRotationPoint(-34F, 5F, -11F);

		bodyModel[282].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 175
		bodyModel[282].setRotationPoint(-34F, 5F, 3F);

		bodyModel[283].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 178
		bodyModel[283].setRotationPoint(31.01F, 5F, 3F);

		bodyModel[284].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 179
		bodyModel[284].setRotationPoint(31.01F, 5F, -11F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[285].setRotationPoint(-4.5F, -1F, -11.5F);
		bodyModel[285].rotateAngleX = 0.87266463F;

		bodyModel[286].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[286].setRotationPoint(-4.5F, 0.5F, 8.75F);
		bodyModel[286].rotateAngleX = 0.87266463F;

		bodyModel[287].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 452
		bodyModel[287].setRotationPoint(-31.5F, -7F, -4.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 453
		bodyModel[288].setRotationPoint(30.5F, -7F, 2.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 122
		bodyModel[289].setRotationPoint(13F, -23F, 11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 123
		bodyModel[290].setRotationPoint(13F, -23F, -12F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 456
		bodyModel[291].setRotationPoint(-33F, 3.5F, -10F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 457
		bodyModel[292].setRotationPoint(31F, 3.5F, -10F);

		bodyModel[293].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 67
		bodyModel[293].setRotationPoint(10F, -16.98F, -1.5F);
		bodyModel[293].rotateAngleY = -0.48869219F;

		bodyModel[294].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
		bodyModel[294].setRotationPoint(12F, -17F, 3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow
		bodyModel[295].setRotationPoint(12F, -24F, -1F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 78 glow
		bodyModel[296].setRotationPoint(17F, -25F, -1F);

		bodyModel[297].addBox(0F, 0F, 0F, 2, 1, 23, 0F); // Box 462
		bodyModel[297].setRotationPoint(-18F, -2F, -11.5F);

		bodyModel[298].addBox(0F, 0F, 0F, 2, 1, 23, 0F); // Box 463
		bodyModel[298].setRotationPoint(16F, -2F, -11.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 299
		bodyModel[299].setRotationPoint(27.5F, -5F, 10F);

		bodyModel[300].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 303
		bodyModel[300].setRotationPoint(27.5F, -5F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[301].setRotationPoint(27.5F, -11F, 8F);

		bodyModel[302].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 307
		bodyModel[302].setRotationPoint(24.5F, -11F, 8F);

		bodyModel[303].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 308
		bodyModel[303].setRotationPoint(24.5F, -11F, -8F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 309
		bodyModel[304].setRotationPoint(27.5F, -11F, -11F);

		bodyModel[305].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 310 nasa cap
		bodyModel[305].setRotationPoint(1.75F, -26.5F, -1F);
		bodyModel[305].rotateAngleZ = -0.87266463F;

		bodyModel[306].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 311 nasa cap
		bodyModel[306].setRotationPoint(-10.25F, -26.5F, -1F);
		bodyModel[306].rotateAngleZ = -0.87266463F;

		bodyModel[307].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 312
		bodyModel[307].setRotationPoint(17F, -28F, -0.5F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 313
		bodyModel[308].setRotationPoint(17F, -28F, 0.5F);

		bodyModel[309].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 314
		bodyModel[309].setRotationPoint(17F, -28F, -0.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 315 glow
		bodyModel[310].setRotationPoint(17.03F, -30F, -0.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 316
		bodyModel[311].setRotationPoint(17.18F, -29F, -0.5F);
	}

	ModelFlexicoil2 theTrucks1 = new ModelFlexicoil2();
	ModelTypeASmol theTrucks2 = new ModelTypeASmol();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 312; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeasmol_Green.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.05, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 12 || entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.05, 0.13, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeasmol_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.0, 0.05, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.13, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}


//baby zombie used a nasty chicken plucker
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo SW1500Model[];

}