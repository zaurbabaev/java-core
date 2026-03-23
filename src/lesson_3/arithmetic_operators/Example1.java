package lesson_3.arithmetic_operators;

/*
        + , - , * , / , %, ++ , --
*/
public class Example1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        System.out.println(a - b);

        int d = a - b;
        System.out.println(d);

        System.out.println(a * b);

        System.out.println(a / b);

        System.out.println(a % b);

        double d1 = 11;
        double d2 = 3;
        System.out.println(d1 % d2);

        int a1 = 11;
        int a2 = 3;

        int celayaChast = a1 / a2;
        int ostatok = a1 % a2;

        System.out.println(celayaChast);
        System.out.println(ostatok);


        int x = 5;
        int y = 3;

//        int z = x - y++; // 2
        int z = x - ++y; // 1

        System.out.println(z);
        System.out.println(y); // 4


        int ab = 5;
        int result = ++ab - --ab - ab-- + ab++;
        System.out.println(result);
        System.out.println(ab);


    }
}
