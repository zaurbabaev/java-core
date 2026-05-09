package lesson16.string;


public class StringMethods5 {
    public static void main(String[] args) {

        String s1 = "privet";
        System.out.println(s1.isBlank()); // false // o zaman true qaytarırki, string probel və ya tab olsun.
        String s2 = " ";
        System.out.println(s2.isBlank()); // true

        String s3 = "";
        System.out.println(s3.isEmpty());// true // String daxilində ümumiyyətlə heç bir şey olmadıqda true qaytarır.

        // strip() metodu trim() kimidir
        String s4 = "   privet   ";
        System.out.println(s4.strip());

        String s5 = "    privet  ";
        System.out.println(s5.stripLeading()); // əvvəldə ollan böşluqları silir

        String s6 = "    privet  ";
        System.out.println(s6.stripTrailing()); // Sonda olan boşluqları silir

        String s7 = "poka";
        String s8 = s7.strip(); // s7 üzərində heç bir əməliyyat aparılmadığından həmin obyekt bizə qayıtmış olur. beləki s7==s8 truedir
        System.out.println(s7 == s8); //true


    }
}
