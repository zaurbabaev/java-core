package lesson_8;

/* final */
public class NonAccessModifiersEx {

    public final int a = 10; // by default readonly

    public static void main(String[] args) {
        NonAccessModifiersEx ex = new NonAccessModifiersEx();
//        ex.a = ex.a * 2; // final dəyişilməzdir belə yazmaq olmaq
        System.out.println(ex.a);
    }
}
