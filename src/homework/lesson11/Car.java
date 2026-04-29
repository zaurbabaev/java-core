package homework.lesson11;

public class Car {

    public String color;
    public String engine;
    public int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }


}

class CarTest {

    public void changeDoorCount(Car car, int doorCount) {
        car.doorCount = doorCount;
    }

    public void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {

        CarTest ct = new CarTest();
        Car car1 = new Car("red", "V3", 4);
        Car car2 = new Car("blue", "V4", 3);

        ct.changeDoorCount(car1, 6);
        ct.changeColor(car1, car2);
        System.out.printf("Birinci maşının məlumatı: rəng: %s, mühərrik: %s, qapılarının sayı: %d %n", car1.color, car1.engine, car1.doorCount);
        System.out.printf("İkinci maşının məlumatı: rəng: %s, mühərrik: %s, qapılarının sayı: %d %n", car2.color, car2.engine, car2.doorCount);


    }

}