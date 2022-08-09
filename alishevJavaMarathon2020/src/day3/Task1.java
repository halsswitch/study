package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите город, что бы узнать страну (для выходы введите Stop)");
            String town = scanner.nextLine();
            if (town.equals("Stop"))
                break;
            switch (town) {
                case "Москва", "Владивосток", "Ростов" -> System.out.println("Россия");
                case "Рим", "Милан", "Турин" -> System.out.println("Италия");
                case "Берлин", "Мюнхен", "Кёльн" -> System.out.println("Германия");
                default -> System.out.println("Неизвестная страна");
            }
        }
    }
}