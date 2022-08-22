package day6;

import java.util.Scanner;

public class Car {

    private int year;
    private String color;
    private String model;

    public void info() {
        System.out.println("Это автомобиль");
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

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
