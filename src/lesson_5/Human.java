package lesson_5;

public class Human {
    String name;
    Car2 car;
    BankAccount bankAccount;

    void showInfo() {
        System.out.printf("Name: %s car's color: %s balance %.2f %n", name, car.color, bankAccount.balance) ;
    }
}

class Car2 {
    String color;
    String engine;

    Car2(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

class BankAccount {
    int id;
    double balance;

    BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}