package lesson_18.array;

public class StringsConstructor {
    public static void main(String[] args) {

        char[] array = new char[]{'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);


        StringBuffer sb = new StringBuffer("ok");
        sb.append(array, 2, 3); // massivin 2-ci indeksindən başlayaraq 3 elementini sb-yə əlavə et
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Hello World");
        char[] array1 = {'p', 'r', 'i', 'v', 'e', 't'};
        sb2.insert(1, array1, 2, 3); // sb2-nin 1ci index-indən başlayaraq arrayın 2ci indexindən 3 elementi əlavə edirik.
        System.out.println(sb2);
    }
}
