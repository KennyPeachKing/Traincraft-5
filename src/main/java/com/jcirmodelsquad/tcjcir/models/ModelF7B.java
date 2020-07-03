//stop, waitaminute, take my cup put some liquor in it!

package com.jcirmodelsquad.tcjcir.models; //Path where my ass is located hAh


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelF7B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelF7B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[175];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 1
		bodyModel[21] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 1
		bodyModel[55] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 1
		bodyModel[56] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 1
		bodyModel[57] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 1
		bodyModel[58] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 42
		bodyModel[59] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 44
		bodyModel[60] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 45
		bodyModel[61] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 46
		bodyModel[62] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 48
		bodyModel[63] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 50
		bodyModel[64] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 324
		bodyModel[65] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 325
		bodyModel[66] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 123
		bodyModel[67] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 254
		bodyModel[68] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 255
		bodyModel[69] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 136
		bodyModel[70] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 137
		bodyModel[71] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 138
		bodyModel[72] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 314
		bodyModel[76] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 315
		bodyModel[77] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 316
		bodyModel[78] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 317
		bodyModel[79] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 202
		bodyModel[84] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 203
		bodyModel[85] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 231
		bodyModel[86] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 93
		bodyModel[87] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 94
		bodyModel[88] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 95
		bodyModel[89] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 438
		bodyModel[90] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 439
		bodyModel[91] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 187
		bodyModel[92] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 188
		bodyModel[93] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 196
		bodyModel[94] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 197
		bodyModel[95] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 177
		bodyModel[96] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 178
		bodyModel[97] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 179
		bodyModel[98] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 180
		bodyModel[99] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 189
		bodyModel[100] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 190
		bodyModel[101] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 191
		bodyModel[102] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 192
		bodyModel[103] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 198
		bodyModel[104] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 199
		bodyModel[105] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 200
		bodyModel[106] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 201
		bodyModel[107] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 177
		bodyModel[108] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 178
		bodyModel[109] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 179
		bodyModel[110] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 180
		bodyModel[111] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 189
		bodyModel[112] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 190
		bodyModel[113] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 191
		bodyModel[114] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 192
		bodyModel[115] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 198
		bodyModel[116] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 199
		bodyModel[117] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 200
		bodyModel[118] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 201
		bodyModel[119] = new ModelRendererTurbo(this, 289, 65, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[120] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 222
		bodyModel[121] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 223
		bodyModel[122] = new ModelRendererTurbo(this, 457, 65, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[123] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 222
		bodyModel[124] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 223
		bodyModel[125] = new ModelRendererTurbo(this, 465, 65, textureX, textureY, "lamp"); // Box 132 lamp
		bodyModel[126] = new ModelRendererTurbo(this, 473, 65, textureX, textureY, "lamp"); // Box 133 lamp
		bodyModel[127] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 134
		bodyModel[128] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 114
		bodyModel[129] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 74
		bodyModel[130] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 78
		bodyModel[131] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 245
		bodyModel[132] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 139
		bodyModel[133] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 336
		bodyModel[134] = new ModelRendererTurbo(this, 481, 65, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[135] = new ModelRendererTurbo(this, 489, 65, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[136] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 301
		bodyModel[137] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 302
		bodyModel[138] = new ModelRendererTurbo(this, 313, 74, textureX, textureY); // Box 186
		bodyModel[139] = new ModelRendererTurbo(this, 105, 136, textureX, textureY); // Box 131
		bodyModel[140] = new ModelRendererTurbo(this, 103, 140, textureX, textureY); // Box 131
		bodyModel[141] = new ModelRendererTurbo(this, 78, 145, textureX, textureY); // Box 131
		bodyModel[142] = new ModelRendererTurbo(this, 76, 133, textureX, textureY); // Box 131
		bodyModel[143] = new ModelRendererTurbo(this, 78, 123, textureX, textureY); // Box 131
		bodyModel[144] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 131
		bodyModel[145] = new ModelRendererTurbo(this, 83, 145, textureX, textureY); // Box 131
		bodyModel[146] = new ModelRendererTurbo(this, 71, 135, textureX, textureY); // Box 131
		bodyModel[147] = new ModelRendererTurbo(this, 85, 135, textureX, textureY); // Box 131
		bodyModel[148] = new ModelRendererTurbo(this, 76, 118, textureX, textureY); // Box 131
		bodyModel[149] = new ModelRendererTurbo(this, 92, 131, textureX, textureY); // Box 131
		bodyModel[150] = new ModelRendererTurbo(this, 91, 136, textureX, textureY); // Box 131
		bodyModel[151] = new ModelRendererTurbo(this, 182, 177, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 182, 162, textureX, textureY); // Box 2
		bodyModel[153] = new ModelRendererTurbo(this, 182, 133, textureX, textureY); // Box 3
		bodyModel[154] = new ModelRendererTurbo(this, 182, 118, textureX, textureY); // Box 4
		bodyModel[155] = new ModelRendererTurbo(this, 190, 111, textureX, textureY); // Box 5
		bodyModel[156] = new ModelRendererTurbo(this, 190, 97, textureX, textureY); // Box 6
		bodyModel[157] = new ModelRendererTurbo(this, 190, 104, textureX, textureY); // Box 7
		bodyModel[158] = new ModelRendererTurbo(this, 172, 110, textureX, textureY); // Box 10
		bodyModel[159] = new ModelRendererTurbo(this, 179, 105, textureX, textureY); // Box 11
		bodyModel[160] = new ModelRendererTurbo(this, 165, 105, textureX, textureY); // Box 12
		bodyModel[161] = new ModelRendererTurbo(this, 179, 114, textureX, textureY); // Box 13
		bodyModel[162] = new ModelRendererTurbo(this, 248, 122, textureX, textureY); // Box 14
		bodyModel[163] = new ModelRendererTurbo(this, 182, 148, textureX, textureY); // Box 3
		bodyModel[164] = new ModelRendererTurbo(this, 187, 87, textureX, textureY); // Box 9
		bodyModel[165] = new ModelRendererTurbo(this, 239, 104, textureX, textureY); // Box 9
		bodyModel[166] = new ModelRendererTurbo(this, 219, 87, textureX, textureY); // Box 9
		bodyModel[167] = new ModelRendererTurbo(this, 187, 92, textureX, textureY); // Box 9
		bodyModel[168] = new ModelRendererTurbo(this, 219, 92, textureX, textureY); // Box 9
		bodyModel[169] = new ModelRendererTurbo(this, 235, 117, textureX, textureY); // Box 21
		bodyModel[170] = new ModelRendererTurbo(this, 215, 84, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 207, 84, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 144, 122, textureX, textureY); // Box 13
		bodyModel[173] = new ModelRendererTurbo(this, 151, 102, textureX, textureY); // Box 10
		bodyModel[174] = new ModelRendererTurbo(this, 151, 111, textureX, textureY); // Box 10

		bodyModel[0].addBox(0F, 0F, 0F, 62, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-30.5F, -2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-34.5F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(32.5F, 2F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 38, 16, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-18.5F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 38, 16, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-18.5F, -15F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 62, 2, 4, 0F); // Box 0
		bodyModel[5].setRotationPoint(-30.5F, -1F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 0
		bodyModel[6].setRotationPoint(31.5F, -15F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 64, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-31.5F, -19F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 64, 1, 6, 0F); // Box 0
		bodyModel[8].setRotationPoint(-31.5F, -19F, -3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 64, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-31.5F, -19F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-31.5F, -18F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-31.5F, -18F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-31.5F, -16F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-31.5F, -16F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[14].setRotationPoint(31.5F, -17F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[15].setRotationPoint(31.5F, -18F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(31.5F, -17F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(31.5F, -17F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(31.5F, -18F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(31.5F, -18F, 3F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[20].setRotationPoint(-31.5F, 1F, -2F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[21].setRotationPoint(-31.5F, -1F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[22].setRotationPoint(-31.5F, 1F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[23].setRotationPoint(-31.5F, 1F, 2F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 0
		bodyModel[24].setRotationPoint(-31.5F, -15F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[25].setRotationPoint(-31.5F, -17F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[26].setRotationPoint(-31.5F, -18F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-31.5F, -17F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-31.5F, -17F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-31.5F, -18F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(-31.5F, -18F, 3F);

		bodyModel[31].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 0
		bodyModel[31].setRotationPoint(-31.5F, -15F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[32].setRotationPoint(-22.5F, -2F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[33].setRotationPoint(-22.5F, -2F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 0
		bodyModel[34].setRotationPoint(-31.5F, -15F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 0
		bodyModel[35].setRotationPoint(23.5F, -15F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 9, 16, 1, 0F); // Box 0
		bodyModel[36].setRotationPoint(23.5F, -15F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[37].setRotationPoint(19.5F, -2F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[38].setRotationPoint(19.5F, -2F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[39].setRotationPoint(19.5F, -10F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[40].setRotationPoint(-22.5F, -10F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(19.5F, -10F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(-22.5F, -10F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[43].setRotationPoint(-22.5F, -15F, 10F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[44].setRotationPoint(-22.5F, -15F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[45].setRotationPoint(19.5F, -15F, 10F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[46].setRotationPoint(19.5F, -15F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[47].setRotationPoint(-14.5F, -20F, -3F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[48].setRotationPoint(-7.5F, -20F, -2F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[49].setRotationPoint(-1.5F, -20F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[50].setRotationPoint(-3F, -20F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[51].setRotationPoint(4.5F, -20F, -2F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[52].setRotationPoint(10.5F, -20F, -2F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[53].setRotationPoint(9F, -20F, -1F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[54].setRotationPoint(31.5F, 1F, -2F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[55].setRotationPoint(31.5F, -1F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[56].setRotationPoint(31.5F, 1F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[57].setRotationPoint(31.5F, 1F, 2F);

		bodyModel[58].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 42
		bodyModel[58].setRotationPoint(-2F, 0F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[59].setRotationPoint(-2F, 4F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[60].setRotationPoint(-6F, 1.5F, -10.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 3, 19, 0F); // Box 46
		bodyModel[61].setRotationPoint(-6F, 1.5F, -9.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 48
		bodyModel[62].setRotationPoint(-6F, 4.5F, -9.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[63].setRotationPoint(-6F, 1.5F, 9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[64].setRotationPoint(-2F, 4F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[65].setRotationPoint(-2F, 4F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[66].setRotationPoint(-6F, 1F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[67].setRotationPoint(-9F, 1F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[68].setRotationPoint(-6F, 1F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[69].setRotationPoint(-9F, 1F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[70].setRotationPoint(6F, 1F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[71].setRotationPoint(6F, 1F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 1, 21, 0F); // Box 139
		bodyModel[72].setRotationPoint(-6F, 0.5F, -10.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 140
		bodyModel[73].setRotationPoint(3F, 1F, -10.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 141
		bodyModel[74].setRotationPoint(3F, 1F, 9.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[75].setRotationPoint(32.5F, -15F, -5F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 315
		bodyModel[76].setRotationPoint(32.5F, -17F, -5F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[77].setRotationPoint(32.5F, -15F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[78].setRotationPoint(32.5F, 0F, -5F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 86
		bodyModel[79].setRotationPoint(-33.5F, -15F, -5F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 87
		bodyModel[80].setRotationPoint(-33.5F, -17F, -5F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 88
		bodyModel[81].setRotationPoint(-33.5F, -15F, 4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 89
		bodyModel[82].setRotationPoint(-33.5F, 0F, -5F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[83].setRotationPoint(32.5F, -19F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[84].setRotationPoint(32.5F, -19F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[85].setRotationPoint(32.5F, -19F, 3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[86].setRotationPoint(-33.5F, -19F, -7F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 94
		bodyModel[87].setRotationPoint(-33.5F, -19F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 95
		bodyModel[88].setRotationPoint(-33.5F, -19F, 3F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[89].setRotationPoint(18F, 1F, -2F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[90].setRotationPoint(-21F, 1F, -2F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[91].setRotationPoint(27F, -20F, -3F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[92].setRotationPoint(29F, -20F, 1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 61, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[93].setRotationPoint(-30F, -14F, -11.25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 61, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[94].setRotationPoint(-30F, -14F, 10.25F);

		bodyModel[95].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 177
		bodyModel[95].setRotationPoint(24F, -10F, -11.75F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		bodyModel[96].setRotationPoint(19F, -10F, -11.75F);

		bodyModel[97].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[97].setRotationPoint(24F, -10F, 10.75F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 180
		bodyModel[98].setRotationPoint(19F, -10F, 10.75F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[99].setRotationPoint(19.5F, 1F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[100].setRotationPoint(19.5F, 1F, 11F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[101].setRotationPoint(28F, 1F, 11F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[102].setRotationPoint(28F, 1F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[103].setRotationPoint(31F, -6F, -11.75F);

		bodyModel[104].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[104].setRotationPoint(28F, -6F, -11.75F);

		bodyModel[105].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[105].setRotationPoint(31F, -6F, 10.75F);

		bodyModel[106].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[106].setRotationPoint(28F, -6F, 10.75F);

		bodyModel[107].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 177
		bodyModel[107].setRotationPoint(-18F, -10F, -11.75F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		bodyModel[108].setRotationPoint(-23F, -10F, -11.75F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[109].setRotationPoint(-18F, -10F, 10.75F);

		bodyModel[110].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 180
		bodyModel[110].setRotationPoint(-23F, -10F, 10.75F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[111].setRotationPoint(-22.5F, 1F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[112].setRotationPoint(-22.5F, 1F, 11F);

		bodyModel[113].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[113].setRotationPoint(-30F, 1F, 11F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[114].setRotationPoint(-30F, 1F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[115].setRotationPoint(-27F, -6F, -11.75F);

		bodyModel[116].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[116].setRotationPoint(-30F, -6F, -11.75F);

		bodyModel[117].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[117].setRotationPoint(-27F, -6F, 10.75F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[118].setRotationPoint(-30F, -6F, 10.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[119].setRotationPoint(32F, -10.5F, -9F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[120].setRotationPoint(32.51F, 0F, -10F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[121].setRotationPoint(32.51F, 0F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[122].setRotationPoint(-32F, -10.5F, 7F);

		bodyModel[123].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[123].setRotationPoint(-31.51F, 0F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[124].setRotationPoint(-31.51F, 0F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 132 lamp
		bodyModel[125].setRotationPoint(32F, -10.5F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 133 lamp
		bodyModel[126].setRotationPoint(-32F, -10.5F, -9F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 134
		bodyModel[127].setRotationPoint(-33.51F, 5F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[128].setRotationPoint(-33F, -15F, -7.7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[129].setRotationPoint(-33F, -16F, -7.7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[130].setRotationPoint(-32.75F, -14.5F, -7.45F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 245
		bodyModel[131].setRotationPoint(-33.25F, -17F, -7.75F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 0, 5, 0F); // Box 139
		bodyModel[132].setRotationPoint(32.51F, 5F, -10F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[133].setRotationPoint(-32F, -21F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[134].setRotationPoint(-32.75F, -21F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[135].setRotationPoint(-32.75F, -21F, -2F);

		bodyModel[136].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[136].setRotationPoint(-31F, -20F, -7F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[137].setRotationPoint(-29F, -19F, -7F);

		bodyModel[138].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 186
		bodyModel[138].setRotationPoint(10.35F, -21F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[139].setRotationPoint(-28F, -9F, -1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[140].setRotationPoint(-28.5F, -7F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[141].setRotationPoint(-28F, -9.5F, -4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[142].setRotationPoint(-29F, -9.5F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[143].setRotationPoint(-30F, -9.5F, -4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[144].setRotationPoint(-28F, -9.5F, -5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[145].setRotationPoint(-28F, -9.5F, -3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[146].setRotationPoint(-30F, -9.5F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[147].setRotationPoint(-30F, -9.5F, -3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[148].setRotationPoint(-29.5F, -11.5F, -4.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[149].setRotationPoint(-30.75F, -12F, -3F);
		bodyModel[149].rotateAngleY = -0.78539816F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[150].setRotationPoint(-31.5F, -11F, -3.75F);
		bodyModel[150].rotateAngleY = -0.78539816F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[151].setRotationPoint(-6.5F, -5F, -6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 20, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[152].setRotationPoint(-6.5F, -7F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 20, 2, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[153].setRotationPoint(-6.5F, -10F, -6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 20, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[154].setRotationPoint(-6.5F, -12F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[155].setRotationPoint(-6.5F, -14F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[156].setRotationPoint(-6.5F, -14F, 2F);

		bodyModel[157].addBox(0F, 0F, 0F, 20, 2, 4, 0F); // Box 7
		bodyModel[157].setRotationPoint(-6.5F, -14F, -2F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[158].setRotationPoint(-7.5F, -16F, -2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[159].setRotationPoint(-7.5F, -16F, -6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[160].setRotationPoint(-7.5F, -16F, 2F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 13
		bodyModel[161].setRotationPoint(-7.5F, -12F, -3F);

		bodyModel[162].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[162].setRotationPoint(13.5F, -6F, -5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 20, 1, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[163].setRotationPoint(-6.5F, -8F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[164].setRotationPoint(-5.5F, -16F, -1.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[165].setRotationPoint(13.5F, -14F, -4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[166].setRotationPoint(4.5F, -16F, -1.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[167].setRotationPoint(-5.5F, -15F, -1.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[168].setRotationPoint(4.5F, -15F, -1.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[169].setRotationPoint(13.5F, -10F, -2F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[170].setRotationPoint(-3F, -18F, -1F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 0
		bodyModel[171].setRotationPoint(9F, -18F, -1F);

		bodyModel[172].addBox(0F, 0F, 0F, 3, 15, 12, 0F); // Box 13
		bodyModel[172].setRotationPoint(-16.5F, -17F, -6F);

		bodyModel[173].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[173].setRotationPoint(-12.5F, -15F, 3F);

		bodyModel[174].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[174].setRotationPoint(-12.5F, -15F, -6F);
	}
	ModelBlombergB theTrucc = new ModelBlombergB();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 175; i++) {
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
			GL11.glTranslated(-1.25, 0.05, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.5, 0, 0);
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
			GL11.glTranslated(-1.25, 0.05, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.5, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelF7B[];

}