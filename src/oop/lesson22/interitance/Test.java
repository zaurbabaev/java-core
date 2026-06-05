package oop.lesson22.interitance;

// Extensibility super klass tələb olunan yerə sab klass göndərilə bilər
public class Test {

    void uvelichZP(Employee e) {
        e.salary += 100;
    }

    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.speciality = "Xirurg";
        doc.eat();
        doc.sleep();
        doc.cure();
        Test test = new Test();
        test.uvelichZP(doc);
        System.out.println(doc.salary);
    }
}

class Employee {
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
    String speciality;

    void cure() {
        System.out.println("Cure");
    }


}

class Teacher extends Employee {
    String numberOfStudents;

    void teach() {
        System.out.println("Teaching");
    }

}

class Driver extends Employee {

    String nameOfCar;

    void drive() {
        System.out.println("Driving");
    }
}


