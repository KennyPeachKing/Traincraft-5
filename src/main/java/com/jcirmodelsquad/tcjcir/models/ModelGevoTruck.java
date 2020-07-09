//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.04.2020 - 20:13:16
// Last changed on: 27.04.2020 - 20:13:16

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelGevoTruck extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGevoTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[91];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 173
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 61
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 53
		bodyModel[43] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 54
		bodyModel[44] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 59
		bodyModel[49] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 60
		bodyModel[50] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 61
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 62
		bodyModel[52] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 64
		bodyModel[54] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 65
		bodyModel[55] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 67
		bodyModel[57] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 68
		bodyModel[58] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 69
		bodyModel[59] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 70
		bodyModel[60] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 71
		bodyModel[61] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 72
		bodyModel[62] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 73
		bodyModel[63] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 74
		bodyModel[64] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 75
		bodyModel[65] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 76
		bodyModel[66] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 77
		bodyModel[67] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 83
		bodyModel[73] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 84
		bodyModel[74] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 85
		bodyModel[75] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 86
		bodyModel[76] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 87
		bodyModel[77] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 91
		bodyModel[81] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 92
		bodyModel[82] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 93
		bodyModel[83] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 94
		bodyModel[84] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 95
		bodyModel[85] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 96
		bodyModel[86] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 97
		bodyModel[87] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 98
		bodyModel[88] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 99
		bodyModel[89] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 100
		bodyModel[90] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 90

		bodyModel[0].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-10F, 0.5F, -6F);

		bodyModel[1].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0.5F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 4
		bodyModel[2].setRotationPoint(-11F, -0.5F, -8.5F);

		bodyModel[3].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 3
		bodyModel[3].setRotationPoint(-10F, 0.5F, 6F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0.5F, 6F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 10
		bodyModel[5].setRotationPoint(10F, 0.5F, -6F);

		bodyModel[6].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 11
		bodyModel[6].setRotationPoint(10F, 0.5F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[7].setRotationPoint(-11F, -0.5F, -8.75F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 61
		bodyModel[8].setRotationPoint(-11F, -0.5F, 7.75F);

		bodyModel[9].addBox(0F, 0F, 0F, 26, 1, 1, 0F); // Box 14
		bodyModel[9].setRotationPoint(-13F, -2F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 15
		bodyModel[10].setRotationPoint(-8F, -1F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[11].setRotationPoint(-2F, -1F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 22
		bodyModel[12].setRotationPoint(2F, -1F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[13].setRotationPoint(-1F, -0.5F, -8.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 24
		bodyModel[14].setRotationPoint(-1F, -0.5F, 7.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 25
		bodyModel[15].setRotationPoint(9F, -0.5F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 26
		bodyModel[16].setRotationPoint(9F, -0.5F, 7.75F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 27
		bodyModel[17].setRotationPoint(-1F, -0.5F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 28
		bodyModel[18].setRotationPoint(9F, -0.5F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(-9F, -0.5F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[20].setRotationPoint(-12F, -0.5F, -8.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 31
		bodyModel[21].setRotationPoint(-13F, 1.5F, -8.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 32
		bodyModel[22].setRotationPoint(-3F, 1.5F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 34
		bodyModel[23].setRotationPoint(-13F, 0F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 35
		bodyModel[24].setRotationPoint(-8F, 0F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		bodyModel[25].setRotationPoint(-12F, -3F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[26].setRotationPoint(-13F, -3F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[27].setRotationPoint(-3F, -3F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[28].setRotationPoint(-2F, -0.5F, -8.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 40
		bodyModel[29].setRotationPoint(-3F, 0F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(1F, -0.5F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 42
		bodyModel[31].setRotationPoint(2F, 0F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[32].setRotationPoint(8F, -0.5F, -8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 44
		bodyModel[33].setRotationPoint(7F, 0F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[34].setRotationPoint(11F, -0.5F, -8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 46
		bodyModel[35].setRotationPoint(12F, 0F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 47
		bodyModel[36].setRotationPoint(7F, 1.5F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[37].setRotationPoint(7F, -3F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		bodyModel[38].setRotationPoint(9F, -3F, -8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[39].setRotationPoint(1F, -1F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[40].setRotationPoint(-9F, -1F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[41].setRotationPoint(-12F, -1F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[42].setRotationPoint(11F, -1F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[43].setRotationPoint(8F, -1F, -8F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 55
		bodyModel[44].setRotationPoint(-12.25F, -2.5F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 56
		bodyModel[45].setRotationPoint(-10.5F, -2F, -9F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 57
		bodyModel[46].setRotationPoint(7.5F, -2F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 58
		bodyModel[47].setRotationPoint(10.25F, -2.5F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 59
		bodyModel[48].setRotationPoint(-13F, -1F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 60
		bodyModel[49].setRotationPoint(-14F, -2F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 61
		bodyModel[50].setRotationPoint(12F, -1F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 62
		bodyModel[51].setRotationPoint(13F, -2F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 7, 5, 11, 0F); // Box 63
		bodyModel[52].setRotationPoint(-12F, -2.5F, -5.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 7, 5, 11, 0F); // Box 64
		bodyModel[53].setRotationPoint(5F, -2.5F, -5.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 10, 6, 11, 0F); // Box 65
		bodyModel[54].setRotationPoint(-5F, -3F, -5.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 66
		bodyModel[55].setRotationPoint(-13F, -1F, 7F);

		bodyModel[56].addBox(0F, 0F, 0F, 26, 1, 1, 0F); // Box 67
		bodyModel[56].setRotationPoint(-13F, -2F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[57].setRotationPoint(-12F, -1F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[58].setRotationPoint(-9F, -1F, 7F);

		bodyModel[59].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 70
		bodyModel[59].setRotationPoint(-8F, -1F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[60].setRotationPoint(-2F, -1F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[61].setRotationPoint(1F, -1F, 7F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 73
		bodyModel[62].setRotationPoint(2F, -1F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[63].setRotationPoint(8F, -1F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[64].setRotationPoint(11F, -1F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 76
		bodyModel[65].setRotationPoint(12F, -1F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[66].setRotationPoint(-13F, -3F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[67].setRotationPoint(7F, -3F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[68].setRotationPoint(-3F, -3F, 7F);

		bodyModel[69].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 80
		bodyModel[69].setRotationPoint(-3F, 1.5F, 6.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 81
		bodyModel[70].setRotationPoint(-3F, 0F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[71].setRotationPoint(-2F, -0.5F, 6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[72].setRotationPoint(1F, -0.5F, 6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 84
		bodyModel[73].setRotationPoint(2F, 0F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 85
		bodyModel[74].setRotationPoint(-8F, 0F, 7F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 86
		bodyModel[75].setRotationPoint(-13F, 1.5F, 6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[76].setRotationPoint(-9F, -0.5F, 6.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[77].setRotationPoint(-12F, -0.5F, 6.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 89
		bodyModel[78].setRotationPoint(-13F, 0F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 90
		bodyModel[79].setRotationPoint(7F, 0F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 91
		bodyModel[80].setRotationPoint(7F, 1.5F, 6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[81].setRotationPoint(8F, -0.5F, 6.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[82].setRotationPoint(11F, -0.5F, 6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F, 0F, -5.5F, -0.25F); // Box 94
		bodyModel[83].setRotationPoint(12F, 0F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[84].setRotationPoint(-12F, -3F, 7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[85].setRotationPoint(9F, -3F, 7.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 97
		bodyModel[86].setRotationPoint(10.25F, -2.5F, 8F);

		bodyModel[87].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 98
		bodyModel[87].setRotationPoint(7.5F, -2F, 8F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 99
		bodyModel[88].setRotationPoint(-10.5F, -2F, 8F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 100
		bodyModel[89].setRotationPoint(-12.25F, -2.5F, 8F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 90
		bodyModel[90].setRotationPoint(-2F, -4F, -2F);
	}
}