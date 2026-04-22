package lesson_8;

// constant primitive data type
public class Test1 {
    public final int a;
    public static final int b = 30; // static dəyişəndən istifadə etdikdə ona mütləq olaraq dəyər verilməlidir.

    Test1() {
        a = 10;
    }

    Test1(boolean b) {
        a = 15;
    }

    public void abc(short s) {
        final byte b = 10;
        System.out.println(s + b);
    }

    public void abc(int s) {
        final byte b; // belə yaza bilərik çünki local dəyişənlərin default dəyəri olmur
        b = 20;
        System.out.println(s + b);
    }

    public void finalParameter(final int a) {
//        artıq burada a dəyişilə bəlməz
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1(true);
        System.out.println(t1.a);

        Test1 t2 = new Test1();
        System.out.println(t2.a);

        t2.abc((short) 12);
        t2.abc(12);
    }
}
