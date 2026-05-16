package lesson_18.array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {

        // declaration (elan edilmə). declaration massiv yaradıb onun dəyərinin null referans olmasıdır. yəni array obyekti yaranır amma o referance saxlamır. null olur
        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] array4;
        double[] array7;

        // allocation - yerləşdirmə. massiv üçün yaddaşda yer təyin edilir. Massivin ölçüsü göstərilir - daxilində neçə element saxlayacaqsa o göstərilir və onların hər birinin dəyəri massivin tipinə uyğun olaraq default dəyərlərdir.
        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2]; // iki ölçülü massiv daxilində 4-ədəd 1 ölçülü massiv hər birinin daxilində 2 element.
        array4 = new int[3][];
        array7 = new double[2];

        System.out.println(array1.length);

        // initialization dəyər mənimsətmə. static initialization - əllə dəyər daxil edilir. dinamik initialization for vasitəsilə dəyər mənimsətmə.

        // static initialization
        array2[0] = "privet";
        array2[1] = "poka";
        array2[2] = "ok";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double[] array5; // declaration
        array5 = new double[3]; // allocation
        array5[0] = 2.5; // static initialization
        array5[1] = 3.5; // static initialization
        array7 = array5;

        System.out.println(Arrays.toString(array5)); // [2.5, 3.5, 0.0]

        array3[1] = array5; // array3-ün və array5-in uzunluğu eyni olduğundan bunu edə bilərik
        System.out.println(Arrays.deepToString(array3)); // [[3.14, 0.0], [2.5, 3.5, 0.0], [0.0, 3.14], [0.0, 0.0]]


    }
}
