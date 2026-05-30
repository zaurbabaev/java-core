package lesson20.arrayList;

import java.util.Arrays;

/*
 * compare - lexicographical
 * mismatch - harada oxşarlıq pozulursa o index-ini qaytarır
 * */
public class Test11 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};

        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};

        System.out.println(Arrays.compare(array1, array2)); // birinci massiv 2cidən kiçikdirsə 0-dan kiçik rəqəm qayıdır. -1 (1-1, 2-2, 3-3, 4-5 4 ədədi 5-dən kiçikdir)
        System.out.println(Arrays.compare(array2, array1)); // birinci massiv 2cidən kiçikdirsə 0-dan kiçik rəqəm qayıdır. 1

        System.out.println((int) 'e'); // 101 privet sözündəki e-dir  (p - p, r - r, i - i, v - v, e - i)
        System.out.println((int) 'i'); // 105 privivka sözündəki i-dir

        System.out.println(Arrays.compare(array3, array4)); // 101 - 105 = -4 array3 array4-dən kiçikdir
        // massivlər eyni olduqda 0 qayıdacaq. tərəflərədn biri null ilə müqayisə edildikdə 1 qayıdır.

        System.out.println(Arrays.mismatch(array1,array2)); // 3
        System.out.println(Arrays.mismatch(array3,array4)); // 4


    }
}
