package lesson_8;

public class Student2 {
    String name;
    int course;
    static int count;
    int a;

    public Student2(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.printf("Student %d created %n", count);
    }

    public static void showCount() {
        System.out.printf("All created Students %d %n", count);
    }

    public void showInfo() {
        System.out.println("Welcome To the Student class");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        // static daxilində obyekt (instance) dəyişənini bir başa çağıra bilmərik. Bunun üçün obyekt yaradıb sonra onun elementlərinə müraciət etmək olar.
    }

    public static void main(String[] args) {

    }

}
