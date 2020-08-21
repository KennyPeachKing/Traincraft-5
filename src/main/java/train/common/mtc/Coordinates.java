package train.common.mtc;

public class Coordinates {
    public int x = 0;
    public int y = 0;
    public int z = 0;

    public Coordinates() {}

    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getXAsDouble() {return x;}
    public double getYAsDouble() {return y;}
    public double getZAsDouble() {return z;}
}
