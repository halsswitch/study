package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double y = 420;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double x = scan.nextDouble();
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (x > -3) {
            y = (x + 3) * (x * x - 2);
        }
        System.out.println(y);
    }
}
