package lesson_15;

public class Test3 {

    public static void main(String[] args) {

        // 3-ə və 7-yə tam bölünən ilk ədədi tapdıqdan sonra loop bitsin.
        boolean b = true;

        int a = 1;

        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;
            }
            a++;
        }
    }
}
