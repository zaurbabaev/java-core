package lesson21;

public class Test5 {
    public static void main(String[] args) {

        int a = 7;
        System.out.println(a > 2 ? a < 5 ? 5 : 6 : 9);
        System.out.println(a > 2 ? (a < 5 ? 5 : 6) : 9); // oxunaqlı yazılış 1ci true olduqda mötərizəyə girir onu yoxlayır falsedirsə 9 qayıdır. cavab 6

        // if ilə yazılış
        if (a > 2) {
            if (a < 5) {
                System.out.println(5);
            } else {
                System.out.println(6);
            }
        } else {
            System.out.println(9);
        }


    }
}
