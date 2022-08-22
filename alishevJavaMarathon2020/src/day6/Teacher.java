package day6;

public class Teacher {

    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public void evaluate(Student student) {
        int x = (int) (2 + Math.random() * 4);
        switch (x) {
            case 2 -> System.out.println("Преподователь " + name + " оценил студента " + student.getName() +
                    " по предмету " + discipline + " на оценку неудовлетворительно");
            case 3 -> System.out.println("Преподователь " + name + " оценил студента " + student.getName() +
                    " по предмету " + discipline + " на оценку удовлетворительно");
            case 4 -> System.out.println("Преподователь " + name + " оценил студента " + student.getName() +
                    " по предмету " + discipline + " на оценку хорошо");
            case 5 -> System.out.println("Преподователь " + name + " оценил студента " + student.getName() +
                    " по предмету " + discipline + " на оценку отлично");
        }
    }
}
