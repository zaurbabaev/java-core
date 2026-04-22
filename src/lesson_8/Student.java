package lesson_8;

// static variable
public class Student {

    String name;
    int course;
    static int count;

    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.printf("Student %d has been created %n", count);
    }

    public static void showCount() {
        System.out.printf("All created Students %d %n", count);
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 1);
        Student st2 = new Student("Nail", 3);
        Student st3 = new Student("Nagi", 2);

        System.out.println(Student.count);
        Student.showCount();
    }
}
