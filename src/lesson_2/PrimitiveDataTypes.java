package lesson_2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
//      byte b3 = 1000; // error

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 10000000000L;


        float f1 = 1.1f;
        float f2 = 20;  //int float daxilinə yerləşdiyindən belə yaza bilirik
        // float f3=20.0; // error verəcək sonuna mütləq olaraq F və ya f yazılmalıdır.
        float f3 = 20.0F;

        double d1 = 5.5;
        double d2 = 87.65;

        char c1 = 'a';
        char c2 = 300;
        char c3 = '5';
        char c4 = '\u9098';

        System.out.println(c2);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);




    }
}
