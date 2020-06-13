package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;

public class StartMissionPacket implements IMessage {

    public int entity;
    public boolean status;

    public StartMissionPacket() {}

    public StartMissionPacket(int entity, boolean status) {
        this.entity = entity;
        this.status = status;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        this.status = buf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        buf.writeBoolean(status);
    }

    public static class Handler implements IMessageHandler<StartMissionPacket, IMessage> {

        @Override
        public IMessage onMessage(StartMissionPacket message, MessageContext ctx) {
            Entity theCar = ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity);

            if (theCar instanceof ExperimentalGeometryCar) {
                if (message.status) {
                    ((ExperimentalGeometryCar)theCar).startMission();
                }
                if (!message.status) {
                    ((ExperimentalGeometryCar)theCar).missionStarted = false;
                    System.out.println("Stopped!");
                }
            }
            return null;
        }
    }
}
