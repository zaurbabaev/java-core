package lesson16.string;

public class Employee {

    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
//        System.out.println(emp.salary + emp.isManager); // ayrı ayrı tiplər olduğundan onları concat edə bilmərik.
        System.out.println("On manager? " + emp.isManager + " Ego zarplata: " + emp.salary);
    }
}
