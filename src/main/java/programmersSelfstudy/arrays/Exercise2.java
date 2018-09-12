package programmersSelfstudy.arrays;

public class Exercise2 {

    public int maxNumber(int[] numbers) {
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }
}
