package homework.lesson4;

public class StudentTest {
    public static void main(String[] args) {

        Student firstStudent = new Student();
        firstStudent.studentId = 1;
        firstStudent.name = "Zaur";
        firstStudent.surname = "Babayev";
        firstStudent.course = 1;
        firstStudent.mathAvgGrade = 9.5;
        firstStudent.economyAvgGrade = 8;
        firstStudent.foreignLanguageAvgGrade = 8.7;

        Student secondStudent = new Student();
        secondStudent.studentId = 2;
        secondStudent.name = "Vusal";
        secondStudent.surname = "Nagiyev";
        secondStudent.course = 4;
        secondStudent.mathAvgGrade = 9;
        secondStudent.economyAvgGrade = 8.5;
        secondStudent.foreignLanguageAvgGrade = 7.2;

        Student thirdStudent = new Student();
        thirdStudent.studentId = 3;
        thirdStudent.name = "Musa";
        thirdStudent.surname = "Nuriyev";
        thirdStudent.course = 3;
        thirdStudent.mathAvgGrade = 7;
        thirdStudent.economyAvgGrade = 5.5;
        thirdStudent.foreignLanguageAvgGrade = 6.2;

        System.out.printf("%s %s's average grade - > %.2f %n",
                firstStudent.name, firstStudent.surname, (firstStudent.mathAvgGrade + firstStudent.economyAvgGrade + firstStudent.foreignLanguageAvgGrade) / 3);

        System.out.printf("%s %s's average grade - > %.2f %n",
                secondStudent.surname, secondStudent.name, (secondStudent.mathAvgGrade + secondStudent.economyAvgGrade + secondStudent.foreignLanguageAvgGrade) / 3);

        System.out.printf("%s %s's average grade - > %.2f %n",
                thirdStudent.surname, thirdStudent.name, (thirdStudent.mathAvgGrade + thirdStudent.economyAvgGrade + thirdStudent.foreignLanguageAvgGrade) / 3);
    }
}
