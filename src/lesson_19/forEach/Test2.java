package lesson_19.forEach;

// Hər bir tələb üçün imtahan adları çapa verək
public class Test2 {
    public static void main(String[] args) {

        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"math analiz", "filosofiya"};

        for (String student : students) {
            for (String exam : exams) {
                System.out.println(student + " => " + exam);
            }
        }
    }
}
