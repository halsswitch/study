package lesson12;

public class ArraysOfStrings {
    public static void main(String[] args) {

        String[] arrayString = new String[3];
        arrayString[0] = "привет";
        arrayString[1] = "пока";
        arrayString[2] = "Java";
        for (String i : arrayString) {
            System.out.println(i);
        }

        int[] numbers = {1, 2, 3};
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
