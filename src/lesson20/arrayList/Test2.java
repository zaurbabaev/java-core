package lesson20.arrayList;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {

        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        System.out.println(list);

        StringBuilder removed = list.remove(2); // return type data type
        System.err.println("Removed => " + removed); // privet silinir
        System.out.println(list);

        // Obyekt vasitəsilə remove etmək istədikdə. Remove zamanı equals metodu istifadə olunduğundan silinmə olmaya bilər(String istisna). Amma referanceni verdikdə silinmə olacaq.
        list.remove(sb1); // return type boolean hello silinir
        System.out.println(list);


    }
}
