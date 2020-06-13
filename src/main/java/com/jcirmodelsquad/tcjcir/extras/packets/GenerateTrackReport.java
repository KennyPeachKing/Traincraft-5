package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;

public class GenerateTrackReport implements IMessage {
    public int entityID;
    public int mode;
    public GenerateTrackReport() {}
    public GenerateTrackReport(int entityID, int mode) {
        this.entityID = entityID;
        this.mode = mode;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        entityID = buf.readInt();
        mode = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entityID);
        buf.writeInt(mode);
    }

    public static class Handler implements IMessageHandler<GenerateTrackReport, IMessage> {

        @Override
        public IMessage onMessage(GenerateTrackReport message, MessageContext ctx) {
            Entity theCar = ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
            if (theCar instanceof ExperimentalGeometryCar) {
                ExperimentalGeometryCar theGeoCar = (ExperimentalGeometryCar)theCar;
                if (message.mode == 1) {
                    theGeoCar.generateTrackReportAsBook();
                }
                if (message.mode == 2) {
                    theGeoCar.generateTrackReportAsFile();
                }
            }
            return null;
        }
    }


}
