package oop.lesson22.inheritance2;

public class Test1 {


}

class Human {
    String name;
    String surname;

    Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Human(String name) {
        this(name, null);
    }


}

class Student extends Human {
    int course;

    Student() {
        super("Roma");
    }

    Student(String name, String surname, int course) {
        super(name, surname);
        this.course = course;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Ivan", "Petrov", 3);
        System.out.println(student1.name);
        System.out.println(student1.surname);
        System.out.println(student1.course);
    }
}
