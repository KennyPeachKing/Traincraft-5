package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class UpdateGeometryCarFromServer implements IMessage {

    public int entity;
    public String railroadName;
    public String lineType;
    public String operatingCrew;
    public boolean missionStarted;
    public UpdateGeometryCarFromServer() {}

    public UpdateGeometryCarFromServer(int entity, String railroadName, String lineType, String operatingCrew, boolean missionStarted) {
        this.entity = entity;
        this.railroadName = railroadName;
        this.lineType = lineType;
        this.operatingCrew = operatingCrew;
        this.missionStarted = missionStarted;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        railroadName = ByteBufUtils.readUTF8String(buf);
        lineType = ByteBufUtils.readUTF8String(buf);
        operatingCrew = ByteBufUtils.readUTF8String(buf);
        missionStarted = buf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        ByteBufUtils.writeUTF8String(buf, railroadName);
        ByteBufUtils.writeUTF8String(buf, lineType);
        ByteBufUtils.writeUTF8String(buf, operatingCrew);
        buf.writeBoolean(missionStarted);
    }

    public static class Handler implements IMessageHandler<UpdateGeometryCarFromServer, IMessage> {
        @Override
        public IMessage onMessage(UpdateGeometryCarFromServer message, MessageContext ctx) {
            Entity theCar = Minecraft.getMinecraft().theWorld.getEntityByID(message.entity);
            if (theCar instanceof ExperimentalGeometryCar) {
                ExperimentalGeometryCar theGeoCar = (ExperimentalGeometryCar)theCar;
                theGeoCar.railroadLine = message.railroadName;
                theGeoCar.lineType = message.lineType;
                theGeoCar.operatingCrew = message.operatingCrew;
                theGeoCar.missionStarted = message.missionStarted;
            }
            return null;
        }
    }

}
