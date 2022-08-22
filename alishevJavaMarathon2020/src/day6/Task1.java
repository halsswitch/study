package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2010);
        car.setColor("blue");
        car.setModel("prius");
        car.info();
        car.yearDifference();

        Motorbike moto = new Motorbike(1996, "red", "java");
        moto.info();
        moto.yearDifference();
    }
}
