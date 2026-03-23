package lesson_3.relational_operators;

/*
 < , > , <= , >= , == , !=
*/
public class Example1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a < b); // true
        System.out.println(a <= b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true

        int c = 5;
        boolean b1 = b >= c;
        System.out.println(b1 );


    }
}
