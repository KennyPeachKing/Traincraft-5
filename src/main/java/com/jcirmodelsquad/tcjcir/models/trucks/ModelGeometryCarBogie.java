package com.jcirmodelsquad.tcjcir.models.trucks;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;

public class ModelGeometryCarBogie extends ModelBase
    {
        int textureX = 512;
        int textureY = 512;

        public ModelGeometryCarBogie()
        {
            geometrycarbogieModel = new ModelRendererTurbo[72];
            geometrycarbogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
            geometrycarbogieModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
            geometrycarbogieModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
            geometrycarbogieModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
            geometrycarbogieModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 53
            geometrycarbogieModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 55
            geometrycarbogieModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 56
            geometrycarbogieModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 57
            geometrycarbogieModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 59
            geometrycarbogieModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 60
            geometrycarbogieModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 62
            geometrycarbogieModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 65
            geometrycarbogieModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 66
            geometrycarbogieModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 67
            geometrycarbogieModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 70
            geometrycarbogieModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 71
            geometrycarbogieModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 72
            geometrycarbogieModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 73
            geometrycarbogieModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 74
            geometrycarbogieModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 77
            geometrycarbogieModel[20] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 78
            geometrycarbogieModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 79
            geometrycarbogieModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 80
            geometrycarbogieModel[23] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 81
            geometrycarbogieModel[24] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 82
            geometrycarbogieModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 83
            geometrycarbogieModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 84
            geometrycarbogieModel[27] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 86
            geometrycarbogieModel[28] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 87
            geometrycarbogieModel[29] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 88
            geometrycarbogieModel[30] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 90
            geometrycarbogieModel[31] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 91
            geometrycarbogieModel[32] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 92
            geometrycarbogieModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 96
            geometrycarbogieModel[34] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 46
            geometrycarbogieModel[35] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 47
            geometrycarbogieModel[36] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 48
            geometrycarbogieModel[37] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 47
            geometrycarbogieModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 48
            geometrycarbogieModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 49
            geometrycarbogieModel[40] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 50
            geometrycarbogieModel[41] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 51
            geometrycarbogieModel[42] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 52
            geometrycarbogieModel[43] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 57
            geometrycarbogieModel[44] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 58
            geometrycarbogieModel[45] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 59
            geometrycarbogieModel[46] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 60
            geometrycarbogieModel[47] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 61
            geometrycarbogieModel[48] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 62
            geometrycarbogieModel[49] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 63
            geometrycarbogieModel[50] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 64
            geometrycarbogieModel[51] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 65
            geometrycarbogieModel[52] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 66
            geometrycarbogieModel[53] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 67
            geometrycarbogieModel[54] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 68
            geometrycarbogieModel[55] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 69
            geometrycarbogieModel[56] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 70
            geometrycarbogieModel[57] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 71
            geometrycarbogieModel[58] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 72
            geometrycarbogieModel[59] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 73
            geometrycarbogieModel[60] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 74
            geometrycarbogieModel[61] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 77
            geometrycarbogieModel[62] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 78
            geometrycarbogieModel[63] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 80
            geometrycarbogieModel[64] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 81
            geometrycarbogieModel[65] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 81
            geometrycarbogieModel[66] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 82
            geometrycarbogieModel[67] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 83
            geometrycarbogieModel[68] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 84
            geometrycarbogieModel[69] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 85
            geometrycarbogieModel[70] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 86
            geometrycarbogieModel[71] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 87

            geometrycarbogieModel[0].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 4
            geometrycarbogieModel[0].setRotationPoint(-9F, 1.5F, -8F);

            geometrycarbogieModel[1].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 5
            geometrycarbogieModel[1].setRotationPoint(5F, 1.5F, -8F);

            geometrycarbogieModel[2].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 30
            geometrycarbogieModel[2].setRotationPoint(6F, 2.5F, 6F);

            geometrycarbogieModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
            geometrycarbogieModel[3].setRotationPoint(-9F, 0.5F, -7.75F);

            geometrycarbogieModel[4].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 53
            geometrycarbogieModel[4].setRotationPoint(-7F, 1.5F, -7.75F);

            geometrycarbogieModel[5].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 55
            geometrycarbogieModel[5].setRotationPoint(4F, 1.5F, -7.75F);

            geometrycarbogieModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
            geometrycarbogieModel[6].setRotationPoint(4F, 0.5F, -7.75F);

            geometrycarbogieModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
            geometrycarbogieModel[7].setRotationPoint(-11F, 0F, -7.5F);

            geometrycarbogieModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
            geometrycarbogieModel[8].setRotationPoint(-11F, 2F, -7.5F);

            geometrycarbogieModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
            geometrycarbogieModel[9].setRotationPoint(7F, 2F, -7.5F);

            geometrycarbogieModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
            geometrycarbogieModel[10].setRotationPoint(2F, 0F, -7.5F);

            geometrycarbogieModel[11].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 65
            geometrycarbogieModel[11].setRotationPoint(-11.5F, 1F, -7.5F);

            geometrycarbogieModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 66
            geometrycarbogieModel[12].setRotationPoint(-7F, 2F, -7.5F);

            geometrycarbogieModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 67
            geometrycarbogieModel[13].setRotationPoint(3F, 2F, -7.5F);

            geometrycarbogieModel[14].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 70
            geometrycarbogieModel[14].setRotationPoint(-5.5F, 2F, -7.25F);

            geometrycarbogieModel[15].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 71
            geometrycarbogieModel[15].setRotationPoint(-4F, 2F, -7.25F);

            geometrycarbogieModel[16].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 72
            geometrycarbogieModel[16].setRotationPoint(2.5F, 2F, -7.25F);

            geometrycarbogieModel[17].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 73
            geometrycarbogieModel[17].setRotationPoint(1F, 2F, -7.25F);

            geometrycarbogieModel[18].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 74
            geometrycarbogieModel[18].setRotationPoint(-11.5F, 1F, 6.5F);

            geometrycarbogieModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
            geometrycarbogieModel[19].setRotationPoint(2F, 0F, 6.5F);

            geometrycarbogieModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
            geometrycarbogieModel[20].setRotationPoint(-11F, 0F, 6.5F);

            geometrycarbogieModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
            geometrycarbogieModel[21].setRotationPoint(-11F, 2F, 6.5F);

            geometrycarbogieModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 80
            geometrycarbogieModel[22].setRotationPoint(-7F, 2F, 6.5F);

            geometrycarbogieModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 81
            geometrycarbogieModel[23].setRotationPoint(3F, 2F, 6.5F);

            geometrycarbogieModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 82
            geometrycarbogieModel[24].setRotationPoint(7F, 2F, 6.5F);

            geometrycarbogieModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
            geometrycarbogieModel[25].setRotationPoint(4F, 0.5F, 6.75F);

            geometrycarbogieModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 84
            geometrycarbogieModel[26].setRotationPoint(4F, 1.5F, 6.75F);

            geometrycarbogieModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
            geometrycarbogieModel[27].setRotationPoint(-9F, 0.5F, 6.75F);

            geometrycarbogieModel[28].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 87
            geometrycarbogieModel[28].setRotationPoint(-7F, 1.5F, 6.75F);

            geometrycarbogieModel[29].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 88
            geometrycarbogieModel[29].setRotationPoint(-5.5F, 2F, 6.25F);

            geometrycarbogieModel[30].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 90
            geometrycarbogieModel[30].setRotationPoint(-4F, 2F, 6.25F);

            geometrycarbogieModel[31].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 91
            geometrycarbogieModel[31].setRotationPoint(1F, 2F, 6.25F);

            geometrycarbogieModel[32].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 92
            geometrycarbogieModel[32].setRotationPoint(2.5F, 2F, 6.25F);

            geometrycarbogieModel[33].addBox(0F, 0F, 0F, 4, 1, 13, 0F); // Box 96
            geometrycarbogieModel[33].setRotationPoint(-3F, 1F, -6.5F);

            geometrycarbogieModel[34].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 46
            geometrycarbogieModel[34].setRotationPoint(-8F, 2.5F, 6F);

            geometrycarbogieModel[35].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 47
            geometrycarbogieModel[35].setRotationPoint(-8F, 2.5F, -6F);

            geometrycarbogieModel[36].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 48
            geometrycarbogieModel[36].setRotationPoint(6F, 2.5F, -6F);

            geometrycarbogieModel[37].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 47
            geometrycarbogieModel[37].setRotationPoint(-5F, 3.5F, -7.75F);

            geometrycarbogieModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
            geometrycarbogieModel[38].setRotationPoint(-7F, 3.5F, -7.75F);

            geometrycarbogieModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
            geometrycarbogieModel[39].setRotationPoint(3F, 3.5F, -7.75F);

            geometrycarbogieModel[40].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 50
            geometrycarbogieModel[40].setRotationPoint(-5F, 3.5F, 6.75F);

            geometrycarbogieModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 51
            geometrycarbogieModel[41].setRotationPoint(-7F, 3.5F, 6.75F);

            geometrycarbogieModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 52
            geometrycarbogieModel[42].setRotationPoint(3F, 3.5F, 6.75F);

            geometrycarbogieModel[43].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 57
            geometrycarbogieModel[43].setRotationPoint(5F, 1.25F, -9F);

            geometrycarbogieModel[44].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 58
            geometrycarbogieModel[44].setRotationPoint(2F, 1.7F, -9F);

            geometrycarbogieModel[45].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 59
            geometrycarbogieModel[45].setRotationPoint(2F, 1.7F, -8F);

            geometrycarbogieModel[46].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 60
            geometrycarbogieModel[46].setRotationPoint(2F, 1.7F, 8F);

            geometrycarbogieModel[47].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
            geometrycarbogieModel[47].setRotationPoint(2F, 1.7F, 4F);

            geometrycarbogieModel[48].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 62
            geometrycarbogieModel[48].setRotationPoint(5F, 1.25F, 8F);

            geometrycarbogieModel[49].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 63
            geometrycarbogieModel[49].setRotationPoint(2.5F, 4.01F, -7.5F);

            geometrycarbogieModel[50].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 64
            geometrycarbogieModel[50].setRotationPoint(9.5F, 2.01F, -7.5F);

            geometrycarbogieModel[51].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 65
            geometrycarbogieModel[51].setRotationPoint(9.5F, 2.01F, 6.5F);

            geometrycarbogieModel[52].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 66
            geometrycarbogieModel[52].setRotationPoint(2.5F, 4.01F, 6.5F);

            geometrycarbogieModel[53].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 67
            geometrycarbogieModel[53].setRotationPoint(-11.5F, 4.01F, 6.5F);

            geometrycarbogieModel[54].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 68
            geometrycarbogieModel[54].setRotationPoint(-11.5F, 2.01F, 6.5F);

            geometrycarbogieModel[55].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // Box 69
            geometrycarbogieModel[55].setRotationPoint(-11.5F, 4.01F, -7.5F);

            geometrycarbogieModel[56].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 70
            geometrycarbogieModel[56].setRotationPoint(-11.5F, 2.01F, -7.5F);

            geometrycarbogieModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
            geometrycarbogieModel[57].setRotationPoint(-12.5F, 1F, -7.5F);

            geometrycarbogieModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 72
            geometrycarbogieModel[58].setRotationPoint(-12.5F, 1F, 3.5F);

            geometrycarbogieModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
            geometrycarbogieModel[59].setRotationPoint(-12.5F, 2F, -3.5F);

            geometrycarbogieModel[60].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 74
            geometrycarbogieModel[60].setRotationPoint(-12.5F, 1F, -3.5F);

            geometrycarbogieModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
            geometrycarbogieModel[61].setRotationPoint(9.5F, 1F, -7.5F);

            geometrycarbogieModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 78
            geometrycarbogieModel[62].setRotationPoint(9.5F, 1F, 3.5F);

            geometrycarbogieModel[63].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 80
            geometrycarbogieModel[63].setRotationPoint(9.5F, 1F, -3.5F);

            geometrycarbogieModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
            geometrycarbogieModel[64].setRotationPoint(9.5F, 2F, -3.5F);

            geometrycarbogieModel[65].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 81
            geometrycarbogieModel[65].setRotationPoint(0.5F, 1.25F, 7F);

            geometrycarbogieModel[66].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 82
            geometrycarbogieModel[66].setRotationPoint(0.5F, 1.25F, -8F);

            geometrycarbogieModel[67].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 83
            geometrycarbogieModel[67].setRotationPoint(-2F, 2F, -8F);

            geometrycarbogieModel[68].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 84
            geometrycarbogieModel[68].setRotationPoint(10F, 4F, -9F);

            geometrycarbogieModel[69].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 85
            geometrycarbogieModel[69].setRotationPoint(10F, 2F, -8F);

            geometrycarbogieModel[70].addBox(0F, 0F, 0F, 6, 4, 9, 0F); // Box 86
            geometrycarbogieModel[70].setRotationPoint(-4F, 0F, -4.5F);

            geometrycarbogieModel[71].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 87
            geometrycarbogieModel[71].setRotationPoint(-2F, -1F, -1F);


        }

        @Override
        public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
        {
            for(int i = 0; i < 72; i++)
            {
                geometrycarbogieModel[i].render(f5);
            }
        }

        public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
        {
        }

        public ModelRendererTurbo geometrycarbogieModel[];
}
