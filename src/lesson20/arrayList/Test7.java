package lesson20.arrayList;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("hello");
        System.out.println(list);
        System.out.println(list.indexOf("poka")); // 0
        System.out.println(list.indexOf(new String("ok"))); // 2 - Hər
        System.out.println(list.size());
        System.out.println(list.isEmpty()); // false

        System.out.println(list.contains("poka")); // equalsdan istifadə olunur

        System.out.println(list.toString()); // lakin biz toString() metodunu listdə istifadə etməsəkdə həmin nəticəni almış olacağıq.

        
    }
}
