package day4;

public class Task2 {
    public static void main(String[] args) {

        int[] myArray = new int[100];
        int arrayMax = 0;
        int arrayMin = 10000;
        int countFinalZero = 0;
        int sumFinalZero = 0;

        for (int i = 0; i < myArray.length; i++)
            myArray[i] = (int) (Math.random() * 10001);

        for (int myInt : myArray) {
            if (arrayMax < myInt)
                arrayMax = myInt;
            if (arrayMin > myInt)
                arrayMin = myInt;
            if (myInt % 10.0 == 0) {
                countFinalZero++;
                sumFinalZero += myInt;
            }
        }
        System.out.println("Максимальное число в массиве: " + arrayMax);
        System.out.println("Минимальное число в массиве: " + arrayMin);
        System.out.println("Количество чисел в массиве оканчисающихся на 0: " + countFinalZero);
        System.out.println("Сумма чисел оканчивающихся на 0: " + sumFinalZero);
    }
}
