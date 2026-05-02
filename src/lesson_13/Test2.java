package lesson_13;

public class Test2 {

    public static void main(String[] args) {

        switch ("subbota") {
            case "ponedelnik":
                System.out.println("Rabota do 18:00");
                break;
            case "vtornik":
                System.out.println("Rabota do 18:00");
                break;
            case "sreda":
                System.out.println("Rabota do 18:00");
                break;
            case "chetverq":
                System.out.println("Rabota do 18:00");
                break;
            case "pyatnicha":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenye":
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dni nedeli ne sushestvuet");
        }


        // bunu sadə formada yazaq. Kodda Rabota do 18:00 təkrarlandığından onu 1 dəfə yazamaq olar.

        switch ("pyatnicha") {
            case "ponedelnik":
            case "vtornik":
            case "sreda":
            case "chetverq":
            case "pyatnicha":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenye":
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dni nedeli ne sushestvuet");
        }

    }
}
