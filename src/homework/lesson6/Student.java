package homework.lesson6;

public class Student {

    int studentId;
    String name;
    String surname;
    int course;
    double mathAvgGrade;
    double economyAvgGrade;
    double foreignLanguageAvgGrade;


    Student(int studentId, String name, String surname, int course, double mathAvgGrade, double economyAvgGrade, double foreignLanguageAvgGrade) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.mathAvgGrade = mathAvgGrade;
        this.economyAvgGrade = economyAvgGrade;
        this.foreignLanguageAvgGrade = foreignLanguageAvgGrade;
    }

    Student(int studentId, String name, String surname, int course) {
        this(studentId, name, surname, course, 0.0, 0.0, 0.0);
    }

    Student() {

    }


}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(12, "Zaur", "Babayev", 2, 5.5, 6.7, 8.3);
        Student st3 = new Student(1, "Vusal", "Hesenov", 2);
    }
}