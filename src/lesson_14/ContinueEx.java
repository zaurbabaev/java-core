package lesson_14;

// tutaqki biz loop icra olunarkən 87 rəqəminin çap olunmasını istəmiriksə o zaman continuedən istifadə edirik
public class ContinueEx {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i == 87) continue;

            System.out.println(i);
        }

    }
}
