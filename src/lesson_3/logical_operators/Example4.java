package lesson_3.logical_operators;

/*
 & və | bitwice operatorları ədədlərlədə işləyir. Qeyd edim ki, && və || ədədlərlə işləmir.
*/
public class Example4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a & b); // 1010 & 0101 -> 0

        System.out.println(a | b); // 1010 | 0101 -> 1111 -> 15
    }
}
