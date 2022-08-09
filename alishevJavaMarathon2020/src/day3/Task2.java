package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите делимое и делитель");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (y == 0)
                break;
            System.out.println(x + " / " + y + " = " + x / y);
        }
    }
}