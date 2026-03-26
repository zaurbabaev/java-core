package lesson_5;

/* Method */
public class Car {
    String color;
    String engine;
    int speed;

    int qaz(int skorost) {
        return speed += skorost;
    }

    int tormoz(int skorost) {
        return speed -= skorost;
    }

    void showInfo() {
        System.out.printf("Cvet: %s motor: %s skorost: %d %n", color, engine, speed);
    }
}
