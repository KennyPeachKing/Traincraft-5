//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:-
// Last changed on: -

package com.jcirmodelsquad.tcjcir.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import tmt.ModelRendererTurbo;

public class ModelAutoTrainIndicator extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelAutoTrainIndicator()
	{
		autotrainindicatorModel = new ModelRendererTurbo[1];
		autotrainindicatorModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		autotrainindicatorModel[0].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		autotrainindicatorModel[0].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 1; i++)
		{
			autotrainindicatorModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo autotrainindicatorModel[];
}