package oop.lesson22.relationship;

public class Human {

    /*public Human(String name) {
        this.name = name;
    }*/

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int salary = 150;

    public void work() {
        System.out.println("Rabotat");
    }

    public static void rest() {
        System.out.println("Otdixat");
    }
}

class Student extends Human {

    public static void main(String[] args) {
        Student student = new Student();
//        System.out.println(student.name);
        System.out.println(student.getName());
        System.out.println(Student.salary);
        student.work();
        Student.rest();


    }
}
