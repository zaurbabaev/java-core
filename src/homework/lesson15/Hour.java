package homework.lesson15;

public class Hour {

    public static void time() {

        int hour = 0;

        OUTER:
        while (hour < 6) {
            int minute = -1; // do while başlayan kim minute-ni artırdığımıza görə -1-dən başlayırıq. artıq o 0-dan başlayaraq hesablamağa başlayacaq.

            MIDDLE:
            do {
                minute++; // 0

                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int seconde = 0;

                INNER:
                while (seconde < 60) {
                    if (seconde * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.printf("%d:%d:%d %n", hour, minute, seconde);
                    seconde++;
                }

            } while (minute < 59);

            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
