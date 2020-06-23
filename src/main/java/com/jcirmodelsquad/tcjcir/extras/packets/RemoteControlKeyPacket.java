package com.jcirmodelsquad.tcjcir.extras.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.api.Locomotive;

public class RemoteControlKeyPacket implements IMessage {

    public int key;
    public int entity;
  //  public String playerName;

    public RemoteControlKeyPacket() {}
    public RemoteControlKeyPacket(int entity,int key) {
        this.key = key;
        this.entity = entity;
       // this.playerName = playerName;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.key = buf.readInt();
        this.entity = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.key);
        buf.writeInt(this.entity);
    }

    public static class Handler implements IMessageHandler<RemoteControlKeyPacket, IMessage> {

        @Override
        public IMessage onMessage(RemoteControlKeyPacket message, MessageContext ctx) {
            if (ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity) != null) {
                Locomotive train = (Locomotive) ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity);
                train.remoteControlFromPacket(message.key);
            }
            return null;
        }
    }
}
