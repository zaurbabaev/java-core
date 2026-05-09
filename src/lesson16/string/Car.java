package lesson16.string;

public class Car {

    public String color;
    public String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public Car abc(String color) {
        return new Car(color, "V4");
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        Car black = c.abc("black");

        System.out.println(c.color);

    }


}
