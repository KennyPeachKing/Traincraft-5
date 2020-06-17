//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:27.04.2020 - 07:08:26
// Last changed on: 27.04.2020 - 07:08:26

package com.jcirmodelsquad.tcjcir.models;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

public class ModelSW1 extends ModelConverter
{
    int textureX = 512;
    int textureY = 512;

    public ModelSW1()
    {
        sw1Model = new ModelRendererTurbo[167];
        sw1Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        sw1Model[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 1
        sw1Model[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 5
        sw1Model[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 6
        sw1Model[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
        sw1Model[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 8
        sw1Model[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 9
        sw1Model[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 10
        sw1Model[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 11
        sw1Model[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 13
        sw1Model[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 14
        sw1Model[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 15
        sw1Model[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
        sw1Model[13] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 17
        sw1Model[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 18
        sw1Model[15] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 19
        sw1Model[16] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 20
        sw1Model[17] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 21
        sw1Model[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
        sw1Model[19] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 35
        sw1Model[20] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 36
        sw1Model[21] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 38
        sw1Model[22] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 40
        sw1Model[23] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 41
        sw1Model[24] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 42
        sw1Model[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
        sw1Model[26] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 47
        sw1Model[27] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 50 OPTIONAL
        sw1Model[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 52
        sw1Model[29] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 53
        sw1Model[30] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 54 OPTIONAL
        sw1Model[31] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 55 OPTIONAL
        sw1Model[32] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 58
        sw1Model[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 59
        sw1Model[34] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 67
        sw1Model[35] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 68
        sw1Model[36] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 71
        sw1Model[37] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 61
        sw1Model[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 67
        sw1Model[39] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 70
        sw1Model[40] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 71
        sw1Model[41] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 72
        sw1Model[42] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 73
        sw1Model[43] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 78
        sw1Model[44] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 83
        sw1Model[45] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 84
        sw1Model[46] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 85
        sw1Model[47] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 86
        sw1Model[48] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 87
        sw1Model[49] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 88
        sw1Model[50] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 89
        sw1Model[51] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 102
        sw1Model[52] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 104
        sw1Model[53] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 107
        sw1Model[54] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 108
        sw1Model[55] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 114
        sw1Model[56] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 74
        sw1Model[57] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 78
        sw1Model[58] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 113
        sw1Model[59] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 114
        sw1Model[60] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 115
        sw1Model[61] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 116
        sw1Model[62] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 117
        sw1Model[63] = new ModelRendererTurbo(this, 489, 17, textureX, textureY, "lamp"); // Box 211 lamp
        sw1Model[64] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 212
        sw1Model[65] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 213
        sw1Model[66] = new ModelRendererTurbo(this, 145, 25, textureX, textureY, "lamp"); // Box 214 lamp
        sw1Model[67] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 126 liveryimg 1
        sw1Model[68] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 127 liveryimg 1
        sw1Model[69] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 128 liveryimg 2
        sw1Model[70] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 129 liveryimg 2
        sw1Model[71] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 126
        sw1Model[72] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 127
        sw1Model[73] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 128
        sw1Model[74] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 129
        sw1Model[75] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 130
        sw1Model[76] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 131
        sw1Model[77] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 132
        sw1Model[78] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 133
        sw1Model[79] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 134
        sw1Model[80] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 135
        sw1Model[81] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 136
        sw1Model[82] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 137
        sw1Model[83] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 138
        sw1Model[84] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 139
        sw1Model[85] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 140
        sw1Model[86] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 141
        sw1Model[87] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 142
        sw1Model[88] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 143
        sw1Model[89] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 144
        sw1Model[90] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 2
        sw1Model[91] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 146
        sw1Model[92] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 147
        sw1Model[93] = new ModelRendererTurbo(this, 369, 25, textureX, textureY, "lamp"); // Box 148 glow
        sw1Model[94] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 315 door swing right
        sw1Model[95] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 151
        sw1Model[96] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 152
        sw1Model[97] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 153
        sw1Model[98] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 154
        sw1Model[99] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 161
        sw1Model[100] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 162
        sw1Model[101] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 163
        sw1Model[102] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 164
        sw1Model[103] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 166
        sw1Model[104] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 167
        sw1Model[105] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 168
        sw1Model[106] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 169
        sw1Model[107] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 170
        sw1Model[108] = new ModelRendererTurbo(this, 257, 33, textureX, textureY, "lamp"); // Box 171 lamp
        sw1Model[109] = new ModelRendererTurbo(this, 369, 33, textureX, textureY, "lamp"); // Box 172 lamp
        sw1Model[110] = new ModelRendererTurbo(this, 281, 49, textureX, textureY, "lamp"); // Box 173 glow
        sw1Model[111] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 174
        sw1Model[112] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 175
        sw1Model[113] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 176
        sw1Model[114] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 177
        sw1Model[115] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 178
        sw1Model[116] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 179
        sw1Model[117] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 180
        sw1Model[118] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 181
        sw1Model[119] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 182
        sw1Model[120] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 183
        sw1Model[121] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 184
        sw1Model[122] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 131
        sw1Model[123] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 187
        sw1Model[124] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 188
        sw1Model[125] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 189
        sw1Model[126] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 190
        sw1Model[127] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 191
        sw1Model[128] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 192
        sw1Model[129] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 193
        sw1Model[130] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 194
        sw1Model[131] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 195
        sw1Model[132] = new ModelRendererTurbo(this, 329, 49, textureX, textureY, "lamp"); // Box 196 glow
        sw1Model[133] = new ModelRendererTurbo(this, 401, 49, textureX, textureY, "lamp"); // Box 197 lamp
        sw1Model[134] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 198
        sw1Model[135] = new ModelRendererTurbo(this, 425, 49, textureX, textureY, "lamp"); // Box 199 glow
        sw1Model[136] = new ModelRendererTurbo(this, 449, 49, textureX, textureY, "lamp"); // Box 200 lamp
        sw1Model[137] = new ModelRendererTurbo(this, 465, 49, textureX, textureY, "lamp"); // Box 137 lamp
        sw1Model[138] = new ModelRendererTurbo(this, 25, 57, textureX, textureY, "lamp"); // Box 138 lamp
        sw1Model[139] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 140
        sw1Model[140] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 141
        sw1Model[141] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 142
        sw1Model[142] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 143
        sw1Model[143] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 144
        sw1Model[144] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 145
        sw1Model[145] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 146
        sw1Model[146] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 147
        sw1Model[147] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 148
        sw1Model[148] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 148
        sw1Model[149] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 149
        sw1Model[150] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 150
        sw1Model[151] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 151
        sw1Model[152] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 152
        sw1Model[153] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 153
        sw1Model[154] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 154
        sw1Model[155] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 155
        sw1Model[156] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 156
        sw1Model[157] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 157
        sw1Model[158] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 158
        sw1Model[159] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 159
        sw1Model[160] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 160
        sw1Model[161] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 161
        sw1Model[162] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 162
        sw1Model[163] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 163
        sw1Model[164] = new ModelRendererTurbo(this, 409, 4, textureX, textureY); // Box 164
        sw1Model[165] = new ModelRendererTurbo(this, 356, 4, textureX, textureY); // Box 165
        sw1Model[166] = new ModelRendererTurbo(this, 361, 4, textureX, textureY); // Box 166

        sw1Model[0].addBox(0F, 0F, 0F, 54, 1, 22, 0F); // Box 0
        sw1Model[0].setRotationPoint(-22F, -2F, -11F);

        sw1Model[1].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 1
        sw1Model[1].setRotationPoint(-25F, -2F, -7F);

        sw1Model[2].addBox(0F, 0F, 0F, 25, 15, 14, 0F); // Box 5
        sw1Model[2].setRotationPoint(-18F, -17F, -7F);

        sw1Model[3].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 6
        sw1Model[3].setRotationPoint(15F, -21F, -11F);

        sw1Model[4].addBox(0F, 0F, 0F, 12, 2, 6, 0F); // Box 7
        sw1Model[4].setRotationPoint(14F, -25F, -3F);

        sw1Model[5].addBox(0F, 0F, 0F, 11, 15, 1, 0F); // Box 8
        sw1Model[5].setRotationPoint(15F, -21F, 10F);

        sw1Model[6].addBox(0F, 0F, 0F, 1, 15, 7, 0F); // Box 9
        sw1Model[6].setRotationPoint(25F, -21F, -10F);

        sw1Model[7].addBox(0F, 0F, 0F, 1, 15, 18, 0F); // Box 10
        sw1Model[7].setRotationPoint(14F, -21F, -7F);

        sw1Model[8].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 11
        sw1Model[8].setRotationPoint(14F, -23F, -9F);

        sw1Model[9].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
        sw1Model[9].setRotationPoint(14F, -25F, -9F);

        sw1Model[10].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
        sw1Model[10].setRotationPoint(14F, -23F, -11F);

        sw1Model[11].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
        sw1Model[11].setRotationPoint(14F, -23F, 9F);

        sw1Model[12].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
        sw1Model[12].setRotationPoint(14F, -25F, 3F);

        sw1Model[13].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, 0F, 0F, 0F, -2F, -0.75F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
        sw1Model[13].setRotationPoint(7F, -17F, -7F);

        sw1Model[14].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 18
        sw1Model[14].setRotationPoint(14F, -6F, -11F);

        sw1Model[15].addShapeBox(0F, 0F, 0F, 25, 1, 7, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        sw1Model[15].setRotationPoint(-18F, -18F, -7F);

        sw1Model[16].addShapeBox(0F, 0F, 0F, 25, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
        sw1Model[16].setRotationPoint(-18F, -18F, 0F);

        sw1Model[17].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 21
        sw1Model[17].setRotationPoint(-22F, -6F, -7F);

        sw1Model[18].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 33
        sw1Model[18].setRotationPoint(3F, -24F, -1F);

        sw1Model[19].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 35
        sw1Model[19].setRotationPoint(-21F, -10F, -11.01F);

        sw1Model[20].addBox(0F, 0F, 0F, 35, 8, 0, 0F); // Box 36
        sw1Model[20].setRotationPoint(-21F, -10F, 11.01F);

        sw1Model[21].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
        sw1Model[21].setRotationPoint(-23F, -10F, -11.01F);

        sw1Model[22].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 40
        sw1Model[22].setRotationPoint(-23F, -8F, -11.01F);

        sw1Model[23].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 41
        sw1Model[23].setRotationPoint(-23F, -8F, 11.01F);

        sw1Model[24].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 42
        sw1Model[24].setRotationPoint(-23F, -10F, 11.01F);

        sw1Model[25].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
        sw1Model[25].setRotationPoint(12F, -5F, -11F);

        sw1Model[26].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 47
        sw1Model[26].setRotationPoint(7F, -17F, 0F);

        sw1Model[27].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 50 OPTIONAL
        sw1Model[27].setRotationPoint(-28F, 5F, -11F);

        sw1Model[28].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 52
        sw1Model[28].setRotationPoint(-28.5F, 0F, -1.5F);

        sw1Model[29].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 53
        sw1Model[29].setRotationPoint(35.5F, 0F, -1.5F);

        sw1Model[30].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54 OPTIONAL
        sw1Model[30].setRotationPoint(15F, -21F, -12F);

        sw1Model[31].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55 OPTIONAL
        sw1Model[31].setRotationPoint(15F, -20F, 11F);

        sw1Model[32].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 58
        sw1Model[32].setRotationPoint(-25F, 5F, -11F);

        sw1Model[33].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 59
        sw1Model[33].setRotationPoint(-25F, 3F, -9.5F);

        sw1Model[34].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 67
        sw1Model[34].setRotationPoint(28F, -10F, -4F);

        sw1Model[35].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 68
        sw1Model[35].setRotationPoint(28F, -10F, 4F);

        sw1Model[36].addBox(0F, 0F, 0F, 1, 15, 7, 0F); // Box 71
        sw1Model[36].setRotationPoint(25F, -21F, 3F);

        sw1Model[37].addShapeBox(0F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
        sw1Model[37].setRotationPoint(25F, -21F, -3F);

        sw1Model[38].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 67
        sw1Model[38].setRotationPoint(13F, -14.98F, -1.5F);
        sw1Model[38].rotateAngleY = -0.48869219F;

        sw1Model[39].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 70
        sw1Model[39].setRotationPoint(15F, -15F, 3F);

        sw1Model[40].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71
        sw1Model[40].setRotationPoint(15F, -23F, -1F);

        sw1Model[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 72
        sw1Model[41].setRotationPoint(13F, -24F, -0.5F);

        sw1Model[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 73
        sw1Model[42].setRotationPoint(12F, -24F, -0.5F);

        sw1Model[43].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 78
        sw1Model[43].setRotationPoint(20F, -23.5F, -1F);

        sw1Model[44].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
        sw1Model[44].setRotationPoint(0.5F, 1F, -11F);

        sw1Model[45].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 84
        sw1Model[45].setRotationPoint(0.5F, 3F, -11F);

        sw1Model[46].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 85
        sw1Model[46].setRotationPoint(0.5F, 2F, -11F);

        sw1Model[47].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
        sw1Model[47].setRotationPoint(0.5F, 1F, 8F);

        sw1Model[48].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // Box 87
        sw1Model[48].setRotationPoint(0.5F, 2F, 8F);

        sw1Model[49].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
        sw1Model[49].setRotationPoint(0.5F, 3F, 8F);

        sw1Model[50].addBox(0F, 0F, 0F, 10, 5, 16, 0F); // Box 89
        sw1Model[50].setRotationPoint(0F, 0F, -8F);

        sw1Model[51].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 102
        sw1Model[51].setRotationPoint(-15F, 0F, -1F);

        sw1Model[52].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 104
        sw1Model[52].setRotationPoint(20F, 0F, -1F);

        sw1Model[53].addShapeBox(0F, 0F, 0F, 7, 13, 14, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
        sw1Model[53].setRotationPoint(7F, -15F, -7F);

        sw1Model[54].addBox(0F, 0F, 0F, 54, 1, 16, 0F); // Box 108
        sw1Model[54].setRotationPoint(-22F, -1F, -8F);

        sw1Model[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
        sw1Model[55].setRotationPoint(-16F, -21F, -0.5F);

        sw1Model[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
        sw1Model[56].setRotationPoint(-16F, -22F, -0.5F);

        sw1Model[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
        sw1Model[57].setRotationPoint(-15.75F, -20.5F, -0.25F);

        sw1Model[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
        sw1Model[58].setRotationPoint(-16F, -19F, -2F);

        sw1Model[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
        sw1Model[59].setRotationPoint(-16F, -22F, -2F);

        sw1Model[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
        sw1Model[60].setRotationPoint(-16F, -22F, 1F);

        sw1Model[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
        sw1Model[61].setRotationPoint(-16F, -22.5F, -1F);

        sw1Model[62].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
        sw1Model[62].setRotationPoint(-16F, -18.5F, -1F);

        sw1Model[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 211 lamp
        sw1Model[63].setRotationPoint(-25.5F, -4F, 5.25F);

        sw1Model[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212
        sw1Model[64].setRotationPoint(-25F, -4F, 5F);

        sw1Model[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 213
        sw1Model[65].setRotationPoint(-25F, -4F, -7F);

        sw1Model[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 214 lamp
        sw1Model[66].setRotationPoint(-25.5F, -4F, -6.75F);

        sw1Model[67].addBox(0F, 0F, 0F, 20, 8, 0, 0F); // Box 126 liveryimg 1
        sw1Model[67].setRotationPoint(-16F, -14F, -7.01F);

        sw1Model[68].addBox(0F, 0F, 0F, 20, 8, 0, 0F); // Box 127 liveryimg 1
        sw1Model[68].setRotationPoint(-16F, -14F, 7.01F);

        sw1Model[69].addBox(0F, 0F, 0F, 11, 5, 0, 0F); // Box 128 liveryimg 2
        sw1Model[69].setRotationPoint(15F, -14F, -11.01F);

        sw1Model[70].addBox(0F, 0F, 0F, 11, 5, 0, 0F); // Box 129 liveryimg 2
        sw1Model[70].setRotationPoint(15F, -14F, 11.01F);

        sw1Model[71].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
        sw1Model[71].setRotationPoint(15F, -23F, 6F);

        sw1Model[72].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 127
        sw1Model[72].setRotationPoint(15F, -23F, -9F);

        sw1Model[73].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 128
        sw1Model[73].setRotationPoint(-21F, -7F, -7F);

        sw1Model[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
        sw1Model[74].setRotationPoint(13F, -25F, -9F);

        sw1Model[75].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 130
        sw1Model[75].setRotationPoint(13F, -25F, 3F);

        sw1Model[76].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 131
        sw1Model[76].setRotationPoint(13F, -25F, -3F);

        sw1Model[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
        sw1Model[77].setRotationPoint(13F, -23F, -11F);

        sw1Model[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 133
        sw1Model[78].setRotationPoint(13F, -23F, 9F);

        sw1Model[79].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 134
        sw1Model[79].setRotationPoint(-25F, 1F, -8F);

        sw1Model[80].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 135
        sw1Model[80].setRotationPoint(-22F, -1F, -11F);

        sw1Model[81].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 136
        sw1Model[81].setRotationPoint(-22F, -1F, 5F);

        sw1Model[82].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
        sw1Model[82].setRotationPoint(-22F, -7F, -7F);

        sw1Model[83].addBox(0F, 0F, 0F, 1, 7, 13, 0F); // Box 138
        sw1Model[83].setRotationPoint(-18.25F, -14.5F, -6.5F);

        sw1Model[84].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
        sw1Model[84].setRotationPoint(26F, -25F, -9F);

        sw1Model[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
        sw1Model[85].setRotationPoint(26F, -23F, -11F);

        sw1Model[86].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 141
        sw1Model[86].setRotationPoint(26F, -25F, -3F);

        sw1Model[87].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 142
        sw1Model[87].setRotationPoint(26F, -25F, 3F);

        sw1Model[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 143
        sw1Model[88].setRotationPoint(26F, -23F, 9F);

        sw1Model[89].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 144
        sw1Model[89].setRotationPoint(25F, -23F, -9F);

        sw1Model[90].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
        sw1Model[90].setRotationPoint(-26F, -0.5F, -2F);

        sw1Model[91].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
        sw1Model[91].setRotationPoint(35F, -0.5F, -2F);

        sw1Model[92].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 147
        sw1Model[92].setRotationPoint(-20F, -18F, -1.5F);

        sw1Model[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148 glow
        sw1Model[93].setRotationPoint(-19.5F, -17.5F, -2.5F);

        sw1Model[94].addBox(-0.5F, 0F, -0.5F, 1, 15, 4, 0F); // Box 315 door swing right
        sw1Model[94].setRotationPoint(14.5F, -21F, -10.5F);

        sw1Model[95].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 151
        sw1Model[95].setRotationPoint(-22F, -1F, -11F);

        sw1Model[96].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 152
        sw1Model[96].setRotationPoint(-21F, 0F, -11F);

        sw1Model[97].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 153
        sw1Model[97].setRotationPoint(-21F, -1F, -11F);

        sw1Model[98].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 154
        sw1Model[98].setRotationPoint(-19F, -1F, -11F);

        sw1Model[99].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 161
        sw1Model[99].setRotationPoint(0F, -1F, -10F);

        sw1Model[100].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 162
        sw1Model[100].setRotationPoint(0F, -1F, 8F);

        sw1Model[101].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 163
        sw1Model[101].setRotationPoint(32F, -1F, -11F);

        sw1Model[102].addBox(0F, 0F, 0F, 0, 6, 6, 0F); // Box 164
        sw1Model[102].setRotationPoint(32F, -1F, 5F);

        sw1Model[103].addBox(0F, 0F, 0F, 0, 14, 20, 0F); // Box 166
        sw1Model[103].setRotationPoint(-25.01F, -10F, -10F);

        sw1Model[104].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
        sw1Model[104].setRotationPoint(-25.01F, -10F, -11F);

        sw1Model[105].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 168
        sw1Model[105].setRotationPoint(-25.01F, -9F, -11F);

        sw1Model[106].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 169
        sw1Model[106].setRotationPoint(-25.01F, -9F, 10F);

        sw1Model[107].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
        sw1Model[107].setRotationPoint(-25.01F, -10F, 10F);

        sw1Model[108].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 171 lamp
        sw1Model[108].setRotationPoint(-20.5F, -18.25F, -0.75F);

        sw1Model[109].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 172 lamp
        sw1Model[109].setRotationPoint(-20.5F, -16.25F, -0.75F);

        sw1Model[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173 glow
        sw1Model[110].setRotationPoint(-19.5F, -17.5F, 1.5F);

        sw1Model[111].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 174
        sw1Model[111].setRotationPoint(-25.01F, 4F, -11F);

        sw1Model[112].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 175
        sw1Model[112].setRotationPoint(-28F, 5F, 4F);

        sw1Model[113].addBox(0F, 0F, 0F, 0, 14, 20, 0F); // Box 176
        sw1Model[113].setRotationPoint(35.01F, -10F, -10F);

        sw1Model[114].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 177
        sw1Model[114].setRotationPoint(35.01F, 4F, -11F);

        sw1Model[115].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 178
        sw1Model[115].setRotationPoint(35.01F, 5F, 4F);

        sw1Model[116].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 179
        sw1Model[116].setRotationPoint(35.01F, 5F, -11F);

        sw1Model[117].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 180
        sw1Model[117].setRotationPoint(35.01F, -9F, -11F);

        sw1Model[118].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
        sw1Model[118].setRotationPoint(35.01F, -10F, 10F);

        sw1Model[119].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 182
        sw1Model[119].setRotationPoint(35.01F, -9F, 10F);

        sw1Model[120].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
        sw1Model[120].setRotationPoint(35.01F, -10F, -11F);

        sw1Model[121].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 184
        sw1Model[121].setRotationPoint(32F, -2F, -7F);

        sw1Model[122].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 131
        sw1Model[122].setRotationPoint(29F, -16F, -4F);
        sw1Model[122].rotateAngleY = -3.14159265F;

        sw1Model[123].addShapeBox(0F, 0F, 0F, 3, 6, 0, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 187
        sw1Model[123].setRotationPoint(29F, -16F, 4F);
        sw1Model[123].rotateAngleY = -3.14159265F;

        sw1Model[124].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 188
        sw1Model[124].setRotationPoint(32F, -8F, -11.01F);

        sw1Model[125].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 189
        sw1Model[125].setRotationPoint(31F, -10F, -11.01F);

        sw1Model[126].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 190
        sw1Model[126].setRotationPoint(32F, -8F, 11.01F);

        sw1Model[127].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 191
        sw1Model[127].setRotationPoint(31F, -10F, 11.01F);

        sw1Model[128].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 192
        sw1Model[128].setRotationPoint(29F, -10F, -11.01F);

        sw1Model[129].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 193
        sw1Model[129].setRotationPoint(29F, -10F, 11.01F);

        sw1Model[130].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 194
        sw1Model[130].setRotationPoint(29F, -8F, -11.01F);

        sw1Model[131].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 195
        sw1Model[131].setRotationPoint(29F, -8F, 11.01F);

        sw1Model[132].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196 glow
        sw1Model[132].setRotationPoint(25.5F, -23.5F, -2.5F);

        sw1Model[133].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 197 lamp
        sw1Model[133].setRotationPoint(26.5F, -22.25F, -0.75F);

        sw1Model[134].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 198
        sw1Model[134].setRotationPoint(26F, -24F, -1.5F);

        sw1Model[135].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 199 glow
        sw1Model[135].setRotationPoint(25.5F, -23.5F, 1.5F);

        sw1Model[136].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 200 lamp
        sw1Model[136].setRotationPoint(26.5F, -24.25F, -0.75F);

        sw1Model[137].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 137 lamp
        sw1Model[137].setRotationPoint(-20.25F, -17.25F, -0.75F);

        sw1Model[138].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 138 lamp
        sw1Model[138].setRotationPoint(26.25F, -23.25F, -0.75F);

        sw1Model[139].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 140
        sw1Model[139].setRotationPoint(32F, 5F, -11F);

        sw1Model[140].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 141
        sw1Model[140].setRotationPoint(32F, 3F, -9.5F);

        sw1Model[141].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 142
        sw1Model[141].setRotationPoint(32F, 1F, -8F);

        sw1Model[142].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 143
        sw1Model[142].setRotationPoint(32F, 5F, 9F);

        sw1Model[143].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 144
        sw1Model[143].setRotationPoint(32F, 3F, 7.5F);

        sw1Model[144].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 145
        sw1Model[144].setRotationPoint(32F, 1F, 5F);

        sw1Model[145].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 146
        sw1Model[145].setRotationPoint(-25F, 1F, 5F);

        sw1Model[146].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 147
        sw1Model[146].setRotationPoint(-25F, 3F, 7.5F);

        sw1Model[147].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 148
        sw1Model[147].setRotationPoint(-25F, 5F, 9F);

        sw1Model[148].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 148
        sw1Model[148].setRotationPoint(-21F, -1F, 11F);

        sw1Model[149].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 149
        sw1Model[149].setRotationPoint(-22F, -1F, 11F);

        sw1Model[150].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 150
        sw1Model[150].setRotationPoint(-21F, 0F, 11F);

        sw1Model[151].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 151
        sw1Model[151].setRotationPoint(-19F, -1F, 11F);

        sw1Model[152].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 152
        sw1Model[152].setRotationPoint(29F, -1F, 11F);

        sw1Model[153].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 153
        sw1Model[153].setRotationPoint(31F, -1F, 11F);

        sw1Model[154].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 154
        sw1Model[154].setRotationPoint(29F, 0F, 11F);

        sw1Model[155].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 155
        sw1Model[155].setRotationPoint(28F, -1F, 11F);

        sw1Model[156].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 156
        sw1Model[156].setRotationPoint(28F, -1F, -11F);

        sw1Model[157].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 157
        sw1Model[157].setRotationPoint(29F, -1F, -11F);

        sw1Model[158].addShapeBox(0F, 0F, 0F, 2, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 158
        sw1Model[158].setRotationPoint(29F, 0F, -11F);

        sw1Model[159].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 159
        sw1Model[159].setRotationPoint(31F, -1F, -11F);

        sw1Model[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 160
        sw1Model[160].setRotationPoint(36F, -4F, -5.25F);
        sw1Model[160].rotateAngleY = -3.14159265F;

        sw1Model[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
        sw1Model[161].setRotationPoint(35.5F, -4F, -5F);
        sw1Model[161].rotateAngleY = -3.14159265F;

        sw1Model[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 162
        sw1Model[162].setRotationPoint(35.5F, -4F, 7F);
        sw1Model[162].rotateAngleY = -3.14159265F;

        sw1Model[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 163
        sw1Model[163].setRotationPoint(36F, -4F, 6.75F);
        sw1Model[163].rotateAngleY = -3.14159265F;

        sw1Model[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, 0.25F, 0.25F); // Box 164
        sw1Model[164].setRotationPoint(12F, -26F, -0.5F);

        sw1Model[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 165
        sw1Model[165].setRotationPoint(13F, -26F, -0.5F);

        sw1Model[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
        sw1Model[166].setRotationPoint(14F, -26F, -0.5F);


    }

    ModelTypeASmol theTrucks = new ModelTypeASmol();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 167; i++) {
            if (sw1Model[i].boxName != null && sw1Model[i].boxName.contains("lamp")) {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                sw1Model[i].render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            } else {
                sw1Model[i].render(f5);
            }
        }
        Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/typeasmol.png"));
        GL11.glPushMatrix();
        GL11.glTranslatef(-0.6F ,0.05F,0F);
        //GL11.glScalef(0.9f,0.9f,0.8f);
        theTrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        GL11.glTranslated(1.35F,0.05F,0);
        theTrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo sw1Model[];
}