package lesson21;

public class Lesson21 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 34);
        h1.printNumberOfPeople();
        Human h2 = new Human("Tom", 44);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human h3 = new Human("John", 55);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
        System.out.println(Math.PI + " " + Math.sqrt(4));
    }
}

class Human {
    private String name;
    private int age;
    private static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void printNumberOfPeople() {
        System.out.println(name + ", " + age + ", " + countPeople);
    }
}
