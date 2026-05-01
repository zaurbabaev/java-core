package lesson_12;

/*
Flow control (idarəetmə axını) — proqramın hansı əmrləri hansı ardıcıllıqla və hansı şərtlərlə icra edəcəyini müəyyən edən mexanizmdir.
3 hissəyə bölünür
selection- şərt seçimi - proqram qərar verir - bu şərt doğrudursa bunu et, əks halda başqasını et. if/else, switch
loop - dövr - eyni əməliyyatı bir neçə dəfə icra etmək - for, while, do while
jump - keçid əmrləri - continue, break və return
*/

public class IfExample {

    public static void main(String[] args) {
        int a = 30;
        if (a < 20) {
            System.out.println("\"a\" is less than 20");
        } else {
            System.out.println("\"a\" is greater than 20");
        }
    }
}
