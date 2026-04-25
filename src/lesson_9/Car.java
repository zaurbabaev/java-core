package lesson_9;

/* Variable scope (Область видимости переменных)
    static dəyişənə instance dəyişən mənimsədə bilmərik. static metod daxilində instance dəyişən istifadə edə bilmərik. Amma hər iki halda əksinə edə bilərik.
 */
public class Car {
    String color;
    int a = 10;
    String engine;
    static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public static void changeA(int b) {
        Car car = new Car("black", "V8");
        car.a = b;
    }

    public void showColor() {
        System.out.printf("Color of the car is: %s %n", color);
        this.changeColor("red");
    }

    public void changeColor(String color) {
        System.out.println("Color of the car is changed");
        int price = 5000;
        this.color = color;
        price += 1000;
        System.out.println(color);
    }

    public static void main(String[] args) {
        Car car = new Car("green", "V3");
        car.showColor();
        car.changeColor("yellow");
        car.showColor();
    }

}
