package lesson20.arrayList;

import java.util.ArrayList;
import java.util.List;

// subList -> List
public class ArrayListMethodsPart3 {
    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1: " + al1); // al1: [one, two, three, four, five]

        List<String> subList = al1.subList(1, 3); // subString kimidir, SubList view-dir o list-dэn kənar mövcud deyil
        System.out.println("subList: " + subList);
        subList.add("six");
        System.out.println("subList: " + subList); // subList: [two, three, six] sublistə element əlavə etdikdə o list-dədə əlavə olunacaq
        System.out.println("al1: " + al1); // al1: [one, two, three, six, four, five]
        // biz list-ə add etdikdən sonra həmin listi yenədə işlədə bilərik. Lakin subList artıq istifadə etmək istəsək exception alacağıq.
        al1.add("seven");
        System.out.println("al1: " + al1);
        System.out.println("subList: " + subList); // ConcurrentModificationException. Artıq biz struktur modifikasiyalarını subList vasitəsilə etməliyik.






    }
}
