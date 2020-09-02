//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.08.2020 - 01:14:27
// Last changed on: 17.08.2020 - 01:14:27

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelHustler extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHustler() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[62];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 6, 58, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 3, 58, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 21, 49, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 6, 49, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 3, 49, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 21, 51, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 10, 51, textureX, textureY); // Box 61

		bodyModel[0].addBox(0F, 0F, 0F, 48, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-24F, 2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 28, 10, 14, 0F); // Box 1
		bodyModel[1].setRotationPoint(-20F, -8F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 28, 2, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-20F, -10F, 2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-20F, -9F, 5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-20F, -9F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 28, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-20F, -10F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 28, 2, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-20F, -10F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 6, 22, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(21F, -4F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		bodyModel[8].setRotationPoint(-21F, -11F, -1.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 17, 22, 0F); // Box 12
		bodyModel[9].setRotationPoint(8F, -15F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 17, 22, 0F); // Box 13
		bodyModel[10].setRotationPoint(20F, -15F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 11, 17, 1, 0F); // Box 14
		bodyModel[11].setRotationPoint(9F, -15F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 11, 17, 1, 0F); // Box 15
		bodyModel[12].setRotationPoint(9F, -15F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(8F, -17F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(8F, -18F, 2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(8F, -18F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(8F, -17F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(8F, -18F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 46, 5, 10, 0F); // Box 21
		bodyModel[18].setRotationPoint(-23F, 3F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 23
		bodyModel[19].setRotationPoint(-15F, 6F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 24
		bodyModel[20].setRotationPoint(-1F, 6F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 25
		bodyModel[21].setRotationPoint(14F, 6F, -6F);

		bodyModel[22].addBox(0F, 0F, 0F, 46, 5, 1, 0F); // Box 26
		bodyModel[22].setRotationPoint(-23F, 3F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 27
		bodyModel[23].setRotationPoint(-17F, 4F, -6F);

		bodyModel[24].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 28
		bodyModel[24].setRotationPoint(-3F, 4F, -6F);

		bodyModel[25].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 29
		bodyModel[25].setRotationPoint(12F, 4F, -6F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 30
		bodyModel[26].setRotationPoint(-17F, 4F, 6F);

		bodyModel[27].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 31
		bodyModel[27].setRotationPoint(-3F, 4F, 6F);

		bodyModel[28].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 32
		bodyModel[28].setRotationPoint(12F, 4F, 6F);

		bodyModel[29].addBox(0F, 0F, 0F, 46, 5, 1, 0F); // Box 33
		bodyModel[29].setRotationPoint(-23F, 3F, 7F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 34
		bodyModel[30].setRotationPoint(-24F, 3F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 5, 22, 0F); // Box 35
		bodyModel[31].setRotationPoint(23F, 3F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 32
		bodyModel[32].setRotationPoint(21F, -17F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 34
		bodyModel[33].setRotationPoint(18F, -17F, 8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 35
		bodyModel[34].setRotationPoint(18F, -18F, 8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.25F); // Box 37
		bodyModel[35].setRotationPoint(18.5F, -18.13F, 8.65F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0.5F); // Box 38
		bodyModel[36].setRotationPoint(7.5F, -18.13F, 8.35F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 39
		bodyModel[37].setRotationPoint(10F, -18F, 8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 40
		bodyModel[38].setRotationPoint(10F, -17F, 8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[39].setRotationPoint(-26F, 3F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[40].setRotationPoint(22F, 3F, -1.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 43
		bodyModel[41].setRotationPoint(24F, 7F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 44
		bodyModel[42].setRotationPoint(24F, 7F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 45
		bodyModel[43].setRotationPoint(-25F, 7F, 5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 46
		bodyModel[44].setRotationPoint(-25F, 7F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[45].setRotationPoint(-23F, 3F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[46].setRotationPoint(-23F, 3F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 49
		bodyModel[47].setRotationPoint(17F, 3F, 10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 50
		bodyModel[48].setRotationPoint(17F, 3F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, -5.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -5.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 51
		bodyModel[49].setRotationPoint(0F, -15F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 52
		bodyModel[50].setRotationPoint(6F, -15F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[51].setRotationPoint(-19F, -7F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[52].setRotationPoint(-19F, -7F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 55
		bodyModel[53].setRotationPoint(-9F, -11F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Box 56
		bodyModel[54].setRotationPoint(-9.4F, -11F, -0.6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(-23F, -5F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(-23F, -5F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[57].setRotationPoint(-23F, -6F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-21F, -5F, -10F);
		bodyModel[58].rotateAngleY = 0.4712389F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-21F, -5F, 10F);
		bodyModel[59].rotateAngleY = 2.65290046F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 60
		bodyModel[60].setRotationPoint(-23F, -6F, 6F);
		bodyModel[60].rotateAngleY = -0.4712389F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
		bodyModel[61].setRotationPoint(-23F, -6F, -6F);
		bodyModel[61].rotateAngleY = 3.61283155F;
	}
}