package lesson20.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list = new ArrayList<>(); // list daxilində 3 string builder əlavə edirik. Onlarda öz növbəsində 3 obyekt özündə saxlayır
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        Object[] array1 = list.toArray(); // A B C
        for (Object o : array1) {
            System.out.print(o + " ");
        }
        System.out.println();


        StringBuilder[] array = list.toArray(new StringBuilder[10]); // listi arraya çeviririk. StringBuilder massivində istədiyimiz uzunluğu yaza bilərik adətən 0 yazılır. Çünki başqa rəqəm yazsaq və array-ı çapa versək yerdə qalan elementlər null olaraq çapa veriləcək.
        System.out.println(Arrays.toString(array)); // [A, B, C, null, null, null, null, null, null, null]

        StringBuilder[] array2 = list.toArray(new StringBuilder[0]); // əgər verilən array kiçikdirsə, Java yenisini yaradır.
        System.out.println(Arrays.toString(array2)); // [A, B, C]

        StringBuilder[] array3 = list.toArray(StringBuilder[]::new);
        System.out.println(Arrays.toString(array3));  // [A, B, C]

        StringBuilder[] array4 = {sb1, sb2, sb3, sb3};

        List<StringBuilder> list1 = Arrays.asList(array4); // massivdən fixed-size list qaytarır. yəni biz yaranmış listin size()-sini dəyişə bilmərik. add və remove edə bilmərik biz array-in özünü dəyişdikdə bu listdədə dəyişiklik olacaq
        System.out.println(list1); // [A, B, C, C]

        array4[0] = new StringBuilder("!!!"); // biz massivdə dəyişiklik etsək bu list-dədə öz əksini tapır.
        System.out.println(list1); // [!!!, Bye, C, C]

        array4[1].append("ye");
        System.out.println(list1); // [!!!, Bye, C, C]

        list1.set(0, new StringBuilder("A")); // listdədə dəyişiklik etdikdə bu həm listdə həmdə massivdə əksini tapacaq
        System.out.println(list1); // [A, Bye, C, C]
        System.out.println(Arrays.toString(array4)); // [A, Bye, C, C]


    }
}
