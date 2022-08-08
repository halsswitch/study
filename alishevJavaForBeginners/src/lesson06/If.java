package lesson06;

public class If {
    public static void main(String[] args) {
        int myInt = 15;
        if (myInt < 10) {
            System.out.println(myInt + " меньше 10");
        } else if (myInt > 20) {
            System.out.println(myInt + " больше 20");
        } else {
            System.out.println(myInt + " в диапазоне от 10 до 20");
        }
    }
}
