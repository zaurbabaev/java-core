package lesson_17.stringbuilder;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!"); // capacity 16 + 11 (16 defaukt capacity-dir 11 isə good day!!!! simvol sayıdır )
        StringBuilder sb3 = new StringBuilder(50); // capacity-ni öncədən veririk.
        StringBuilder sb4 = new StringBuilder(sb2); // Dəyəri sb2 kimi olan başqa bir obyekt saxlayacaq. Yəni sb4-ün dəyəri Good Day!!!! olacaq, lakin onun sb2 obyekti ilə heç bir əlaqəsi olmayacaq.



    }
}
