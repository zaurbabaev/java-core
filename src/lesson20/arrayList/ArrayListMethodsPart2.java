package lesson20.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethodsPart2 {
    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1: " + al1); // al1: [one, two, three, four, five]

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");
        System.out.println("al2: " + al2); // al2: [one, three, four, ten]

        al1.removeAll(al2); // Əgər 1ci list-də parametrdə olanlar varsa onlar silinir.

        System.out.println("al1: " + al1); //  al1: [two, five]

        al1.retainAll(al2); // removenin əksidir əgər parametrdə olanlar 1ci listdə varsa onlar saxlanılır digərləri silinir.
        System.out.println("al1: " + al1); // (removeAll metodunu kommentə alsaq) al1: [one, three, four]




    }
}
