package lesson_11;

// primitive data type argument
public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a) {
        return a * 2;
    }

    public void zp2() {
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);

        double d = emp1.uvelichitel(emp1.salary); // salary dəyişmir
        System.out.println(d);
        System.out.println(emp1.salary);

        emp1.zp2(); // salary dəyişir
        System.out.println(emp1.salary);
    }
}