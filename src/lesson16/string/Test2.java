package lesson16.string;

// Şerdə böyük hərf gələndə yeni sətirdən başlasın
public class Test2 {
    public static void main(String[] args) {

        String s1 = "Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала: " +
                "Ты лучше голодай, чем что попало есть, И лучше будь один, чем вместе с кем попало.";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;

        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (i != 0 && c1 != ',' && c1 != '.' && c1 != ':' && c1 != ' ' && c1 == c2) {
                System.out.println();
            }
            System.out.print(c1);
        }
    }
}
