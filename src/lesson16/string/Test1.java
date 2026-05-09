package lesson16.string;

public class Test1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        String s = "ok";
        System.out.println(a + b + s); //11ok

        // Əgər int-lərin toplanmasını istəmiriksə o zaman ilk intin qarşısına "" yazırıq
        System.out.println("" + a + b + s); // 56ok  Belə yazsaq belə əgər int-lərin toplanmasını istəyiriksə o zaman onları () daxilində yazırıq
        System.out.println("" + (a + b) + s);

    }
}
