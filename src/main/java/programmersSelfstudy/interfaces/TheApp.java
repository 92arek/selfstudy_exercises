package programmersSelfstudy.interfaces;

import java.util.Scanner;

public class TheApp {

    private Scanner scanner = new Scanner(System.in);

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
        System.out.println("Do you want to Add or Multiply?");
        return scanner.next().equals("m");
    }

    private double getArgument(){
        System.out.println("Enter the number: ");
        return scanner.nextDouble();
    }
}
