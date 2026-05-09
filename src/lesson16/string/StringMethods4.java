package lesson16.string;

public class StringMethods4 {
    public static void main(String[] args) {

        String s = "PrIVet:2;";

        String lowerCase = s.toLowerCase();
        System.out.println("Lowercase => " + lowerCase);

        String upperCase = s.toUpperCase();
        System.out.println("Uppercase => " + upperCase);

        boolean contains = s.contains("t:2");
        System.out.println("Contains => " + contains); // true
    }
}
