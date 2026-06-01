package homework.lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NoRepeat {

    public ArrayList<String> abc(String... s) {
        ArrayList<String> list = new ArrayList<>();
        for (String string : s) {
            if (!list.contains(string)) {
                list.add(string);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }

    public ArrayList<String> abc2(String... s) {
        ArrayList<String> list = Arrays.stream(s)
                .distinct()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);

        return list;
    }

    public ArrayList<String> abc3(String... s) {
        ArrayList<String> list = new ArrayList<>(new TreeSet<>(Arrays.asList(s)));
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {

        NoRepeat np = new NoRepeat();
        np.abc3("privet", "ok", "poka", "privet", "kak dela?", "ok", "hello");
    }
}
