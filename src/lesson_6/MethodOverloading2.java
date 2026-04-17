package lesson_6;

public class MethodOverloading2 {
    int sum(int a, int b) {
        return a + b;
    }

    String sum(String a, String b) {
        return a + b;
    }

}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 methodOverloading = new MethodOverloading2();
        int sum1 = methodOverloading.sum(12, 3);
        String hello = methodOverloading.sum("Hello", " World");
        System.out.println(sum1);
        System.out.println(hello);
    }
}

