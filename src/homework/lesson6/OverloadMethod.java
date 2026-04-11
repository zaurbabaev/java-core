package homework.lesson6;

public class OverloadMethod {

    void sum() {
        int result = 0;
        System.out.println(result);
    }

    void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    void sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
    }

    void sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println(result);
    }
}

class OverloadMethodTest {
    public static void main(String[] args) {
        OverloadMethod oM = new OverloadMethod();
        oM.sum();
        oM.sum(1, 2);
        oM.sum(1, 2, 3);
        oM.sum(1, 2, 3, 4);
    }
}