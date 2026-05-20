package lesson_19.forEach;

public class ForEachEx {
    public static void main(String[] args) {

        int[] array = {0, 6, 4, 1};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();

        for (int num : array) {
            System.out.print(num+" ");
        }

    }
}
