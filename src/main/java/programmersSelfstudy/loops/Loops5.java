package programmersSelfstudy.loops;

//Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.

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
