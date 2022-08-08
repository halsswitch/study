package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два целых числа разделенных пробелом");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("Некоректный ввод. Первое число должно быть меньше второго");
        } else {
            int t = a + 1;
            while (t < b) {
                if (t % 5 == 0 && t % 10 != 0) {
                    System.out.print(t + " ");
                }
                t++;
            }
        }
    }
}
