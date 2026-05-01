package lesson_12;

public class Car2 {
    int engine;
    int doorCount;

    Car2(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }

}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2(3, 6);
        Car2 c2 = new Car2(2, 5);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("Birinci maşında motorun həcmi böyük və qapılarının sayı çoxdur.");
            } else {
                System.out.println("Birinci maşında matorun həcmi böyük lakin qapıların sayı azdır.");
            }
        } else {
            System.out.println("Birinci maşının motor həcmi kiçikdir.");
        }
    }
}
