package lesson6;

/* Constructor overloading */
public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    /*Employee(int id, String surname, int age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    Employee(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }*/

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    Employee(int id, String surname, int age) {
        this(id, surname, age, 0.0, "IT");
    }

    Employee(String surname, int age) {
        this(0, surname, age);
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Babayev", 38);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.surname);

        Employee emp3 = new Employee(2, "Sidrov", 40, 100.35, "IT");
        System.out.println(emp3.department);
    }
}
