package lesson28;

public class Lesson28 { // этот класс должен быть public, и только один public на файл класса

    private int a; // private - не видно ни кому (только внутри класса, метода)
    protected int b; // protected - видно внутри пакета и наследникам
    int c; // default - видно только внутри пакета
    public int d; // public - видно всем

    public static void main(String[] args) {

    }
}
