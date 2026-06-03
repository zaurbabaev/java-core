package lesson21;

public class Test2 {
    public static void main(String[] args) {

        String s1, s2;
        s1 = new String("privet"); // privet obyekti silinməyə namizəd
        s2 = new String("poka");
        s1 = s2;
        String s3 = s1;
        s1 = null; // burada s2 və s3 poka obyektinə hələdə referance saxlayır.
    } // main metodu bitdiyindən poka obyektidə silinəcək
}
