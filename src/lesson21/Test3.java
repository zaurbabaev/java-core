package lesson21;

// overload metodlar həm primitive həmdə referance parametr qəbul edə bilər.
public class Test3 {

    public void abc(String s) {
        System.out.println(s);
    }

    public void abc(boolean b) {
        System.out.println(b);
    }

    public StringBuilder abc(StringBuilder sb) {
        System.out.println(sb);
        return new StringBuilder("poka");
    }
}
