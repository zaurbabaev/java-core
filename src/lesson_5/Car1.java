package lesson_5;

public class Car1 {
    String color;
    String engine;

    Car1() {
        color = "blue";
        engine = "V8";
    }

    Car1(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    void showInfo() {
        System.out.printf("Car's color: %s, cars's engine: %s %n", this.color, this.engine);

    }
}

class Car1Test {
    public static void main(String[] args) {

        Car1 car = new Car1();
        car.showInfo();

        Car1 car1 = new Car1("red", "V3");
        car1.showInfo();
    }
}
