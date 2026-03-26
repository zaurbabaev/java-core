package lesson_5;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "David";
        human.car = new Car2("red", "V8");
        human.bankAccount = new BankAccount(1, 200.5 );

        human.showInfo();
    }
}
