package lesson_10;

import lesson_9.Car; // Car klasını import edirik.
import lesson_9.Student;

// İmport etməsək o zaman obyekt yaradarkən tam addam istifadə olunur. lesson_9.Car car = new lesson_9.Car("red", "V6");
// Eyni adlı klası import etdikdə isə errorun qarşısını almaq üçün tam ad yazılmalıdır.
// import
public class A {
    public static void main(String[] args) {
        Car car = new Car("red", "V6");
        lesson_8.Car car1 = new lesson_8.Car();

        Student st = new Student();
        st.name = "Zaur";
        Student.count = 2;


    }
}
