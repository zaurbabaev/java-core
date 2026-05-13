package homework.lesson17;

public class Equality {

    public static boolean equals(StringBuilder sb1, StringBuilder sb2) {
        if (sb1 == null || sb2 == null) {
            return false;
        }
        if (sb1.length() != sb2.length()) {
            return false;
        }

        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals2(StringBuilder sb1, StringBuilder sb2) {
        return sb1.toString().contentEquals(sb2);
    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println(equals(sb1, sb2));
        System.out.println(equals2(sb1, sb2));
    }
}
