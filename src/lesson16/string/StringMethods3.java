package lesson16.string;

public class StringMethods3 {

    public static void main(String[] args) {

        String s = new String("privet");

        String replace1 = s.replace('r', 'Z');
        System.out.println("Replace char => " + replace1); // pZivet

        String replace2 = s.replace('o', 'Z');
        System.out.println("Replace char => " + replace2); // Olmayan simvolu dəyişmək istəsək bizə artıq köhnə string yeni obyekt yaratmadan qayıdacaq. privet

        System.out.println(s == replace2); // true


        String replace3 = s.replace("vet", "vivka");
        System.out.println("Replace string => " + replace3); // privivka

        // Replace metodunda eyni charları deyişsək və onları == yoxlasaq true alacağıq.
        String s2 = "poka";
        String replaceChar2 = s2.replace('k', 'k');
        System.out.println(s2 == replaceChar2); // true

        String s3 = "privet";
        String s4 = " druq";
        System.out.println("Concat => " + s3.concat(s4));
        System.out.println("Concat alternativ =>" + s3 + s4);




    }
}
