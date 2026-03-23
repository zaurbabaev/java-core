package homework.lesson2;

public class Lesson_2 {
    public static void main(String[] args) {

        byte b_binary = 0B1100;
        byte b_decimal = 12;
        byte b_octal = 014;
        byte b_hexadecimal = 0XC;

        System.out.println(b_binary);
        System.out.println(b_decimal);
        System.out.println(b_octal);
        System.out.println(b_hexadecimal);

        System.out.println("-".repeat(20));

        short s_binary = 0B0101_0001_0100;
        short s_decimal = 1300;
        short s_octal = 02424;
        short s_hexadecimal = 0X514;

        System.out.println(s_binary);
        System.out.println(s_decimal);
        System.out.println(s_octal);
        System.out.println(s_hexadecimal);

        System.out.println("-".repeat(20));


        int i1 = 0; // hamısnda 0

        long l_binary = 0B0111_0101_10111100110100010101L;
        long l_decimal = 123456789L;
        long l_octal = 0726746425L;
        long l_hexadecimal = 0X75BCD15L;

        System.out.println(l_binary);
        System.out.println(l_decimal);
        System.out.println(l_octal);
        System.out.println(l_hexadecimal);

        System.out.println("-".repeat(20));

        float f1 = 25.3F;
        float f2 = 3.14F;
        System.out.println(f1);
        System.out.println(f2);

        double d1 = 25.9876;
        double d2 = 34.123;
        System.out.println(d1);
        System.out.println(d2);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        char c1 = 'a';
        char c2 = 100;
        char c3 = '\u1235';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
