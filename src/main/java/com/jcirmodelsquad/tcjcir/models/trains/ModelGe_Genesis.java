//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2020 - 16:02:20
// Last changed on: 26.06.2020 - 16:02:20

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelGe_GenesisBogie;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;

public class ModelGe_Genesis extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 512;

    public ModelGe_Genesis() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[181];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 60
        bodyModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 65
        bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 66
        bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 67
        bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 74
        bodyModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 77
        bodyModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 81
        bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 82
        bodyModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 84
        bodyModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 56
        bodyModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
        bodyModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 3
        bodyModel[12] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 7
        bodyModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 69
        bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 69
        bodyModel[15] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 72
        bodyModel[16] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 73
        bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 74
        bodyModel[18] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 75
        bodyModel[19] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 76
        bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 80
        bodyModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 81
        bodyModel[22] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 82
        bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 83
        bodyModel[24] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 85
        bodyModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 82
        bodyModel[26] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 87
        bodyModel[27] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 88
        bodyModel[28] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 89
        bodyModel[29] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 90
        bodyModel[30] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 91
        bodyModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 94
        bodyModel[32] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 22
        bodyModel[33] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 22
        bodyModel[34] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 22
        bodyModel[35] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 22
        bodyModel[36] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 22
        bodyModel[37] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 22
        bodyModel[38] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 22
        bodyModel[39] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 22
        bodyModel[40] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 22
        bodyModel[41] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 22
        bodyModel[42] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 22
        bodyModel[43] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 216
        bodyModel[44] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 215
        bodyModel[45] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 222
        bodyModel[46] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 223
        bodyModel[47] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 225
        bodyModel[48] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 228
        bodyModel[49] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 229
        bodyModel[50] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 115
        bodyModel[51] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 244
        bodyModel[52] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 245
        bodyModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 246
        bodyModel[54] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 247
        bodyModel[55] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 248
        bodyModel[56] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 251
        bodyModel[57] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 252
        bodyModel[58] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 253
        bodyModel[59] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 254
        bodyModel[60] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 255
        bodyModel[61] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 256
        bodyModel[62] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 257
        bodyModel[63] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 124
        bodyModel[64] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 218
        bodyModel[65] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 226
        bodyModel[66] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 227
        bodyModel[67] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 231
        bodyModel[68] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 234
        bodyModel[69] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 235
        bodyModel[70] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 236
        bodyModel[71] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 237
        bodyModel[72] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 238
        bodyModel[73] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 239
        bodyModel[74] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 240
        bodyModel[75] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 249
        bodyModel[76] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 250
        bodyModel[77] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 241
        bodyModel[78] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 242
        bodyModel[79] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 243
        bodyModel[80] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 258
        bodyModel[81] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 259
        bodyModel[82] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 260
        bodyModel[83] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 170
        bodyModel[84] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 36
        bodyModel[85] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 37
        bodyModel[86] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 38
        bodyModel[87] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 39
        bodyModel[88] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 103
        bodyModel[89] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 37
        bodyModel[90] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 37
        bodyModel[91] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 37
        bodyModel[92] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 12
        bodyModel[93] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 12
        bodyModel[94] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 12
        bodyModel[95] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 12
        bodyModel[96] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 12
        bodyModel[97] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 36
        bodyModel[98] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 38
        bodyModel[99] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 168
        bodyModel[100] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 172
        bodyModel[101] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 173
        bodyModel[102] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 171
        bodyModel[103] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 169
        bodyModel[104] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 174
        bodyModel[105] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 170
        bodyModel[106] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 217
        bodyModel[107] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 218
        bodyModel[108] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 219
        bodyModel[109] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 220
        bodyModel[110] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 221
        bodyModel[111] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 224
        bodyModel[112] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 261
        bodyModel[113] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 262
        bodyModel[114] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 263
        bodyModel[115] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 264
        bodyModel[116] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 265
        bodyModel[117] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 171
        bodyModel[118] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 171
        bodyModel[119] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 171
        bodyModel[120] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 171
        bodyModel[121] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 171
        bodyModel[122] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 171
        bodyModel[123] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 171
        bodyModel[124] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 171
        bodyModel[125] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 171
        bodyModel[126] = new ModelRendererTurbo(this, 191, 73, textureX, textureY); // Box 171
        bodyModel[127] = new ModelRendererTurbo(this, 231, 80, textureX, textureY); // Box 177
        bodyModel[128] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 295
        bodyModel[129] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 296
        bodyModel[130] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 12
        bodyModel[131] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 151
        bodyModel[132] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 151
        bodyModel[133] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 12
        bodyModel[134] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 12
        bodyModel[135] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 12
        bodyModel[136] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 223
        bodyModel[137] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 224
        bodyModel[138] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 171
        bodyModel[139] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 12
        bodyModel[140] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 12
        bodyModel[141] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 310
        bodyModel[142] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 311
        bodyModel[143] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 312
        bodyModel[144] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 313
        bodyModel[145] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 75
        bodyModel[146] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 85
        bodyModel[147] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 22
        bodyModel[148] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 22
        bodyModel[149] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 22
        bodyModel[150] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 22
        bodyModel[151] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 85
        bodyModel[152] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 326
        bodyModel[153] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 327
        bodyModel[154] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 328
        bodyModel[155] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 329
        bodyModel[156] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 183
        bodyModel[157] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 184
        bodyModel[158] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 186
        bodyModel[159] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 187
        bodyModel[160] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 4
        bodyModel[161] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 4
        bodyModel[162] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 4
        bodyModel[163] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 4
        bodyModel[164] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 4
        bodyModel[165] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 4
        bodyModel[166] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 179
        bodyModel[167] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 180
        bodyModel[168] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 181
        bodyModel[169] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 182
        bodyModel[170] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 184
        bodyModel[171] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 185
        bodyModel[172] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 187
        bodyModel[173] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 188
        bodyModel[174] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 182
        bodyModel[175] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 183
        bodyModel[176] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 183
        bodyModel[177] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 184
        bodyModel[178] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 185
        bodyModel[179] = new ModelRendererTurbo(this, 199, 56, textureX, textureY); // Box 183
        bodyModel[180] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 184

        bodyModel[0].addBox(0F, 0F, 0F, 92, 1, 22, 0F); // Box 60
        bodyModel[0].setRotationPoint(-43F, -6F, -11F);

        bodyModel[1].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 65
        bodyModel[1].setRotationPoint(50F, -5F, -6F);

        bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
        bodyModel[2].setRotationPoint(-28F, -5F, -0.5F);

        bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 67
        bodyModel[3].setRotationPoint(35F, -5F, -0.5F);

        bodyModel[4].addShapeBox(0F, 0F, 0F, 32, 3, 22, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F); // Box 74
        bodyModel[4].setRotationPoint(-12F, -5F, -11F);

        bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        bodyModel[5].setRotationPoint(0F, -2F, -9F);

        bodyModel[6].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 81
        bodyModel[6].setRotationPoint(1F, -2F, -9.5F);

        bodyModel[7].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 82
        bodyModel[7].setRotationPoint(14F, -2F, -9.5F);

        bodyModel[8].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 84
        bodyModel[8].setRotationPoint(50.5F, -7F, -1.5F);

        bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 56
        bodyModel[9].setRotationPoint(50F, -8F, -3F);

        bodyModel[10].addBox(0F, 0F, -2F, 21, 3, 20, 0F); // Box 0
        bodyModel[10].setRotationPoint(-43F, -9F, -8F);

        bodyModel[11].addBox(0F, 0F, 0F, 5, 8, 20, 0F); // Box 3
        bodyModel[11].setRotationPoint(-43F, -17F, -10F);

        bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 18, 0F,0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.75F); // Box 7
        bodyModel[12].setRotationPoint(-47F, -19F, -9F);

        bodyModel[13].addBox(0F, 0F, 0F, 71, 20, 20, 0F); // Box 69
        bodyModel[13].setRotationPoint(-22F, -26F, -10F);

        bodyModel[14].addBox(0F, 0F, 0F, 6, 4, 0, 0F); // Box 69
        bodyModel[14].setRotationPoint(-34.5F, -5F, -11F);

        bodyModel[15].addBox(0F, 0F, 0F, 6, 4, 0, 0F); // Box 72
        bodyModel[15].setRotationPoint(-34.5F, -5F, 11F);

        bodyModel[16].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 73
        bodyModel[16].setRotationPoint(42.5F, -5F, 11F);

        bodyModel[17].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 74
        bodyModel[17].setRotationPoint(42.5F, -5F, -11F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
        bodyModel[18].setRotationPoint(-42F, -26F, -11F);
        bodyModel[18].rotateAngleX = -0.10471976F;

        bodyModel[19].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 76
        bodyModel[19].setRotationPoint(-42F, -26F, 10F);
        bodyModel[19].rotateAngleX = 0.10471976F;

        bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 80
        bodyModel[20].setRotationPoint(-7F, -29.5F, 0F);

        bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 81
        bodyModel[21].setRotationPoint(-8F, -29.5F, -1.04F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 82
        bodyModel[22].setRotationPoint(-8F, -29.5F, 4.05F);

        bodyModel[23].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 83
        bodyModel[23].setRotationPoint(-9F, -30.5F, 0.199999999999999F);

        bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 85
        bodyModel[24].setRotationPoint(-10F, -30.5F, 1.5F);

        bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 82
        bodyModel[25].setRotationPoint(50F, -25F, -8F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
        bodyModel[26].setRotationPoint(1F, -2F, -9F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[27].setRotationPoint(0F, -2F, -8F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
        bodyModel[28].setRotationPoint(0F, -1F, -8F);

        bodyModel[29].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 90
        bodyModel[29].setRotationPoint(15F, -2F, -9.5F);

        bodyModel[30].addBox(0F, 0F, 0F, 0, 2, 3, 0F); // Box 91
        bodyModel[30].setRotationPoint(2F, -2F, -9.5F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 94
        bodyModel[31].setRotationPoint(50F, -25F, 7F);

        bodyModel[32].addShapeBox(-1F, -1F, 0F, 6, 2, 10, 0F,-3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -5F, 0F, 3F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -5F, 0F, 3F); // Box 22
        bodyModel[32].setRotationPoint(-55F, -11F, -4F);

        bodyModel[33].addShapeBox(-1F, -1F, 0F, 6, 2, 10, 0F,-5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, -3F, 0F, -4F, -6F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, -4F, 0F, -4F); // Box 22
        bodyModel[33].setRotationPoint(-55F, -6F, -6F);

        bodyModel[34].addShapeBox(-1F, -1F, 0F, 6, 2, 10, 0F,-5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, -3F, 0F, -4F, -5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, -3F, 0F, -4F); // Box 22
        bodyModel[34].setRotationPoint(-55F, -11F, -6F);

        bodyModel[35].addShapeBox(-1F, -1F, 0F, 9, 2, 5, 0F,3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 22
        bodyModel[35].setRotationPoint(-47F, -6F, -14F);

        bodyModel[36].addShapeBox(-1F, -1F, 0F, 9, 2, 5, 0F,3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 3F, 0F, -5F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 2F, 0F, -5F); // Box 22
        bodyModel[36].setRotationPoint(-47F, -6F, 9F);

        bodyModel[37].addShapeBox(-1F, -1F, 0F, 9, 5, 5, 0F,3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 3F, 0F, 0F); // Box 22
        bodyModel[37].setRotationPoint(-47F, -11F, -14F);

        bodyModel[38].addShapeBox(-1F, -1F, 0F, 9, 5, 5, 0F,3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 3F, 0F, -5F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 3F, 0F, -5F); // Box 22
        bodyModel[38].setRotationPoint(-47F, -11F, 9F);

        bodyModel[39].addShapeBox(-1F, -1F, 0F, 9, 2, 5, 0F,2F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 3F, 0F, 0F); // Box 22
        bodyModel[39].setRotationPoint(-47F, -13F, -14F);

        bodyModel[40].addShapeBox(-1F, -1F, 0F, 9, 2, 5, 0F,2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 2F, 0F, -5F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 3F, 0F, -5F); // Box 22
        bodyModel[40].setRotationPoint(-47F, -13F, 9F);

        bodyModel[41].addShapeBox(-1F, -1F, 0F, 8, 7, 5, 0F,-4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -3F, -4F, 0F, -3F, 3F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -3F, 3F, 0F, -5F); // Box 22
        bodyModel[41].setRotationPoint(-46F, -20F, 9F);

        bodyModel[42].addShapeBox(-1F, -1F, 0F, 8, 7, 5, 0F,-4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -1F, -4F, 0F, -1F, 3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, -1F, 3F, 0F, 0F); // Box 22
        bodyModel[42].setRotationPoint(-46F, -20F, -14F);

        bodyModel[43].addShapeBox(-1F, -1F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.4F, -1.5F, 0F, -0.5F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.5F); // Box 216
        bodyModel[43].setRotationPoint(-50.5F, -13F, 1.5F);

        bodyModel[44].addShapeBox(-1F, -1F, 0F, 1, 2, 8, 0F,-1.5F, 0F, -0.5F, 1F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 1.2F, 0F, 0F); // Box 215
        bodyModel[44].setRotationPoint(-50.5F, -13F, -9.5F);

        bodyModel[45].addShapeBox(-1F, 0F, 0F, 1, 12, 9, 0F,-5.5F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7.6F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 222
        bodyModel[45].setRotationPoint(-49.5F, -26F, 0F);

        bodyModel[46].addShapeBox(-1F, 0F, 0F, 1, 12, 9, 0F,-7.6F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F); // Box 223
        bodyModel[46].setRotationPoint(-49.5F, -26F, -9F);

        bodyModel[47].addShapeBox(-1F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 225
        bodyModel[47].setRotationPoint(-51F, -13.75F, -1.25F);

        bodyModel[48].addShapeBox(-1F, -1F, 0F, 6, 1, 10, 0F,-5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, -3F, 0F, -4F, -5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, -3F, 0F, -4F); // Box 228
        bodyModel[48].setRotationPoint(-55F, -7F, -6F);

        bodyModel[49].addShapeBox(-1F, -1F, 0F, 6, 1, 10, 0F,-3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -5F, 0F, 3F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -5F, 0F, 3F); // Box 229
        bodyModel[49].setRotationPoint(-55F, -7F, -4F);

        bodyModel[50].addShapeBox(-1F, -1F, 0F, 6, 2, 10, 0F,-3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -5F, 0F, 3F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -6F, 0F, 3F); // Box 115
        bodyModel[50].setRotationPoint(-55F, -6F, -4F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 244
        bodyModel[51].setRotationPoint(-47F, -12F, -11.01F);

        bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 245
        bodyModel[52].setRotationPoint(-47F, -11F, -11.01F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 246
        bodyModel[53].setRotationPoint(-47F, -10F, -11.01F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -8F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -8F, 2F, 0F, 8F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 8F, 2F); // Box 247
        bodyModel[54].setRotationPoint(-51F, -20F, -11.01F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -4F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F); // Box 248
        bodyModel[55].setRotationPoint(-51F, -14F, -11.01F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -6F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -6F, 2F, 0F, 6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 2F); // Box 251
        bodyModel[56].setRotationPoint(-51F, -17F, -11.01F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -6F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -6F, -2F, 0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -2F); // Box 252
        bodyModel[57].setRotationPoint(-51F, -17F, 11.01F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -8F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -8F, -2F, 0F, 8F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 8F, -2F); // Box 253
        bodyModel[58].setRotationPoint(-51F, -20F, 11.01F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 1, 0, 0F,0F, -4F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, -2F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F); // Box 254
        bodyModel[59].setRotationPoint(-51F, -14F, 11.01F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 255
        bodyModel[60].setRotationPoint(-47F, -12F, 11.01F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 256
        bodyModel[61].setRotationPoint(-47F, -11F, 11.01F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 257
        bodyModel[62].setRotationPoint(-47F, -10F, 11.01F);

        bodyModel[63].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 124
        bodyModel[63].setRotationPoint(-50.9F, -14F, -1.5F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 218
        bodyModel[64].setRotationPoint(-51.5F, -9.75F, 6.25F);

        bodyModel[65].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 226
        bodyModel[65].setRotationPoint(-50.5F, -10F, -9F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 227
        bodyModel[66].setRotationPoint(-51.5F, -9.75F, -7.75F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -1.35F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -1.35F, 0F, -0.95F); // Box 231
        bodyModel[67].setRotationPoint(-53F, -10F, 0F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,-1.35F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
        bodyModel[68].setRotationPoint(-53F, -10F, -7F);

        bodyModel[69].addShapeBox(0F, -3F, 0F, 0, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2F, 0F, -2F, -2F, 0F); // Box 235
        bodyModel[69].setRotationPoint(-53.01F, -7F, 0F);

        bodyModel[70].addShapeBox(0F, -3F, 0F, 0, 2, 9, 0F,-2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 236
        bodyModel[70].setRotationPoint(-53.01F, -7F, -9F);

        bodyModel[71].addShapeBox(0F, -3F, 0F, 0, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2F, 0F, -2F, -2F, 0F); // Box 237
        bodyModel[71].setRotationPoint(-53.01F, -6F, 0F);

        bodyModel[72].addShapeBox(0F, -3F, 0F, 0, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2F, 0F, -2F, -2F, 0F); // Box 238
        bodyModel[72].setRotationPoint(-53.01F, -5F, 0F);

        bodyModel[73].addShapeBox(0F, -3F, 0F, 0, 2, 9, 0F,-2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 239
        bodyModel[73].setRotationPoint(-53.01F, -6F, -9F);

        bodyModel[74].addShapeBox(0F, -3F, 0F, 0, 2, 9, 0F,-2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 240
        bodyModel[74].setRotationPoint(-53.01F, -5F, -9F);

        bodyModel[75].addShapeBox(0F, -3F, 0F, 0, 2, 9, 0F,-2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 249
        bodyModel[75].setRotationPoint(-53.01F, -8F, -9F);

        bodyModel[76].addShapeBox(0F, -3F, 0F, 0, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2F, 0F, -2F, -2F, 0F); // Box 250
        bodyModel[76].setRotationPoint(-53.01F, -8F, 0F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F); // Box 241
        bodyModel[77].setRotationPoint(-51F, -11F, -10.01F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F); // Box 242
        bodyModel[78].setRotationPoint(-51F, -10F, -10.01F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F); // Box 243
        bodyModel[79].setRotationPoint(-51F, -9F, -10.01F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 258
        bodyModel[80].setRotationPoint(-51F, -9F, 10.01F);

        bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 259
        bodyModel[81].setRotationPoint(-51F, -10F, 10.01F);

        bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 260
        bodyModel[82].setRotationPoint(-51F, -11F, 10.01F);

        bodyModel[83].addBox(0F, 3F, 0F, 5, 4, 8, 0F); // Box 170
        bodyModel[83].setRotationPoint(11.5F, -33F, -4F);

        bodyModel[84].addShapeBox(0F, 0F, 0F, 54, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 36
        bodyModel[84].setRotationPoint(-4.5F, -29F, 4F);

        bodyModel[85].addShapeBox(0F, 1F, 0F, 19, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[85].setRotationPoint(-42.5F, -30F, -4F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 54, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 38
        bodyModel[86].setRotationPoint(-4.5F, -29F, -7F);

        bodyModel[87].addShapeBox(0F, 1F, 0F, 19, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 39
        bodyModel[87].setRotationPoint(-42.5F, -29F, -10F);

        bodyModel[88].addShapeBox(0F, 1F, 0F, 19, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 103
        bodyModel[88].setRotationPoint(-42.5F, -29F, 7F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 35, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[89].setRotationPoint(16.5F, -29F, -4F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[90].setRotationPoint(-4.5F, -29F, -4F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[91].setRotationPoint(-11F, -28F, -7F);

        bodyModel[92].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 12
        bodyModel[92].setRotationPoint(49.5F, -28F, -6F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 12
        bodyModel[93].setRotationPoint(49.5F, -28F, 6F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[94].setRotationPoint(49.5F, -29F, -8F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[95].setRotationPoint(49.5F, -28F, -11F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 12
        bodyModel[96].setRotationPoint(49.5F, -29F, 4F);

        bodyModel[97].addShapeBox(0F, 1F, 0F, 19, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 36
        bodyModel[97].setRotationPoint(-42.5F, -30F, 4F);

        bodyModel[98].addShapeBox(0F, 1F, 0F, 19, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 38
        bodyModel[98].setRotationPoint(-42.5F, -30F, -7F);

        bodyModel[99].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 168
        bodyModel[99].setRotationPoint(37F, -29.5F, -2F);

        bodyModel[100].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // Box 172
        bodyModel[100].setRotationPoint(30F, -29.5F, -2F);

        bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 173
        bodyModel[101].setRotationPoint(30F, -29.5F, 2F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[102].setRotationPoint(30F, -29.5F, -5F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
        bodyModel[103].setRotationPoint(37F, -29.5F, -5F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 174
        bodyModel[104].setRotationPoint(37F, -29.5F, 2F);

        bodyModel[105].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 170
        bodyModel[105].setRotationPoint(33F, -29.5F, -5F);

        bodyModel[106].addShapeBox(-1F, 0F, 0F, 2, 3, 4, 0F,-1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.41F, 0F, 0F); // Box 217
        bodyModel[106].setRotationPoint(-43.5F, -29F, 0F);

        bodyModel[107].addShapeBox(-1F, 0F, 0F, 2, 3, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, 0F, 0F, -0.41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 218
        bodyModel[107].setRotationPoint(-43.5F, -29F, -4F);

        bodyModel[108].addShapeBox(-1F, 0F, 0F, 1, 3, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, -1F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.59F, 0F, 0F); // Box 219
        bodyModel[108].setRotationPoint(-42.5F, -29F, -7F);

        bodyModel[109].addShapeBox(-1F, 0F, 0F, 1, 3, 3, 0F,-1F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0.59F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F); // Box 220
        bodyModel[109].setRotationPoint(-42.5F, -29F, 4F);

        bodyModel[110].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, -0.35F, 0F, -1F, -0.35F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Box 221
        bodyModel[110].setRotationPoint(-42.5F, -27F, 7F);

        bodyModel[111].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F); // Box 224
        bodyModel[111].setRotationPoint(-42.5F, -27F, -9F);

        bodyModel[112].addShapeBox(0F, 0F, 0F, 13, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
        bodyModel[112].setRotationPoint(-23.5F, -29F, -4F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 262
        bodyModel[113].setRotationPoint(-23.5F, -29F, 4F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 73, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 263
        bodyModel[114].setRotationPoint(-23.5F, -28F, 7F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 73, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
        bodyModel[115].setRotationPoint(-23.5F, -28F, -10F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 265
        bodyModel[116].setRotationPoint(-23.5F, -29F, -7F);

        bodyModel[117].addBox(0F, 0F, 0F, 71, 15, 1, 0F); // Box 171
        bodyModel[117].setRotationPoint(-28.5F, -21F, 10F);

        bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.5F, 0F, 1F); // Box 171
        bodyModel[118].setRotationPoint(-42.5F, -26F, 9F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 15, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[119].setRotationPoint(-43F, -21F, 10F);

        bodyModel[120].addBox(0F, 0F, 0F, 6, 12, 1, 0F); // Box 171
        bodyModel[120].setRotationPoint(-34.5F, -21F, 10F);

        bodyModel[121].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 171
        bodyModel[121].setRotationPoint(-34.5F, -9F, 10F);

        bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 15, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 171
        bodyModel[122].setRotationPoint(-43F, -21F, -11F);

        bodyModel[123].addBox(-2F, 0F, 0F, 6, 12, 1, 0F); // Box 171
        bodyModel[123].setRotationPoint(-32.5F, -21F, -11F);

        bodyModel[124].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 171
        bodyModel[124].setRotationPoint(-34.5F, -9F, -11F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 171
        bodyModel[125].setRotationPoint(-42.5F, -26F, -10F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 171
        bodyModel[126].setRotationPoint(-34.5F, -26F, 9F);

        bodyModel[127].addShapeBox(-2F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 177
        bodyModel[127].setRotationPoint(-32.5F, -26F, -10F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 78, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 295
        bodyModel[128].setRotationPoint(-28.48F, -26F, -10F);

        bodyModel[129].addBox(0F, 0F, 0F, 71, 15, 1, 0F); // Box 296
        bodyModel[129].setRotationPoint(-28.5F, -21F, -11F);

        bodyModel[130].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Box 12
        bodyModel[130].setRotationPoint(49.5F, -26F, -6F);

        bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 15, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
        bodyModel[131].setRotationPoint(49.5F, -21F, -11F);

        bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 151
        bodyModel[132].setRotationPoint(49.5F, -21F, 6F);

        bodyModel[133].addBox(0F, 0F, 0F, 1, 13, 6, 0F); // Box 12
        bodyModel[133].setRotationPoint(50F, -21F, -3F);

        bodyModel[134].addBox(0F, 0F, 0F, 2, 15, 3, 0F); // Box 12
        bodyModel[134].setRotationPoint(49.5F, -21F, -6F);

        bodyModel[135].addBox(0F, 0F, 0F, 2, 15, 3, 0F); // Box 12
        bodyModel[135].setRotationPoint(49.5F, -21F, 3F);

        bodyModel[136].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 223
        bodyModel[136].setRotationPoint(42.5F, -21F, 10F);

        bodyModel[137].addBox(0F, 0F, 0F, 5, 13, 1, 0F); // Box 224
        bodyModel[137].setRotationPoint(42.5F, -19F, 10F);

        bodyModel[138].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 171
        bodyModel[138].setRotationPoint(47.5F, -21F, 10F);

        bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[139].setRotationPoint(49.5F, -26F, 6F);

        bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
        bodyModel[140].setRotationPoint(49.5F, -26F, -11F);

        bodyModel[141].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 310
        bodyModel[141].setRotationPoint(42.5F, -21F, -11F);

        bodyModel[142].addBox(0F, 0F, 0F, 5, 13, 1, 0F); // Box 311
        bodyModel[142].setRotationPoint(42.5F, -19F, -11F);

        bodyModel[143].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 312
        bodyModel[143].setRotationPoint(47.5F, -21F, -11F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 78, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 313
        bodyModel[144].setRotationPoint(-28.48F, -26F, 9F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 75
        bodyModel[145].setRotationPoint(-54F, -4F, -9F);

        bodyModel[146].addBox(0F, 0F, 0F, 9, 2, 8, 0F); // Box 85
        bodyModel[146].setRotationPoint(-51F, -4F, -4F);

        bodyModel[147].addShapeBox(0F, -1F, 0F, 5, 1, 10, 0F,-5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, -3F, 0F, -4F, -5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, -3F, 0F, -4F); // Box 22
        bodyModel[147].setRotationPoint(-55F, -4F, -6F);

        bodyModel[148].addShapeBox(0F, -1F, 0F, 5, 1, 10, 0F,-3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -5F, 0F, 3F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -5F, 0F, 3F); // Box 22
        bodyModel[148].setRotationPoint(-55F, -4F, -4F);

        bodyModel[149].addShapeBox(0F, -1F, 0F, 9, 1, 5, 0F,3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 3F, 0F, 0F); // Box 22
        bodyModel[149].setRotationPoint(-47F, -4F, -14F);

        bodyModel[150].addShapeBox(0F, -1F, 0F, 8, 2, 5, 0F,3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -5F, -4F, 0F, -3F, -4F, 0F, 0F, 3F, 0F, 0F); // Box 22
        bodyModel[150].setRotationPoint(-46F, -3F, -14F);

        bodyModel[151].addBox(0F, 0F, 0F, 7, 2, 5, 0F); // Box 85
        bodyModel[151].setRotationPoint(-49F, -4F, 4F);

        bodyModel[152].addBox(0F, 0F, 0F, 7, 2, 18, 0F); // Box 326
        bodyModel[152].setRotationPoint(-50F, -6F, -9F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 327
        bodyModel[153].setRotationPoint(-54F, -4F, 4F);

        bodyModel[154].addShapeBox(0F, -1F, 0F, 8, 2, 5, 0F,3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 3F, 0F, -5F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 3F, 0F, -5F); // Box 328
        bodyModel[154].setRotationPoint(-46F, -3F, 9F);

        bodyModel[155].addBox(0F, 0F, 0F, 7, 2, 5, 0F); // Box 329
        bodyModel[155].setRotationPoint(-49F, -4F, -9F);

        bodyModel[156].addShapeBox(0F, -1F, 0F, 9, 1, 5, 0F,3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 3F, 0F, -5F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, 3F, 0F, -5F); // Box 183
        bodyModel[156].setRotationPoint(-47F, -4F, 9F);

        bodyModel[157].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 184
        bodyModel[157].setRotationPoint(-55F, -7F, -1.5F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 2, 5, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 186
        bodyModel[158].setRotationPoint(51.01F, -25.5F, -2.5F);

        bodyModel[159].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[159].setRotationPoint(0F, -1F, -9F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
        bodyModel[160].setRotationPoint(-52.75F, -5F, 0F);

        bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
        bodyModel[161].setRotationPoint(-52.75F, -6F, 2F);

        bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
        bodyModel[162].setRotationPoint(-52.75F, -3F, 0F);

        bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
        bodyModel[163].setRotationPoint(-52.75F, -5F, -10F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
        bodyModel[164].setRotationPoint(-53.25F, -6F, -10F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
        bodyModel[165].setRotationPoint(-52.75F, -3F, -10F);

        bodyModel[166].addShapeBox(-1F, -1F, 0F, 9, 12, 5, 0F,-5.5F, 0.65F, 0F, -3.5F, 0.65F, 0F, -3.5F, 0F, -4F, -5.5F, 0.05F, -4.1F, -2.11F, -7F, 0F, -4F, -7F, -1F, -4F, -7F, -3F, -2.16F, -7F, -5F); // Box 179
        bodyModel[166].setRotationPoint(-47F, -25F, 9F);

        bodyModel[167].addShapeBox(-1F, -1F, 0F, 9, 10, 5, 0F,-4.15F, 1F, 1F, -1.9F, 0.95F, 0F, -2F, 1F, -4F, -4.2F, 1F, -6F, -1.81F, -7.05F, 1F, -5.8F, -7.1F, 0.5F, -6F, -7F, -5.15F, -3.01F, -7F, -5.15F); // Box 180
        bodyModel[167].setRotationPoint(-49F, -19F, 10F);

        bodyModel[168].addShapeBox(-1F, -1F, 0F, 9, 10, 5, 0F,-3.8F, 1.05F, 1F, -3.7F, 1.05F, 0.5F, -4F, 1F, -5.15F, -3.8F, 1.05F, -6F, -2.01F, -8.05F, 1F, -6.95F, -8.05F, 1F, -6.9F, -8.05F, -6F, -2.01F, -8F, -6F); // Box 181
        bodyModel[168].setRotationPoint(-51F, -15F, 10F);

        bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 182
        bodyModel[169].setRotationPoint(49F, -6F, -6F);

        bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 184
        bodyModel[170].setRotationPoint(49F, -6F, -11F);

        bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 185
        bodyModel[171].setRotationPoint(49F, -6F, 6F);

        bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
        bodyModel[172].setRotationPoint(50F, -5F, -11F);

        bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F); // Box 188
        bodyModel[173].setRotationPoint(50F, -5F, 6F);

        bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 182
        bodyModel[174].setRotationPoint(-9F, -30.5F, 2.8F);

        bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 183
        bodyModel[175].setRotationPoint(-7F, -28.5F, 1.5F);

        bodyModel[176].addShapeBox(-1F, -1F, 0F, 9, 12, 5, 0F,-5.5F, 0.05F, -4.1F, -3.5F, 0F, -4F, -3.5F, 0.65F, 0F, -5.5F, 0.65F, 0F, -2.16F, -7F, -5F, -4F, -7F, -3F, -4F, -7F, -1F, -2.11F, -7F, 0F); // Box 183
        bodyModel[176].setRotationPoint(-47F, -25F, -14F);

        bodyModel[177].addShapeBox(-1F, -1F, 0F, 9, 10, 5, 0F,-4.2F, 1F, -6F, -2F, 1F, -4F, -1.9F, 0.95F, 0F, -4.15F, 1F, 1F, -3.01F, -7F, -5.15F, -6F, -7F, -5.15F, -5.8F, -7.1F, 0.5F, -1.81F, -7.05F, 1F); // Box 184
        bodyModel[177].setRotationPoint(-49F, -19F, -15F);

        bodyModel[178].addShapeBox(-1F, -1F, 0F, 9, 10, 5, 0F,-3.8F, 1.05F, -6F, -4F, 1F, -5.15F, -3.7F, 1.05F, 0.5F, -3.8F, 1.05F, 1F, -2.01F, -8F, -6F, -6.9F, -8.05F, -6F, -6.95F, -8.05F, 1F, -2.01F, -8.05F, 1F); // Box 185
        bodyModel[178].setRotationPoint(-51F, -15F, -15F);

        bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 183
        bodyModel[179].setRotationPoint(-31.5F, -26F, 9F);

        bodyModel[180].addShapeBox(-2F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 184
        bodyModel[180].setRotationPoint(-29.5F, -26F, -10F);
    }

    private ModelGe_GenesisBogie theTrucks = new ModelGe_GenesisBogie();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 181; i++) {
            if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
                Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                bodyModel[i].render(f5);
                Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
            } else {
                bodyModel[i].render(f5);
            }
        }

        if(entity instanceof AbstractTrains) {
            if (((AbstractTrains) entity).getColor() == 8) {
                Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/genesis_truck_phaseiii.png"));
            } else {
                Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/genesis_truck.png"));
            }
        }

        GL11.glPushMatrix();
        GL11.glTranslatef(-1.44F , 0.11F,-0.3F);
        //GL11.glScalef(0.9f,0.9f,0.8f);
        theTrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslated(2.5F,0.11F,-0.3F);
        theTrucks.render(entity,f,f1,f2,f3,f4,f5);
        GL11.glPopMatrix();
    }

}