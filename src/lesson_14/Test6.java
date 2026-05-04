package lesson_14;

// saatın hər bir dəqiqəsini çapa verək. Bunun üçün nested loop istifadə edirik.
public class Test6 {

    public void time() {
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Nachalo outer loopa");
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                System.out.printf("%d : %d %n", hour, minute);
                if (minute == 30) break OUTER;
            }
            System.out.println("Konech outer loopa");
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }

}
