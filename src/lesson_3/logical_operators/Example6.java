package lesson_3.logical_operators;

public class Example6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int c = ++a - b * 2;
        System.out.println(c); // 11 - 6 = 5

        a = 10;
        c = (++a - b) * 2; // 18
        System.out.println(c);
    }
}
