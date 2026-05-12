package lesson_17.stringbuilder;

public class StringBuilderMethods2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Good Day!!!!");
        sb1.append("22"); // StringBuilderi dəyişir. Biz ona müxtəlif tiplər verə bilirik.
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);
        sb1.append(sb1);
        System.out.println(sb1);


    }
}
