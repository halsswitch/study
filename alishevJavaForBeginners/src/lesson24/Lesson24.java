package lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 24);
        System.out.println(h1);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
