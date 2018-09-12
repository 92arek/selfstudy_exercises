package courseJava.lesson6.no3;

public class Coordinates {

    public static void main(String[] args) {
        Point3D[] point3D = new Point3D[10];

        for (int i = 0; i < 10; i++) {
            int a = i * 5;
            int b = i + 3;
            int c = i - 14;
            point3D[i] = new Point3D(a, b, c);
        }
        printTable(point3D);
    }

    public static void printTable(Point3D[] point3DS){
        Point3D[] var1 = point3DS;
        int var2 = point3DS.length;

        for (int var3 = 0; var3 < var2; var3++){
            Point3D i = var1[var3];
            System.out.println("id#" + i + " x=" + i.getX() + " y=" + i.getY() + " z=" + i.getZ());
        }
    }
}
