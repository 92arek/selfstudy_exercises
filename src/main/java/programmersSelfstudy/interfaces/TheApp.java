package programmersSelfstudy.interfaces;

public class TheApp {
    public static void main(String[] args) {
        TheApp theApp = new TheApp();
        Computation computation;

        if (theApp.shouldMultiply()){
            computation = new Multiply();
        } else {
            computation = new Add();
        }

        double argument1 = theApp.getArgument();
        double argument2 = theApp.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Result: " + result);
    }

    private boolean shouldMultiply(){
        return false;
    }

    private double getArgument(){
        return 0;
    }
}
