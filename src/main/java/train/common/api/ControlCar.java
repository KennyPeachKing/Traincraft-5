package train.common.api;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;
import train.common.Traincraft;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketKeyPress;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.Info;

import java.util.ArrayList;
import java.util.List;

public abstract class ControlCar extends EntityRollingStock implements IPassenger {

    public Locomotive connectedLocomotive;
    public int whistleDelay;

    private boolean forwardPressed = false;
    private boolean backwardPressed = false;
    private boolean brakePressed = false;

    public ControlCar(World world) {
        super(world);
        if (connectedLocomotive == null) {
            dataWatcher.addObject(29, 0);
        } else {
            dataWatcher.addObject(29, connectedLocomotive.getEntityId());
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!worldObj.isRemote) {
            //Server side stuff.

            if (cartLinked1 != null) {
                if ((cartLinked1).train != null && (cartLinked1).train.getTrains().size() != 0) {
                    for (int j1 = 0; j1 < (cartLinked1).train.getTrains().size(); j1++) {
                        EntityRollingStock daRollingStock = (cartLinked1).train.getTrains().get(j1);
                        if (daRollingStock instanceof Locomotive) {
                            connectedLocomotive = (Locomotive) daRollingStock;
                            break;
                        }
                    }
                }

            }
            if (connectedLocomotive == null) {
                dataWatcher.updateObject(29, 0);
            } else {
                dataWatcher.updateObject(29, connectedLocomotive.getEntityId());
            }


        } else {
            //Client side stuff.
        }
        handleTrainMovement();
        if (whistleDelay > 0) {
            whistleDelay--;
        }
    }

    public void soundHorn() {
        for (EnumSounds sounds : EnumSounds.values()) {
            if (sounds.getEntityClass() != null && sounds.getEntityClass().equals(this.getClass()) && whistleDelay == 0) {
                worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + sounds.getHornString(), sounds.getHornVolume(), 1.0F);
                whistleDelay = 65;
            }
        }
        List entities = worldObj.getEntitiesWithinAABB(EntityAnimal.class, AxisAlignedBB.getBoundingBox(
                this.posX-20,this.posY-5,this.posZ-20,
                this.posX+20,this.posY+5,this.posZ+20));

        for(Object e : entities) {
            if(e instanceof EntityAnimal) {
                ((EntityAnimal) e).setTarget(this);
                ((EntityAnimal) e).getNavigator().setPath(null, 0);
            }
        }
    }
    @Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ);
        }
    }

    @Override
    public void pressKey(int i) {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            System.out.println("UwU");
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.CONTROL_CAR, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    //I'm moving this to a separate function because it's really, really thick, and I want to try to make things look neater.
    public void handleTrainMovement() {
        if (worldObj.isRemote) {
            if (ticksExisted % 2 == 0 && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) {

                if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindForward.getKeyCode())
                        && !forwardPressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(4));
                    forwardPressed = true;
                } else if (!Keyboard
                        .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindForward.getKeyCode())
                        && forwardPressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(13));
                    forwardPressed = false;
                }
                if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindBack.getKeyCode())
                        && !backwardPressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(5));
                    backwardPressed = true;
                } else if (!Keyboard
                        .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindBack.getKeyCode())
                        && backwardPressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(14));
                    backwardPressed = false;
                }
                if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindJump.getKeyCode())
                        && !brakePressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(12));
                    brakePressed = true;
                } else if (!Keyboard
                        .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindJump.getKeyCode())
                        && brakePressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(15));
                    brakePressed = false;
                }
            }
        } else {
            //Server stuff.
            if (connectedLocomotive != null) {
                if (forwardPressed || backwardPressed) {

                    if (connectedLocomotive.getFuel() > 0 && connectedLocomotive.isLocoTurnedOn() && rand.nextInt(4) == 0 && !worldObj.isRemote) {
                        if (this.getTrainLockedFromPacket() && !((EntityPlayer) this.riddenByEntity).getDisplayName()
                                .toLowerCase().equals(this.getTrainOwner().toLowerCase())) {
                            return;
                        }
                        if (riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
                            int dir = MathHelper
                                    .floor_double((((EntityPlayer) riddenByEntity).rotationYaw * 4F) / 360F + 0.5D) & 3;
                            System.out.println(dir);
                            if (dir == 2) {
                                if (forwardPressed) {
                                    connectedLocomotive.motionZ -= 0.0075 * this.accelerate;
                                    System.out.println("A");
                                } else {
                                    connectedLocomotive.motionZ += 0.0075 * this.accelerate;
                                    System.out.println("B");
                                }
                            } else if (dir == 0) {
                                if (forwardPressed) {
                                    connectedLocomotive.motionZ += 0.0075 * this.accelerate;
                                    System.out.println("C");
                                } else {
                                    connectedLocomotive.motionZ -= 0.0075 * this.accelerate;
                                    System.out.println("D");
                                }
                            } else if (dir == 1) {
                                if (forwardPressed) {
                                    connectedLocomotive.motionX -= 0.0075 * this.accelerate;
                                    System.out.println("E");
                                } else {
                                    connectedLocomotive.motionX += 0.0075 * this.accelerate;
                                    System.out.println("F");
                                }
                            } else {
                                if (forwardPressed) {
                                    connectedLocomotive.motionX += 0.0075 * this.accelerate;
                                    System.out.println("G");
                                } else {
                                    connectedLocomotive.motionX -= 0.0075 * this.accelerate;
                                    System.out.println("H");
                                }
                            }
                        }
                    }
                } else if (brakePressed) {
                    connectedLocomotive.motionX *= brake;
                    connectedLocomotive.motionZ *= brake;
                }
            }
        }

    }

    @Override
    public void keyHandlerFromPacket(int i) {
        if (this.getTrainLockedFromPacket()) {
            if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer
                    && !((EntityPlayer) this.riddenByEntity).getDisplayName().toLowerCase()
                    .equals(this.getTrainOwner().toLowerCase())) {
                return;
            }
        }
        pressKey(i);
        if (i == 8 && ConfigHandler.SOUNDS) {
            soundHorn();
        }
        if (i == 4) {
            forwardPressed = true;
        }
        if (i == 5) {
            backwardPressed = true;
        }
        if (i == 12) {
            brakePressed = true;
        }
        if (i == 13) {
            forwardPressed = false;
        }
        if (i == 14) {
            backwardPressed = false;
        }
        if (i == 15) {
            brakePressed = false;
        }
    }
}
