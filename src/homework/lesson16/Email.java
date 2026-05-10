package homework.lesson16;

public class Email {

    // ya@yahoo.com; on@mail.ru; ona@gmail.com;
    public static void getEmail(String email) {

        int indexOfAt = 0; // @
        int dot = 0; // .
        int indexOfSemicolon = 0; // ;

        while (indexOfSemicolon < email.length() - 1) {
            indexOfAt = email.indexOf('@', indexOfSemicolon);
            dot = email.indexOf('.', indexOfSemicolon);
            indexOfSemicolon = email.indexOf(';', indexOfSemicolon + 1);

            System.out.println(email.substring(indexOfAt + 1, dot));
        }
    }


    public static void getEmail2(String emails) {
        String[] arr = emails.split(";");

        for (String email : arr) {
            email = email.strip();

            if (!email.isEmpty()) {
                int at = email.indexOf('@');
                int dot = email.indexOf('.');

                System.out.println(email.substring(at + 1, dot));
            }
        }

    }


    public static void main(String[] args) {

        getEmail("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
        getEmail2("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}
