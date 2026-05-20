package homework.lesson19;

public class Exercisses {

    public static String[] abc(String[]... array) {
        int length = 0;
        for (String[] s : array) {
            length += s.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                target[count] = string;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "bye"});

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();


    }

}
