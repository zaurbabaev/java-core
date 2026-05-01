package lesson_12;

public class Test3 {
    public void maximum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Maximum " + a);
        } else if (b > a && b > c) {
            System.out.println("Maximum " + b);
        } else {
            System.out.println("Maximum " + c);
        }
    }

    void abc() {
        String str;
        int a = 10;
        
        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10) {
            str = "poka";
        }
        /*System.out.println(str);*/ // str-i elan edildikdən sonra ona dəyər verməsək. pritln daxilində str Variable 'str' might not have been initialized mesajını verəcək.
        // Ona görədə str="" yazılması düzgündür və sout-dan əvvəl else yazaraq orada str-ə mənimsətmə edirik. Şərt ödənməsə elseyə daxil olsun və str-ə mənimsətmə edilsin.
    }

    // yuxarıdakı belə yazılmalıdır.
    void abc1() {
        String str;
        int a = 10;

        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10) {
            str = "poka";
        } else {
            str = null;
        }

        System.out.println(str);
    }

    // Belədə yaza bilərik. str elan edilərkən ona boş dəyər veririk.
    void abc2() {
        String str = "";
        int a = 10;

        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10) {
            str = "poka";
        }

        System.out.println(str);
    }

    public static void main(String[] args) {

        Test3 t = new Test3();
        t.maximum(12, 5, 9);
    }
}
