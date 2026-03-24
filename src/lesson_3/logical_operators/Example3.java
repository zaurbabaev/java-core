package lesson_3.logical_operators;

public class Example3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 99;
        int d = 100;

        boolean result = a > b || ++c == d; // true || false short circuit || 1ci tərəf true oldusa ikinci tərəfi yoxlamır
        System.out.println(result); // true
        System.out.println(c); // 99

        result = a < b || ++c == d; // false || true
        System.out.println(result); // true
        System.out.println(c); // 100

//        hər 2 tərəfində işləməsi üçün & və | istifadə olunur
        c = 99;
        result = a < b & ++c == d;
        System.out.println(result); // false
        System.out.println(c); // 100

        c = 99;
        result = a > b | ++c == d;
        System.out.println(result); // true
        System.out.println(c); //100


    }
}
