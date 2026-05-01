package lesson_12;

public class Test2 {
    public static void main(String[] args) {
        int salary = 800;

        if (salary < 200) {
            System.out.println("Z/P ochen nizkaya");
        } else if (salary < 400) {
            System.out.println("Z/P sredneqo razmera");
        } else if (salary < 600) {
            System.out.println("Z/P visokaya");
        } else {
            System.out.println("Z/P otlichnaya");
        }
    }
}
