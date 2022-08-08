package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество этажей в доме");
        int floor = scan.nextInt();
        if (floor <= 0) {
            System.out.println("Ошибка ввода");
        } else if (floor <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}