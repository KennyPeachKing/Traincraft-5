//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:23.02.2020 - 15:35:18
// Last changed on: 23.02.2020 - 15:35:18

package com.jcirmodelsquad.tcjcir.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

public class ModelH1044 extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public ModelH1044()
	{
		h1044Model = new ModelRendererTurbo[230];
		h1044Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		h1044Model[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		h1044Model[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		h1044Model[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 5
		h1044Model[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		h1044Model[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // box20
		h1044Model[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // box21
		h1044Model[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // box22
		h1044Model[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // box23
		h1044Model[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 20
		h1044Model[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // box03
		h1044Model[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // box05
		h1044Model[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // box06
		h1044Model[13] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // box07
		h1044Model[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // box08
		h1044Model[15] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // box24
		h1044Model[16] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // box25
		h1044Model[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // box26
		h1044Model[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // box27
		h1044Model[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // box28
		h1044Model[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // box29
		h1044Model[21] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // box48
		h1044Model[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box50
		h1044Model[23] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // box51
		h1044Model[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // box56
		h1044Model[25] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // box57
		h1044Model[26] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // box58
		h1044Model[27] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // box04
		h1044Model[28] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // box70
		h1044Model[29] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // box81
		h1044Model[30] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // box82
		h1044Model[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 134
		h1044Model[32] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 135
		h1044Model[33] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 217
		h1044Model[34] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 371
		h1044Model[35] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 372
		h1044Model[36] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 374
		h1044Model[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 375
		h1044Model[38] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 376
		h1044Model[39] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 377
		h1044Model[40] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 378
		h1044Model[41] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 379
		h1044Model[42] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 380
		h1044Model[43] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 381
		h1044Model[44] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 382
		h1044Model[45] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 383
		h1044Model[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 384
		h1044Model[47] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 385
		h1044Model[48] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 386
		h1044Model[49] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 387
		h1044Model[50] = new ModelRendererTurbo(this, 489, 17, textureX, textureY, "Lamp"); // Box 388 lamp
		h1044Model[51] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 389
		h1044Model[52] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 467
		h1044Model[53] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 468
		h1044Model[54] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // box31 smoke
		h1044Model[55] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // box32 smoke
		h1044Model[56] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 471
		h1044Model[57] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 472 
		h1044Model[58] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // box64
		h1044Model[59] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // box65
		h1044Model[60] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 478
		h1044Model[61] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 479
		h1044Model[62] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 480
		h1044Model[63] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 481
		h1044Model[64] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 482
		h1044Model[65] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 483
		h1044Model[66] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 484
		h1044Model[67] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 485
		h1044Model[68] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 486
		h1044Model[69] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 487
		h1044Model[70] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 488
		h1044Model[71] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 489
		h1044Model[72] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 490
		h1044Model[73] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 491
		h1044Model[74] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 492
		h1044Model[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 493
		h1044Model[76] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 494
		h1044Model[77] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 495
		h1044Model[78] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 496
		h1044Model[79] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 497
		h1044Model[80] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 498
		h1044Model[81] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 499
		h1044Model[82] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 500
		h1044Model[83] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 501
		h1044Model[84] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 502
		h1044Model[85] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 503
		h1044Model[86] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 504
		h1044Model[87] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 505
		h1044Model[88] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 506
		h1044Model[89] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 507
		h1044Model[90] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 508
		h1044Model[91] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 509
		h1044Model[92] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 510
		h1044Model[93] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 511
		h1044Model[94] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 512
		h1044Model[95] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 513
		h1044Model[96] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 514
		h1044Model[97] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 515
		h1044Model[98] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 516
		h1044Model[99] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 517
		h1044Model[100] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 518
		h1044Model[101] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 519
		h1044Model[102] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 520
		h1044Model[103] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 521
		h1044Model[104] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 522
		h1044Model[105] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 523
		h1044Model[106] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 524
		h1044Model[107] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 525
		h1044Model[108] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 526
		h1044Model[109] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 527
		h1044Model[110] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 528
		h1044Model[111] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 529
		h1044Model[112] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 530
		h1044Model[113] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 531
		h1044Model[114] = new ModelRendererTurbo(this, 241, 33, textureX, textureY, "Lamp"); // Box 532 lamp
		h1044Model[115] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 534
		h1044Model[116] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 535
		h1044Model[117] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 536
		h1044Model[118] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 537
		h1044Model[119] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 538
		h1044Model[120] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 539
		h1044Model[121] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 540
		h1044Model[122] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 541
		h1044Model[123] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 542
		h1044Model[124] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 543
		h1044Model[125] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 545
		h1044Model[126] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 546
		h1044Model[127] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 547
		h1044Model[128] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 548
		h1044Model[129] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 549
		h1044Model[130] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 550
		h1044Model[131] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 551
		h1044Model[132] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 552
		h1044Model[133] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 553
		h1044Model[134] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 554
		h1044Model[135] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 555
		h1044Model[136] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 708
		h1044Model[137] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 709
		h1044Model[138] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 710
		h1044Model[139] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 711
		h1044Model[140] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 712
		h1044Model[141] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 713
		h1044Model[142] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 792
		h1044Model[143] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 114
		h1044Model[144] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 74
		h1044Model[145] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 78
		h1044Model[146] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 875
		h1044Model[147] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 876
		h1044Model[148] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 877
		h1044Model[149] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 878
		h1044Model[150] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 879
		h1044Model[151] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 314 door swing right
		h1044Model[152] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 315 door swing right
		h1044Model[153] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 883
		h1044Model[154] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 884
		h1044Model[155] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 885
		h1044Model[156] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 886
		h1044Model[157] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 887
		h1044Model[158] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 888
		h1044Model[159] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 889
		h1044Model[160] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 890
		h1044Model[161] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 891
		h1044Model[162] = new ModelRendererTurbo(this, 441, 57, textureX, textureY, "Lamp"); // Box 162 light
		h1044Model[163] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 165
		h1044Model[164] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 894
		h1044Model[165] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 895
		h1044Model[166] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 896
		h1044Model[167] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 897 liveryimg 1
		h1044Model[168] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 898 liveryimg 1
		h1044Model[169] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 899 liveryimg 1
		h1044Model[170] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 900 liveryimg 1
		h1044Model[171] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 901 liveryimg 1
		h1044Model[172] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 902 liveryimg 2
		h1044Model[173] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 903 liveryimg 2
		h1044Model[174] = new ModelRendererTurbo(this, 300, 83, textureX, textureY); // Box 174
		h1044Model[175] = new ModelRendererTurbo(this, 264, 83, textureX, textureY); // Box 175
		h1044Model[176] = new ModelRendererTurbo(this, 220, 82, textureX, textureY); // Box 176
		h1044Model[177] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 177
		h1044Model[178] = new ModelRendererTurbo(this, 229, 91, textureX, textureY); // Box 178
		h1044Model[179] = new ModelRendererTurbo(this, 237, 89, textureX, textureY); // Box 179
		h1044Model[180] = new ModelRendererTurbo(this, 317, 89, textureX, textureY); // Box 180
		h1044Model[181] = new ModelRendererTurbo(this, 305, 91, textureX, textureY); // Box 181
		h1044Model[182] = new ModelRendererTurbo(this, 466, 70, textureX, textureY, "Lamp"); // Box 182 light
		h1044Model[183] = new ModelRendererTurbo(this, 504, 65, textureX, textureY); // Box 183
		h1044Model[184] = new ModelRendererTurbo(this, 212, 90, textureX, textureY); // Box 184
		h1044Model[185] = new ModelRendererTurbo(this, 181, 91, textureX, textureY); // Box 185
		h1044Model[186] = new ModelRendererTurbo(this, 394, 86, textureX, textureY); // Box 186
		h1044Model[187] = new ModelRendererTurbo(this, 262, 90, textureX, textureY); // Box 187
		h1044Model[188] = new ModelRendererTurbo(this, 244, 90, textureX, textureY); // Box 188
		h1044Model[189] = new ModelRendererTurbo(this, 329, 74, textureX, textureY); // Box 189
		h1044Model[190] = new ModelRendererTurbo(this, 2, 69, textureX, textureY); // Box 190
		h1044Model[191] = new ModelRendererTurbo(this, 329, 71, textureX, textureY); // Box 191
		h1044Model[192] = new ModelRendererTurbo(this, 329, 68, textureX, textureY); // Box 192
		h1044Model[193] = new ModelRendererTurbo(this, 457, 67, textureX, textureY, "Lamp"); // Box 193 light
		h1044Model[194] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 194
		h1044Model[195] = new ModelRendererTurbo(this, 12, 70, textureX, textureY); // Box 195
		h1044Model[196] = new ModelRendererTurbo(this, 15, 70, textureX, textureY); // Box 196
		h1044Model[197] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 197
		h1044Model[198] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 198
		h1044Model[199] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 199
		h1044Model[200] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 200
		h1044Model[201] = new ModelRendererTurbo(this, 322, 82, textureX, textureY); // Box 201
		h1044Model[202] = new ModelRendererTurbo(this, 291, 55, textureX, textureY); // Box 202
		h1044Model[203] = new ModelRendererTurbo(this, 257, 35, textureX, textureY); // Box 203
		h1044Model[204] = new ModelRendererTurbo(this, 268, 36, textureX, textureY); // Box 204
		h1044Model[205] = new ModelRendererTurbo(this, 54, 60, textureX, textureY); // Box 555
		h1044Model[206] = new ModelRendererTurbo(this, 186, 75, textureX, textureY); // Box 4
		h1044Model[207] = new ModelRendererTurbo(this, 148, 70, textureX, textureY); // Box 4
		h1044Model[208] = new ModelRendererTurbo(this, 154, 80, textureX, textureY); // Box 4
		h1044Model[209] = new ModelRendererTurbo(this, 190, 93, textureX, textureY); // Box 4
		h1044Model[210] = new ModelRendererTurbo(this, 165, 67, textureX, textureY); // Box 4
		h1044Model[211] = new ModelRendererTurbo(this, 205, 67, textureX, textureY); // Box 4
		h1044Model[212] = new ModelRendererTurbo(this, 111, 76, textureX, textureY); // Box 4
		h1044Model[213] = new ModelRendererTurbo(this, 120, 92, textureX, textureY); // Box 4
		h1044Model[214] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 4
		h1044Model[215] = new ModelRendererTurbo(this, 161, 95, textureX, textureY); // Box 4
		h1044Model[216] = new ModelRendererTurbo(this, 109, 64, textureX, textureY); // Box 4
		h1044Model[217] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 4
		h1044Model[218] = new ModelRendererTurbo(this, 10, 3, textureX, textureY); // Box 2
		h1044Model[219] = new ModelRendererTurbo(this, 94, 51, textureX, textureY); // Box 2
		h1044Model[220] = new ModelRendererTurbo(this, 329, 37, textureX, textureY); // Box 204
		h1044Model[221] = new ModelRendererTurbo(this, 314, 37, textureX, textureY); // Box 204
		h1044Model[222] = new ModelRendererTurbo(this, 278, 27, textureX, textureY); // Box 204
		h1044Model[223] = new ModelRendererTurbo(this, 302, 4, textureX, textureY); // Box 204
		h1044Model[224] = new ModelRendererTurbo(this, 251, 40, textureX, textureY); // Box 204
		h1044Model[225] = new ModelRendererTurbo(this, 296, 27, textureX, textureY); // Box 204
		h1044Model[226] = new ModelRendererTurbo(this, 441, 52, textureX, textureY, "Lamp"); // Box 162 light
		h1044Model[227] = new ModelRendererTurbo(this, 505, 61, textureX, textureY); // Box 165
		h1044Model[228] = new ModelRendererTurbo(this, 12, 67, textureX, textureY); // Box 196
		h1044Model[229] = new ModelRendererTurbo(this, 15, 67, textureX, textureY); // Box 196

		h1044Model[0].addBox(0F, 0F, 0F, 58, 3, 22, 0F); // Box 0
		h1044Model[0].setRotationPoint(-29F, -1F, -11F);

		h1044Model[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 2
		h1044Model[1].setRotationPoint(-35F, 2F, -1.5F);

		h1044Model[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		h1044Model[2].setRotationPoint(32F, 2F, -1.5F);

		h1044Model[3].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 5
		h1044Model[3].setRotationPoint(-32F, -1F, -6F);

		h1044Model[4].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 6
		h1044Model[4].setRotationPoint(-32.01F, -1F, -9F);

		h1044Model[5].addBox(0F, 0F, 0F, 1, 13, 18, 0F); // box20
		h1044Model[5].setRotationPoint(17F, -18F, -7F);

		h1044Model[6].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // box21
		h1044Model[6].setRotationPoint(18F, -18F, -11F);

		h1044Model[7].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // box22
		h1044Model[7].setRotationPoint(18F, -18F, 10F);

		h1044Model[8].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // box23
		h1044Model[8].setRotationPoint(28F, -18F, -11F);

		h1044Model[9].addBox(0F, 0F, 0F, 3, 3, 12, 0F); // Box 20
		h1044Model[9].setRotationPoint(29F, -1F, -6F);

		h1044Model[10].addBox(0F, 0F, 0F, 43, 20, 14, 0F); // box03
		h1044Model[10].setRotationPoint(-26F, -21F, -7F);

		h1044Model[11].addShapeBox(0F, 0F, 0F, 2, 19, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box05
		h1044Model[11].setRotationPoint(-29F, -20F, -3F);

		h1044Model[12].addShapeBox(0F, 0F, 0F, 2, 20, 4, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box06
		h1044Model[12].setRotationPoint(-29F, -21F, -7F);

		h1044Model[13].addShapeBox(0F, 0F, 0F, 2, 20, 4, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // box07
		h1044Model[13].setRotationPoint(-29F, -21F, 3F);

		h1044Model[14].addBox(0F, 0F, 0F, 46, 1, 6, 0F); // box08
		h1044Model[14].setRotationPoint(-17F, -22F, -3F);

		h1044Model[15].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // box24
		h1044Model[15].setRotationPoint(7F, -5F, -11F);

		h1044Model[16].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // box25
		h1044Model[16].setRotationPoint(7F, -5F, 7F);

		h1044Model[17].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box26
		h1044Model[17].setRotationPoint(5F, -5F, 11F);

		h1044Model[18].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box27
		h1044Model[18].setRotationPoint(5F, -5F, -11F);

		h1044Model[19].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // box28
		h1044Model[19].setRotationPoint(5F, -3F, 7F);

		h1044Model[20].addBox(0F, 0F, -14F, 2, 0, 4, 0F); // box29
		h1044Model[20].setRotationPoint(5F, -3F, 3F);

		h1044Model[21].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box48
		h1044Model[21].setRotationPoint(16F, -9F, -11F);

		h1044Model[22].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box50
		h1044Model[22].setRotationPoint(15F, -7F, -11F);

		h1044Model[23].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box51
		h1044Model[23].setRotationPoint(13F, -6F, -11F);

		h1044Model[24].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box56
		h1044Model[24].setRotationPoint(13F, -6F, 11F);

		h1044Model[25].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box57
		h1044Model[25].setRotationPoint(15F, -7F, 11F);

		h1044Model[26].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box58
		h1044Model[26].setRotationPoint(16F, -9F, 11F);

		h1044Model[27].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // box04
		h1044Model[27].setRotationPoint(-6F, 2F, -6F);

		h1044Model[28].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // box70
		h1044Model[28].setRotationPoint(-5F, 2F, -10F);

		h1044Model[29].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // box81
		h1044Model[29].setRotationPoint(5F, 1.5F, -8.5F);

		h1044Model[30].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // box82
		h1044Model[30].setRotationPoint(-6F, 1.5F, -8.5F);

		h1044Model[31].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 134
		h1044Model[31].setRotationPoint(-5F, 2F, -8.5F);

		h1044Model[32].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 135
		h1044Model[32].setRotationPoint(-5F, 2F, -8F);

		h1044Model[33].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 217
		h1044Model[33].setRotationPoint(-32F, -9F, -9F);

		h1044Model[34].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		h1044Model[34].setRotationPoint(17F, -19F, -11F);

		h1044Model[35].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		h1044Model[35].setRotationPoint(17F, -21F, -10F);

		h1044Model[36].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		h1044Model[36].setRotationPoint(-28F, -22F, -2F);

		h1044Model[37].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 375
		h1044Model[37].setRotationPoint(-26F, -22F, -3F);

		h1044Model[38].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		h1044Model[38].setRotationPoint(-17F, -22F, -7F);

		h1044Model[39].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		h1044Model[39].setRotationPoint(-17F, -22F, 3F);

		h1044Model[40].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 378
		h1044Model[40].setRotationPoint(-24F, -21.5F, -3F);

		h1044Model[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		h1044Model[41].setRotationPoint(-26F, -22F, -7F);

		h1044Model[42].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		h1044Model[42].setRotationPoint(-26F, -22F, 3F);

		h1044Model[43].addBox(0F, 0F, 0F, 1, 19, 14, 0F); // Box 381
		h1044Model[43].setRotationPoint(-27F, -20F, -7F);

		h1044Model[44].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 382
		h1044Model[44].setRotationPoint(-28F, -21F, -2F);

		h1044Model[45].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 383
		h1044Model[45].setRotationPoint(-27F, -21F, -3F);

		h1044Model[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		h1044Model[46].setRotationPoint(-27F, -21F, 3F);

		h1044Model[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		h1044Model[47].setRotationPoint(-27F, -21F, -7F);

		h1044Model[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		h1044Model[48].setRotationPoint(-28F, -21F, -3F);

		h1044Model[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		h1044Model[49].setRotationPoint(-28F, -21F, 2F);

		h1044Model[50].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 388 lamp
		h1044Model[50].setRotationPoint(-28.5F, -19F, -1.5F);

		h1044Model[51].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Box 389
		h1044Model[51].setRotationPoint(17F, -21F, -7F);

		h1044Model[52].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		h1044Model[52].setRotationPoint(17F, -21F, 7F);

		h1044Model[53].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		h1044Model[53].setRotationPoint(17F, -19F, 10F);

		h1044Model[54].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // box31 smoke
		h1044Model[54].setRotationPoint(-14F, -22.5F, -3F);

		h1044Model[55].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // box32 smoke
		h1044Model[55].setRotationPoint(-14F, -22.5F, 1F);

		h1044Model[56].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 471
		h1044Model[56].setRotationPoint(-14F, -23.5F, 1F);

		h1044Model[57].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 472 
		h1044Model[57].setRotationPoint(-14F, -23.5F, -3F);

		h1044Model[58].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		h1044Model[58].setRotationPoint(19.5F, -17F, 11F);

		h1044Model[59].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		h1044Model[59].setRotationPoint(19.5F, -17F, -12F);

		h1044Model[60].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 478
		h1044Model[60].setRotationPoint(-32F, -9F, -11F);

		h1044Model[61].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 479
		h1044Model[61].setRotationPoint(-32F, -7F, -11F);

		h1044Model[62].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		h1044Model[62].setRotationPoint(-32F, 0F, -11F);

		h1044Model[63].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 481
		h1044Model[63].setRotationPoint(-32F, 5F, -11F);

		h1044Model[64].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		h1044Model[64].setRotationPoint(-32F, 2F, -11F);

		h1044Model[65].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		h1044Model[65].setRotationPoint(-29F, 2F, -11F);

		h1044Model[66].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 484
		h1044Model[66].setRotationPoint(-29F, 5F, -11F);

		h1044Model[67].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 485
		h1044Model[67].setRotationPoint(-32F, 7F, -11F);

		h1044Model[68].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 486
		h1044Model[68].setRotationPoint(-32F, -1F, -8F);

		h1044Model[69].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 487
		h1044Model[69].setRotationPoint(-32F, 1F, -9F);

		h1044Model[70].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 488
		h1044Model[70].setRotationPoint(-32F, 4F, -10F);

		h1044Model[71].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 489
		h1044Model[71].setRotationPoint(-29F, 2F, -9F);

		h1044Model[72].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 490
		h1044Model[72].setRotationPoint(-32F, 4F, 8F);

		h1044Model[73].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 491
		h1044Model[73].setRotationPoint(-32F, 7F, 9F);

		h1044Model[74].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 492
		h1044Model[74].setRotationPoint(-32F, 5F, 9F);

		h1044Model[75].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		h1044Model[75].setRotationPoint(-32F, 2F, 9F);

		h1044Model[76].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		h1044Model[76].setRotationPoint(-29F, 2F, 7F);

		h1044Model[77].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		h1044Model[77].setRotationPoint(-29F, 2F, 9F);

		h1044Model[78].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 496
		h1044Model[78].setRotationPoint(-29F, 5F, 9F);

		h1044Model[79].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 497
		h1044Model[79].setRotationPoint(-32F, 1F, 6F);

		h1044Model[80].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 498
		h1044Model[80].setRotationPoint(-32F, -1F, 6F);

		h1044Model[81].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 499
		h1044Model[81].setRotationPoint(-32F, 0F, 9F);

		h1044Model[82].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 500
		h1044Model[82].setRotationPoint(-32F, -7F, 10F);

		h1044Model[83].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 501
		h1044Model[83].setRotationPoint(-32F, -9F, 9F);

		h1044Model[84].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 502
		h1044Model[84].setRotationPoint(-35F, 7F, -11F);

		h1044Model[85].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 503
		h1044Model[85].setRotationPoint(-35F, 7F, 3F);

		h1044Model[86].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 504
		h1044Model[86].setRotationPoint(32.01F, -1F, -9F);

		h1044Model[87].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 505
		h1044Model[87].setRotationPoint(32F, 7F, -11F);

		h1044Model[88].addBox(0F, 0F, 0F, 3, 0, 8, 0F); // Box 506
		h1044Model[88].setRotationPoint(32F, 7F, 3F);

		h1044Model[89].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 507
		h1044Model[89].setRotationPoint(32F, 5F, 9F);

		h1044Model[90].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		h1044Model[90].setRotationPoint(32F, 2F, 9F);

		h1044Model[91].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 509
		h1044Model[91].setRotationPoint(32F, 5F, -11F);

		h1044Model[92].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		h1044Model[92].setRotationPoint(32F, 2F, -11F);

		h1044Model[93].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		h1044Model[93].setRotationPoint(32F, 0F, -11F);

		h1044Model[94].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 512
		h1044Model[94].setRotationPoint(32F, -7F, -11F);

		h1044Model[95].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 513
		h1044Model[95].setRotationPoint(32F, -9F, -11F);

		h1044Model[96].addBox(0F, 0F, 0F, 0, 8, 18, 0F); // Box 514
		h1044Model[96].setRotationPoint(32F, -9F, -9F);

		h1044Model[97].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 515
		h1044Model[97].setRotationPoint(32F, -9F, 9F);

		h1044Model[98].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 516
		h1044Model[98].setRotationPoint(32F, -7F, 10F);

		h1044Model[99].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 517
		h1044Model[99].setRotationPoint(32F, 0F, 9F);

		h1044Model[100].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 518
		h1044Model[100].setRotationPoint(29F, 5F, 9F);

		h1044Model[101].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		h1044Model[101].setRotationPoint(29F, 2F, 9F);

		h1044Model[102].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		h1044Model[102].setRotationPoint(29F, 2F, 7F);

		h1044Model[103].addShapeBox(0F, 0F, 0F, 0, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 521
		h1044Model[103].setRotationPoint(29F, 2F, -9F);

		h1044Model[104].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		h1044Model[104].setRotationPoint(29F, 2F, -11F);

		h1044Model[105].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 523
		h1044Model[105].setRotationPoint(29F, 5F, -11F);

		h1044Model[106].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 524
		h1044Model[106].setRotationPoint(29F, 7F, -11F);

		h1044Model[107].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 525
		h1044Model[107].setRotationPoint(29F, 4F, -10F);

		h1044Model[108].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 526
		h1044Model[108].setRotationPoint(29F, 1F, -9F);

		h1044Model[109].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 527
		h1044Model[109].setRotationPoint(29F, -1F, -8F);

		h1044Model[110].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 528
		h1044Model[110].setRotationPoint(29F, 7F, 9F);

		h1044Model[111].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 529
		h1044Model[111].setRotationPoint(29F, 4F, 8F);

		h1044Model[112].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 530
		h1044Model[112].setRotationPoint(29F, 1F, 6F);

		h1044Model[113].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 531
		h1044Model[113].setRotationPoint(29F, -1F, 6F);

		h1044Model[114].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 532 lamp
		h1044Model[114].setRotationPoint(28.5F, -21F, -1.5F);

		h1044Model[115].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 534
		h1044Model[115].setRotationPoint(29F, -19F, 10F);

		h1044Model[116].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 535
		h1044Model[116].setRotationPoint(29F, -21F, 7F);

		h1044Model[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		h1044Model[117].setRotationPoint(29F, -19F, -11F);

		h1044Model[118].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 537
		h1044Model[118].setRotationPoint(29F, -21F, -10F);

		h1044Model[119].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		h1044Model[119].setRotationPoint(29F, -22F, -7F);

		h1044Model[120].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 539
		h1044Model[120].setRotationPoint(29F, -22F, 3F);

		h1044Model[121].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 540
		h1044Model[121].setRotationPoint(29F, -22F, -3F);

		h1044Model[122].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 541
		h1044Model[122].setRotationPoint(-29F, -7F, 11F);

		h1044Model[123].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 542
		h1044Model[123].setRotationPoint(-29F, -9F, 11F);

		h1044Model[124].addBox(0F, 0F, 0F, 31, 8, 0, 0F); // Box 543
		h1044Model[124].setRotationPoint(-27F, -9F, 11F);

		h1044Model[125].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 545
		h1044Model[125].setRotationPoint(-24F, -9F, 11F);

		h1044Model[126].addBox(0F, 0F, 0F, 12, 1, 0, 0F); // Box 546
		h1044Model[126].setRotationPoint(5F, -13F, 11F);

		h1044Model[127].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 547
		h1044Model[127].setRotationPoint(4F, -13F, 11F);

		h1044Model[128].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 548
		h1044Model[128].setRotationPoint(11F, -12F, 11F);

		h1044Model[129].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 549
		h1044Model[129].setRotationPoint(-24F, -9F, -11F);

		h1044Model[130].addBox(0F, 0F, 0F, 31, 8, 0, 0F); // Box 550
		h1044Model[130].setRotationPoint(-27F, -9F, -11F);

		h1044Model[131].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 551
		h1044Model[131].setRotationPoint(11F, -12F, -11F);

		h1044Model[132].addBox(0F, 0F, 0F, 12, 1, 0, 0F); // Box 552
		h1044Model[132].setRotationPoint(5F, -13F, -11F);

		h1044Model[133].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 553
		h1044Model[133].setRotationPoint(4F, -13F, -11F);

		h1044Model[134].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 554
		h1044Model[134].setRotationPoint(-29F, -9F, -11F);

		h1044Model[135].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 555
		h1044Model[135].setRotationPoint(-29F, -7F, -11F);

		h1044Model[136].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 708
		h1044Model[136].setRotationPoint(5F, 1.5F, 7.5F);

		h1044Model[137].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 709
		h1044Model[137].setRotationPoint(-5F, 2F, 8F);

		h1044Model[138].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 710
		h1044Model[138].setRotationPoint(-5F, 2F, 7.5F);

		h1044Model[139].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 711
		h1044Model[139].setRotationPoint(-5F, 2F, 6F);

		h1044Model[140].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 712
		h1044Model[140].setRotationPoint(-6F, 1.5F, 7.5F);

		h1044Model[141].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 713
		h1044Model[141].setRotationPoint(-20F, 2F, -2F);

		h1044Model[142].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 792
		h1044Model[142].setRotationPoint(16F, 2F, -2F);

		h1044Model[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		h1044Model[143].setRotationPoint(-30F, -21F, -0.5F);

		h1044Model[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		h1044Model[144].setRotationPoint(-30F, -22F, -0.5F);

		h1044Model[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		h1044Model[145].setRotationPoint(-29.75F, -20.5F, -0.25F);

		h1044Model[146].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		h1044Model[146].setRotationPoint(-30F, -22F, -1F);

		h1044Model[147].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		h1044Model[147].setRotationPoint(-30F, -22F, 1F);

		h1044Model[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		h1044Model[148].setRotationPoint(-29.75F, -22.25F, -1.5F);

		h1044Model[149].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 878
		h1044Model[149].setRotationPoint(17F, -5F, -11F);

		h1044Model[150].addBox(0F, 0F, 0F, 46, 0, 16, 0F); // Box 879
		h1044Model[150].setRotationPoint(-29F, -13F, -8F);

		h1044Model[151].addBox(-0.5F, 0F, -5.5F, 1, 13, 6, 0F); // Box 314 door swing right
		h1044Model[151].setRotationPoint(28.5F, -18F, 2.5F);

		h1044Model[152].addBox(-0.5F, 0F, -0.5F, 1, 13, 4, 0F); // Box 315 door swing right
		h1044Model[152].setRotationPoint(17.5F, -18F, -10.5F);

		h1044Model[153].addBox(0F, 0F, 0F, 1, 13, 8, 0F); // Box 883
		h1044Model[153].setRotationPoint(28F, -18F, 3F);

		h1044Model[154].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 884
		h1044Model[154].setRotationPoint(29F, -4F, -3F);

		h1044Model[155].addBox(0F, 0F, 0F, 1, 7, 6, 0F); // Box 885
		h1044Model[155].setRotationPoint(18F, -13F, -3F);

		h1044Model[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 886
		h1044Model[156].setRotationPoint(14F, -19F, 7.5F);

		h1044Model[157].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 887
		h1044Model[157].setRotationPoint(16F, -24F, -4F);

		h1044Model[158].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 888
		h1044Model[158].setRotationPoint(17F, -24F, -3F);

		h1044Model[159].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 889
		h1044Model[159].setRotationPoint(16F, -24F, -2F);

		h1044Model[160].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 890
		h1044Model[160].setRotationPoint(17.5F, -23F, -3F);

		h1044Model[161].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		h1044Model[161].setRotationPoint(19F, -23F, 3F);

		h1044Model[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		h1044Model[162].setRotationPoint(27.32F, -24F, -0.5F);

		h1044Model[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		h1044Model[163].setRotationPoint(27.5F, -23F, -0.5F);

		h1044Model[164].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		h1044Model[164].setRotationPoint(13F, -24F, -0.5F);

		h1044Model[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		h1044Model[165].setRotationPoint(15F, -23F, -0.5F);

		h1044Model[166].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 896
		h1044Model[166].setRotationPoint(-28.5F, -14F, -1.5F);

		h1044Model[167].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 897 liveryimg 1
		h1044Model[167].setRotationPoint(-28.1F, -21F, -2F);

		h1044Model[168].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 898 liveryimg 1
		h1044Model[168].setRotationPoint(29.05F, -20F, 2F);

		h1044Model[169].addBox(0F, 0F, 0F, 0, 2, 4, 0F); // Box 899 liveryimg 1
		h1044Model[169].setRotationPoint(29.05F, -20F, -6F);

		h1044Model[170].addBox(0F, 0F, 0F, 8, 4, 0, 0F); // Box 900 liveryimg 1
		h1044Model[170].setRotationPoint(19.05F, -10F, 11.05F);

		h1044Model[171].addBox(0F, 0F, 0F, 8, 4, 0, 0F); // Box 901 liveryimg 1
		h1044Model[171].setRotationPoint(19.05F, -10F, -11.05F);

		h1044Model[172].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 902 liveryimg 2
		h1044Model[172].setRotationPoint(-1.95F, -16F, -7.05F);

		h1044Model[173].addBox(0F, 0F, 0F, 4, 2, 0, 0F); // Box 903 liveryimg 2
		h1044Model[173].setRotationPoint(-1.95F, -16F, 7.05F);

		h1044Model[174].addShapeBox(0F, 0F, 0F, 8, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 174
		h1044Model[174].setRotationPoint(-25F, -22F, 3F);

		h1044Model[175].addShapeBox(0F, 0F, 0F, 8, 0, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		h1044Model[175].setRotationPoint(-25F, -22F, -7F);

		h1044Model[176].addBox(0F, 0F, 0F, 8, 0, 6, 0F); // Box 176
		h1044Model[176].setRotationPoint(-25F, -22F, -3F);

		h1044Model[177].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 177
		h1044Model[177].setRotationPoint(28.5F, -19.25F, 6.5F);

		h1044Model[178].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		h1044Model[178].setRotationPoint(29.05F, -10F, -11F);

		h1044Model[179].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		h1044Model[179].setRotationPoint(29.05F, -10F, 10F);

		h1044Model[180].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 180
		h1044Model[180].setRotationPoint(29.05F, 0F, 9F);

		h1044Model[181].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		h1044Model[181].setRotationPoint(29.05F, 0F, -11F);

		h1044Model[182].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182 light
		h1044Model[182].setRotationPoint(17.32F, -24F, -0.5F);

		h1044Model[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 183
		h1044Model[183].setRotationPoint(17.5F, -23F, -0.5F);

		h1044Model[184].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 184
		h1044Model[184].setRotationPoint(-14F, -21.5F, 1F);

		h1044Model[185].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 185
		h1044Model[185].setRotationPoint(-14F, -21.5F, -3F);

		h1044Model[186].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		h1044Model[186].setRotationPoint(-27.5F, -19F, -1.5F);

		h1044Model[187].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 187
		h1044Model[187].setRotationPoint(28.5F, -16F, 3.5F);

		h1044Model[188].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 188
		h1044Model[188].setRotationPoint(28.5F, -16F, -3.5F);

		h1044Model[189].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 189
		h1044Model[189].setRotationPoint(12F, -22F, 7.5F);

		h1044Model[190].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 190
		h1044Model[190].setRotationPoint(13F, -21F, 6.5F);

		h1044Model[191].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 191
		h1044Model[191].setRotationPoint(12F, -20F, 7.5F);

		h1044Model[192].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 192
		h1044Model[192].setRotationPoint(13F, -21F, 7.5F);

		h1044Model[193].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193 light
		h1044Model[193].setRotationPoint(11.32F, -24F, -0.5F);

		h1044Model[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 194
		h1044Model[194].setRotationPoint(11.5F, -23F, -0.5F);

		h1044Model[195].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 195
		h1044Model[195].setRotationPoint(15F, -24F, -2.5F);

		h1044Model[196].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		h1044Model[196].setRotationPoint(19F, -24F, 0F);

		h1044Model[197].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 197
		h1044Model[197].setRotationPoint(-15F, -24F, -4F);

		h1044Model[198].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 198
		h1044Model[198].setRotationPoint(-15F, -24F, -4F);

		h1044Model[199].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 199
		h1044Model[199].setRotationPoint(-15F, -24F, 3F);

		h1044Model[200].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 200
		h1044Model[200].setRotationPoint(-11F, -24F, 3F);

		h1044Model[201].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 201
		h1044Model[201].setRotationPoint(-11F, -24F, -4F);

		h1044Model[202].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 202
		h1044Model[202].setRotationPoint(14F, -24.5F, -1.5F);

		h1044Model[203].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 203
		h1044Model[203].setRotationPoint(-14F, -22.5F, -3F);

		h1044Model[204].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 204
		h1044Model[204].setRotationPoint(-14F, -22.5F, 1F);

		h1044Model[205].addShapeBox(0F, 0F, 0F, 4, 23, 0, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		h1044Model[205].setRotationPoint(-20F, -24F, -7.25F);

		h1044Model[206].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		h1044Model[206].setRotationPoint(-35F, 5F, 0F);

		h1044Model[207].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		h1044Model[207].setRotationPoint(-35F, 4F, 2F);

		h1044Model[208].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		h1044Model[208].setRotationPoint(-35F, 6F, 0F);

		h1044Model[209].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		h1044Model[209].setRotationPoint(-35F, 5F, -10F);

		h1044Model[210].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		h1044Model[210].setRotationPoint(-35.5F, 4F, -10F);

		h1044Model[211].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		h1044Model[211].setRotationPoint(-35F, 6F, -10F);

		h1044Model[212].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		h1044Model[212].setRotationPoint(32F, 5F, 0F);

		h1044Model[213].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		h1044Model[213].setRotationPoint(32F, 4F, 2F);

		h1044Model[214].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		h1044Model[214].setRotationPoint(32F, 6F, 0F);

		h1044Model[215].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		h1044Model[215].setRotationPoint(32F, 5F, -10F);

		h1044Model[216].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, -0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		h1044Model[216].setRotationPoint(32.5F, 4F, -10F);

		h1044Model[217].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		h1044Model[217].setRotationPoint(32F, 6F, -10F);

		h1044Model[218].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		h1044Model[218].setRotationPoint(-33F, 1.5F, -2F);

		h1044Model[219].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		h1044Model[219].setRotationPoint(32F, 1.5F, -2F);

		h1044Model[220].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		h1044Model[220].setRotationPoint(-14F, -23.5F, 1F);

		h1044Model[221].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 204
		h1044Model[221].setRotationPoint(-14F, -25.5F, 1F);

		h1044Model[222].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 204
		h1044Model[222].setRotationPoint(-15F, -24.5F, 0F);

		h1044Model[223].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		h1044Model[223].setRotationPoint(-14F, -23.5F, -3F);

		h1044Model[224].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 204
		h1044Model[224].setRotationPoint(-14F, -25.5F, -3F);

		h1044Model[225].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 204
		h1044Model[225].setRotationPoint(-15F, -24.5F, -4F);

		h1044Model[226].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 light
		h1044Model[226].setRotationPoint(21.32F, -26F, -0.5F);

		h1044Model[227].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		h1044Model[227].setRotationPoint(21.5F, -25F, -0.5F);

		h1044Model[228].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		h1044Model[228].setRotationPoint(21.35F, -24F, -0.5F);

		h1044Model[229].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 196
		h1044Model[229].setRotationPoint(21.35F, -24F, 0.5F);


	}

	ModelTypeA theTrucks = new ModelTypeA();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 230; i++) {
			if (h1044Model[i].boxName != null && h1044Model[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				h1044Model[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				h1044Model[i].render(f5);
			}
		}
		Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/typea.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-1F ,0.15F,0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(1.15F,0.15F,0);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo h1044Model[];
}