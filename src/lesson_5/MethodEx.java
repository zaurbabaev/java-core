package lesson_5;

/* Method*/
public class MethodEx {

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sumAvg(int a, int b, int c) {
        return sum(a, b, c) / 3;
    }

    public static void main(String[] args) {
        MethodEx ex = new MethodEx();
        int sum = ex.sum(12, 3, 5);
        System.out.println(sum);
        int sum1 = ex.sum(23, 45, 3);
        System.out.println(sum1);

        int sumAvg = ex.sumAvg(12, 3, 5);
        System.out.println(sumAvg);

        int sumAvg1 = ex.sumAvg(20, 40, 60);
        System.out.println(sumAvg1);
    }

}
