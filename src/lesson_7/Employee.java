package lesson_7;

public class Employee {

    protected double salary;

    protected void dvoynayaZp() {
        System.out.printf("Novaya z/p = %.2f %n", salary * 2);
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(200);
        System.out.println(employee.salary);
        employee.dvoynayaZp();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(500.2);
        System.out.println(employee.salary);
        employee.dvoynayaZp();
    }
}
