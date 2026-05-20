package lesson_19.forEach;

public class Test5 {
    public static void main(String[] args) {

        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
