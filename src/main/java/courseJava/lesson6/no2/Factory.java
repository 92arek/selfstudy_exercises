package courseJava.lesson6.no2;

public class Factory {
    public Factory() {
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        Factory[] products = new Factory[1000];
        factory.create100products(products);

    }

    private void create100products(Factory[] products){
        for (int i = 0; i < 100; ++i) {
            products[i] = new Factory();
        }
    }
}
