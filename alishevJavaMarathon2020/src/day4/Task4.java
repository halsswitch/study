package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] myArray = new int[100];
        int sum = 0;
        int localSum;
        int index = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10001);
            if (i > 1) {
                localSum = myArray[i] + myArray[i - 1] + myArray[i - 2];
                if (localSum > sum) {
                    sum = localSum;
                    index = i - 2;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Тройка с максимальной суммой: " + myArray[index] + " + " + myArray[index + 1] + " + " +
                myArray[index + 2] + " = " + sum);
        System.out.println("Индекс первого элемента: " + index);
    }
}
