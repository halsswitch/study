package lesson11;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbersReady = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10 + 1;
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbersReady));
    }
}
