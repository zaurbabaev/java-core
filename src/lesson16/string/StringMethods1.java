package lesson16.string;

public class StringMethods1 {

    public static void main(String[] args) {

        String s = new String("abcdefgabcd");

        int length = s.length();
        System.out.printf("Length => %s %n", length); // 11

        char charAt = s.charAt(2);
        System.out.printf("CharAt => %s %n", charAt);  // c

        // Axtarılan simvol tapılmadıqda -1 qaytaracaq
        int indexOfChar = s.indexOf('f');
        System.out.printf("IndexOf Char => %s %n", indexOfChar); //5

        int indexOfString1 = s.indexOf("f");
        System.out.printf("IndexOf String => %s %n", indexOfString1); //5

        int indexOfString2 = s.indexOf("cde");
        System.out.printf("IndexOf String => %s %n", indexOfString2); //2

        // a 5ci index-dən başlayaraq hansı indexdə yerləşir. Bu metod string-də də eynidir. Uyğun olan stringin ilk simvolunun indexini qaytarır.
        int indexOfCharStart = s.indexOf('a', 5);
        System.out.println("IndexOf CharStart => " + indexOfCharStart); // 7

        int indexOfStringStart = s.indexOf("bcd", 5);
        System.out.println("IndexOf StringStart => " + indexOfStringStart); // 8


    }
}
