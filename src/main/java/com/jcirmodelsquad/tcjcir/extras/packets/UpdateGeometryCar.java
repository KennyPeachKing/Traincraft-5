package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;

public class UpdateGeometryCar implements IMessage {

    public int entity;
    public String railroadName;
    public String geometryCarName;
    public String lineType;
    public String railStandard;

    public UpdateGeometryCar() {}

    public UpdateGeometryCar(int entity, String railroadName, String geometryCarName, String lineType, String railStandard) {
        this.entity = entity;
        this.railroadName = railroadName;
        this.geometryCarName = geometryCarName;
        this.lineType = lineType;
        this.railStandard = railStandard;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        railroadName = ByteBufUtils.readUTF8String(buf);
        geometryCarName = ByteBufUtils.readUTF8String(buf);
        lineType = ByteBufUtils.readUTF8String(buf);
        railStandard = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        ByteBufUtils.writeUTF8String(buf, railroadName);
        ByteBufUtils.writeUTF8String(buf, geometryCarName);
        ByteBufUtils.writeUTF8String(buf, lineType);
        ByteBufUtils.writeUTF8String(buf, railStandard);
    }

    public static class Handler implements IMessageHandler<UpdateGeometryCar, IMessage> {
        @Override
        public IMessage onMessage(UpdateGeometryCar message, MessageContext ctx) {
            Entity theCar = ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity);
            if (theCar instanceof ExperimentalGeometryCar) {
                ExperimentalGeometryCar theGeoCar = (ExperimentalGeometryCar)theCar;
                theGeoCar.railroadLine = message.railroadName;
                theGeoCar.geometryCarName = message.geometryCarName;
                theGeoCar.lineType = message.lineType;
                theGeoCar.standard = message.railStandard;
            }
            return null;
        }
    }

}
