package lesson16;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.sayHello();
        person1.speak();
        System.out.println("Мне " + person1.yearsToRetirement() + " лет до пенсии");

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.sayHello();
        person2.speak();
        System.out.println("Мне " + person2.yearsToRetirement() + " лет до пенсии");
    }
}

class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Привет!");
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    int yearsToRetirement() {
        return 65 - age;
    }
}
