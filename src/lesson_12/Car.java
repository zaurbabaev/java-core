package lesson_12;

//  Nested if (if else yazarkən {} istifadə etmədikdə if-ə ən yaxın olan else həmin if-ə aid olur)
public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }

}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.engine > c2.engine)
            if (c1.doorCount > c2.doorCount)
                System.out.println("Birinci maşında motorun həcmi və qapılarının sayı çoxdur.");
            else
                System.out.println("Birinci maşında matorun həcmi böyük lakin qapıların sayı azdır.");
        else
            System.out.println("Birinci maşının motor həcmi kiçikdir.");
    }
}
