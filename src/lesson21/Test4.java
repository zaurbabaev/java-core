package lesson21;

// parametrdə int istənilirsə biz char göndərə bilərik
public class Test4 {

    void abc(int i) {
        System.out.println(i);

    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        char c = 'a';
        test4.abc(c);
    }
}
