package lesson_14;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("-".repeat(20));
        int i = 1;
        for (; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-".repeat(20));

        for (int j = 5; j < 11; j++, abc(10)) { // bu üsul çox istifadə olunmur. Onun yerinə istifadə olunacaq metod sout-dan sonra yazılır.
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("-".repeat(20));

        for (int j = 0; j < 11; ) {
            System.out.print(j + " ");
            j++; // update statement burada yazıla bilər.
        }

        System.out.println();
        System.out.println("-".repeat(20));

        for (int j = 0; ; j++ ) { // condition statement yazılmasa belə sintaktik olaraq ; ; yazılmalıdır bu zaman condition statement true qəbul olunurki dövür sönsuz qədər artaraq gedir
            System.out.print(j + " ");
        }
    }

    static void abc(int n) {
        System.out.print(n + " ");
    }
}
