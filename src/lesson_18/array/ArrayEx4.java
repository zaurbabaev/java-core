package lesson_18.array;

import java.util.Arrays;

public class ArrayEx4 {
    public static void main(String[] args) {

        int arr[] = {1, 9, 3, -8, 0, 5, 4, 1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int foundIndex = Arrays.binarySearch(arr, 3); // sortlaşdırılmış massivdə verilmiş dəyərin index-ini tapır.
        System.out.println(foundIndex);

        int foundedIndex2 = Arrays.binarySearch(arr, 2); // Element tapılmasa bizə mənfi index qayıdır. Bunu hesablamağın qaydası əgər verilmiş ədəd massiv daxilində olsa idi onun yerini tapırıq sonra üzərinə +1 gələrək qarşısına - əlavə etməklə mənfi indexi tapa bilərik.
        System.out.println(foundedIndex2);

    }
}
