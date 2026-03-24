package lesson_3.logical_operators;

public class Example2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 0;
        int d = 100;

        boolean result = a < b && c == d; // false && false -> false
        System.out.println(result); // false

        b = 50;
        result = a < b && c == d; // true && false -> false
        System.out.println(result); // false

        result = a < b && c++ == d; // true && false -> false
        System.out.println(result); // -> false
        System.out.println(c); // -> 1

        c = 0;
        result = a > b && c++ == d; // false && false -> short circuit &&-da 1ci tərəf false olduğundan 2ci tərəfi yoxlamır.
        System.out.println(result); // -> false
        System.out.println(c); // -> 0

        c = 99;
        result = a < b && c++ == d; // true && false -> false c hələki 99
        System.out.println(result); // false
        System.out.println(c); // 100

        c = 99;
        result = a > b && c++ == d; // false && false c 99 artmayacaq short circuit
        System.out.println(result);
        System.out.println(c);

        c=99;
        result = a < b && ++c == d; // true && true c=100
        System.out.println(result);
        System.out.println(c);



    }
}
