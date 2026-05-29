package lesson20.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list = new ArrayList<>();
        list.add(s3);
        list.add(s1);
        list.add(s4);
        list.add(s2);

        System.out.println(list); // [C, A, D, B]

        Collections.sort(list);
        System.out.println(list); // [A, B, C, D]

        ArrayList<String> list1 = list;
        boolean equals = list.equals(list1);
        System.out.println(equals); // true

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(list); // []
    }
}
