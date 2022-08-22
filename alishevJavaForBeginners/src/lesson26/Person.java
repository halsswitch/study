package lesson26;

public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}
