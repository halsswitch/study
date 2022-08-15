package lesson18;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Роман");
        person1.setAge(50);
        person1.sayHello();
        System.out.println("Выводим значение в main методе. Мне " + person1.getAge() + " лет");
        person1.speak();
        System.out.println("Мне " + person1.yearsToRetirement() + " лет до пенсии");

        Person person2 = new Person();
        person2.setName("");
        person2.setAge(-15);
        person2.sayHello();
        System.out.println("Выводим значение в main методе. Меня зовут " + person2.getName());
        person2.speak();
        System.out.println("Мне " + person2.yearsToRetirement() + " лет до пенсии");
    }
}

class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Вы ввели пустое имя");
        } else
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Вы ввели отрицательный возраст");
        } else
            this.age = age;
    }

    private String name;
    private int age;

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
