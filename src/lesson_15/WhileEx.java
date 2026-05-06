package lesson_15;

public class WhileEx {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println(i); // loopumuz 10 olduqda dayanacaq. Loopdan sonra i-ni çapa versək i = 11 olacaqdır.
        // Yəni whiledə yoxlama zamanı 11<=10 false qaytarır və onun daxilindəki sout-a növbə çatmır ona gördədə daxilindəki i = 10 olaraq qalır.
        // Amma sloopdan sonra i-nin dəyərini yoxlasaq o 11 olur.
    }
}
