package homework.lesson5;

public class BankAccount {

    double balance = 250.60;

    void popolnenieScheta(double summa) {
        System.out.printf("Balans do popolneniya: %.2f %n", balance);
        System.out.printf("Summa popolneniya: %.2f %n", summa);
        balance += summa;
        System.out.printf("Konechniy balans: %.2f %n", balance);
    }

    void snyatieSoScheta(double summa) {
        System.out.printf("Balans do snyatiya: %.2f %n", balance);
        System.out.printf("Summa snyatiya: %.2f %n", summa);
        balance -= summa;
        System.out.printf("Konechniy balans: %.2f %n", balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.popolnenieScheta(200);
        System.out.println();
        bankAccount.snyatieSoScheta(100);
    }
}
