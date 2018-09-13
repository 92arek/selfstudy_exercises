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
        initGrades();
    }


    private void initGrades(){
        grades = new int[numberOfClasses][];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = new int[numberOfGrades];
        }
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

    public void countAvg() {
        double avg = 0;
        for (int i = 0; i < numberOfClasses; i++) {
            double classAvg = 0;
            for (int grade : grades[i]) {
                classAvg += grade;
            }
            classAvg /= numberOfGrades;
            System.out.println("The average grade for the subject is " + i + 1 + classAvg);
            avg += classAvg;
        }
        avg /= numberOfClasses;
        System.out.println("The average grade for all the subcjects is: " + avg);
    }

    public static void main(String[] args) {
        int numberOfClasses = 3;
        int numberOfGrades = 4;
        Average average = new Average(numberOfClasses, numberOfGrades);
        average.getUserGrades();
        average.countAvg();
    }
}
