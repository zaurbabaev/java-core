package lesson_17.stringbuilder;

public class StringBuilderMethods1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Good Day!!!!");
        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2.length()); // burada length 0-dır. capacity 50-dir
        System.out.println(sb1.charAt(3)); // d

        System.out.println(sb1.indexOf(" ")); // 4 // olmayan simvol olduqda -1 qaytarır
        System.out.println(sb1.indexOf("!!!!")); // 8

        String s1 = sb1.substring(5);
        System.out.println(s1); // Day!!!!

        String s2 = sb1.substring(5, 8);
        System.out.println(s2); // Day

        CharSequence charSequence = sb1.subSequence(5, 8);
        System.out.println(charSequence);


    }
}
