//Sometimes, i dream about Foxes, then i remember i am one!

package com.jcirmodelsquad.tcjcir.models; //h


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelF7A extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelF7A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[249];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 215, 143, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 153, 155, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 344, 157, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 250, 104, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 250, 73, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 205, 78, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 205, 109, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 190, 145, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 165, 145, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 156, 149, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 223, 167, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 337, 46, textureX, textureY); // Box 1
		bodyModel[12] = new ModelRendererTurbo(this, 367, 26, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 311, 34, textureX, textureY); // Box 1
		bodyModel[14] = new ModelRendererTurbo(this, 322, 38, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 333, 11, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 145, 23, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 145, 15, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 145, 29, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 145, 4, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 145, 34, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 356, 14, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 395, 5, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 378, 22, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 359, 16, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 373, 16, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 71, 17, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 86, 19, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 93, 18, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 60, 19, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 55, 18, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 40, 31, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 73, 90, textureX, textureY); // Box 1
		bodyModel[37] = new ModelRendererTurbo(this, 64, 91, textureX, textureY); // Box 1
		bodyModel[38] = new ModelRendererTurbo(this, 54, 86, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 47, 85, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 92, 86, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 84, 91, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 66, 52, textureX, textureY); // Box 1
		bodyModel[43] = new ModelRendererTurbo(this, 82, 52, textureX, textureY); // Box 1
		bodyModel[44] = new ModelRendererTurbo(this, 68, 55, textureX, textureY); // Box 1
		bodyModel[45] = new ModelRendererTurbo(this, 82, 55, textureX, textureY); // Box 1
		bodyModel[46] = new ModelRendererTurbo(this, 67, 66, textureX, textureY); // Box 1
		bodyModel[47] = new ModelRendererTurbo(this, 85, 66, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 67, 69, textureX, textureY); // Box 1
		bodyModel[49] = new ModelRendererTurbo(this, 85, 69, textureX, textureY); // Box 1
		bodyModel[50] = new ModelRendererTurbo(this, 52, 66, textureX, textureY); // Box 105
		bodyModel[51] = new ModelRendererTurbo(this, 73, 54, textureX, textureY); // Box 106
		bodyModel[52] = new ModelRendererTurbo(this, 84, 66, textureX, textureY); // Box 107
		bodyModel[53] = new ModelRendererTurbo(this, 105, 71, textureX, textureY); // Box 108
		bodyModel[54] = new ModelRendererTurbo(this, 33, 71, textureX, textureY); // Box 109
		bodyModel[55] = new ModelRendererTurbo(this, 53, 57, textureX, textureY); // Box 110
		bodyModel[56] = new ModelRendererTurbo(this, 83, 57, textureX, textureY); // Box 111
		bodyModel[57] = new ModelRendererTurbo(this, 73, 67, textureX, textureY); // Box 112
		bodyModel[58] = new ModelRendererTurbo(this, 102, 48, textureX, textureY); // Box 114
		bodyModel[59] = new ModelRendererTurbo(this, 73, 42, textureX, textureY); // Box 117
		bodyModel[60] = new ModelRendererTurbo(this, 66, 35, textureX, textureY); // Box 118
		bodyModel[61] = new ModelRendererTurbo(this, 85, 35, textureX, textureY); // Box 119
		bodyModel[62] = new ModelRendererTurbo(this, 104, 43, textureX, textureY); // Box 120
		bodyModel[63] = new ModelRendererTurbo(this, 43, 35, textureX, textureY); // Box 125
		bodyModel[64] = new ModelRendererTurbo(this, 38, 48, textureX, textureY); // Box 127
		bodyModel[65] = new ModelRendererTurbo(this, 40, 43, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 112, 31, textureX, textureY); // Box 129
		bodyModel[67] = new ModelRendererTurbo(this, 111, 34, textureX, textureY); // Box 130
		bodyModel[68] = new ModelRendererTurbo(this, 41, 34, textureX, textureY); // Box 131
		bodyModel[69] = new ModelRendererTurbo(this, 91, 48, textureX, textureY); // Box 135
		bodyModel[70] = new ModelRendererTurbo(this, 82, 43, textureX, textureY); // Box 136
		bodyModel[71] = new ModelRendererTurbo(this, 60, 43, textureX, textureY); // Box 138
		bodyModel[72] = new ModelRendererTurbo(this, 68, 28, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 52, 28, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 142
		bodyModel[76] = new ModelRendererTurbo(this, 84, 28, textureX, textureY); // Box 143
		bodyModel[77] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 144
		bodyModel[78] = new ModelRendererTurbo(this, 100, 28, textureX, textureY); // Box 145
		bodyModel[79] = new ModelRendererTurbo(this, 105, 27, textureX, textureY); // Box 146
		bodyModel[80] = new ModelRendererTurbo(this, 103, 85, textureX, textureY); // Box 147
		bodyModel[81] = new ModelRendererTurbo(this, 13, 130, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 2, 133, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 1, 133, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 21, 141, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 3, 127, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 3, 141, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 236, 83, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 223, 71, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 214, 71, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 204, 71, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 228, 73, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 236, 72, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 236, 69, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 236, 114, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 223, 102, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 214, 102, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 204, 102, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 228, 104, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 236, 103, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 236, 100, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 8, 90, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 16, 104, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 16, 100, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 16, 96, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 16, 92, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 250, 13, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 269, 13, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 285, 15, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 282, 13, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 298, 13, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 314, 15, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 311, 13, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 282, 181, textureX, textureY); // Box 42
		bodyModel[119] = new ModelRendererTurbo(this, 300, 206, textureX, textureY); // Box 44
		bodyModel[120] = new ModelRendererTurbo(this, 271, 201, textureX, textureY); // Box 45
		bodyModel[121] = new ModelRendererTurbo(this, 255, 178, textureX, textureY); // Box 46
		bodyModel[122] = new ModelRendererTurbo(this, 227, 176, textureX, textureY); // Box 48
		bodyModel[123] = new ModelRendererTurbo(this, 273, 174, textureX, textureY); // Box 50
		bodyModel[124] = new ModelRendererTurbo(this, 319, 181, textureX, textureY); // Box 324
		bodyModel[125] = new ModelRendererTurbo(this, 299, 175, textureX, textureY); // Box 325
		bodyModel[126] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 123
		bodyModel[127] = new ModelRendererTurbo(this, 288, 217, textureX, textureY); // Box 254
		bodyModel[128] = new ModelRendererTurbo(this, 297, 212, textureX, textureY); // Box 255
		bodyModel[129] = new ModelRendererTurbo(this, 288, 212, textureX, textureY); // Box 136
		bodyModel[130] = new ModelRendererTurbo(this, 324, 212, textureX, textureY); // Box 137
		bodyModel[131] = new ModelRendererTurbo(this, 324, 217, textureX, textureY); // Box 138
		bodyModel[132] = new ModelRendererTurbo(this, 225, 197, textureX, textureY); // Box 139
		bodyModel[133] = new ModelRendererTurbo(this, 321, 208, textureX, textureY); // Box 140
		bodyModel[134] = new ModelRendererTurbo(this, 320, 177, textureX, textureY); // Box 141
		bodyModel[135] = new ModelRendererTurbo(this, 104, 58, textureX, textureY); // Box 111
		bodyModel[136] = new ModelRendererTurbo(this, 38, 58, textureX, textureY); // Box 144
		bodyModel[137] = new ModelRendererTurbo(this, 99, 69, textureX, textureY); // Box 145
		bodyModel[138] = new ModelRendererTurbo(this, 53, 69, textureX, textureY); // Box 146
		bodyModel[139] = new ModelRendererTurbo(this, 99, 67, textureX, textureY); // Box 147
		bodyModel[140] = new ModelRendererTurbo(this, 53, 67, textureX, textureY); // Box 148
		bodyModel[141] = new ModelRendererTurbo(this, 80, 61, textureX, textureY); // Box 149
		bodyModel[142] = new ModelRendererTurbo(this, 74, 61, textureX, textureY); // Box 150
		bodyModel[143] = new ModelRendererTurbo(this, 73, 82, textureX, textureY); // Box 151
		bodyModel[144] = new ModelRendererTurbo(this, 247, 107, textureX, textureY); // Box 152
		bodyModel[145] = new ModelRendererTurbo(this, 233, 107, textureX, textureY); // Box 153
		bodyModel[146] = new ModelRendererTurbo(this, 247, 76, textureX, textureY); // Box 154
		bodyModel[147] = new ModelRendererTurbo(this, 233, 76, textureX, textureY); // Box 155
		bodyModel[148] = new ModelRendererTurbo(this, 237, 122, textureX, textureY); // Box 156
		bodyModel[149] = new ModelRendererTurbo(this, 237, 91, textureX, textureY); // Box 157
		bodyModel[150] = new ModelRendererTurbo(this, 211, 103, textureX, textureY); // Box 350
		bodyModel[151] = new ModelRendererTurbo(this, 211, 72, textureX, textureY); // Box 351
		bodyModel[152] = new ModelRendererTurbo(this, 205, 122, textureX, textureY); // Box 160
		bodyModel[153] = new ModelRendererTurbo(this, 205, 91, textureX, textureY); // Box 161
		bodyModel[154] = new ModelRendererTurbo(this, 84, 60, textureX, textureY, "lamp"); // Box 164 lamp
		bodyModel[155] = new ModelRendererTurbo(this, 70, 60, textureX, textureY, "lamp"); // Box 165 lamp
		bodyModel[156] = new ModelRendererTurbo(this, 70, 58, textureX, textureY, "lamp"); // Box 166 lamp
		bodyModel[157] = new ModelRendererTurbo(this, 84, 58, textureX, textureY, "lamp"); // Box 167 lamp
		bodyModel[158] = new ModelRendererTurbo(this, 72, 66, textureX, textureY, "lamp"); // Box 168 lamp
		bodyModel[159] = new ModelRendererTurbo(this, 82, 66, textureX, textureY, "lamp"); // Box 169 lamp
		bodyModel[160] = new ModelRendererTurbo(this, 82, 68, textureX, textureY, "lamp"); // Box 170 lamp
		bodyModel[161] = new ModelRendererTurbo(this, 72, 68, textureX, textureY, "lamp"); // Box 171 lamp
		bodyModel[162] = new ModelRendererTurbo(this, 49, 48, textureX, textureY); // Box 172
		bodyModel[163] = new ModelRendererTurbo(this, 153, 46, textureX, textureY); // Box 299
		bodyModel[164] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 300
		bodyModel[165] = new ModelRendererTurbo(this, 153, 40, textureX, textureY); // Box 301
		bodyModel[166] = new ModelRendererTurbo(this, 157, 43, textureX, textureY); // Box 302
		bodyModel[167] = new ModelRendererTurbo(this, 336, 110, textureX, textureY); // Box 177
		bodyModel[168] = new ModelRendererTurbo(this, 333, 110, textureX, textureY); // Box 178
		bodyModel[169] = new ModelRendererTurbo(this, 336, 79, textureX, textureY); // Box 179
		bodyModel[170] = new ModelRendererTurbo(this, 333, 79, textureX, textureY); // Box 180
		bodyModel[171] = new ModelRendererTurbo(this, 146, 40, textureX, textureY, "lamp"); // Box 348 rotating lamp?
		bodyModel[172] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box 349
		bodyModel[173] = new ModelRendererTurbo(this, 75, 49, textureX, textureY); // Box 183 CNW Gong
		bodyModel[174] = new ModelRendererTurbo(this, 114, 55, textureX, textureY, "lamp"); // Box 184 liveryimg 2 glow
		bodyModel[175] = new ModelRendererTurbo(this, 32, 55, textureX, textureY, "lamp"); // Box 185 liveryimg 2 glow
		bodyModel[176] = new ModelRendererTurbo(this, 310, 21, textureX, textureY); // Box 186
		bodyModel[177] = new ModelRendererTurbo(this, 329, 23, textureX, textureY); // Box 187
		bodyModel[178] = new ModelRendererTurbo(this, 329, 19, textureX, textureY); // Box 188
		bodyModel[179] = new ModelRendererTurbo(this, 330, 122, textureX, textureY); // Box 189
		bodyModel[180] = new ModelRendererTurbo(this, 330, 91, textureX, textureY); // Box 190
		bodyModel[181] = new ModelRendererTurbo(this, 339, 91, textureX, textureY); // Box 191
		bodyModel[182] = new ModelRendererTurbo(this, 339, 122, textureX, textureY); // Box 192
		bodyModel[183] = new ModelRendererTurbo(this, 165, 43, textureX, textureY); // Box 193
		bodyModel[184] = new ModelRendererTurbo(this, 169, 40, textureX, textureY); // Box 194
		bodyModel[185] = new ModelRendererTurbo(this, 167, 37, textureX, textureY); // Box 195
		bodyModel[186] = new ModelRendererTurbo(this, 250, 97, textureX, textureY); // Box 196
		bodyModel[187] = new ModelRendererTurbo(this, 250, 66, textureX, textureY); // Box 197
		bodyModel[188] = new ModelRendererTurbo(this, 339, 114, textureX, textureY); // Box 198
		bodyModel[189] = new ModelRendererTurbo(this, 342, 114, textureX, textureY); // Box 199
		bodyModel[190] = new ModelRendererTurbo(this, 342, 83, textureX, textureY); // Box 200
		bodyModel[191] = new ModelRendererTurbo(this, 339, 83, textureX, textureY); // Box 201
		bodyModel[192] = new ModelRendererTurbo(this, 336, 17, textureX, textureY); // Box 202
		bodyModel[193] = new ModelRendererTurbo(this, 335, 25, textureX, textureY); // Box 203
		bodyModel[194] = new ModelRendererTurbo(this, 390, 26, textureX, textureY); // Box 314
		bodyModel[195] = new ModelRendererTurbo(this, 390, 13, textureX, textureY); // Box 315
		bodyModel[196] = new ModelRendererTurbo(this, 408, 26, textureX, textureY); // Box 316
		bodyModel[197] = new ModelRendererTurbo(this, 390, 33, textureX, textureY); // Box 317
		bodyModel[198] = new ModelRendererTurbo(this, 282, 9, textureX, textureY); // Box 209
		bodyModel[199] = new ModelRendererTurbo(this, 311, 9, textureX, textureY); // Box 210
		bodyModel[200] = new ModelRendererTurbo(this, 178, 43, textureX, textureY); // Box 278
		bodyModel[201] = new ModelRendererTurbo(this, 178, 40, textureX, textureY); // Box 279
		bodyModel[202] = new ModelRendererTurbo(this, 178, 37, textureX, textureY); // Box 280
		bodyModel[203] = new ModelRendererTurbo(this, 187, 40, textureX, textureY); // Box 214
		bodyModel[204] = new ModelRendererTurbo(this, 145, 56, textureX, textureY); // Box 215
		bodyModel[205] = new ModelRendererTurbo(this, 145, 59, textureX, textureY); // Box 216
		bodyModel[206] = new ModelRendererTurbo(this, 145, 62, textureX, textureY); // Box 217
		bodyModel[207] = new ModelRendererTurbo(this, 154, 59, textureX, textureY); // Box 218
		bodyModel[208] = new ModelRendererTurbo(this, 105, 136, textureX, textureY); // Box 131
		bodyModel[209] = new ModelRendererTurbo(this, 103, 140, textureX, textureY); // Box 131
		bodyModel[210] = new ModelRendererTurbo(this, 78, 145, textureX, textureY); // Box 131
		bodyModel[211] = new ModelRendererTurbo(this, 76, 133, textureX, textureY); // Box 131
		bodyModel[212] = new ModelRendererTurbo(this, 78, 123, textureX, textureY); // Box 131
		bodyModel[213] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 131
		bodyModel[214] = new ModelRendererTurbo(this, 83, 145, textureX, textureY); // Box 131
		bodyModel[215] = new ModelRendererTurbo(this, 71, 135, textureX, textureY); // Box 131
		bodyModel[216] = new ModelRendererTurbo(this, 85, 135, textureX, textureY); // Box 131
		bodyModel[217] = new ModelRendererTurbo(this, 91, 132, textureX, textureY); // Box 131
		bodyModel[218] = new ModelRendererTurbo(this, 76, 118, textureX, textureY); // Box 131
		bodyModel[219] = new ModelRendererTurbo(this, 87, 130, textureX, textureY); // Box 131
		bodyModel[220] = new ModelRendererTurbo(this, 329, 13, textureX, textureY); // Box 231
		bodyModel[221] = new ModelRendererTurbo(this, 323, 33, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[222] = new ModelRendererTurbo(this, 377, 44, textureX, textureY); // Box 222
		bodyModel[223] = new ModelRendererTurbo(this, 389, 44, textureX, textureY); // Box 223
		bodyModel[224] = new ModelRendererTurbo(this, 339, 174, textureX, textureY); // Box 438
		bodyModel[225] = new ModelRendererTurbo(this, 223, 174, textureX, textureY); // Box 439
		bodyModel[226] = new ModelRendererTurbo(this, 72, 10, textureX, textureY); // Box 336
		bodyModel[227] = new ModelRendererTurbo(this, 70, 18, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[228] = new ModelRendererTurbo(this, 80, 18, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[229] = new ModelRendererTurbo(this, 85, 86, textureX, textureY, "lamp"); // Box 443 lamp
		bodyModel[230] = new ModelRendererTurbo(this, 80, 89, textureX, textureY); // Box 444
		bodyModel[231] = new ModelRendererTurbo(this, 65, 86, textureX, textureY, "lamp"); // Box 445 lamp
		bodyModel[232] = new ModelRendererTurbo(this, 70, 89, textureX, textureY); // Box 446
		bodyModel[233] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 447
		bodyModel[234] = new ModelRendererTurbo(this, 209, 38, textureX, textureY); // Box 448
		bodyModel[235] = new ModelRendererTurbo(this, 209, 44, textureX, textureY); // Box 449
		bodyModel[236] = new ModelRendererTurbo(this, 218, 41, textureX, textureY); // Box 450
		bodyModel[237] = new ModelRendererTurbo(this, 181, 74, textureX, textureY); // Box 260
		bodyModel[238] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 264
		bodyModel[239] = new ModelRendererTurbo(this, 145, 76, textureX, textureY); // Box 268
		bodyModel[240] = new ModelRendererTurbo(this, 139, 78, textureX, textureY); // Box 274
		bodyModel[241] = new ModelRendererTurbo(this, 136, 82, textureX, textureY); // Box 283
		bodyModel[242] = new ModelRendererTurbo(this, 149, 82, textureX, textureY); // Box 284
		bodyModel[243] = new ModelRendererTurbo(this, 166, 82, textureX, textureY); // Box 291
		bodyModel[244] = new ModelRendererTurbo(this, 179, 82, textureX, textureY); // Box 292
		bodyModel[245] = new ModelRendererTurbo(this, 184, 78, textureX, textureY); // Box 293
		bodyModel[246] = new ModelRendererTurbo(this, 172, 76, textureX, textureY); // Box 294
		bodyModel[247] = new ModelRendererTurbo(this, 140, 74, textureX, textureY); // Box 295
		bodyModel[248] = new ModelRendererTurbo(this, 146, 73, textureX, textureY); // Box 296

		bodyModel[0].addBox(0F, 0F, 0F, 54, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-22.5F, -2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-35.5F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(32.5F, 2F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 40, 16, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-7.5F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 40, 16, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-7.5F, -15F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-22F, -10F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-22F, -10F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0.8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -1F, 0.8F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -0.95F); // Box 0
		bodyModel[7].setRotationPoint(-24.5F, -2F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 0
		bodyModel[8].setRotationPoint(-29.3F, -2F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 0
		bodyModel[9].setRotationPoint(-30.3F, -2F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 62, 2, 4, 0F); // Box 0
		bodyModel[10].setRotationPoint(-30.5F, -1F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[11].setRotationPoint(31.5F, 1F, -2F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[12].setRotationPoint(31.5F, -1F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[13].setRotationPoint(31.5F, 1F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[14].setRotationPoint(31.5F, 1F, 2F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 0
		bodyModel[15].setRotationPoint(31.5F, -15F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-16.5F, -19F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 49, 1, 6, 0F); // Box 0
		bodyModel[17].setRotationPoint(-16.5F, -19F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-16.5F, -19F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 49, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(-16.5F, -18F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-16.5F, -18F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 49, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-16.5F, -16F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 49, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(-16.5F, -16F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[23].setRotationPoint(31.5F, -17F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[24].setRotationPoint(31.5F, -18F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(31.5F, -17F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(31.5F, -17F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(31.5F, -18F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(31.5F, -18F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-20F, -18F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(-17.5F, -19F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(-17.5F, -19F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(-17.5F, -18F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[33].setRotationPoint(-17.5F, -19F, 3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[34].setRotationPoint(-17.5F, -18F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(-17.5F, -16F, 10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1
		bodyModel[36].setRotationPoint(-32.5F, 1F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -0.5F, -2.5F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F); // Box 1
		bodyModel[37].setRotationPoint(-32.5F, 1F, 2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-0.5F, 0F, 3.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F); // Box 0
		bodyModel[38].setRotationPoint(-30.5F, 1F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-25.5F, 1F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-0.5F, 0F, -3.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 3.5F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 0
		bodyModel[40].setRotationPoint(-30.5F, 1F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-2.5F, 0F, 0.5F, 1.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1
		bodyModel[41].setRotationPoint(-32.5F, 1F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[42].setRotationPoint(-31.5F, -13F, 0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 1
		bodyModel[43].setRotationPoint(-31.5F, -13F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 1
		bodyModel[44].setRotationPoint(-31.5F, -11F, 0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[45].setRotationPoint(-31.5F, -11F, -1.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[46].setRotationPoint(-32F, -8F, 0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 1
		bodyModel[47].setRotationPoint(-32F, -8F, -1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 1
		bodyModel[48].setRotationPoint(-32F, -6F, 0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[49].setRotationPoint(-32F, -6F, -1.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 10, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 105
		bodyModel[50].setRotationPoint(-32F, -9F, 2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[51].setRotationPoint(-31F, -11F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 10, 6, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[52].setRotationPoint(-32F, -9F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[53].setRotationPoint(-28F, -9F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F); // Box 109
		bodyModel[54].setRotationPoint(-28F, -9F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 110
		bodyModel[55].setRotationPoint(-31F, -11F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[56].setRotationPoint(-31F, -11F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[57].setRotationPoint(-32F, -9F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -3F, 0F, -1F, 0F, 0F, 0.31F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 114
		bodyModel[58].setRotationPoint(-27F, -11F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[59].setRotationPoint(-30F, -13F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 118
		bodyModel[60].setRotationPoint(-27F, -13F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[61].setRotationPoint(-27F, -11F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[62].setRotationPoint(-22F, -11F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[63].setRotationPoint(-27F, -11F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0.31F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F); // Box 127
		bodyModel[64].setRotationPoint(-27F, -11F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.31F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-22F, -11F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[66].setRotationPoint(-17.5F, -16F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[67].setRotationPoint(-20F, -15F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[68].setRotationPoint(-20F, -15F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-3F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[69].setRotationPoint(-30F, -13F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[70].setRotationPoint(-28F, -13F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 138
		bodyModel[71].setRotationPoint(-28F, -13F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 139
		bodyModel[72].setRotationPoint(-20F, -18F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F); // Box 140
		bodyModel[73].setRotationPoint(-20F, -18F, 3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -0.6F, 0F, -2.5F, -0.65F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F); // Box 141
		bodyModel[74].setRotationPoint(-20F, -17F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-2.5F, 0.35F, 0F, 2.5F, 0.35F, 0F, 2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, -0.4F, 0F, -0.05F, -0.4F, 0F, 0F, 0.6F, 0F, -0.2F, 0.6F, 0F); // Box 142
		bodyModel[75].setRotationPoint(-20F, -16F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[76].setRotationPoint(-20F, -18F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-2.5F, -1F, 0F, 2.5F, -1F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 144
		bodyModel[77].setRotationPoint(-20F, -18F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2.5F, -0.65F, 0F, 2.5F, -0.6F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 145
		bodyModel[78].setRotationPoint(-20F, -17F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-2.5F, -1F, 0F, 2.5F, -1F, 0F, 2.5F, 0.35F, 0F, -2.5F, 0.35F, 0F, -0.2F, 0.6F, 0F, 0F, 0.6F, 0F, -0.05F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 146
		bodyModel[79].setRotationPoint(-20F, -16F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 147
		bodyModel[80].setRotationPoint(-25.5F, 1F, -9F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 0
		bodyModel[81].setRotationPoint(-2.5F, -15F, -10F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[82].setRotationPoint(-2.5F, -17F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[83].setRotationPoint(-2.5F, -18F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-2.5F, -17F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[85].setRotationPoint(-2.5F, -17F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[86].setRotationPoint(-2.5F, -18F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[87].setRotationPoint(-2.5F, -18F, 3F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[88].setRotationPoint(-11.5F, -5F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[89].setRotationPoint(-13F, -15F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[90].setRotationPoint(-16.5F, -15F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[91].setRotationPoint(-19F, -15F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[92].setRotationPoint(-12F, -15F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[93].setRotationPoint(-11.5F, -14F, 10F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[94].setRotationPoint(-11.5F, -15F, 10F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[95].setRotationPoint(-11.5F, -5F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[96].setRotationPoint(-13F, -15F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[97].setRotationPoint(-16.5F, -15F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[98].setRotationPoint(-19F, -15F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[99].setRotationPoint(-12F, -15F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[100].setRotationPoint(-11.5F, -14F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[101].setRotationPoint(-11.5F, -15F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Box 0
		bodyModel[102].setRotationPoint(-20F, -10F, -10F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 0
		bodyModel[103].setRotationPoint(-20F, -11F, -6F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[104].setRotationPoint(-20F, -12F, -2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[105].setRotationPoint(-20F, -12F, 2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[106].setRotationPoint(-20F, -12F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(-20F, -11F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[108].setRotationPoint(-20F, -11F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[109].setRotationPoint(-20F, -11F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[110].setRotationPoint(-20F, -11F, 6F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[111].setRotationPoint(-4.5F, -20F, -3F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[112].setRotationPoint(2.5F, -20F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[113].setRotationPoint(8.5F, -20F, -2F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[114].setRotationPoint(7F, -20F, -1F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[115].setRotationPoint(13.5F, -20F, -2F);

		bodyModel[116].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[116].setRotationPoint(19.5F, -20F, -2F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[117].setRotationPoint(18F, -20F, -1F);

		bodyModel[118].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 42
		bodyModel[118].setRotationPoint(1F, 0F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[119].setRotationPoint(1F, 4F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[120].setRotationPoint(-3F, 1.5F, -10.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 3, 19, 0F); // Box 46
		bodyModel[121].setRotationPoint(-3F, 1.5F, -9.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 48
		bodyModel[122].setRotationPoint(-3F, 4.5F, -9.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[123].setRotationPoint(-3F, 1.5F, 9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[124].setRotationPoint(1F, 4F, -8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[125].setRotationPoint(1F, 4F, 8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[126].setRotationPoint(-3F, 1F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[127].setRotationPoint(-6F, 1F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[128].setRotationPoint(-3F, 1F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[129].setRotationPoint(-6F, 1F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[130].setRotationPoint(9F, 1F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[131].setRotationPoint(9F, 1F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 4, 1, 21, 0F); // Box 139
		bodyModel[132].setRotationPoint(-3F, 0.5F, -10.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 140
		bodyModel[133].setRotationPoint(6F, 1F, -10.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 141
		bodyModel[134].setRotationPoint(6F, 1F, 9.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 111
		bodyModel[135].setRotationPoint(-28.5F, -9F, -9F);
		bodyModel[135].rotateAngleY = 0.4712389F;

		bodyModel[136].addBox(0F, 0F, -5F, 2, 2, 5, 0F); // Box 144
		bodyModel[136].setRotationPoint(-28.5F, -9F, 9F);
		bodyModel[136].rotateAngleY = -0.4712389F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 145
		bodyModel[137].setRotationPoint(-32.5F, -1F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 146
		bodyModel[138].setRotationPoint(-32.5F, -1F, 4F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 147
		bodyModel[139].setRotationPoint(-32.5F, -2F, -4F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 148
		bodyModel[140].setRotationPoint(-32.5F, -2F, 4F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 149
		bodyModel[141].setRotationPoint(-31.5F, -8F, -3F);
		bodyModel[141].rotateAngleZ = -0.10471976F;

		bodyModel[142].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 150
		bodyModel[142].setRotationPoint(-31.5F, -8F, 3F);
		bodyModel[142].rotateAngleZ = -0.10471976F;

		bodyModel[143].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 151
		bodyModel[143].setRotationPoint(-32.5F, 0F, -2F);

		bodyModel[144].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 152
		bodyModel[144].setRotationPoint(-7F, -13F, -11.75F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 153
		bodyModel[145].setRotationPoint(-12F, -13F, -11.75F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 154
		bodyModel[146].setRotationPoint(-12F, -13F, 10.75F);

		bodyModel[147].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 155
		bodyModel[147].setRotationPoint(-7F, -13F, 10.75F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 156
		bodyModel[148].setRotationPoint(-11.5F, 1F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 157
		bodyModel[149].setRotationPoint(-11.5F, 1F, 11F);

		bodyModel[150].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[150].setRotationPoint(-16.5F, -15F, -12F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[151].setRotationPoint(-16.5F, -15F, 11F);

		bodyModel[152].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 160
		bodyModel[152].setRotationPoint(-22F, 1F, -11F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 161
		bodyModel[153].setRotationPoint(-22F, 1F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 164 lamp
		bodyModel[154].setRotationPoint(-31.51F, -11F, -1.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 165 lamp
		bodyModel[155].setRotationPoint(-31.51F, -11F, 0.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 166 lamp
		bodyModel[156].setRotationPoint(-31.51F, -13F, 0.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 167 lamp
		bodyModel[157].setRotationPoint(-31.51F, -13F, -1.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 168 lamp
		bodyModel[158].setRotationPoint(-32.01F, -8F, 0.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 169 lamp
		bodyModel[159].setRotationPoint(-32.01F, -8F, -1.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 170 lamp
		bodyModel[160].setRotationPoint(-32.01F, -6F, -1.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 171 lamp
		bodyModel[161].setRotationPoint(-32.01F, -6F, 0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 172
		bodyModel[162].setRotationPoint(-30F, -13F, 2F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[163].setRotationPoint(-13F, -20F, -5F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[164].setRotationPoint(-13F, -19F, -5F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[165].setRotationPoint(-13F, -20F, 4F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[166].setRotationPoint(-11F, -19F, 4F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 177
		bodyModel[167].setRotationPoint(24F, -10F, -11.75F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		bodyModel[168].setRotationPoint(19F, -10F, -11.75F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[169].setRotationPoint(24F, -10F, 10.75F);

		bodyModel[170].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 180
		bodyModel[170].setRotationPoint(19F, -10F, 10.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 rotating lamp?
		bodyModel[171].setRotationPoint(-14F, -20F, -0.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 349
		bodyModel[172].setRotationPoint(-13.82F, -20F, -0.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 183 CNW Gong
		bodyModel[173].setRotationPoint(-32F, -12.5F, -1F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 184 liveryimg 2 glow
		bodyModel[174].setRotationPoint(-28.51F, -9F, -9F);
		bodyModel[174].rotateAngleY = 0.4712389F;

		bodyModel[175].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 185 liveryimg 2 glow
		bodyModel[175].setRotationPoint(-28.51F, -9F, 9F);
		bodyModel[175].rotateAngleY = -0.4712389F;

		bodyModel[176].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186
		bodyModel[176].setRotationPoint(19.35F, -21F, -3F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[177].setRotationPoint(27F, -20F, -3F);

		bodyModel[178].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[178].setRotationPoint(29F, -20F, 1F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[179].setRotationPoint(19.5F, 1F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[180].setRotationPoint(19.5F, 1F, 11F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[181].setRotationPoint(28F, 1F, 11F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[182].setRotationPoint(28F, 1F, -11F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 193
		bodyModel[183].setRotationPoint(-14F, -20.5F, 2F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 194
		bodyModel[184].setRotationPoint(-12F, -19.5F, 2.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 195
		bodyModel[185].setRotationPoint(-13F, -20.5F, 3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 37, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[186].setRotationPoint(-6F, -14F, -11.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 37, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[187].setRotationPoint(-6F, -14F, 10.25F);

		bodyModel[188].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[188].setRotationPoint(31F, -6F, -11.75F);

		bodyModel[189].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[189].setRotationPoint(28F, -6F, -11.75F);

		bodyModel[190].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[190].setRotationPoint(31F, -6F, 10.75F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[191].setRotationPoint(28F, -6F, 10.75F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[192].setRotationPoint(32.5F, -19F, -3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[193].setRotationPoint(32.5F, -19F, -7F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[194].setRotationPoint(32.5F, -15F, -5F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 315
		bodyModel[195].setRotationPoint(32.5F, -17F, -5F);

		bodyModel[196].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[196].setRotationPoint(32.5F, -15F, 4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[197].setRotationPoint(32.5F, 0F, -5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[198].setRotationPoint(7F, -21F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[199].setRotationPoint(18F, -21F, -1F);

		bodyModel[200].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[200].setRotationPoint(-10F, -20.5F, -1F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[201].setRotationPoint(-9F, -20.5F, 0F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[202].setRotationPoint(-11F, -20.5F, 1F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 214
		bodyModel[203].setRotationPoint(-8F, -19.5F, 0.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 215
		bodyModel[204].setRotationPoint(-16F, -20.5F, 4F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 216
		bodyModel[205].setRotationPoint(-15F, -20F, 5F);

		bodyModel[206].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 217
		bodyModel[206].setRotationPoint(-17F, -19.5F, 6F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 218
		bodyModel[207].setRotationPoint(-14F, -19F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[208].setRotationPoint(-18F, -9F, 3.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[209].setRotationPoint(-18.5F, -7F, 3F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[210].setRotationPoint(-16F, -9.5F, -4F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[211].setRotationPoint(-17F, -9.5F, -5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[212].setRotationPoint(-18F, -9.5F, -4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[213].setRotationPoint(-16F, -9.5F, -5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[214].setRotationPoint(-16F, -9.5F, -3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[215].setRotationPoint(-18F, -9.5F, -5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[216].setRotationPoint(-18F, -9.5F, -3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[217].setRotationPoint(-19F, -10.3F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[218].setRotationPoint(-17.5F, -11.5F, -4.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131
		bodyModel[219].setRotationPoint(-19.5F, -11.5F, -3.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[220].setRotationPoint(32.5F, -19F, 3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[221].setRotationPoint(32F, -10.5F, -9F);

		bodyModel[222].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[222].setRotationPoint(32.51F, 0F, -10F);

		bodyModel[223].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[223].setRotationPoint(32.51F, 0F, 5F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[224].setRotationPoint(18F, 1F, -2F);

		bodyModel[225].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[225].setRotationPoint(-16F, 1F, -2F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[226].setRotationPoint(-18F, -20F, -2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[227].setRotationPoint(-18.75F, -20F, 0F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[228].setRotationPoint(-18.75F, -20F, -2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443 lamp
		bodyModel[229].setRotationPoint(-31.25F, -1.25F, -6.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444
		bodyModel[230].setRotationPoint(-30.5F, -1.25F, -6.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 lamp
		bodyModel[231].setRotationPoint(-31.25F, -1.25F, 4.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 446
		bodyModel[232].setRotationPoint(-30.5F, -1.25F, 4.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 447
		bodyModel[233].setRotationPoint(16F, -21F, -4F);

		bodyModel[234].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 448
		bodyModel[234].setRotationPoint(14F, -21F, -3F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 449
		bodyModel[235].setRotationPoint(15F, -21F, -5F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 450
		bodyModel[236].setRotationPoint(17F, -20F, -3.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[237].setRotationPoint(-11F, -25F, 6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[238].setRotationPoint(-11F, -25F, 8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[239].setRotationPoint(-11F, -24F, 5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[240].setRotationPoint(-11F, -24F, 8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[241].setRotationPoint(-11F, -22F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[242].setRotationPoint(-11F, -22F, 5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[243].setRotationPoint(-11F, -22F, -8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[244].setRotationPoint(-11F, -22F, -10F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[245].setRotationPoint(-11F, -24F, -9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[246].setRotationPoint(-11F, -24F, -8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[247].setRotationPoint(-11F, -25F, -8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[248].setRotationPoint(-11F, -25F, -9F);
	}
	ModelBlombergB theTrucc = new ModelBlombergB();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 249; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.9, 0.05, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.15, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		/*} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		 */
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-0.9, 0.05, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.15, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelF7A[];

}