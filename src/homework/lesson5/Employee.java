package homework.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double uvelichenieZarplati() {
        return salary *= 2;
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Zaur", 39, 305.4, "IT");
        Employee emp2 = new Employee(2, "Sem", 30, 555.5, "HR");
        System.out.println(emp1.salary);
        System.out.println(emp2.salary);

        emp1.uvelichenieZarplati();
        double newSalary = emp2.uvelichenieZarplati();

        System.out.println(emp1.salary);
        System.out.println(newSalary);
    }
}
