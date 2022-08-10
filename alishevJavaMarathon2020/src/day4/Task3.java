package day4;

public class Task3 {
    public static void main(String[] args) {

        int[][] myArray = new int[12][8];
        int index = 0;
        int sum = 0;
        int localSum;

        for (int i = 0; i < myArray.length; i++) {
            localSum = 0;
            for (int j = 0; j < myArray[i].length; j++) {
                if (j == 0)
                    System.out.print(i + ": ");
                myArray[i][j] = (int) (Math.random() * 51);
                System.out.print(myArray[i][j] + " ");
                localSum += myArray[i][j];
            }
            System.out.println(" Cумма строки " + localSum);
            if (sum <= localSum) {
                sum = localSum;
                index = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой чисел: " + index);
    }
}
