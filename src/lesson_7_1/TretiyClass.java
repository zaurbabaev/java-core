package lesson_7_1;


public class TretiyClass extends lesson_7.Employee {

    TretiyClass() {
        super(123.5);
    }

    public static void main(String[] args) {
        TretiyClass tretiyClass = new TretiyClass();
        System.out.println(tretiyClass.salary);
        tretiyClass.dvoynayaZp();
    }
}
