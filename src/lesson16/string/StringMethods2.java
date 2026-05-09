package lesson16.string;

public class StringMethods2 {

    public static void main(String[] args) {

        String s = new String("abcdefgabcd");

        boolean startsWith = s.startsWith("abc");
        System.out.println("Starts with => " + startsWith); // true

        // Verilmi. string 7ci simvoldan başlayır ?
        boolean startsWithInIndex7 = s.startsWith("abc", 7);
        System.out.println("Starts withInIndex 7 => " + startsWithInIndex7);

        boolean endsWith = s.endsWith("abcd");
        System.out.println("Ends with => " + endsWith); // true

        // 3cü indexdən başlayaraq yerdə qalan stringi qaytar. artıq yeni bir String yaranmış olur. Stringin heç bir metodu onu dəyişə bilmir. String İMMUTABLE-dir
        String substring = s.substring(3);
        System.out.println("Substring => " + substring); // defgabcd


        // Stringin verilmiş indexlər arası hissəsini qaytarmaq üçün isə 2 index verilirki, sonuncu indexə daxil olan string nəzərə alınmır.
        String indexInterval = s.substring(3, 8);
        System.out.println("IndexInterval => " + indexInterval); // defga

        // bizim nümunədə Stringin index sayı 10-dur. Əgər biz substring vasitəsilə sözün son simvounuda götürmək istəsək o zaman +1 vahid indexi +1 vahid çox yazırıq.
        // Amma biz adi substringlədə bun yazırıq bu zaman 2ci indexi yazmasaqda göstərdiyimiz indexdən başlayaraq sona qədər bizə bütöv string qayıdacaq
        String substringWithLastSymbol = s.substring(3, 11);
        System.out.println("SubstringWithLastSymbol => " + substringWithLastSymbol); // defgabcd

        String s1 = "   dsddd    ";
        String trim = s1.trim();
        System.out.println("Trim => " + trim);



    }
}
