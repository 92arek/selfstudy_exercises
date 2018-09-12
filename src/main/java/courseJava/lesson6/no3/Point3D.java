package courseJava.lesson6.no3;

public class Point3D extends Point {

    private int z;

    public Point3D(int z) {
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
