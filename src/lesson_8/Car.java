package lesson_8;

/*
ReferenceDataTypeConstant
final olaraq yaradılan reference dəyişilə bilməz lakin onun daxili dəyişilə bilər. Beləki biz yalnız 1 dəfə new
yazmaqla obyekt yaratdıqdan sonra həmin referansı dəyişə bilmərik. Lakin obyektin daxilini dəyişə bilərik bunda heç bir məhdudiyyət yoxdur.
*/
public class Car {

    String color = "blue";
    String engine = "V6";
}

/*class Human {
    String name = "Ivan";
    Car c = new Car(); // Car final olmasa humana yenidən yeni Car obyekti əlavə edə bilərik.

    public static void main(String[] args) {
        Human human = new Human();
        human.c = new Car();
        human.c = new Car();
        human.c.engine = "V4";
    }
}
*/

class Human {
    String name = "Ivan";
    final Car car = new Car();

    public static void main(String[] args) {
        Human human = new Human();
        human.car.engine = "V3"; // artıq biz yalnız elan olunmuş car obyektinin daxilini dəyişə bilərik. Yeni Car obyekti yarada bilmərik
    }
}