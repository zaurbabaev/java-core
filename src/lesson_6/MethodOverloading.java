package lesson_6;

public class MethodOverloading {

    void show(int i) {
        System.out.println(i);
    }

    void show(boolean b) {
        System.out.println(b);
    }

    void show(String s) {
        System.out.println(s);
    }

    void show(int a, int b) {
        System.out.println(a + " " + b);
    }

    void show(int a, String s) {
        System.out.println(a + " " + s);
    }

    void show(String s, int a) {
        System.out.println(s + " " + a);
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        int a = 500;
        methodOverloading.show(a);
        methodOverloading.show(true);
        methodOverloading.show("Java");
        methodOverloading.show(12, 2);
        methodOverloading.show("String + int", 12);
        methodOverloading.show(12, "Int + String");
    }
}
