package programmersSelfstudy.loops;

//Przerób funkcję z zadania piątego tak, żeby metoda przymowała tablicę dwuwymiarową typu int[][].

public class Loops6 {

    private static int sum(int[][] table) {
        int i = 0;
        for (int[] ints : table) {
            for (int anInt : ints) {
                i +=anInt;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[][] table = new int[][]{new int[]{1,5,3},new int[]{1,1,2,8,6}};
        System.out.println(sum(table));
    }
}
