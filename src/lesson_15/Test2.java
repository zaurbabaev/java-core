package lesson_15;

public class Test2 {

    // Tutaqki biz kazinoda oynayırıq və 100azn pulumuz var hər gediş 10 azn-dir və biz pulumuzun qurtarmasına qədər oynayırıq.
    public static void main(String[] args) {

        int money = 100;
        while (money > 0) {
            System.out.println("Delay stavku");
            System.out.println("Vi proigrali");
            money -= 10;
        }
    }

}
