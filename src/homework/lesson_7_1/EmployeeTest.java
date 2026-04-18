package homework.lesson_7_1;

public class EmployeeTest {
    public static void main(String[] args) {
        homework.lesson7.Employee emp1 = new homework.lesson7.Employee(12);
//        homework.lesson7.Employee emp2 = new homework.lesson7.Employee(350.3); konstruktoru default olduğundan başqa görsənmir
//        System.out.println(emp1.id); id default olduğundan başqa paketdə görsənmir
//        System.out.println(emp1.salary);  private olduğundan bu klasda görsənmir
        System.out.println(emp1.surname);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();

    }
}
