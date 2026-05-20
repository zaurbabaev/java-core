package lesson_19.forEach;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        int[] array = {0, 6, 4, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = 3; // forEach vasitəsilə biz massivi dəyişə bilmirik. O yalnız iterasiya yarayır.
        }

        System.out.println(Arrays.toString(array));


        String[] s = {"privet", "poka", "ok"};
        for (String string : s) {
            string = new String("hello"); // dəyişmir
        }

        System.out.println(Arrays.toString(s));


        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");

        StringBuilder[] arraySb = {sb1, sb2, sb3};

        for (StringBuilder sb : arraySb) {
            sb = new StringBuilder("hello"); // dəyişmədi. Yeni StringBuilder yaranır və sb ona müraciət edir.
        }

        System.out.println(Arrays.toString(arraySb));

        StringBuilder[] arraySb2 = {sb1, sb2, sb3};

        for (StringBuilder sb : arraySb2) {
            sb.append("!!!");  // Burada isə biz hər bir massivə !!! əlavə edə bilirik. StringBuilderin metodları ilə biz obyektin dəyərlərini dəyişə bilərik. Amma obyektin özünü deyişmək mümkün deyil.
        }

        System.out.println(Arrays.toString(arraySb2));
    }


}
