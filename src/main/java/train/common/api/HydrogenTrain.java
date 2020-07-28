package train.common.api;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;

public abstract class HydrogenTrain extends Locomotive implements IFluidHandler {
    public int fuelSlot = 1;
    private int maxTank;
    private int maxBattery;
    private int update = 8;

    private LiquidManager.StandardTank theTank;


    public HydrogenTrain(World world, int capacity, int maxB) {
        this(capacity, world);
        maxBattery = maxB;
    }

    private HydrogenTrain(int capacity, World world) {
        super(world);
        this.maxTank = capacity;

        this.theTank = LiquidManager.getInstance().new FilteredTank(capacity, new FluidStack(FluidRegistry.getFluid("hydrogen"), 1));

        dataWatcher.addObject(4, 0);
        numCargoSlots = 3;
        numCargoSlots1 = 3;
        numCargoSlots2 = 3;
        inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + fuelSlot;
        this.dataWatcher.addObject(23, "null-_-" + 0);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (!worldObj.isRemote) {
            this.setState("hot");
            if (theTank.getFluidAmount() != Integer.parseInt(this.dataWatcher.getWatchableObjectString(23).split("-_-")[1])){
                this.dataWatcher.updateObject(23,(theTank.getFluid()!=null?theTank.getFluid().getUnlocalizedName():"null")+"-_-"+theTank.getFluidAmount());
                fuelTrain = theTank.getFluidAmount();
                this.dataWatcher.updateObject(4, theTank.getFluid()!=null?theTank.getFluid().getFluidID():0);
            }
            if (isLocoTurnedOn() && theTank.getFluidAmount() >0 && !canBePulled) {
                if (theTank.getFluid().amount <= 1) {
                    motionX *= 0.94;
                    motionZ *= 0.94;
                    System.out.println(this.getTrainName());
                }
            }
        }
    }

    public int getDiesel() {
        return getFuel() == 0 ? Integer.parseInt(this.dataWatcher.getWatchableObjectString(23).split("-_-")[1]) : getFuel();
    }

    public String getLiquidName() {
        return this.dataWatcher.getWatchableObjectString(23).split("-_-")[0];
    }

    public int getLiquidItemID() {
        return (this.dataWatcher.getWatchableObjectInt(4));
    }

    public LiquidManager.StandardTank getTank() {
        return theTank;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);
        this.theTank.writeToNBT(nbttagcompound);
        nbttagcompound.setBoolean("canBeAdjusted", canBeAdjusted);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);
        this.theTank.readFromNBT(nbttagcompound);
        canBeAdjusted = nbttagcompound.getBoolean("canBeAdjusted");
    }

    public int getCartTankCapacity() {
        return maxTank;
    }

    @Override
    protected void updateFuelTrain(int amount) {
       if (!this.isLocoTurnedOn() && !this.canBePulled) {
            motionX *= 0.8;
            motionZ *= 0.8;
        } else if (ticksExisted % 5 == 0 && getTank().getFluidAmount() + 100 < maxTank) {
            FluidStack drain = null;
            blocksToCheck = new TileEntity[]{worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY - 1), MathHelper.floor_double(posZ)),
                    worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 2), MathHelper.floor_double(posZ)),
                    worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 3), MathHelper.floor_double(posZ)),
                    worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 4), MathHelper.floor_double(posZ))
            };

           for (TileEntity block : blocksToCheck) {
               if (drain == null && block instanceof IFluidHandler) {
                   for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
                       if (((IFluidHandler) block).drain(direction, 100, false) != null &&
                               (getFluid()==null || ((IFluidHandler) block).drain(direction, 100, false).fluid==getTank().getFluid().fluid) &&
                               ((IFluidHandler) block).drain(direction, 100, false).amount == 100
                       ) {
                           drain = ((IFluidHandler) block).drain(
                                   direction, 100, true);
                       }
                   }
               }
           }
           if (drain != null){
               fill(ForgeDirection.UNKNOWN, drain, true);
           }

        }
        if (fuelTrain >1 && this.isLocoTurnedOn()) {
            fuelTrain -= amount;
            if (fuelTrain < 0) {
                fuelTrain = 0;
                drain(ForgeDirection.UNKNOWN, amount, true);
                setLocoTurnedOnFromPacket(false);
            } else {
                drain(ForgeDirection.UNKNOWN, 10, true);
            }
        }

    }


    public void setCapacity(int capacity) {
        this.maxTank = capacity;
    }

    public int getCapacity() {
        return this.maxTank;
    }

    @Override
    public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
        return theTank.fill(resource, doFill);
    }

    @Override
    public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
        if (resource == null || !resource.isFluidEqual(theTank.getFluid())) {
            return null;
        }
        return theTank.drain(resource.amount, doDrain);
    }

    @Override
    public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
        return theTank == null ? null : theTank.drain(maxDrain, doDrain);
    }

    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid) {
        return true;
    }

    @Override
    public boolean canDrain(ForgeDirection from, Fluid fluid) {
        return true;
    }

    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from) {
        return new FluidTankInfo[]{theTank.getInfo()};
    }

    public FluidStack getFluid() {
        return theTank.getFluid();
    }

    public int getFluidAmount() {
        return theTank.getFluidAmount();
    }

    @Override
    public boolean canOverheat() {
        return false;
    }
}
