package lesson_15;

public class DoWhileEx3 {

    public static void main(String[] args) {

        do {
            System.out.println("Hello World"); // sonsuz dövr (infinity loop)
        } while (true);


        // burada while icra olunmayacaq o unreachable statementdir. Çünki yuxarıdakı do while infinity loopdur.
//        while (10 == 10) {
//            System.out.println("Hello World");
//        }


    }
}
