package courseJava.lesson6.no2;

public class Product {

    private static int id = (int) Math.random();
    private final String productName = "Sony";
    private int tempId;

    public Product() {
        this.tempId = id++;
    }

    public void run(){
        System.out.println(productName + this.tempId);
    }
}
