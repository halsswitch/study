package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2010);
        car.setColor("blue");
        car.setModel("prius");
        System.out.println("Год выпуска - " + car.getYear() + ". Цвет - " + car.getColor() +
                ". Модель - " + car.getModel());
    }
}
