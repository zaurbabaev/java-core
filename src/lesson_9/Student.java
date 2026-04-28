package lesson_9;

// object life cycle
public class Student {

    public String name;
    public int age;
    public static int count;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3; // heç bir obyekt yaranmayıb. st3 null-dur.
        st1 = null; // st1 artıq heç bir obyektə referans deyil. ona bağlı olan obyekt artıq əlçatan deyildir. garbage collector tərəfindən müəyyən vaxtan sonra silinəcəkdir.
        // scope bitdikdə obyektin həyat dövrü bitir.
    }
}
