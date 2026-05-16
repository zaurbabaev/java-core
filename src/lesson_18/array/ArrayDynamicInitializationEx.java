package lesson_18.array;

import java.util.Arrays;

public class ArrayDynamicInitializationEx {
    public static void main(String[] args) {

        String[] array1;
        int[][] array2;

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = "Privet " + i;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + j;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array2));

        int[] arr1 = new int[7];
        int[] arr2 = {1, 2, 3};
        int[] arr3;
        arr3 = new int[]{1, 2, 3};
        int[] arr4 = new int[]{1, 2, 3, 4};



    }
}
