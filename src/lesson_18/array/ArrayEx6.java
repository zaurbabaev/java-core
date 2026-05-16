package lesson_18.array;

public class ArrayEx6 {

    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max Value is: " + max + " Min Value is: " + min);
    }

    public static void main(String[] args) {
        double[] array = {23.4, 20.6, 100.3, -75.2, 3.6, 0};
        maxMin(array);
    }
}
