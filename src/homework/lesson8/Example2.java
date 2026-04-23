package homework.lesson8;

public class Example2 {
    public static final double PI = 3.14;

    public static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public void showInfo(double radius) {
        System.out.printf("Radius %.2f %n", radius);
        System.out.printf("Area: %.2f %n", areaOfCircle(radius));
        System.out.printf("Circumference: %.2f %n", circumference(radius));
    }
}

class Example2Test {
    public static void main(String[] args) {
        double areaOfCircle = Example2.areaOfCircle(25);
        System.out.println(areaOfCircle);
        double circumference = Example2.circumference(25);
        System.out.println(circumference);
        Example2 ex=new Example2();
        ex.showInfo(25);
    }
}