package lesson23;

public class Lesson23 {
    public static void main(String[] args) {
        String immutable = "Hello World!";
        System.out.println(immutable);

        StringBuilder mutable = new StringBuilder("Hello");
        mutable.append(" my").append(" friend");
        System.out.println(mutable);

        System.out.printf("String %s %d %f end\n","String", 10, 25.23);
        System.out.printf("String %6d end\n", 10);
        System.out.printf("String %6d end\n", 10000);
        System.out.printf("String %-6d end\n", 10000);
        System.out.printf("String %.2f end\n", 12.123);
        System.out.printf("String %.2f end\n", 12.125);
    }
}
