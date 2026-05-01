package lesson_11;

// reference data type argument
public class Student {

    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    // biz bu metodla Student obyektlərinin yerini dəyişmək istəsək bu alınmayacaq. Çünki biz parametrə reference yazan zaman oraya referencenin kopyası ötürülür.
    public static void swap(Student st1, Student st2) {
        Student st3 = st1;
        st1 = st2;
        st2 = st3;
    }

    // bu halda isə artıq biz referansın kopyası ilə obyekktin içini dəyişə bilirik. Bu pass-by-value adlanır.
    public static void changeName(Student s) {
        s.name = "Vasiliy";
    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Pyotr", 1, 5.3);

        swap(st1, st2); // işləmiyəcək

        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st1);
        System.out.println(st1.name);

    }

}
