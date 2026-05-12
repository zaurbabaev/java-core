package lesson_17.stringbuilder;

public class StringBuilderMethods3 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Good Day!!!!");
        StringBuilder sb2 = sb1.insert(4, "55"); // müəyyən indexə yeni dəyər əlavə etmək üçündür. 4cü indeksə 55 əlavə edirik. Sağdakılar sağa sürüşür.
        System.out.println(sb1); // Good55 Day!!!!
        System.out.println(sb2); // Good55 Day!!!!

        System.out.println(sb1.insert(sb1.length(), "Hello")); // length 14-dür. 14cü indexə yəni sona Hello əlavə olundu.

        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3, 6); // 3cü indexdən 6-cıya qədər olanları silir. 3 daxildir 6 yox
        System.out.println(sb10);// HelWorld

        StringBuilder sb11 = new StringBuilder("Hello World");
        sb11.deleteCharAt(6); // W silinir
        System.out.println(sb11); // Hello orld

        sb11.reverse(); // sondan əvvələ çevirir
        System.out.println(sb11); // dlro olleH

        StringBuilder sb12 = new StringBuilder("Vsem privet"); // capacity 27. 17 simvol + 10 default capacity
        sb12.replace(0, 5, "Pete"); // verilmiş indexləri yeni stringlə dəyişdirir. 2ci index həmişəki kimi daxil deyil.
        System.out.println(sb12); // Peteprivet

        System.out.println(sb12.length()); // length 10
        int capacity = sb12.capacity();
        System.out.println(capacity); // 27 Ona görəki sb12 ilkin olaraq capacity-si 27 idi (Vsem Privet). Java performan üçün replacedə dəyişsə belə ilkin capacitysini saxlayır.




    }
}
