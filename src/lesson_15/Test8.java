package lesson_15;

public class Test8 {

    public static void main(String[] args) {

        // sonsuz dövr alınır ki oda 0:19 olduqdan sonra yenidən təkrarlanır.
        int hour = 0;

        OUTER:
        do {
            int minute = 0;

            INNER:
            while (minute < 60) {
                if (minute == 20) {
                    continue OUTER; // burada yenidən do-ya qayıdır və təkrarən 0-dan başlayaraq təkrarlanır. hour++ minute=0-dan sonra gəlsə idi o zaman minute 20-də qırılıb yeni hour başlamalı idi.
                }
                System.out.printf("%d : %d %n", hour, minute);
                minute++;
            }
            hour++;
        } while (hour < 24);
    }
}
