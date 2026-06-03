package lesson21;

public class Test6 {


    int a = printA();

    int printA() {
        System.out.println("Field initialized");
        return 10;
    }

    Test6() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test6();
    }
}
