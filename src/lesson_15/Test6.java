package lesson_15;

// Outer do while inner while olan loop yazaq
public class Test6 {

    public static void main(String[] args) {

        int hour = 0;

        OUTER:
        do {
            int minute = 0;

            INNER:
            while (minute < 60) {
                System.out.printf("%d : %d %n", hour, minute);
                minute++;
            }
            hour++;
        } while (hour < 24);
    }
}
