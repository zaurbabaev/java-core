package lesson_14;

public class BreakEx {
    public static void main(String[] args) {

        // i 7-yə bərabər olduqda dövr işini bitirsin (7 çapa verilməyəcək)
        for (int i = 1; i <= 10; i++) {
            if (i == 7) break;
            System.out.println(i);
        }
    }
}
