
package com.jcirmodelsquad.tcjcir.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelTypeASmol extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelTypeASmol()
	{
		typeasmolModel = new ModelRendererTurbo[78];
		typeasmolModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		typeasmolModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		typeasmolModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		typeasmolModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
		typeasmolModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 53
		typeasmolModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 56
		typeasmolModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 57
		typeasmolModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 59
		typeasmolModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 60
		typeasmolModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 65
		typeasmolModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 66
		typeasmolModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 67
		typeasmolModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 70
		typeasmolModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 71
		typeasmolModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 96
		typeasmolModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 46
		typeasmolModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 47
		typeasmolModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 48
		typeasmolModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 47
		typeasmolModel[19] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 48
		typeasmolModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 63
		typeasmolModel[21] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 64
		typeasmolModel[22] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 69
		typeasmolModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 70
		typeasmolModel[24] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 71
		typeasmolModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 73
		typeasmolModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 75
		typeasmolModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 76
		typeasmolModel[28] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 77
		typeasmolModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 79
		typeasmolModel[30] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 81
		typeasmolModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 82
		typeasmolModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 81
		typeasmolModel[33] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 82
		typeasmolModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 84
		typeasmolModel[35] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 85
		typeasmolModel[36] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 87
		typeasmolModel[37] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 88
		typeasmolModel[38] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 89
		typeasmolModel[39] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 90
		typeasmolModel[40] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 91
		typeasmolModel[41] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 92
		typeasmolModel[42] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 93
		typeasmolModel[43] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 94
		typeasmolModel[44] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 95
		typeasmolModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 96
		typeasmolModel[46] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 97
		typeasmolModel[47] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 98
		typeasmolModel[48] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 99
		typeasmolModel[49] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 100
		typeasmolModel[50] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 101
		typeasmolModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 102
		typeasmolModel[52] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 103
		typeasmolModel[53] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 104
		typeasmolModel[54] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 105
		typeasmolModel[55] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 106
		typeasmolModel[56] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 107
		typeasmolModel[57] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 108
		typeasmolModel[58] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 109
		typeasmolModel[59] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 110
		typeasmolModel[60] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 111
		typeasmolModel[61] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 112
		typeasmolModel[62] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 113
		typeasmolModel[63] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 114
		typeasmolModel[64] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 115
		typeasmolModel[65] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 116
		typeasmolModel[66] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 117
		typeasmolModel[67] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 118
		typeasmolModel[68] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 119
		typeasmolModel[69] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 120
		typeasmolModel[70] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 121
		typeasmolModel[71] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 122
		typeasmolModel[72] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 123
		typeasmolModel[73] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 124
		typeasmolModel[74] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 125
		typeasmolModel[75] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 126
		typeasmolModel[76] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 76
		typeasmolModel[77] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 77

		typeasmolModel[0].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 4
		typeasmolModel[0].setRotationPoint(-8F, 1.5F, -8F);

		typeasmolModel[1].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 5
		typeasmolModel[1].setRotationPoint(4F, 1.5F, -8F);

		typeasmolModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30
		typeasmolModel[2].setRotationPoint(5F, 2.5F, 6F);

		typeasmolModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		typeasmolModel[3].setRotationPoint(-8F, 0.5F, -8F);

		typeasmolModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		typeasmolModel[4].setRotationPoint(-6F, 1.5F, -8F);

		typeasmolModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		typeasmolModel[5].setRotationPoint(3F, 0.5F, -8F);

		typeasmolModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		typeasmolModel[6].setRotationPoint(-7.5F, -0.5F, -7.5F);

		typeasmolModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
		typeasmolModel[7].setRotationPoint(-10F, 1F, -7.5F);

		typeasmolModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		typeasmolModel[8].setRotationPoint(6F, 1F, -7.5F);

		typeasmolModel[9].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		typeasmolModel[9].setRotationPoint(-7.5F, 0F, -7.5F);

		typeasmolModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 66
		typeasmolModel[10].setRotationPoint(-6F, 2F, -7.5F);

		typeasmolModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
		typeasmolModel[11].setRotationPoint(2F, 2F, -7.5F);

		typeasmolModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 70
		typeasmolModel[12].setRotationPoint(-4F, 2F, -7.5F);

		typeasmolModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		typeasmolModel[13].setRotationPoint(-2F, 1.5F, -7.5F);

		typeasmolModel[14].addBox(0F, 0F, 0F, 6, 1, 13, 0F); // Box 96
		typeasmolModel[14].setRotationPoint(-4F, 0.25F, -6.5F);

		typeasmolModel[15].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
		typeasmolModel[15].setRotationPoint(-7F, 2.5F, 6F);

		typeasmolModel[16].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
		typeasmolModel[16].setRotationPoint(-7F, 2.5F, -6F);

		typeasmolModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48
		typeasmolModel[17].setRotationPoint(5F, 2.5F, -6F);

		typeasmolModel[18].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 47
		typeasmolModel[18].setRotationPoint(-5F, 3F, -8F);

		typeasmolModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		typeasmolModel[19].setRotationPoint(-6F, 2.5F, -8F);

		typeasmolModel[20].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 63
		typeasmolModel[20].setRotationPoint(2.5F, 4.01F, -7.5F);

		typeasmolModel[21].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 64
		typeasmolModel[21].setRotationPoint(8.5F, 1.01F, -7.5F);

		typeasmolModel[22].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 69
		typeasmolModel[22].setRotationPoint(-11.5F, 4.01F, -7.5F);

		typeasmolModel[23].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 70
		typeasmolModel[23].setRotationPoint(-10.5F, 1.01F, -7.5F);

		typeasmolModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		typeasmolModel[24].setRotationPoint(-11.5F, 0F, -7.5F);

		typeasmolModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		typeasmolModel[25].setRotationPoint(-11.5F, 1F, -3.5F);

		typeasmolModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		typeasmolModel[26].setRotationPoint(-11.5F, 0F, -3.5F);

		typeasmolModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		typeasmolModel[27].setRotationPoint(-11.5F, 0F, 2.5F);

		typeasmolModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		typeasmolModel[28].setRotationPoint(8.5F, 0F, -7.5F);

		typeasmolModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		typeasmolModel[29].setRotationPoint(8.5F, 0F, 2.5F);

		typeasmolModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
		typeasmolModel[30].setRotationPoint(8.5F, 1F, -3.5F);

		typeasmolModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		typeasmolModel[31].setRotationPoint(8.5F, 0F, -3.5F);

		typeasmolModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		typeasmolModel[32].setRotationPoint(4F, 1.5F, -9F);

		typeasmolModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		typeasmolModel[33].setRotationPoint(-8F, 1.5F, -9F);

		typeasmolModel[34].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 84
		typeasmolModel[34].setRotationPoint(-2.5F, -0.5F, -7.25F);

		typeasmolModel[35].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 85
		typeasmolModel[35].setRotationPoint(-4F, 0F, -6.75F);

		typeasmolModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 87
		typeasmolModel[36].setRotationPoint(1F, 2F, -7.5F);

		typeasmolModel[37].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 88
		typeasmolModel[37].setRotationPoint(-10.5F, 0F, -7.5F);

		typeasmolModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		typeasmolModel[38].setRotationPoint(-9.5F, -1F, -7.5F);

		typeasmolModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		typeasmolModel[39].setRotationPoint(5.5F, -1F, -7.5F);

		typeasmolModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		typeasmolModel[40].setRotationPoint(2.5F, -0.5F, -7.5F);

		typeasmolModel[41].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 92
		typeasmolModel[41].setRotationPoint(5.5F, 0F, -7.5F);

		typeasmolModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 93
		typeasmolModel[42].setRotationPoint(3F, 2.5F, -8F);

		typeasmolModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 94
		typeasmolModel[43].setRotationPoint(3F, 1.5F, -8F);

		typeasmolModel[44].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		typeasmolModel[44].setRotationPoint(-7.5F, 0F, 6.5F);

		typeasmolModel[45].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 96
		typeasmolModel[45].setRotationPoint(-10.5F, 0F, 6.5F);

		typeasmolModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 97
		typeasmolModel[46].setRotationPoint(-10F, 1F, 6.5F);

		typeasmolModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
		typeasmolModel[47].setRotationPoint(6F, 1F, 6.5F);

		typeasmolModel[48].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 99
		typeasmolModel[48].setRotationPoint(5.5F, 0F, 6.5F);

		typeasmolModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		typeasmolModel[49].setRotationPoint(2.5F, -0.5F, 6.5F);

		typeasmolModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		typeasmolModel[50].setRotationPoint(5.5F, -1F, 6.5F);

		typeasmolModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		typeasmolModel[51].setRotationPoint(-9.5F, -1F, 6.5F);

		typeasmolModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		typeasmolModel[52].setRotationPoint(-7.5F, -0.5F, 6.5F);

		typeasmolModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 104
		typeasmolModel[53].setRotationPoint(-4F, 2F, 6.5F);

		typeasmolModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		typeasmolModel[54].setRotationPoint(-2F, 1.5F, 6.5F);

		typeasmolModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 106
		typeasmolModel[55].setRotationPoint(1F, 2F, 6.5F);

		typeasmolModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		typeasmolModel[56].setRotationPoint(3F, 0.5F, 7F);

		typeasmolModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 108
		typeasmolModel[57].setRotationPoint(3F, 1.5F, 7F);

		typeasmolModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 109
		typeasmolModel[58].setRotationPoint(3F, 2.5F, 7F);

		typeasmolModel[59].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 110
		typeasmolModel[59].setRotationPoint(-5F, 3F, 7.5F);

		typeasmolModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 111
		typeasmolModel[60].setRotationPoint(-6F, 2.5F, 7F);

		typeasmolModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		typeasmolModel[61].setRotationPoint(-6F, 1.5F, 7F);

		typeasmolModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		typeasmolModel[62].setRotationPoint(-8F, 0.5F, 7F);

		typeasmolModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		typeasmolModel[63].setRotationPoint(-8F, 1.5F, 8F);

		typeasmolModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		typeasmolModel[64].setRotationPoint(4F, 1.5F, 8F);

		typeasmolModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 116
		typeasmolModel[65].setRotationPoint(-11.5F, 0F, 3.5F);

		typeasmolModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 117
		typeasmolModel[66].setRotationPoint(8.5F, 0F, 3.5F);

		typeasmolModel[67].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 118
		typeasmolModel[67].setRotationPoint(2.5F, 4.01F, 6.5F);

		typeasmolModel[68].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 119
		typeasmolModel[68].setRotationPoint(8.5F, 1.01F, 6.5F);

		typeasmolModel[69].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 120
		typeasmolModel[69].setRotationPoint(-10.5F, 1.01F, 6.5F);

		typeasmolModel[70].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 121
		typeasmolModel[70].setRotationPoint(-11.5F, 4.01F, 6.5F);

		typeasmolModel[71].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // Box 122
		typeasmolModel[71].setRotationPoint(-9F, 1F, -5F);

		typeasmolModel[72].addBox(0F, 0F, 0F, 5, 3, 10, 0F); // Box 123
		typeasmolModel[72].setRotationPoint(2F, 1F, -5F);

		typeasmolModel[73].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		typeasmolModel[73].setRotationPoint(-3F, 0F, -2F);

		typeasmolModel[74].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 125
		typeasmolModel[74].setRotationPoint(-2.5F, -0.5F, 6.25F);

		typeasmolModel[75].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 126
		typeasmolModel[75].setRotationPoint(-4F, 0F, 6.75F);

		typeasmolModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 76
		typeasmolModel[76].setRotationPoint(-6F, 2F, 6.5F);

		typeasmolModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 77
		typeasmolModel[77].setRotationPoint(2F, 2F, 6.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 78; i++)
		{
			typeasmolModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo typeasmolModel[];
}