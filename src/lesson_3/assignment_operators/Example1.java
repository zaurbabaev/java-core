package lesson_3.assignment_operators;


/*
 = , += , -= , *= , /= , %=
*/
public class Example1 {
    public static void main(String[] args) {

        int a = 3;

        int oldA = a;

        a = a + 3; // -> 6
        System.out.printf("%d + 3 = %d %n", oldA, a);

        oldA = a;
        a += 3; // a = a + 3 -> 9
        System.out.printf("%d + 3 = %d %n", oldA, a);

        oldA = a;
        a -= 3; // -> 6
        System.out.printf("%d - 3 = %d %n", oldA, a);

        oldA = a;
        a *= 3; // -> 18
        System.out.printf("%d * 3 = %d %n", oldA, a);

        oldA = a;
        a /= 3; // -> 6
        System.out.printf("%d / 3 = %d %n", oldA, a);

        oldA = a;
        a %= 3; // 0
        System.out.printf("%d %% 3 = %d %n", oldA, a);


        int b = 3;
        int c = 50;
        int d = 0;

        b = c = d = 18;

        System.out.println(b); // 18
        System.out.println(c); // 18
        System.out.println(d); // 18


    }
}
