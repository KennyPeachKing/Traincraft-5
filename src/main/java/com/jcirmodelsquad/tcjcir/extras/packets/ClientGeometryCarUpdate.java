package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class ClientGeometryCarUpdate implements IMessage {

    public int entity;
    public String allPotentialIssues;

    public ClientGeometryCarUpdate() {}

    public ClientGeometryCarUpdate(int entity, String genTrackReport) {
        this.entity = entity;
        this.allPotentialIssues = genTrackReport;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        allPotentialIssues = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        ByteBufUtils.writeUTF8String(buf, allPotentialIssues);
    }

    public static class Handler implements IMessageHandler<ClientGeometryCarUpdate, IMessage> {


        @Override
        public IMessage onMessage(ClientGeometryCarUpdate message, MessageContext ctx) {
            Entity theCar = Minecraft.getMinecraft().theWorld.getEntityByID(message.entity);
            if (theCar instanceof ExperimentalGeometryCar) {
                ExperimentalGeometryCar theGeoCar = (ExperimentalGeometryCar)theCar;
                theGeoCar.currentTrackReport = message.allPotentialIssues;
            }
            return null;
        }
    }
}
