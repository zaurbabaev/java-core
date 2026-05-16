package lesson_18.array;

public class ArrayEx5 {

    public static void main(String[] args) {

        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[] array2 = {1, 9, 3, -8, 0, 5, 4, 1};

        System.out.println(array1 == array2); // false

        int[] array3 = array1;
        System.out.println(array1 == array3); // true

        array1[1] = 0; // dəyəri dəyişirik.
        array2[5 - 3] = 4;
        System.out.println(array2[2]);
        array1[array1.length] = 10; // Compilator heç bir error göstərməyəcək. Amma run olduqda array1-in sonuncu indexi 7 olduğundan length -sə bizə 8 qaytarır. ArrayIndexOutOfBoundsException atacaq



    }
}
