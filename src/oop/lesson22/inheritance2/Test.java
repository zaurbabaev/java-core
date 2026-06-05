package oop.lesson22.inheritance2;

public class Test {


    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.cure();
        Test test = new Test();
        System.out.println(doc.salary);
    }
}

class Employee { // kompilyator default olaraq extends Object əlavə edir.
    String name;
    int age;
    int experience;
    double salary = 100;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Doctor extends Employee {

    void cure() {
        System.out.println("Cure");
    }

}

class Xirurg extends Doctor {
    String skalpel;

    void operaciya() {
    }
}

class Dantist extends Doctor {

}



