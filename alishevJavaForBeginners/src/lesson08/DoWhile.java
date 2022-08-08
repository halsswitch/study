package lesson08;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int five = 0;
        do {
            System.out.println("Введите 5");
            five = scan.nextInt();
        } while (five != 5);
        System.out.println("Вы ввели " + five);
    }
}
