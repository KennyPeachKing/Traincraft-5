//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:03.05.2019 - 23:05:46
// Last changed on: 03.05.2019 - 23:05:46

package com.jcirmodelsquad.tcjcir.models.trains;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.render.models.ModelAmericanFreightTrucks;
import train.common.library.Info;

public class ModelRibbedHopper extends ModelBase
{
    int textureX = 512;
    int textureY = 512;

    public ModelRibbedHopper()
    {
        ribbedhopperModel = new ModelRendererTurbo[110];
        ribbedhopperModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        ribbedhopperModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
        ribbedhopperModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
        ribbedhopperModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 4
        ribbedhopperModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
        ribbedhopperModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 6
        ribbedhopperModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
        ribbedhopperModel[7] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 28
        ribbedhopperModel[8] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 34
        ribbedhopperModel[9] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 35
        ribbedhopperModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
        ribbedhopperModel[11] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 37
        ribbedhopperModel[12] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 38
        ribbedhopperModel[13] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 39
        ribbedhopperModel[14] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 43
        ribbedhopperModel[15] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 45
        ribbedhopperModel[16] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 46
        ribbedhopperModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
        ribbedhopperModel[18] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 48
        ribbedhopperModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 49
        ribbedhopperModel[20] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 50
        ribbedhopperModel[21] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 51
        ribbedhopperModel[22] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 53
        ribbedhopperModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 54
        ribbedhopperModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 55
        ribbedhopperModel[25] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 56
        ribbedhopperModel[26] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 57
        ribbedhopperModel[27] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 80
        ribbedhopperModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 81
        ribbedhopperModel[29] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 84
        ribbedhopperModel[30] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 85
        ribbedhopperModel[31] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 86
        ribbedhopperModel[32] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 88
        ribbedhopperModel[33] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 89
        ribbedhopperModel[34] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 91
        ribbedhopperModel[35] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 48
        ribbedhopperModel[36] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 51
        ribbedhopperModel[37] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 55
        ribbedhopperModel[38] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 57
        ribbedhopperModel[39] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 60
        ribbedhopperModel[40] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 62
        ribbedhopperModel[41] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 63
        ribbedhopperModel[42] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 64
        ribbedhopperModel[43] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 65
        ribbedhopperModel[44] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 66
        ribbedhopperModel[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 67
        ribbedhopperModel[46] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 68
        ribbedhopperModel[47] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 69
        ribbedhopperModel[48] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 70
        ribbedhopperModel[49] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 71
        ribbedhopperModel[50] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 72
        ribbedhopperModel[51] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 73
        ribbedhopperModel[52] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 74
        ribbedhopperModel[53] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 75
        ribbedhopperModel[54] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 76
        ribbedhopperModel[55] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 77
        ribbedhopperModel[56] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 78
        ribbedhopperModel[57] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 79
        ribbedhopperModel[58] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 80
        ribbedhopperModel[59] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 81
        ribbedhopperModel[60] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 82
        ribbedhopperModel[61] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 83
        ribbedhopperModel[62] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 84
        ribbedhopperModel[63] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 85
        ribbedhopperModel[64] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 86
        ribbedhopperModel[65] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 87
        ribbedhopperModel[66] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 88
        ribbedhopperModel[67] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 89
        ribbedhopperModel[68] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 90
        ribbedhopperModel[69] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 77
        ribbedhopperModel[70] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 78
        ribbedhopperModel[71] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 79
        ribbedhopperModel[72] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 80
        ribbedhopperModel[73] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 81
        ribbedhopperModel[74] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 82
        ribbedhopperModel[75] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 83
        ribbedhopperModel[76] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 0 truck mount
        ribbedhopperModel[77] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 0 truck mount
        ribbedhopperModel[78] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 83
        ribbedhopperModel[79] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 84
        ribbedhopperModel[80] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 85
        ribbedhopperModel[81] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 86
        ribbedhopperModel[82] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 87
        ribbedhopperModel[83] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 88
        ribbedhopperModel[84] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 89
        ribbedhopperModel[85] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 90
        ribbedhopperModel[86] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 91
        ribbedhopperModel[87] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 92
        ribbedhopperModel[88] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 93
        ribbedhopperModel[89] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 94
        ribbedhopperModel[90] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 95
        ribbedhopperModel[91] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 96
        ribbedhopperModel[92] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 97
        ribbedhopperModel[93] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 98
        ribbedhopperModel[94] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 99
        ribbedhopperModel[95] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 95
        ribbedhopperModel[96] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 96
        ribbedhopperModel[97] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 97
        ribbedhopperModel[98] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 98
        ribbedhopperModel[99] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 99
        ribbedhopperModel[100] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 100
        ribbedhopperModel[101] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 101
        ribbedhopperModel[102] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 102
        ribbedhopperModel[103] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 103
        ribbedhopperModel[104] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 104
        ribbedhopperModel[105] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 105
        ribbedhopperModel[106] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 106
        ribbedhopperModel[107] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 107
        ribbedhopperModel[108] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 108
        ribbedhopperModel[109] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 109

        ribbedhopperModel[0].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 0
        ribbedhopperModel[0].setRotationPoint(-38F, -3F, -10F);

        ribbedhopperModel[1].addBox(0F, 0F, 0F, 70, 1, 3, 0F); // Box 1
        ribbedhopperModel[1].setRotationPoint(-35F, -7F, -11F);

        ribbedhopperModel[2].addBox(0F, 0F, 0F, 70, 1, 3, 0F); // Box 3
        ribbedhopperModel[2].setRotationPoint(-35F, -7F, 8F);

        ribbedhopperModel[3].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 4
        ribbedhopperModel[3].setRotationPoint(36F, -3F, -10F);

        ribbedhopperModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 22, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
        ribbedhopperModel[4].setRotationPoint(-31F, -6F, -11F);

        ribbedhopperModel[5].addShapeBox(0F, 0F, 0F, 2, 4, 22, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
        ribbedhopperModel[5].setRotationPoint(29F, -6F, -11F);

        ribbedhopperModel[6].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 27
        ribbedhopperModel[6].setRotationPoint(-38F, -4F, -5F);

        ribbedhopperModel[7].addBox(0F, 0F, 0F, 7, 1, 10, 0F); // Box 28
        ribbedhopperModel[7].setRotationPoint(31F, -4F, -5F);

        ribbedhopperModel[8].addBox(0F, 0F, 0F, 62, 19, 22, 0F); // Box 34
        ribbedhopperModel[8].setRotationPoint(-31F, -26F, -11F);

        ribbedhopperModel[9].addShapeBox(0F, 0F, 0F, 76, 1, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
        ribbedhopperModel[9].setRotationPoint(-38F, -27F, -11F);

        ribbedhopperModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Box 36
        ribbedhopperModel[10].setRotationPoint(-38F, -22F, -10F);

        ribbedhopperModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Box 37
        ribbedhopperModel[11].setRotationPoint(31F, -22F, -10F);

        ribbedhopperModel[12].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 38
        ribbedhopperModel[12].setRotationPoint(-38F, -26F, -10F);

        ribbedhopperModel[13].addBox(0F, 0F, 0F, 7, 4, 20, 0F); // Box 39
        ribbedhopperModel[13].setRotationPoint(31F, -26F, -10F);

        ribbedhopperModel[14].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 43
        ribbedhopperModel[14].setRotationPoint(35F, -26F, -11F);

        ribbedhopperModel[15].addBox(0F, 0F, 0F, 76, 1, 18, 0F); // Box 45
        ribbedhopperModel[15].setRotationPoint(-38F, -27F, -9F);

        ribbedhopperModel[16].addBox(0F, 0F, 0F, 76, 0, 4, 0F); // Box 46
        ribbedhopperModel[16].setRotationPoint(-38F, -28.1F, 4F);

        ribbedhopperModel[17].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 47
        ribbedhopperModel[17].setRotationPoint(-40F, -28.1F, -2F);

        ribbedhopperModel[18].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 48
        ribbedhopperModel[18].setRotationPoint(38F, -28.1F, -2F);

        ribbedhopperModel[19].addBox(0F, 0F, 0F, 76, 0, 4, 0F); // Box 49
        ribbedhopperModel[19].setRotationPoint(-38F, -28.1F, -8F);

        ribbedhopperModel[20].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 50
        ribbedhopperModel[20].setRotationPoint(-38F, -28.1F, -4F);

        ribbedhopperModel[21].addBox(0F, 0F, 0F, 4, 0, 8, 0F); // Box 51
        ribbedhopperModel[21].setRotationPoint(34F, -28.1F, -4F);

        ribbedhopperModel[22].addBox(0F, 0F, 0F, 64, 1, 8, 0F); // Box 53
        ribbedhopperModel[22].setRotationPoint(-32F, -29F, -4F);

        ribbedhopperModel[23].addBox(0F, 0F, 0F, 1, 26, 4, 0F); // Box 54
        ribbedhopperModel[23].setRotationPoint(-39F, -28F, 4F);

        ribbedhopperModel[24].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 55
        ribbedhopperModel[24].setRotationPoint(-41F, -2F, -1.5F);

        ribbedhopperModel[25].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 56
        ribbedhopperModel[25].setRotationPoint(36F, -2F, -1.5F);

        ribbedhopperModel[26].addBox(0F, 0F, 0F, 1, 26, 4, 0F); // Box 57
        ribbedhopperModel[26].setRotationPoint(38F, -28F, -8F);

        ribbedhopperModel[27].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 80
        ribbedhopperModel[27].setRotationPoint(-35F, -26F, -11F);

        ribbedhopperModel[28].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 81
        ribbedhopperModel[28].setRotationPoint(-35F, -17F, -11F);

        ribbedhopperModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 84
        ribbedhopperModel[29].setRotationPoint(31F, -17F, -11F);

        ribbedhopperModel[30].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 85
        ribbedhopperModel[30].setRotationPoint(31F, -26F, -11F);

        ribbedhopperModel[31].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 86
        ribbedhopperModel[31].setRotationPoint(31F, -17F, 10F);

        ribbedhopperModel[32].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 88
        ribbedhopperModel[32].setRotationPoint(31F, -26F, 10F);

        ribbedhopperModel[33].addBox(0F, 0F, 0F, 4, 9, 1, 0F); // Box 89
        ribbedhopperModel[33].setRotationPoint(-35F, -26F, 10F);

        ribbedhopperModel[34].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 91
        ribbedhopperModel[34].setRotationPoint(-35F, -17F, 10F);

        ribbedhopperModel[35].addBox(0F, 0F, 0F, 62, 1, 16, 0F); // Box 48
        ribbedhopperModel[35].setRotationPoint(-31F, -7F, -8F);

        ribbedhopperModel[36].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 51
        ribbedhopperModel[36].setRotationPoint(-28F, -6F, -11F);

        ribbedhopperModel[37].addShapeBox(0F, 0F, 0F, 6, 8, 12, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
        ribbedhopperModel[37].setRotationPoint(-24F, -6F, -6F);

        ribbedhopperModel[38].addShapeBox(0F, 0F, 0F, 6, 8, 12, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
        ribbedhopperModel[38].setRotationPoint(-3F, -6F, -6F);

        ribbedhopperModel[39].addShapeBox(0F, 0F, 0F, 6, 8, 12, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
        ribbedhopperModel[39].setRotationPoint(18F, -6F, -6F);

        ribbedhopperModel[40].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 62
        ribbedhopperModel[40].setRotationPoint(-29F, -6F, -3F);

        ribbedhopperModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
        ribbedhopperModel[41].setRotationPoint(-11F, -6F, -7F);

        ribbedhopperModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
        ribbedhopperModel[42].setRotationPoint(10F, -6F, -7F);

        ribbedhopperModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 65
        ribbedhopperModel[43].setRotationPoint(10F, -6F, 3F);

        ribbedhopperModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 66
        ribbedhopperModel[44].setRotationPoint(-11F, -6F, 3F);

        ribbedhopperModel[45].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 67
        ribbedhopperModel[45].setRotationPoint(-33F, -11F, 4F);

        ribbedhopperModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 68
        ribbedhopperModel[46].setRotationPoint(-32F, -11F, 4F);

        ribbedhopperModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 69
        ribbedhopperModel[47].setRotationPoint(-34F, -11F, 4F);

        ribbedhopperModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 70
        ribbedhopperModel[48].setRotationPoint(-33F, -10F, 3.99F);

        ribbedhopperModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 71
        ribbedhopperModel[49].setRotationPoint(-33F, -10F, 9.01F);

        ribbedhopperModel[50].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 72
        ribbedhopperModel[50].setRotationPoint(-38F, -21F, -5F);

        ribbedhopperModel[51].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 73
        ribbedhopperModel[51].setRotationPoint(-38F, -21F, 4F);

        ribbedhopperModel[52].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 74
        ribbedhopperModel[52].setRotationPoint(37F, -21F, 4F);

        ribbedhopperModel[53].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 75
        ribbedhopperModel[53].setRotationPoint(37F, -21F, -5F);

        ribbedhopperModel[54].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 76
        ribbedhopperModel[54].setRotationPoint(-38.5F, -9.5F, -5.5F);

        ribbedhopperModel[55].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 77
        ribbedhopperModel[55].setRotationPoint(-38.52F, -11F, -7F);

        ribbedhopperModel[56].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 78
        ribbedhopperModel[56].setRotationPoint(-30.5F, -26F, -11.5F);

        ribbedhopperModel[57].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 79
        ribbedhopperModel[57].setRotationPoint(-25.5F, -26F, -11.5F);

        ribbedhopperModel[58].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 80
        ribbedhopperModel[58].setRotationPoint(29.5F, -26F, -11.5F);

        ribbedhopperModel[59].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 81
        ribbedhopperModel[59].setRotationPoint(24.5F, -26F, -11.5F);

        ribbedhopperModel[60].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 82
        ribbedhopperModel[60].setRotationPoint(-20.5F, -26F, -11.5F);

        ribbedhopperModel[61].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 83
        ribbedhopperModel[61].setRotationPoint(19.5F, -26F, -11.5F);

        ribbedhopperModel[62].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 84
        ribbedhopperModel[62].setRotationPoint(14.5F, -26F, -11.5F);

        ribbedhopperModel[63].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 85
        ribbedhopperModel[63].setRotationPoint(-15.5F, -26F, -11.5F);

        ribbedhopperModel[64].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 86
        ribbedhopperModel[64].setRotationPoint(-10.5F, -26F, -11.5F);

        ribbedhopperModel[65].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 87
        ribbedhopperModel[65].setRotationPoint(9.5F, -26F, -11.5F);

        ribbedhopperModel[66].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 88
        ribbedhopperModel[66].setRotationPoint(4.5F, -26F, -11.5F);

        ribbedhopperModel[67].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 89
        ribbedhopperModel[67].setRotationPoint(-5.5F, -26F, -11.5F);

        ribbedhopperModel[68].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 90
        ribbedhopperModel[68].setRotationPoint(-0.5F, -26F, -11.5F);

        ribbedhopperModel[69].addShapeBox(0F, 0F, 0F, 76, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        ribbedhopperModel[69].setRotationPoint(-38F, -27F, 9F);

        ribbedhopperModel[70].addShapeBox(0F, 0F, 0F, 76, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
        ribbedhopperModel[70].setRotationPoint(-38F, -28F, -9F);

        ribbedhopperModel[71].addShapeBox(0F, 0F, 0F, 76, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
        ribbedhopperModel[71].setRotationPoint(-38F, -28F, 5F);

        ribbedhopperModel[72].addBox(0F, 0F, 0F, 76, 1, 10, 0F); // Box 80
        ribbedhopperModel[72].setRotationPoint(-38F, -28F, -5F);

        ribbedhopperModel[73].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 81
        ribbedhopperModel[73].setRotationPoint(35F, -26F, 10F);

        ribbedhopperModel[74].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 82
        ribbedhopperModel[74].setRotationPoint(-38F, -26F, 10F);

        ribbedhopperModel[75].addShapeBox(0F, 0F, 0F, 4, 26, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 83
        ribbedhopperModel[75].setRotationPoint(-38F, -26F, -11F);

        ribbedhopperModel[76].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0 truck mount
        ribbedhopperModel[76].setRotationPoint(-33F, -3F, -1F);

        ribbedhopperModel[77].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0 truck mount
        ribbedhopperModel[77].setRotationPoint(31F, -3F, -1F);

        ribbedhopperModel[78].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        ribbedhopperModel[78].setRotationPoint(-24F, -6F, -11F);

        ribbedhopperModel[79].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 84
        ribbedhopperModel[79].setRotationPoint(-18F, -6F, -11F);

        ribbedhopperModel[80].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F); // Box 85
        ribbedhopperModel[80].setRotationPoint(-18F, -6F, 6F);

        ribbedhopperModel[81].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F); // Box 86
        ribbedhopperModel[81].setRotationPoint(-28F, -6F, 6F);

        ribbedhopperModel[82].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 87
        ribbedhopperModel[82].setRotationPoint(-24F, -6F, 6F);

        ribbedhopperModel[83].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 88
        ribbedhopperModel[83].setRotationPoint(-3F, -6F, 6F);

        ribbedhopperModel[84].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F); // Box 89
        ribbedhopperModel[84].setRotationPoint(3F, -6F, 6F);

        ribbedhopperModel[85].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F); // Box 90
        ribbedhopperModel[85].setRotationPoint(-7F, -6F, 6F);

        ribbedhopperModel[86].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 91
        ribbedhopperModel[86].setRotationPoint(-7F, -6F, -11F);

        ribbedhopperModel[87].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
        ribbedhopperModel[87].setRotationPoint(-3F, -6F, -11F);

        ribbedhopperModel[88].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 93
        ribbedhopperModel[88].setRotationPoint(3F, -6F, -11F);

        ribbedhopperModel[89].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 94
        ribbedhopperModel[89].setRotationPoint(18F, -6F, 6F);

        ribbedhopperModel[90].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F); // Box 95
        ribbedhopperModel[90].setRotationPoint(24F, -6F, 6F);

        ribbedhopperModel[91].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F); // Box 96
        ribbedhopperModel[91].setRotationPoint(14F, -6F, 6F);

        ribbedhopperModel[92].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 97
        ribbedhopperModel[92].setRotationPoint(14F, -6F, -11F);

        ribbedhopperModel[93].addShapeBox(0F, 0F, 0F, 6, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
        ribbedhopperModel[93].setRotationPoint(18F, -6F, -11F);

        ribbedhopperModel[94].addShapeBox(0F, 0F, 0F, 4, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 99
        ribbedhopperModel[94].setRotationPoint(24F, -6F, -11F);

        ribbedhopperModel[95].addBox(0F, 0F, 0F, 50, 6, 6, 0F); // Box 95
        ribbedhopperModel[95].setRotationPoint(-25F, -6F, -3F);

        ribbedhopperModel[96].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 96
        ribbedhopperModel[96].setRotationPoint(25F, -6F, -3F);

        ribbedhopperModel[97].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 97
        ribbedhopperModel[97].setRotationPoint(-0.5F, -26F, 10.5F);

        ribbedhopperModel[98].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 98
        ribbedhopperModel[98].setRotationPoint(29.5F, -26F, 10.5F);

        ribbedhopperModel[99].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 99
        ribbedhopperModel[99].setRotationPoint(24.5F, -26F, 10.5F);

        ribbedhopperModel[100].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 100
        ribbedhopperModel[100].setRotationPoint(19.5F, -26F, 10.5F);

        ribbedhopperModel[101].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 101
        ribbedhopperModel[101].setRotationPoint(14.5F, -26F, 10.5F);

        ribbedhopperModel[102].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 102
        ribbedhopperModel[102].setRotationPoint(9.5F, -26F, 10.5F);

        ribbedhopperModel[103].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 103
        ribbedhopperModel[103].setRotationPoint(4.5F, -26F, 10.5F);

        ribbedhopperModel[104].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 104
        ribbedhopperModel[104].setRotationPoint(-5.5F, -26F, 10.5F);

        ribbedhopperModel[105].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 105
        ribbedhopperModel[105].setRotationPoint(-10.5F, -26F, 10.5F);

        ribbedhopperModel[106].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 106
        ribbedhopperModel[106].setRotationPoint(-15.5F, -26F, 10.5F);

        ribbedhopperModel[107].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 107
        ribbedhopperModel[107].setRotationPoint(-20.5F, -26F, 10.5F);

        ribbedhopperModel[108].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 108
        ribbedhopperModel[108].setRotationPoint(-25.5F, -26F, 10.5F);

        ribbedhopperModel[109].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 109
        ribbedhopperModel[109].setRotationPoint(-30.5F, -26F, 10.5F);


    }
    ModelAmericanFreightTrucks bogie = new ModelAmericanFreightTrucks();
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 110; i++)
        {
            ribbedhopperModel[i].render(f5);
        }

        Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/AmericanFreightTrucks.png"));

        GL11.glPushMatrix();
        GL11.glScalef(1,1,0.9f);
        GL11.glTranslated(-2.05,0.2,-0.4);
        bogie.render(entity,f,f1,f2,f3,f4,f5);

        GL11.glTranslated(4,0,0.03);
        bogie.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo ribbedhopperModel[];
}