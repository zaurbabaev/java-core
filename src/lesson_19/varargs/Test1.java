package lesson_19.varargs;

public class Test1 {

    // parametrdə elementlər çoxaldıqca bir hər birinə uyğun metod yazmalıyıq. Bunu etməmək üçün varargs-dan istifdə etirik. variable arguments
    public static void summa(int a, int b) {
        System.out.println(a + b);
    }

//    public static void summa(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }

    public static void summa(int... a) {
        int result = 0;
        for (int num : a) {
            result += num;
        }
        System.out.println(result);
    }

    // 2 eyni adlı metodlarda birində massiv digərində varargs olarsa compile time error baş verəcək çünki varargsın özəyi massivdir.
    public static void summa(String s, int... a) { // varargsla birlikdə başqa parametr olarsa o birinci olmalıdır. Varargs olmayada bilər ona görədə varargs sonda gəlməlidir.
        int result = 0;
        for (int num : a) {
            result += num;
        }
        System.out.println(s + " " + result);
    }


    public static void main(String[] args) {
        summa(12, 9, 5);
        summa(12, 5);
        summa("ok", 14, 5);
        summa("hello", new int[]{1, 2, 4}); // varargsın əasasını massiv təskkil etdiyindən biz argumenti belədə ötürə bilərik.
    }
}
