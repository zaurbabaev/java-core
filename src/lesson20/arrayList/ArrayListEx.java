package lesson20.arrayList;

import java.util.ArrayList;
import java.util.List;

// Aşağıdakı kimi nümunə yazsaqda əslində bu yazılış düzgün deyil. Çünki ArrayList-də konkret data type olmalıdır. Yəni Əgər biz onu String elan etmişiksə daxilində yalnız Stringlər olmalıdır.
// Amma biz bu nümunəni yaza bilməyimizin səbəbi ArrayListin özəyini Object massivinin tutmasıdır.
public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("privet");
        Car car = new Car();
        list.add(car);
        Student student = new Student();
        list.add(student);


        ArrayList<String> strings = new ArrayList<>(); // düzgün yazılış forması. Artıq yalnız Stringləri bu listə əlavə edə bilərik.
        strings.add("Hello");

        List<Integer> integers = new ArrayList<>(); // Polimorfizmə uyğun olaraq daha düzgün yazılış forması
    }
}

class Car {
}

class Student {
}
