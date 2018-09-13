package programmersSelfstudy.loops;

public class Loops5 {


    private static int sum(int[] table) {
        int i = 0;
        for (int i1 : table) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] table = new int[]{1, 5, 4, 67, 8, 9};
        System.out.println(sum(table));
    }


}
