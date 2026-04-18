package homework.lesson7;

public class EmployeeTest {
    public static void main(String[] args) {
        homework.lesson7.Employee emp1 = new homework.lesson7.Employee(12);
        homework.lesson7.Employee emp2 = new homework.lesson7.Employee(350.3);
        System.out.println(emp1.id);
//        System.out.println(emp1.salary);  private olduğundan bu klasda görsənmir
        System.out.println(emp1.surname);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();

        System.out.println("-".repeat(20));

        System.out.println(emp2.id);
//        System.out.println(emp2.salary);  private olduğundan bu klasda görsənmir
        System.out.println(emp2.surname);

        emp2.getId();
        emp2.getSurname();
        emp2.getSalary();
    }
}
