package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdateETI implements IMessage {
    public int entity;
    public String operatorID;
    public String trainName;
    public String trainNumber;
    public String stations;

    public UpdateETI() {}
    public UpdateETI(int entity, String operatorID, String trainName, String trainNumber, String stations) {
        this.entity = entity;
        this.operatorID = operatorID;
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.stations = stations;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        operatorID = ByteBufUtils.readUTF8String(buf);
        trainName = ByteBufUtils.readUTF8String(buf);
        this.trainNumber =  ByteBufUtils.readUTF8String(buf);
        stations = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        ByteBufUtils.writeUTF8String(buf, operatorID);
        ByteBufUtils.writeUTF8String(buf, trainName);
        ByteBufUtils.writeUTF8String(buf, trainNumber);
        ByteBufUtils.writeUTF8String(buf, stations);
    }

    public static class Handler implements IMessageHandler<UpdateETI, IMessage> {

        @Override
        public IMessage onMessage(UpdateETI message, MessageContext ctx) {
            if (ctx.side == Side.SERVER) {
                //Coming from the client. Do server side stuff.
                Entity theCar = ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity);
                if (theCar instanceof Locomotive) {
                    Locomotive theLocomotive = (Locomotive)theCar;
                    theLocomotive.operatorID = message.operatorID;
                    theLocomotive.trainName = message.trainName;
                    theLocomotive.trainNumber = message.trainNumber;
                    theLocomotive.stations = new ArrayList<String>(Arrays.asList(message.stations.split(", ")));
                }
            } else {
                //Coming from the server. Do client side stuff.
                Entity theCar = Minecraft.getMinecraft().theWorld.getEntityByID(message.entity);
                if (theCar instanceof Locomotive) {
                    Locomotive theLocomotive = (Locomotive)theCar;
                    theLocomotive.operatorID = message.operatorID;
                    theLocomotive.trainName = message.trainName;
                    theLocomotive.trainNumber = message.trainNumber;
                }
            }
            return null;
        }
    }
}
