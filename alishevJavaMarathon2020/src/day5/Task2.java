package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike(1996, "red", "java");
        System.out.println("Год выпуска - " + moto.getYear() + ". Цвет - " + moto.getColor() +
                ". Модель - " + moto.getModel());
    }
}
