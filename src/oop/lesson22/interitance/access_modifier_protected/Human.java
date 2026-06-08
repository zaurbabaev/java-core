package oop.lesson22.interitance.access_modifier_protected;

public class Human {

    protected String name = "Kolya";

    protected static int salary = 150;

    protected void work() {
        System.out.println("Rabotat");
    }

    protected static void rest() {
        System.out.println("Otdixat");
    }


}

class Student extends Human {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.name);
        System.out.println(Student.salary);
        student.work();
        Student.rest();
    }
}
