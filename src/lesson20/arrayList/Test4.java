package lesson20.arrayList;

import java.util.ArrayList;

// clear
public class Test4 {
    public static void main(String[] args) {

        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("poka");
        StringBuilder sb2 = new StringBuilder("privet");
        StringBuilder sb3 = new StringBuilder("ok");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        System.out.println(list); // [poka, privet, poka]

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        StringBuilder sb4 = new StringBuilder("Petrov");
        StringBuilder sb5 = new StringBuilder("Sidorov");
        list1.add(sb4);
        list1.add(sb5);
        list.addAll(1, list1);
        System.out.println(list); // [poka, Petrov, Sidorov, privet, ok]

        list1.get(1).append("!!!"); // list1-i dəyişdik. Bu dəyişiklik list-də də oldu.
        System.out.println(list); // [poka, Petrov, Sidorov!!!, privet, ok]

        list.clear();
        System.out.println(list); // list silinir

    }
}
