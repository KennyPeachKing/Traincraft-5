//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.07.2020 - 22:30:54
// Last changed on: 20.07.2020 - 22:30:54

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTGVMobile extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTGVMobile() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[105];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 95
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 47
		bodyModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 54
		bodyModel[10] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 62
		bodyModel[54] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 66
		bodyModel[58] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 68
		bodyModel[60] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 69
		bodyModel[61] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 70
		bodyModel[62] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 71
		bodyModel[63] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 72
		bodyModel[64] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 73
		bodyModel[65] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 74
		bodyModel[66] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 75
		bodyModel[67] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 76
		bodyModel[68] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 77
		bodyModel[69] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 78
		bodyModel[70] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 79
		bodyModel[71] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 80
		bodyModel[72] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 81
		bodyModel[73] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 82
		bodyModel[74] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 83
		bodyModel[75] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 84
		bodyModel[76] = new ModelRendererTurbo(this, 345, 33, textureX, textureY, "lamp"); // Box 85 glow
		bodyModel[77] = new ModelRendererTurbo(this, 369, 33, textureX, textureY, "lamp"); // Box 86 glow
		bodyModel[78] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 87
		bodyModel[79] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 88
		bodyModel[80] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 89
		bodyModel[81] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 90
		bodyModel[82] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 91
		bodyModel[83] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 92
		bodyModel[84] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 93
		bodyModel[85] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 94
		bodyModel[86] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 95
		bodyModel[87] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 96
		bodyModel[88] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 97
		bodyModel[89] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 98
		bodyModel[90] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 99
		bodyModel[91] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 100
		bodyModel[92] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 102
		bodyModel[93] = new ModelRendererTurbo(this, 433, 17, textureX, textureY, "lamp"); // Box 103 glow
		bodyModel[94] = new ModelRendererTurbo(this, 505, 17, textureX, textureY, "lamp"); // Box 104 glow
		bodyModel[95] = new ModelRendererTurbo(this, 444, 38, textureX, textureY); // Box 100
		bodyModel[96] = new ModelRendererTurbo(this, 291, 49, textureX, textureY); // Box 101
		bodyModel[97] = new ModelRendererTurbo(this, 276, 44, textureX, textureY); // Box 102
		bodyModel[98] = new ModelRendererTurbo(this, 467, 20, textureX, textureY); // Box 103
		bodyModel[99] = new ModelRendererTurbo(this, 467, 12, textureX, textureY); // Box 104
		bodyModel[100] = new ModelRendererTurbo(this, 444, 38, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 276, 44, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 467, 12, textureX, textureY); // Box 105
		bodyModel[103] = new ModelRendererTurbo(this, 467, 20, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 291, 49, textureX, textureY); // Box 107

		bodyModel[0].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-24F, 3F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 95
		bodyModel[1].setRotationPoint(-21.5F, 5.5F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 2
		bodyModel[2].setRotationPoint(-24F, 3F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 3
		bodyModel[3].setRotationPoint(19.5F, 5.5F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(17F, 3F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 5
		bodyModel[5].setRotationPoint(17F, 3F, 6F);

		bodyModel[6].addBox(0F, 0F, 0F, 39, 1, 1, 0F); // Box 6
		bodyModel[6].setRotationPoint(-19.5F, 6F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 31, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		bodyModel[7].setRotationPoint(-15F, 3F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 9, 3, 10, 0F); // Box 47
		bodyModel[8].setRotationPoint(16F, 3F, -5F);

		bodyModel[9].addBox(0F, 0F, 0F, 11, 3, 10, 0F); // Box 54
		bodyModel[9].setRotationPoint(-26F, 3F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[10].setRotationPoint(25F, 3F, -8F);

		bodyModel[11].addBox(0F, 0F, 0F, 26, 5, 1, 0F); // Box 14
		bodyModel[11].setRotationPoint(-10F, -2F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 15
		bodyModel[12].setRotationPoint(16F, -2F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 16
		bodyModel[13].setRotationPoint(25F, -2F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 17
		bodyModel[14].setRotationPoint(16F, -2F, 4F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 18
		bodyModel[15].setRotationPoint(25F, -2F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 26, 5, 1, 0F); // Box 19
		bodyModel[16].setRotationPoint(-10F, -2F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 40, 13, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(-10F, -15F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 40, 13, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[18].setRotationPoint(-10F, -15F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 23
		bodyModel[19].setRotationPoint(-21F, -4F, -8F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 24
		bodyModel[20].setRotationPoint(-15F, 2F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 11, 1, 16, 0F); // Box 25
		bodyModel[21].setRotationPoint(-21F, 1F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 26
		bodyModel[22].setRotationPoint(-24F, -4F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-33F, -1F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 28
		bodyModel[24].setRotationPoint(-33F, -1F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 31
		bodyModel[25].setRotationPoint(-21F, -4F, 7F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 32
		bodyModel[26].setRotationPoint(-15F, 2F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[27].setRotationPoint(-33F, -4F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 34
		bodyModel[28].setRotationPoint(-33F, -4F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 35
		bodyModel[29].setRotationPoint(-33F, -4F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 36
		bodyModel[30].setRotationPoint(-33F, 3F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-33F, 2F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -3F); // Box 38
		bodyModel[32].setRotationPoint(-33F, 2F, 5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, -3F, -3F); // Box 39
		bodyModel[33].setRotationPoint(-33F, 3F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 40
		bodyModel[34].setRotationPoint(-21F, -6F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 41
		bodyModel[35].setRotationPoint(-17F, -12F, 6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, 5F, 0F, 1F); // Box 42
		bodyModel[36].setRotationPoint(-18F, -14F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[37].setRotationPoint(-18F, -15F, -7F);

		bodyModel[38].addBox(0F, 0F, 0F, 7, 1, 14, 0F); // Box 44
		bodyModel[38].setRotationPoint(-17F, -15F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 45
		bodyModel[39].setRotationPoint(-18F, -14F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[40].setRotationPoint(-10F, -18F, -7F);

		bodyModel[41].addBox(0F, 0F, 0F, 24, 3, 14, 0F); // Box 47
		bodyModel[41].setRotationPoint(-8F, -18F, -7F);

		bodyModel[42].addBox(0F, 0F, 0F, 14, 2, 14, 0F); // Box 48
		bodyModel[42].setRotationPoint(16F, -17F, -7F);

		bodyModel[43].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 49
		bodyModel[43].setRotationPoint(-17F, -14F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 50
		bodyModel[44].setRotationPoint(-21F, -12F, 6.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[45].setRotationPoint(-18F, -14F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 53
		bodyModel[46].setRotationPoint(-22F, -6F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(-18F, -14F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 55
		bodyModel[48].setRotationPoint(-24F, -4.25F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[49].setRotationPoint(-24F, -4.25F, 2F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 57
		bodyModel[50].setRotationPoint(-25F, -4.25F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 58
		bodyModel[51].setRotationPoint(-33F, 3F, -5F);

		bodyModel[52].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 61
		bodyModel[52].setRotationPoint(-23F, 4F, -8.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 62
		bodyModel[53].setRotationPoint(18F, 4F, -8.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 63
		bodyModel[54].setRotationPoint(18F, 4F, 7.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 64
		bodyModel[55].setRotationPoint(-23F, 4F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[56].setRotationPoint(-34F, 0F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[57].setRotationPoint(-34F, 0F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[58].setRotationPoint(-34F, -1F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[59].setRotationPoint(-34F, -1F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 69
		bodyModel[60].setRotationPoint(-34F, 2F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 70
		bodyModel[61].setRotationPoint(-34F, 2F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[62].setRotationPoint(-30F, 5F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 72
		bodyModel[63].setRotationPoint(-30F, 5F, 4F);

		bodyModel[64].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 73
		bodyModel[64].setRotationPoint(-30F, 5F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 74
		bodyModel[65].setRotationPoint(-31F, 5F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 75
		bodyModel[66].setRotationPoint(-21F, -6F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 76
		bodyModel[67].setRotationPoint(-22F, -6F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 77
		bodyModel[68].setRotationPoint(-21F, -12F, -7.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 78
		bodyModel[69].setRotationPoint(-17F, -12F, -7.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[70].setRotationPoint(-18F, -14F, -7F);

		bodyModel[71].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 80
		bodyModel[71].setRotationPoint(-17F, -14F, -7F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 81
		bodyModel[72].setRotationPoint(-21F, -7F, -9.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 82
		bodyModel[73].setRotationPoint(-21F, -7F, 7.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 5, 14, 0F); // Box 83
		bodyModel[74].setRotationPoint(29F, -2F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 84
		bodyModel[75].setRotationPoint(29F, -5F, -7F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 85 glow
		bodyModel[76].setRotationPoint(29.5F, 0F, -7.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 86 glow
		bodyModel[77].setRotationPoint(29.5F, 0F, 5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 87
		bodyModel[78].setRotationPoint(30F, 5F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 88
		bodyModel[79].setRotationPoint(17F, -15F, -7F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 5, 8, 0F); // Box 89
		bodyModel[80].setRotationPoint(17F, -2F, -4F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 90
		bodyModel[81].setRotationPoint(15F, -2F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 91
		bodyModel[82].setRotationPoint(15F, -2F, 4F);

		bodyModel[83].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 92
		bodyModel[83].setRotationPoint(16F, 2F, 4F);

		bodyModel[84].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 93
		bodyModel[84].setRotationPoint(16F, 2F, -5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 94
		bodyModel[85].setRotationPoint(25F, -2F, 4F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 95
		bodyModel[86].setRotationPoint(25F, -2F, -7F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 18, 14, 0F); // Box 96
		bodyModel[87].setRotationPoint(-10F, -15F, -7F);

		bodyModel[88].addBox(0F, 0F, 0F, 16, 1, 10, 0F); // Box 97
		bodyModel[88].setRotationPoint(-26F, 2F, -5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 98
		bodyModel[89].setRotationPoint(-21F, -5F, -1.5F);
		bodyModel[89].rotateAngleZ = 0.34906585F;

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bodyModel[90].setRotationPoint(-21F, -4F, -0.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 15, 7, 6, 0F); // Box 100
		bodyModel[91].setRotationPoint(-4F, -4F, 1F);

		bodyModel[92].addBox(0F, 0F, 0F, 22, 2, 2, 0F); // Box 102
		bodyModel[92].setRotationPoint(-7F, -17F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 103 glow
		bodyModel[93].setRotationPoint(-33.5F, 0.5F, -4F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 104 glow
		bodyModel[94].setRotationPoint(-33.5F, 0.5F, 3F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 100
		bodyModel[95].setRotationPoint(-27F, 8F, -6F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 101
		bodyModel[96].setRotationPoint(-28F, 7F, -6F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 102
		bodyModel[97].setRotationPoint(-28F, 7F, 6F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 103
		bodyModel[98].setRotationPoint(-27F, 5F, -5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 104
		bodyModel[99].setRotationPoint(-27F, 5F, 4F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 103
		bodyModel[100].setRotationPoint(27F, 8F, -6F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 104
		bodyModel[101].setRotationPoint(26F, 7F, 6F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 105
		bodyModel[102].setRotationPoint(27F, 5F, 4F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 106
		bodyModel[103].setRotationPoint(27F, 5F, -5F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 107
		bodyModel[104].setRotationPoint(26F, 7F, -6F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 105; i++) {
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