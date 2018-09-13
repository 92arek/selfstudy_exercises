package programmersSelfstudy.primitives;

//Napisz program, który policzy średnią z kilku przedmiotów. Możemy założyć, że uczeń w szkole ma 3 przedmioty i z każdego z nich dostał po 4 oceny.

import java.util.Scanner;

public class Average {

    private int numberOfClasses;
    private int numberOfGrades;
    private int[][] grades;

    public Average(int numberOfClasses, int numberOfGrades) {
        this.numberOfClasses = numberOfClasses;
        this.numberOfGrades = numberOfGrades;
    }

    public void getUserGrades() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfClasses; i++) {
            for (int j = 0; j < numberOfGrades; j++) {
                System.out.println("Enter grade number " + (i + 1) + " for subject number " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }
    }

}
