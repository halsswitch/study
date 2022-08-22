package day6;

import java.util.Scanner;

public class Motorbike {

    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public void yearDifference() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите интересующий год, что бы узнать разницу с годом выпуска");
        int x = scanner.nextInt();
        int difference = Math.abs(x - year);
        System.out.println("Разница между введеным годом и годом выпуска: " + difference);
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
