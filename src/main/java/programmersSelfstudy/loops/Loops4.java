package programmersSelfstudy.loops;

//Przerób pętlę z zadania trzeciego na pętlę while.

public class Loops4 {

    public static void main(String[] args) {
        int i = -10;
        while (i <= 40) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }
}
