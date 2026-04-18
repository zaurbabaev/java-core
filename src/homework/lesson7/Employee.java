package homework.lesson7;

public class Employee {

    int id;
    public String surname;
    private double salary;

    public void getId() {
        System.out.println("Id -> "+id);
    }

    public void getSalary() {
        System.out.println("Salary -> "+salary);
    }

    public void getSurname() {
        System.out.println("Surname -> "+surname);
    }

    public Employee(int id) {
        this.id = id;
    }

    Employee(double salary) {
        this.salary = salary;
    }

    private Employee(String surname) {
        this.surname = surname;
    }

}
