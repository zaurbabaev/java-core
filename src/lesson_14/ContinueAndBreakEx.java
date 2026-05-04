package lesson_14;

//
public class ContinueAndBreakEx {

    public static void main(String[] args) {

        // 1-dən 100-ə qədər olan ədələr çapa veriləcək. 10 ədədi çapa verilməyəcək və 55 ədədinə tam bölünmə olduqda dövr bitəcəkdir.

        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }
            if (i % 55 == 0) {
                break;
            }
            System.out.println(i);
        }


    }
}
