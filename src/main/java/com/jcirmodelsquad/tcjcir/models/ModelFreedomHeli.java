//its a depressed flatbed load, dont get pissy with me
//if you want it to fly, glfh

package com.jcirmodelsquad.tcjcir.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelFreedomHeli extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelFreedomHeli() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[37];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
/*
        this.helice1 = 0.41887903f;
        this.helice2 = 5.7595863f;
        this.lastframe = System.nanoTime();
        this.helice = 0.0f; //this stuff is to make the blades go spinnn
 */
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 2, 95, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 9, 93, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 11, 96, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 5, 62, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 5, 86, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1, 124, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 1, 118, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 5, 85, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 14, 90, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 10, 89, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 12, 91, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 10, 91, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 2, 62, textureX, textureY); // Box 36

		bodyModel[0].addBox(0F, 0F, 0F, 26, 1, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-15F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 26, 1, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(-15F, 0F, 9F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(11F, 0F, -10F);
		bodyModel[2].rotateAngleZ = 5.8293997F;

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 3
		bodyModel[3].setRotationPoint(13F, 8F, -5F);
		bodyModel[3].rotateAngleZ = 5.49778714F;

		bodyModel[4].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-12F, 25F, 2F);
		bodyModel[4].rotateAngleX = -4.31096325F;

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 10, 0F); // Box 5
		bodyModel[5].setRotationPoint(16F, 11F, -5F);
		bodyModel[5].rotateAngleZ = 4.99164166F;

		bodyModel[6].addBox(0F, 0F, 0F, 12, 9, 1, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, 17F, -6F);
		bodyModel[6].rotateAngleX = -3.07177948F;
		bodyModel[6].rotateAngleY = 3.14159265F;

		bodyModel[7].addBox(0F, 0F, 0F, 8, 4, 6, 0F); // Box 7
		bodyModel[7].setRotationPoint(-12F, 8F, 3F);
		bodyModel[7].rotateAngleY = -3.14159265F;
		bodyModel[7].rotateAngleZ = 5.41052068F;

		bodyModel[8].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 8
		bodyModel[8].setRotationPoint(-17F, 14F, 2F);
		bodyModel[8].rotateAngleY = -3.14159265F;
		bodyModel[8].rotateAngleZ = 5.74213324F;

		bodyModel[9].addBox(0F, 0F, 0F, 12, 1, 10, 0F); // Box 9
		bodyModel[9].setRotationPoint(-12F, 8F, -5F);

		bodyModel[10].addBox(0F, 0F, 0F, 18, 1, 4, 0F); // Box 10
		bodyModel[10].setRotationPoint(-12F, 24F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 12, 7, 1, 0F); // Box 11
		bodyModel[11].setRotationPoint(-12F, 24F, 4F);
		bodyModel[11].rotateAngleX = -3.43829863F;

		bodyModel[12].addBox(0F, 0F, 0F, 12, 9, 1, 0F); // Box 12
		bodyModel[12].setRotationPoint(-12F, 17F, 6F);
		bodyModel[12].rotateAngleX = -3.07177948F;

		bodyModel[13].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 13
		bodyModel[13].setRotationPoint(11F, 0F, 9F);
		bodyModel[13].rotateAngleZ = 5.8293997F;

		bodyModel[14].addBox(0F, 0F, 0F, 12, 7, 1, 0F); // Box 14
		bodyModel[14].setRotationPoint(0F, 24F, -4F);
		bodyModel[14].rotateAngleX = -3.43829863F;
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addBox(0F, 0F, 0F, 18, 2, 1, 0F); // Box 15
		bodyModel[15].setRotationPoint(6F, 25F, -2F);
		bodyModel[15].rotateAngleX = -4.31096325F;
		bodyModel[15].rotateAngleY = -3.14159265F;

		bodyModel[16].addBox(0F, 0F, 0F, 20, 1, 2, 0F); // Box 16
		bodyModel[16].setRotationPoint(-35F, 22F, -1F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 17
		bodyModel[17].setRotationPoint(-15F, 22F, -2F);
		bodyModel[17].rotateAngleZ = -5.74213324F;

		bodyModel[18].addBox(0F, 0F, 0F, 25, 3, 2, 0F); // Box 18
		bodyModel[18].setRotationPoint(-46F, 19F, -1F);

		bodyModel[19].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 19
		bodyModel[19].setRotationPoint(0F, 12F, 6F);
		bodyModel[19].rotateAngleX = -3.07177948F;

		bodyModel[20].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 20
		bodyModel[20].setRotationPoint(13F, 12F, -6F);
		bodyModel[20].rotateAngleX = -3.07177948F;
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 21
		bodyModel[21].setRotationPoint(6F, 24F, 3F);
		bodyModel[21].rotateAngleY = 0.08726646F;
		bodyModel[21].rotateAngleZ = -2.28638132F;

		bodyModel[22].addBox(0F, 0F, 0F, 1, 12, 10, 0F); // Box 22
		bodyModel[22].setRotationPoint(-12F, 8F, -5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 23
		bodyModel[23].setRotationPoint(-12F, 20F, -4F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 24
		bodyModel[24].setRotationPoint(4F, 7F, -6F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 25
		bodyModel[25].setRotationPoint(-8F, 25F, -2F);

		bodyModel[26].addBox(-40F, 0F, -1F, 80, 1, 2, 0F); // Box 26
		bodyModel[26].setRotationPoint(-6F, 28F, 0F);

		bodyModel[27].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 27
		bodyModel[27].setRotationPoint(-42F, 22F, -1F);
		bodyModel[27].rotateAngleZ = -4.24115008F;

		bodyModel[28].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 28
		bodyModel[28].setRotationPoint(-42F, 19F, 1F);
		bodyModel[28].rotateAngleY = -3.14159265F;
		bodyModel[28].rotateAngleZ = -1.04719755F;

		bodyModel[29].addBox(-8F, -1F, 0F, 16, 2, 1, 0F); // Box 29
		bodyModel[29].setRotationPoint(-44F, 20F, 1F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 30
		bodyModel[30].setRotationPoint(-10F, 7F, -6F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 31
		bodyModel[31].setRotationPoint(-10F, 1F, -10F);
		bodyModel[31].rotateAngleX = -5.75958653F;

		bodyModel[32].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 32
		bodyModel[32].setRotationPoint(4F, 1F, -10F);
		bodyModel[32].rotateAngleX = -5.75958653F;

		bodyModel[33].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 33
		bodyModel[33].setRotationPoint(5F, 1F, 10F);
		bodyModel[33].rotateAngleX = -5.75958653F;
		bodyModel[33].rotateAngleY = -3.14159265F;

		bodyModel[34].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 34
		bodyModel[34].setRotationPoint(-9F, 1F, 10F);
		bodyModel[34].rotateAngleX = -5.75958653F;
		bodyModel[34].rotateAngleY = -3.14159265F;

		bodyModel[35].addBox(0F, 0F, 0F, 13, 1, 10, 0F); // Box 35
		bodyModel[35].setRotationPoint(0F, 8F, -5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 36
		bodyModel[36].setRotationPoint(6F, 24F, -4F);
		bodyModel[36].rotateAngleY = 6.19591884F;
		bodyModel[36].rotateAngleZ = -2.28638132F;
	}
}
/*heres some extra code bits from the original source file for making the blades rotate
public void a(final lq entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        if (ConfigHandler.FLICKERING) {
            super.a(entity, f, f1, f2, f3, f4, f5);
        }
        if (((EntityHelicopter)entity).getFuel() > 0) {
            final long now = System.nanoTime();
            final int elapsed = (int)((now - this.lastframe) / 1000000L);
            this.helice -= elapsed / 100.0f;
            this.lastframe = now;
            this.box31.rotateAngleY = this.helice * 2.0f + this.helice1;
            this.box34.rotateAngleZ = this.helice * 4.0f + this.helice2;
        }
 */