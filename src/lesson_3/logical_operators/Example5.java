package lesson_3.logical_operators;

/*
   ^ bitwise exclusive or o zaman true qaytarır ki, bütün staementdə yalnız 1 true olsun
*/
public class Example5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println(a ^ b ^ c); // false

        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;
        System.out.println(b1 ^ b2 ^ b3 ^ b4); // false

        b1 = true;
        b2 = false;
        b3 = false;
        b4 = false;
        System.out.println(b1 ^ b2 ^ b3 ^ b4); //true




    }
}
