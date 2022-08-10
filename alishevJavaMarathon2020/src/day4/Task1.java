package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int moreThanEight = 0;
        int equalOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        System.out.println("Введите размер массива");
        int arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 11);
            sum += myArray[i];
            if (myArray[i] > 8)
                moreThanEight++;
            if (myArray[i] == 1)
                equalOne++;
            if (myArray[i] % 2.0 == 0) {
                even++;
            } else odd++;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Длина массива: " + myArray.length);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество цифр равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
