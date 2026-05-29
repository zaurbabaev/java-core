package lesson20.arrayList;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");

        System.out.println(list); // [poka, privet, ok]

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Petrov");
        list1.add("Sidorov");
//        list.addAll(list1);
        list.addAll(1, list1); // 28-ci sətir
        System.out.println(list); //[poka, Petrov, Sidorov, privet, ok]

        list1.set(1, "Ivanov"); // belə yazsaq belə list 28-ci sətirdəki kimi qalacaq
        System.out.println(list); // [poka, Petrov, Sidorov, privet, ok]
    }
}
