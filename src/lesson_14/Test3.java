package lesson_14;

public class Test3 {
    public static void main(String[] args) {
        // cüt ədədləri çapa verək
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-".repeat(20));

        for (int i = 2; i <= 30; i += 2) {
            System.out.print(i + " ");
        }
    }
}
