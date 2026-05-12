package lesson_17.stringbuilder;

public class Test2 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        System.out.println(sb1 == sb2); // false
        System.out.println(sb1.equals(sb2)); // false StrinBuilder klasında equals metodu dəyişdirilməmişdir. o default olaraq == kimi işləyir.
        StringBuilder sb3 = sb1;
        System.out.println(sb3 == sb1); // true-dir
        System.out.println(sb3.equals(sb1)); // true-dir. Çünki eyni obyektin referansını saxlayırlar.

        StringBuilder builder = new StringBuilder("Hello");
        String s1 = new String(builder);

        StringBuffer buffer = new StringBuffer("Hello");
        String s2 = new String(buffer); // Stringin konstruktoru belə bir növüdə vardır ki, biz String daxilinə StringBuilder və StringBuffer yaza bilirik.




    }
}
