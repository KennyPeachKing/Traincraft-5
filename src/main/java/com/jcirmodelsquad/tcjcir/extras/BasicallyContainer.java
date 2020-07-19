package com.jcirmodelsquad.tcjcir.extras;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import tmt.ModelBase;

public class BasicallyContainer {

    public String color;
    public String theType;
    public NBTTagCompound savedData;

    public BasicallyContainer(String thet, String color, NBTTagCompound tag) {
        this.theType = thet;
        this.color = color;
        savedData = tag;
    }


}
