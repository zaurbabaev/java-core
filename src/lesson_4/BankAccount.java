package lesson_4;

/* Class and object */

public class BankAccount {
    int id;
    String name;
    double balance;

    /* default dəyərlər vermək
    int id = 1;
    String name = "John";
    double age = 21;
    */
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Zaur";
        myAccount.balance = 12.35;


        yourAccount.id = 2;
        yourAccount.name = "Mike";
        yourAccount.balance = 2.00;


        hisAccount.id = 3;
        hisAccount.name = "Ivan";
        hisAccount.balance = 124.12;
    }
}
