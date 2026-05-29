package lesson20.arrayList;

import java.util.ArrayList;

// indexOf
public class Test6 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));

        System.out.println(list);
        System.out.println(list.indexOf(new StringBuilder("poka"))); // tapmayacaq və -1 qaytaracaq. Buradada equals metodu işləyir.
    }
}
