package lesson_5;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();

        c1.qaz(20);
        c1.showInfo();

        c1.tormoz(10);
        c1.showInfo();
    }
}
