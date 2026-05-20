package lesson_19.forEach;

// massivdəki elementləri toplayaq
public class Test1 {

    public static void main(String[] args) {

        int[] array = {0, 6, 4, 1};

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        System.out.println(sum);
    }


}
