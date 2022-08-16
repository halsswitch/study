package lesson20;

public class Lesson20 {
    public static void main(String[] args) {
        Human defHuman = new Human();
        Human nameHuman = new Human("Bob");
        Human nameAgeHuman = new Human("Alex", 43);
    }
}

class Human {

    private String name;
    private int age;

    public Human() {
        this.name = "John Doe";
        this.age = 41;
        System.out.println("Конструктор по умолчанию " + name + ", " + age);
    }

    public Human(String name) {
        this.name = name;
        System.out.println("Конструктор с именем " + name);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Конструктор с именем и возрастом " + name + ", " + age);
    }
}
