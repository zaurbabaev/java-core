package lesson16.string;

public class Test3 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); //true

        String s3 = "privet";
        String s4 = "privet";
        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true

        System.out.println(s1 != s4); // true

        String s10 = "Kak Dela?";
        String s11 = "kak dela?";
        System.out.println(s10.equalsIgnoreCase(s11)); // true

        String x = "privet";
        String y = "privet".trim();
        System.out.println(x == y); // true // obyektdə heç bir şey dəyişmədiyindən pooldan həmin privet obyekti qayıdır.

        // Əgər obyekt " privet" olsaydı o zaman bu poolda yeni obyekt kimi yaranacaqdı və trim() metodu bunu dəyişərək bizə yeni obyekt qaytaracaq.
        String z = " privet".trim();
        System.out.println(x == z); // false
    }
}
