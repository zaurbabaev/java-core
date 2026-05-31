package lesson20.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// List.of -> List
//List.copyOf
public class ArrayListMethodsPart5 {
    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1: " + al1); // al1: [one, two, three, four, five]

        List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven", "eight"); // immutiable list-dir modifikasiya e də bilmərik. add, remove, set eldə bilmərik.
        System.out.println("List: " + list);

        List<String> list2=List.copyOf(al1); // al1 kolleksiyasının elementlərindən yeni immutable List yaradır. off və copy-ə null əlavə etmək olmaz.
        System.out.println("List2: " + list2);




    }
}
