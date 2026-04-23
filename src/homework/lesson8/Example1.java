package homework.lesson8;

public class Example1 {

    public static int sum(int a, int b, int c) {
        return a * b * c;
    }

    public static void divide(int a, int b) {
        int total = a / b;
        int remainder = a % b;
        System.out.printf("Total -> %d, remainder -> %d %n", total, remainder);
    }


}

class Example1Test {
    public static void main(String[] args) {
        int sum1 = Example1.sum(2, 3, 4);
        int sum2 = Example1.sum(3, 4, 5);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(Example1.sum(5,6,7));

        Example1.divide(5, 2);
        Example1.divide(14, 3);
    }
}
