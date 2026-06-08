package oop.lesson22.interitance.access_modifier_protected.package2;

import oop.lesson22.interitance.access_modifier_protected.Human;

class Student extends Human {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.name);
        System.out.println(Student.salary);
        student.work();
        Student.rest();
    }
}

