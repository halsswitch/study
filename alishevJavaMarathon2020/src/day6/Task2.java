package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 15, 2000);
        airplane.info();
        airplane.setYear(2005);
        airplane.setLength(35);
        airplane.fillUp(1111);
        airplane.fillUp(2222);
        airplane.info();
    }
}
