package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] names = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }

}
