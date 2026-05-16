package homework.lesson18;

import java.util.Arrays;

public class Sortirovka {

    // selectiona yaxın custom sorting
    public static int[] sortirovka(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    // bubble sorting
    public static int[] bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 80, 43, 1, -5, 8, 32};
//        System.out.println(Arrays.toString(sortirovka(array)));
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
