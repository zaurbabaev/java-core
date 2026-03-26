package homework.lesson4;

public class Student {

    public int studentId;
    public String name;
    public String surname;
    public int course;
    public double mathAvgGrade;
    public double economyAvgGrade;
    public double foreignLanguageAvgGrade;

    public void avgGrade(){
        System.out.printf("%s %s's average grade - > %.2f %n",
                name, surname, (mathAvgGrade + economyAvgGrade + foreignLanguageAvgGrade) / 3);
    }
}
