package lesson25;

public class Dog extends Animal {
    public void bark() {
        System.out.println("GAV GAV");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
