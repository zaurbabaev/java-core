package lesson20.arrayList;

import java.util.ArrayList;

public class Test8 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list = new ArrayList<>(); // list daxilində 3 string builder əlavə edirik. Onlarda öz növbəsində 3 obyekt özündə saxlayır
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        ArrayList<StringBuilder> list1 = (ArrayList<StringBuilder>) list.clone(); // list-i clonladıqda bizə Object qayıtdığına görə onu cast edirik. list və list1 daxilində elementlər ayrı ayrı olsalarda onlar eyni obyektdə müraciət edəcəklər. Yeni ArrayList obyekti yaranır amma işindəki elementlər kopyalanmır. (shallow copy)
        System.out.println(list == list1); // false
        System.out.println(list.get(0) == list1.get(0)); // true . Ayrı ayrı obyektlər olsada eyni obyektə referans saxlayırlar. yeni içindəki elementlər eyni referansdır
        // clonlamadan sonra biz listdə olan sb1-in A-sına append etdikdə bu dəyişiklik list1-də də olacaq. Çünki hər ikisi eyni obyektə referans saxlaylr.
        list.get(0).append("!!");
        System.out.println(list); // [A!!, B, C]
        System.out.println(list1); // [A!!, B, C]

        // listdəki sb1-i yeni obyektэ referans etsək o zaman list1-ə aidiyyatı olmayacaq
        sb1 = new StringBuilder("D");
        list.set(0, sb1);
        System.out.println(list); // [D, B, C]
        System.out.println(list1); // [A!!, B, C]



    }
}
