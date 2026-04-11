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
        st1.studentId = 2;
        st1.name = "James";
        st1.surname = "Bond";
        st1.course = 3;
        st1.mathAvgGrade = 4.0;
        st1.economyAvgGrade = 5.0;
        st1.foreignLanguageAvgGrade = 6.0;

        Student st2 = new Student(1, "Vusal", "Hesenov", 2);
        st2.mathAvgGrade = 4.0;
        st2.economyAvgGrade = 5.0;
        st2.foreignLanguageAvgGrade = 6.0;

        Student st3 = new Student(12, "Zaur", "Babayev", 2, 5.5, 6.7, 8.3);
    }
}