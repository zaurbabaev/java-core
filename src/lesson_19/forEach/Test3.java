package lesson_19.forEach;

public class Test3 {
    public static void main(String[] args) {

        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};
        System.out.println("Length is " + array.length); // 3

        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
