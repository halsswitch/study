package lesson07;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите два целых числа (разделитель - пробел):");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Вы ввели " + a + " и " + b);
    }
}
