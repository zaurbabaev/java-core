package lesson21;

public class Employee {
    Employee manager = new Employee();
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e = null;
        e = new Employee();
        e = null;
    }
}
