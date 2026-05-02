package homework.lesson13;

public class Month {

    public static void dayQuantity(int month) {
        String[] months = {"Yanvar", "Fevral", "Mart", "Aprel", "May", "Iyun", "Iyul", "Avqust", "Sentyabr", "Oktyabr", "Noyabr", "Dekabr"};

        switch (month) {
            case 2:
                System.out.println("Fevral -> bu ayda 28 gün var");
                break;
            case 4, 6, 9, 11:
                System.out.printf("%s -> bu ayda 30 gün var %n", months[month - 1]);
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("%s -> bu ayda 31 gün var %n", months[month - 1]);
                break;
            default:
                System.out.println("Belə bir ay yoxdur");
                break;
        }
    }

    public static void main(String[] args) {
        dayQuantity(3);
        Month.dayQuantity(6);
    }
}
