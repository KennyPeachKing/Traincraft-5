//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.04.2020 - 23:08:36
// Last changed on: 29.04.2020 - 23:08:36

package com.jcirmodelsquad.tcjcir.models;

import net.minecraft.client.Minecraft;
import tmt.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

public class ModelAlcoS2 extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public ModelAlcoS2()
	{
		alcos2Model = new ModelRendererTurbo[223];
		alcos2Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		alcos2Model[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 52
		alcos2Model[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		alcos2Model[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 50
		alcos2Model[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 175
		alcos2Model[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		alcos2Model[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		alcos2Model[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		alcos2Model[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		alcos2Model[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		alcos2Model[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		alcos2Model[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		alcos2Model[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
		alcos2Model[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
		alcos2Model[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 15
		alcos2Model[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 17
		alcos2Model[16] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 18
		alcos2Model[17] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		alcos2Model[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 21
		alcos2Model[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		alcos2Model[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 23
		alcos2Model[21] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 24
		alcos2Model[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 27
		alcos2Model[23] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 31
		alcos2Model[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 32
		alcos2Model[25] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 33
		alcos2Model[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		alcos2Model[27] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 36
		alcos2Model[28] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 37
		alcos2Model[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 38
		alcos2Model[30] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 39
		alcos2Model[31] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 41
		alcos2Model[32] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 42
		alcos2Model[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 43
		alcos2Model[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		alcos2Model[35] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 45
		alcos2Model[36] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 46
		alcos2Model[37] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 47
		alcos2Model[38] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 48
		alcos2Model[39] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 49
		alcos2Model[40] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 129
		alcos2Model[41] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 130
		alcos2Model[42] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 132
		alcos2Model[43] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 135
		alcos2Model[44] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 57
		alcos2Model[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 58
		alcos2Model[46] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 59
		alcos2Model[47] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 315 door swing right
		alcos2Model[48] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 61
		alcos2Model[49] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 62
		alcos2Model[50] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 63
		alcos2Model[51] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 64
		alcos2Model[52] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 65
		alcos2Model[53] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 66
		alcos2Model[54] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 67
		alcos2Model[55] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 68
		alcos2Model[56] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 69
		alcos2Model[57] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 71
		alcos2Model[58] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 78 lamp
		alcos2Model[59] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 79
		alcos2Model[60] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 80
		alcos2Model[61] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 81
		alcos2Model[62] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 82
		alcos2Model[63] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 83
		alcos2Model[64] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 84
		alcos2Model[65] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 85
		alcos2Model[66] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 86
		alcos2Model[67] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 87
		alcos2Model[68] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 88
		alcos2Model[69] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 89
		alcos2Model[70] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 90 lamp
		alcos2Model[71] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 92
		alcos2Model[72] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 93
		alcos2Model[73] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 94
		alcos2Model[74] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 95
		alcos2Model[75] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 96
		alcos2Model[76] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 97
		alcos2Model[77] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 98
		alcos2Model[78] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 99
		alcos2Model[79] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 100
		alcos2Model[80] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 101
		alcos2Model[81] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 102
		alcos2Model[82] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		alcos2Model[83] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 104
		alcos2Model[84] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 105
		alcos2Model[85] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 106
		alcos2Model[86] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 107
		alcos2Model[87] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 108
		alcos2Model[88] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
		alcos2Model[89] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 110
		alcos2Model[90] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 111
		alcos2Model[91] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 112
		alcos2Model[92] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 113
		alcos2Model[93] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 114
		alcos2Model[94] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 115
		alcos2Model[95] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 116
		alcos2Model[96] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 117
		alcos2Model[97] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 118
		alcos2Model[98] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 119
		alcos2Model[99] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 120
		alcos2Model[100] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 121
		alcos2Model[101] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 122
		alcos2Model[102] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 123
		alcos2Model[103] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 124
		alcos2Model[104] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 125
		alcos2Model[105] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 126
		alcos2Model[106] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 127
		alcos2Model[107] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 128
		alcos2Model[108] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 129
		alcos2Model[109] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 130
		alcos2Model[110] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 131
		alcos2Model[111] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 132
		alcos2Model[112] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 133
		alcos2Model[113] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 134
		alcos2Model[114] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 135
		alcos2Model[115] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 136
		alcos2Model[116] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 137
		alcos2Model[117] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 138
		alcos2Model[118] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 139
		alcos2Model[119] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 140
		alcos2Model[120] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 114
		alcos2Model[121] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 74
		alcos2Model[122] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 78
		alcos2Model[123] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 113
		alcos2Model[124] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 114
		alcos2Model[125] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 115
		alcos2Model[126] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 116
		alcos2Model[127] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 117
		alcos2Model[128] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 149 glow
		alcos2Model[129] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 150 glow
		alcos2Model[130] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 1
		alcos2Model[131] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 2
		alcos2Model[132] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 3
		alcos2Model[133] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 5
		alcos2Model[134] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 6
		alcos2Model[135] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 167
		alcos2Model[136] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 168
		alcos2Model[137] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 169
		alcos2Model[138] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 170
		alcos2Model[139] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 171
		alcos2Model[140] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 172
		alcos2Model[141] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 173
		alcos2Model[142] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 174
		alcos2Model[143] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 175
		alcos2Model[144] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 176
		alcos2Model[145] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 177
		alcos2Model[146] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 67
		alcos2Model[147] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 70
		alcos2Model[148] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 71
		alcos2Model[149] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 78 lantern
		alcos2Model[150] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 211 lamp
		alcos2Model[151] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 212
		alcos2Model[152] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 213
		alcos2Model[153] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 214 lamp
		alcos2Model[154] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 160 lamp
		alcos2Model[155] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 161
		alcos2Model[156] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 162
		alcos2Model[157] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 163 lamp
		alcos2Model[158] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 191
		alcos2Model[159] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 192
		alcos2Model[160] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 193
		alcos2Model[161] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 197
		alcos2Model[162] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 198
		alcos2Model[163] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 199
		alcos2Model[164] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 200
		alcos2Model[165] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 201
		alcos2Model[166] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 202
		alcos2Model[167] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 203
		alcos2Model[168] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 164
		alcos2Model[169] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 165
		alcos2Model[170] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 166
		alcos2Model[171] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 207
		alcos2Model[172] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 208
		alcos2Model[173] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 209
		alcos2Model[174] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 211
		alcos2Model[175] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 212
		alcos2Model[176] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 399
		alcos2Model[177] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 400
		alcos2Model[178] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 215
		alcos2Model[179] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 216
		alcos2Model[180] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 217
		alcos2Model[181] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // box64
		alcos2Model[182] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // box65
		alcos2Model[183] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 220 atsf stack
		alcos2Model[184] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 221
		alcos2Model[185] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 222
		alcos2Model[186] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 223
		alcos2Model[187] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 224
		alcos2Model[188] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 225
		alcos2Model[189] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 226
		alcos2Model[190] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 227
		alcos2Model[191] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 228
		alcos2Model[192] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 229
		alcos2Model[193] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 230
		alcos2Model[194] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 231
		alcos2Model[195] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 232
		alcos2Model[196] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 233
		alcos2Model[197] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 234 glow
		alcos2Model[198] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 235 glow
		alcos2Model[199] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 236
		alcos2Model[200] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 237
		alcos2Model[201] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 238
		alcos2Model[202] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 239
		alcos2Model[203] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 240
		alcos2Model[204] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 241
		alcos2Model[205] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 242
		alcos2Model[206] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 243
		alcos2Model[207] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 244
		alcos2Model[208] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 245
		alcos2Model[209] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 246
		alcos2Model[210] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 247
		alcos2Model[211] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 248
		alcos2Model[212] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 249
		alcos2Model[213] = new ModelRendererTurbo(this, 195, 4, textureX, textureY); // Box 250
		alcos2Model[214] = new ModelRendererTurbo(this, 195, 4, textureX, textureY); // Box 251
		alcos2Model[215] = new ModelRendererTurbo(this, 452, 44, textureX, textureY); // Box 114
		alcos2Model[216] = new ModelRendererTurbo(this, 505, 46, textureX, textureY); // Box 74
		alcos2Model[217] = new ModelRendererTurbo(this, 345, 46, textureX, textureY); // Box 78
		alcos2Model[218] = new ModelRendererTurbo(this, 153, 11, textureX, textureY); // Box 875
		alcos2Model[219] = new ModelRendererTurbo(this, 504, 14, textureX, textureY); // Box 876
		alcos2Model[220] = new ModelRendererTurbo(this, 429, 67, textureX, textureY); // Box 877
		alcos2Model[221] = new ModelRendererTurbo(this, 322, 45, textureX, textureY); // Box 221
		alcos2Model[222] = new ModelRendererTurbo(this, 322, 45, textureX, textureY); // Box 222

		alcos2Model[0].addBox(0F, 0F, 0F, 52, 2, 4, 0F); // Box 0
		alcos2Model[0].setRotationPoint(-26F, -4F, -11F);

		alcos2Model[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
		alcos2Model[1].setRotationPoint(-33F, 0F, -1.5F);

		alcos2Model[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		alcos2Model[2].setRotationPoint(-30F, -0.5F, -2F);

		alcos2Model[3].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 50
		alcos2Model[3].setRotationPoint(-32F, 5F, -11F);

		alcos2Model[4].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 175
		alcos2Model[4].setRotationPoint(-32F, 5F, 4F);

		alcos2Model[5].addBox(0F, 0F, 0F, 0, 5, 14, 0F); // Box 5
		alcos2Model[5].setRotationPoint(-29F, -2F, -7F);

		alcos2Model[6].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		alcos2Model[6].setRotationPoint(-29F, -2F, -10F);

		alcos2Model[7].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 7
		alcos2Model[7].setRotationPoint(-29F, 4F, -11F);

		alcos2Model[8].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 8
		alcos2Model[8].setRotationPoint(-26F, 4F, -11F);

		alcos2Model[9].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 9
		alcos2Model[9].setRotationPoint(-29F, 5F, -12F);

		alcos2Model[10].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 10
		alcos2Model[10].setRotationPoint(-29F, 3F, -10F);

		alcos2Model[11].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 12
		alcos2Model[11].setRotationPoint(-29F, 0.5F, -9F);

		alcos2Model[12].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 13
		alcos2Model[12].setRotationPoint(-29F, -2F, -8F);

		alcos2Model[13].addBox(0F, 0F, 0F, 58, 2, 14, 0F); // Box 14
		alcos2Model[13].setRotationPoint(-29F, -4F, -7F);

		alcos2Model[14].addBox(0F, 0F, 0F, 52, 2, 4, 0F); // Box 15
		alcos2Model[14].setRotationPoint(-26F, -4F, 7F);

		alcos2Model[15].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		alcos2Model[15].setRotationPoint(-29F, -2F, -3F);

		alcos2Model[16].addBox(0F, 0F, 0F, 48, 1, 10, 0F); // Box 18
		alcos2Model[16].setRotationPoint(-24F, -2F, -5F);

		alcos2Model[17].addBox(0F, 0F, 0F, 0, 5, 14, 0F); // Box 19
		alcos2Model[17].setRotationPoint(29F, -2F, -7F);

		alcos2Model[18].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 21
		alcos2Model[18].setRotationPoint(29F, 5F, -11F);

		alcos2Model[19].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 22
		alcos2Model[19].setRotationPoint(29F, 5F, 4F);

		alcos2Model[20].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 23
		alcos2Model[20].setRotationPoint(30F, 0F, -1.5F);

		alcos2Model[21].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		alcos2Model[21].setRotationPoint(29F, -0.5F, -2F);

		alcos2Model[22].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		alcos2Model[22].setRotationPoint(24F, -2F, -3F);

		alcos2Model[23].addBox(0F, 0F, 0F, 8, 6, 22, 0F); // Box 31
		alcos2Model[23].setRotationPoint(-4F, -2F, -11F);

		alcos2Model[24].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Box 32
		alcos2Model[24].setRotationPoint(-29F, -4F, -8F);

		alcos2Model[25].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		alcos2Model[25].setRotationPoint(-29F, -2F, 7F);

		alcos2Model[26].addBox(0F, 0F, 0F, 1, 15, 8, 0F); // Box 34
		alcos2Model[26].setRotationPoint(-25F, -19F, -4F);

		alcos2Model[27].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		alcos2Model[27].setRotationPoint(-25F, -19F, -7F);

		alcos2Model[28].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 37
		alcos2Model[28].setRotationPoint(-25F, -19F, 4F);

		alcos2Model[29].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		alcos2Model[29].setRotationPoint(-25F, -20F, -4F);

		alcos2Model[30].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 39
		alcos2Model[30].setRotationPoint(-25F, -20F, -7F);

		alcos2Model[31].addBox(0F, 0F, 0F, 37, 15, 14, 0F); // Box 41
		alcos2Model[31].setRotationPoint(-24F, -19F, -7F);

		alcos2Model[32].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Box 42
		alcos2Model[32].setRotationPoint(29F, -4F, -8F);

		alcos2Model[33].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		alcos2Model[33].setRotationPoint(29F, -2F, -10F);

		alcos2Model[34].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		alcos2Model[34].setRotationPoint(29F, -2F, 7F);

		alcos2Model[35].addBox(0F, 0F, 0F, 37, 1, 10, 0F); // Box 45
		alcos2Model[35].setRotationPoint(-24F, -20F, -5F);

		alcos2Model[36].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		alcos2Model[36].setRotationPoint(-24F, -20F, 5F);

		alcos2Model[37].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		alcos2Model[37].setRotationPoint(-24F, -20F, -7F);

		alcos2Model[38].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 48
		alcos2Model[38].setRotationPoint(14F, -22F, -11F);

		alcos2Model[39].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 49
		alcos2Model[39].setRotationPoint(14F, -22F, 10F);

		alcos2Model[40].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		alcos2Model[40].setRotationPoint(12F, -24F, 8F);

		alcos2Model[41].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		alcos2Model[41].setRotationPoint(12F, -23F, 10F);

		alcos2Model[42].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 132
		alcos2Model[42].setRotationPoint(12F, -26F, 3F);

		alcos2Model[43].addBox(0F, 0F, 0F, 13, 1, 6, 0F); // Box 135
		alcos2Model[43].setRotationPoint(12F, -26F, -3F);

		alcos2Model[44].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		alcos2Model[44].setRotationPoint(12F, -26F, -8F);

		alcos2Model[45].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		alcos2Model[45].setRotationPoint(12F, -24F, -10F);

		alcos2Model[46].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		alcos2Model[46].setRotationPoint(12F, -23F, -11F);

		alcos2Model[47].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 315 door swing right
		alcos2Model[47].setRotationPoint(13.5F, -22F, -10.5F);

		alcos2Model[48].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 61
		alcos2Model[48].setRotationPoint(13F, -8F, -11F);

		alcos2Model[49].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 62
		alcos2Model[49].setRotationPoint(25F, -6F, -2F);

		alcos2Model[50].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 63
		alcos2Model[50].setRotationPoint(13F, -22F, -7F);

		alcos2Model[51].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 64
		alcos2Model[51].setRotationPoint(24F, -22F, -10F);

		alcos2Model[52].addBox(0F, 0F, 0F, 1, 14, 8, 0F); // Box 65
		alcos2Model[52].setRotationPoint(24F, -22F, 2F);

		alcos2Model[53].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 66
		alcos2Model[53].setRotationPoint(24F, -23F, -8F);

		alcos2Model[54].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 67
		alcos2Model[54].setRotationPoint(24F, -25F, -3F);

		alcos2Model[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		alcos2Model[55].setRotationPoint(24F, -24.5F, -8F);

		alcos2Model[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		alcos2Model[56].setRotationPoint(24F, -23F, -10F);

		alcos2Model[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		alcos2Model[57].setRotationPoint(24F, -23F, 8F);

		alcos2Model[58].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 78 lamp
		alcos2Model[58].setRotationPoint(24.5F, -25F, -1.5F);

		alcos2Model[59].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 79
		alcos2Model[59].setRotationPoint(24.5F, -22F, -1.5F);

		alcos2Model[60].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 80
		alcos2Model[60].setRotationPoint(-29F, 3F, -10F);

		alcos2Model[61].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 81
		alcos2Model[61].setRotationPoint(-26F, -2F, -10F);

		alcos2Model[62].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 82
		alcos2Model[62].setRotationPoint(-26F, 4F, 7F);

		alcos2Model[63].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 83
		alcos2Model[63].setRotationPoint(-26F, -2F, 7F);

		alcos2Model[64].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 84
		alcos2Model[64].setRotationPoint(26F, 4F, 7F);

		alcos2Model[65].addBox(0F, 0F, 0F, 0, 1, 4, 0F); // Box 85
		alcos2Model[65].setRotationPoint(26F, 4F, -11F);

		alcos2Model[66].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 86
		alcos2Model[66].setRotationPoint(26F, -2F, -10F);

		alcos2Model[67].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 87
		alcos2Model[67].setRotationPoint(29F, 4F, -11F);

		alcos2Model[68].addBox(0F, 0F, 0F, 0, 1, 20, 0F); // Box 88
		alcos2Model[68].setRotationPoint(29F, 3F, -10F);

		alcos2Model[69].addBox(0F, 0F, 0F, 0, 6, 3, 0F); // Box 89
		alcos2Model[69].setRotationPoint(26F, -2F, 7F);

		alcos2Model[70].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 90 lamp
		alcos2Model[70].setRotationPoint(-25.5F, -18F, -1.5F);

		alcos2Model[71].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 92
		alcos2Model[71].setRotationPoint(-15.5F, -3F, -11.5F);

		alcos2Model[72].addBox(0F, 0F, 0F, 2, 2, 23, 0F); // Box 93
		alcos2Model[72].setRotationPoint(13.5F, -3F, -11.5F);

		alcos2Model[73].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 94
		alcos2Model[73].setRotationPoint(-22F, -16F, -7.5F);

		alcos2Model[74].addBox(0F, 0F, 0F, 10, 10, 1, 0F); // Box 95
		alcos2Model[74].setRotationPoint(-22F, -16F, 6.5F);

		alcos2Model[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		alcos2Model[75].setRotationPoint(-25F, -20F, -5F);

		alcos2Model[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		alcos2Model[76].setRotationPoint(-25F, -20F, 4F);

		alcos2Model[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 98
		alcos2Model[77].setRotationPoint(-25F, -20F, 4F);

		alcos2Model[78].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 99
		alcos2Model[78].setRotationPoint(3F, -21F, -4F);

		alcos2Model[79].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		alcos2Model[79].setRotationPoint(3F, -22F, -4F);

		alcos2Model[80].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 101
		alcos2Model[80].setRotationPoint(4F, -25F, -3.5F);

		alcos2Model[81].addBox(0F, 0F, 0F, 38, 8, 0, 0F); // Box 102
		alcos2Model[81].setRotationPoint(-25F, -12F, -11F);

		alcos2Model[82].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		alcos2Model[82].setRotationPoint(-27F, -12F, -11F);

		alcos2Model[83].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Box 104
		alcos2Model[83].setRotationPoint(10F, -13F, -11F);

		alcos2Model[84].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 105
		alcos2Model[84].setRotationPoint(11F, -20F, -11F);

		alcos2Model[85].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 106
		alcos2Model[85].setRotationPoint(11F, -22F, -11F);

		alcos2Model[86].addBox(0F, 0F, 0F, 38, 8, 0, 0F); // Box 107
		alcos2Model[86].setRotationPoint(-25F, -12F, 11F);

		alcos2Model[87].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 108
		alcos2Model[87].setRotationPoint(-27F, -10F, -11F);

		alcos2Model[88].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 109
		alcos2Model[88].setRotationPoint(-26F, 1F, -11F);

		alcos2Model[89].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 110
		alcos2Model[89].setRotationPoint(-26F, 1F, 10F);

		alcos2Model[90].addBox(0F, 0F, 0F, 1, 12, 0, 0F); // Box 111
		alcos2Model[90].setRotationPoint(-27F, -10F, 11F);

		alcos2Model[91].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		alcos2Model[91].setRotationPoint(-27F, -12F, 11F);

		alcos2Model[92].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		alcos2Model[92].setRotationPoint(-29F, 1F, -10F);

		alcos2Model[93].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 114
		alcos2Model[93].setRotationPoint(-29F, -7F, -10F);

		alcos2Model[94].addBox(0F, 0F, 0F, 0, 1, 10, 0F); // Box 115
		alcos2Model[94].setRotationPoint(-29F, -12F, -5F);

		alcos2Model[95].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		alcos2Model[95].setRotationPoint(-29F, -12F, -10F);

		alcos2Model[96].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 117
		alcos2Model[96].setRotationPoint(-29F, -12F, 5F);

		alcos2Model[97].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 118
		alcos2Model[97].setRotationPoint(-29F, -7F, 9F);

		alcos2Model[98].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 119
		alcos2Model[98].setRotationPoint(-29F, 1F, 9F);

		alcos2Model[99].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		alcos2Model[99].setRotationPoint(-29F, -6F, -5F);

		alcos2Model[100].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 121
		alcos2Model[100].setRotationPoint(-29F, -6F, 1F);

		alcos2Model[101].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 122
		alcos2Model[101].setRotationPoint(-29F, -11F, -5F);

		alcos2Model[102].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 123
		alcos2Model[102].setRotationPoint(-29F, -11F, 4F);

		alcos2Model[103].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 124
		alcos2Model[103].setRotationPoint(-29F, -6F, -1F);

		alcos2Model[104].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 125
		alcos2Model[104].setRotationPoint(29F, -6F, -1F);

		alcos2Model[105].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		alcos2Model[105].setRotationPoint(29F, 1F, -10F);

		alcos2Model[106].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 127
		alcos2Model[106].setRotationPoint(29F, -7F, -10F);

		alcos2Model[107].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 128
		alcos2Model[107].setRotationPoint(29F, 1F, 9F);

		alcos2Model[108].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 129
		alcos2Model[108].setRotationPoint(29F, -7F, 9F);

		alcos2Model[109].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 130
		alcos2Model[109].setRotationPoint(29F, -12F, 5F);

		alcos2Model[110].addBox(0F, 0F, 0F, 0, 1, 10, 0F); // Box 131
		alcos2Model[110].setRotationPoint(29F, -12F, -5F);

		alcos2Model[111].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 132
		alcos2Model[111].setRotationPoint(29F, -11F, 4F);

		alcos2Model[112].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 133
		alcos2Model[112].setRotationPoint(29F, -6F, 1F);

		alcos2Model[113].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		alcos2Model[113].setRotationPoint(29F, -12F, -10F);

		alcos2Model[114].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 135
		alcos2Model[114].setRotationPoint(29F, -11F, -5F);

		alcos2Model[115].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		alcos2Model[115].setRotationPoint(29F, -6F, -5F);

		alcos2Model[116].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 137
		alcos2Model[116].setRotationPoint(-29F, 3F, -10F);

		alcos2Model[117].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 138
		alcos2Model[117].setRotationPoint(-29F, 0.5F, -8F);

		alcos2Model[118].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 139
		alcos2Model[118].setRotationPoint(-29F, -2F, -7F);

		alcos2Model[119].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 140
		alcos2Model[119].setRotationPoint(-21F, -21F, -4F);

		alcos2Model[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		alcos2Model[120].setRotationPoint(-13F, -23F, -0.5F);

		alcos2Model[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		alcos2Model[121].setRotationPoint(-13F, -24F, -0.5F);

		alcos2Model[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		alcos2Model[122].setRotationPoint(-12.75F, -22.5F, -0.25F);

		alcos2Model[123].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		alcos2Model[123].setRotationPoint(-13F, -21F, -2F);

		alcos2Model[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		alcos2Model[124].setRotationPoint(-13F, -24F, -2F);

		alcos2Model[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		alcos2Model[125].setRotationPoint(-13F, -24F, 1F);

		alcos2Model[126].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		alcos2Model[126].setRotationPoint(-13F, -24.5F, -1F);

		alcos2Model[127].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		alcos2Model[127].setRotationPoint(-13F, -20.5F, -1F);

		alcos2Model[128].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 149 glow
		alcos2Model[128].setRotationPoint(-22F, -18F, -7.5F);

		alcos2Model[129].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 150 glow
		alcos2Model[129].setRotationPoint(-22F, -18F, 6.5F);

		alcos2Model[130].addBox(0F, 0F, 0F, 8, 5, 0, 0F); // Box 1
		alcos2Model[130].setRotationPoint(15F, -20F, 12.5F);

		alcos2Model[131].addShapeBox(0F, 0F, 0F, 8, 0, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		alcos2Model[131].setRotationPoint(15F, -15F, 10F);

		alcos2Model[132].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3
		alcos2Model[132].setRotationPoint(15F, -20F, 10F);

		alcos2Model[133].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		alcos2Model[133].setRotationPoint(15F, -21F, 10F);

		alcos2Model[134].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 6
		alcos2Model[134].setRotationPoint(23F, -20F, 10F);

		alcos2Model[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		alcos2Model[135].setRotationPoint(24F, -24.5F, 3F);

		alcos2Model[136].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		alcos2Model[136].setRotationPoint(24F, -24F, -8F);

		alcos2Model[137].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		alcos2Model[137].setRotationPoint(24F, -24F, 3F);

		alcos2Model[138].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		alcos2Model[138].setRotationPoint(13F, -24F, 3F);

		alcos2Model[139].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 171
		alcos2Model[139].setRotationPoint(13F, -23F, -8F);

		alcos2Model[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		alcos2Model[140].setRotationPoint(13F, -23F, 8F);

		alcos2Model[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		alcos2Model[141].setRotationPoint(13F, -24.5F, 3F);

		alcos2Model[142].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 174
		alcos2Model[142].setRotationPoint(13F, -25F, -3F);

		alcos2Model[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		alcos2Model[143].setRotationPoint(13F, -24.5F, -8F);

		alcos2Model[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		alcos2Model[144].setRotationPoint(13F, -24F, -8F);

		alcos2Model[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		alcos2Model[145].setRotationPoint(13F, -23F, -10F);

		alcos2Model[146].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 67
		alcos2Model[146].setRotationPoint(12F, -16.98F, -1.5F);
		alcos2Model[146].rotateAngleY = -0.48869219F;

		alcos2Model[147].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
		alcos2Model[147].setRotationPoint(14F, -18F, 3F);

		alcos2Model[148].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71
		alcos2Model[148].setRotationPoint(14F, -25F, -1F);

		alcos2Model[149].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 78 lantern
		alcos2Model[149].setRotationPoint(19F, -25.5F, -1F);

		alcos2Model[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 211 lamp
		alcos2Model[150].setRotationPoint(-29.5F, -6F, 4.25F);

		alcos2Model[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212
		alcos2Model[151].setRotationPoint(-29F, -6F, 4F);

		alcos2Model[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
		alcos2Model[152].setRotationPoint(-29F, -6F, -6F);

		alcos2Model[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 214 lamp
		alcos2Model[153].setRotationPoint(-29.5F, -6F, -5.75F);

		alcos2Model[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 160 lamp
		alcos2Model[154].setRotationPoint(30F, -6F, -4.25F);
		alcos2Model[154].rotateAngleY = -3.14159265F;

		alcos2Model[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		alcos2Model[155].setRotationPoint(29.5F, -6F, -4F);
		alcos2Model[155].rotateAngleY = -3.14159265F;

		alcos2Model[156].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
		alcos2Model[156].setRotationPoint(29.5F, -6F, 6F);
		alcos2Model[156].rotateAngleY = -3.14159265F;

		alcos2Model[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 163 lamp
		alcos2Model[157].setRotationPoint(30F, -6F, 5.75F);
		alcos2Model[157].rotateAngleY = -3.14159265F;

		alcos2Model[158].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 191
		alcos2Model[158].setRotationPoint(26F, -7F, 10.5F);

		alcos2Model[159].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F); // Box 192
		alcos2Model[159].setRotationPoint(26F, -12F, 6.5F);

		alcos2Model[160].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 193
		alcos2Model[160].setRotationPoint(26F, 1F, 10.5F);

		alcos2Model[161].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 197
		alcos2Model[161].setRotationPoint(25F, -12F, 6.5F);

		alcos2Model[162].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 198
		alcos2Model[162].setRotationPoint(25F, -12F, -6.5F);

		alcos2Model[163].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		alcos2Model[163].setRotationPoint(26F, -12F, -11.5F);

		alcos2Model[164].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 200
		alcos2Model[164].setRotationPoint(26F, -7F, -11.5F);

		alcos2Model[165].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 201
		alcos2Model[165].setRotationPoint(26F, 1F, -11.5F);

		alcos2Model[166].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 202
		alcos2Model[166].setRotationPoint(24.5F, -21F, -2.5F);

		alcos2Model[167].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 203
		alcos2Model[167].setRotationPoint(24.5F, -21F, 2.5F);

		alcos2Model[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
		alcos2Model[168].setRotationPoint(10.5F, -25F, -0.5F);

		alcos2Model[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
		alcos2Model[169].setRotationPoint(11.5F, -25F, -0.5F);

		alcos2Model[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		alcos2Model[170].setRotationPoint(12.5F, -25F, -0.5F);

		alcos2Model[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 207
		alcos2Model[171].setRotationPoint(10.5F, -27F, -0.5F);

		alcos2Model[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 208
		alcos2Model[172].setRotationPoint(11.5F, -27F, -0.5F);

		alcos2Model[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 209
		alcos2Model[173].setRotationPoint(12.5F, -27F, -0.5F);

		alcos2Model[174].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 211
		alcos2Model[174].setRotationPoint(-24F, -20.5F, -5.5F);

		alcos2Model[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 212
		alcos2Model[175].setRotationPoint(-24F, -20.5F, 4.5F);

		alcos2Model[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		alcos2Model[176].setRotationPoint(13.32F, -27F, -0.5F);

		alcos2Model[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 400
		alcos2Model[177].setRotationPoint(13.5F, -27F, -0.5F);

		alcos2Model[178].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 215
		alcos2Model[178].setRotationPoint(20F, -26.5F, -6.5F);

		alcos2Model[179].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 216
		alcos2Model[179].setRotationPoint(14F, -20F, 10F);

		alcos2Model[180].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 217
		alcos2Model[180].setRotationPoint(14F, -20F, -12F);

		alcos2Model[181].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		alcos2Model[181].setRotationPoint(16F, -22F, 11F);

		alcos2Model[182].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		alcos2Model[182].setRotationPoint(16F, -22F, -12F);

		alcos2Model[183].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 220 atsf stack
		alcos2Model[183].setRotationPoint(4F, -27F, -3.5F);

		alcos2Model[184].addBox(0F, 0F, 0F, 9, 2, 4, 0F); // Box 221
		alcos2Model[184].setRotationPoint(-23F, -21.5F, -2F);

		alcos2Model[185].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 222
		alcos2Model[185].setRotationPoint(9F, -20.5F, -1F);

		alcos2Model[186].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		alcos2Model[186].setRotationPoint(-32F, 4F, -4F);

		alcos2Model[187].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		alcos2Model[187].setRotationPoint(-32F, 4F, 4F);

		alcos2Model[188].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		alcos2Model[188].setRotationPoint(29F, 4F, 4F);

		alcos2Model[189].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		alcos2Model[189].setRotationPoint(29F, 4F, -4F);

		alcos2Model[190].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 227
		alcos2Model[190].setRotationPoint(-29F, 5F, 10F);

		alcos2Model[191].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 228
		alcos2Model[191].setRotationPoint(-29F, 3F, 10F);

		alcos2Model[192].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 229
		alcos2Model[192].setRotationPoint(-29F, 3F, 8F);

		alcos2Model[193].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 230
		alcos2Model[193].setRotationPoint(-29F, 0.5F, 8F);

		alcos2Model[194].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 231
		alcos2Model[194].setRotationPoint(-29F, 0.5F, 7F);

		alcos2Model[195].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 232
		alcos2Model[195].setRotationPoint(-29F, -2F, 7F);

		alcos2Model[196].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 233
		alcos2Model[196].setRotationPoint(-29F, -2F, 7F);

		alcos2Model[197].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 234 glow
		alcos2Model[197].setRotationPoint(-25F, -22F, 3F);
		alcos2Model[197].rotateAngleY = -0.52359878F;

		alcos2Model[198].addBox(0F, 0F, -4F, 1, 2, 4, 0F); // Box 235 glow
		alcos2Model[198].setRotationPoint(-25F, -22F, -3F);
		alcos2Model[198].rotateAngleY = 0.52359878F;

		alcos2Model[199].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 236
		alcos2Model[199].setRotationPoint(26F, 5F, 10F);

		alcos2Model[200].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 237
		alcos2Model[200].setRotationPoint(26F, 3F, 10F);

		alcos2Model[201].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 238
		alcos2Model[201].setRotationPoint(26F, 3F, 8F);

		alcos2Model[202].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 239
		alcos2Model[202].setRotationPoint(26F, 0.5F, 8F);

		alcos2Model[203].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 240
		alcos2Model[203].setRotationPoint(26F, 0.5F, 7F);

		alcos2Model[204].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 241
		alcos2Model[204].setRotationPoint(26F, -2F, 7F);

		alcos2Model[205].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 242
		alcos2Model[205].setRotationPoint(26F, -2F, 7F);

		alcos2Model[206].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 243
		alcos2Model[206].setRotationPoint(26F, 5F, -12F);

		alcos2Model[207].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 244
		alcos2Model[207].setRotationPoint(26F, 3F, -10F);

		alcos2Model[208].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 245
		alcos2Model[208].setRotationPoint(26F, 3F, -10F);

		alcos2Model[209].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 246
		alcos2Model[209].setRotationPoint(26F, 0.5F, -8F);

		alcos2Model[210].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 247
		alcos2Model[210].setRotationPoint(26F, 0.5F, -9F);

		alcos2Model[211].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 248
		alcos2Model[211].setRotationPoint(26F, -2F, -7F);

		alcos2Model[212].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 249
		alcos2Model[212].setRotationPoint(26F, -2F, -8F);

		alcos2Model[213].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 250
		alcos2Model[213].setRotationPoint(-29.01F, -5.5F, -7F);

		alcos2Model[214].addBox(0F, 0F, 0F, 0, 2, 14, 0F); // Box 251
		alcos2Model[214].setRotationPoint(29.01F, -5.5F, -7F);

		alcos2Model[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		alcos2Model[215].setRotationPoint(-27F, -20F, -0.5F);

		alcos2Model[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		alcos2Model[216].setRotationPoint(-27F, -21F, -0.5F);

		alcos2Model[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		alcos2Model[217].setRotationPoint(-26.75F, -19.5F, -0.25F);

		alcos2Model[218].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 875
		alcos2Model[218].setRotationPoint(-27F, -21F, -1F);

		alcos2Model[219].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 876
		alcos2Model[219].setRotationPoint(-27F, -21F, 1F);

		alcos2Model[220].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		alcos2Model[220].setRotationPoint(-26.75F, -21.25F, -1.5F);

		alcos2Model[221].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 221
		alcos2Model[221].setRotationPoint(-15.5F, -1F, -1F);

		alcos2Model[222].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 222
		alcos2Model[222].setRotationPoint(13.5F, -1F, -1F);

	}

	ModelBluntTruck theTrucks = new ModelBluntTruck();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 223; i++) {
			if (alcos2Model[i].boxName != null && alcos2Model[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				alcos2Model[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				alcos2Model[i].render(f5);
			}
		}
		Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/alcos2_blunttruck.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.85F ,0F,0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(0.98F,0F,0);
		theTrucks.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{

	}

	public ModelRendererTurbo alcos2Model[];
}