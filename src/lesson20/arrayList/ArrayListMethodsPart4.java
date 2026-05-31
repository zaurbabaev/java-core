package lesson20.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// toArray -> Object
public class ArrayListMethodsPart4 {
    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1: " + al1); // al1: [one, two, three, four, five]

        Object[] array = al1.toArray();
        System.out.println("Array: " + Arrays.toString(array)); // Array: [one, two, three, four, five] burada arrayların tipi Object-dir. Əgər biz listimizin tipinə uyğun array yaratmaq istəyirksə o zaman parametrdə həmin tipi gəstiririk.

        String[] strings = al1.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(strings));


    }
}
