package homework.lessson10.p4.p5;

import homework.lessson10.p1.A;
import homework.lessson10.p1.p2.B;
import homework.lessson10.p1.p2.p3.C;
import homework.lessson10.p4.D;

//import static homework.lessson10.p1.p2.B.*; təkcə bütün staticləri import etmək eçen

public class E {
    public static void main(String[] args) {

        A classA = new A();
        classA.show();

        B classB = new B();
        classB.show();
        System.out.println("Static variable in B class " + B.staticVariable);

        C classC = new C();
        classC.show();

        D classD = new D();
        classD.show();


    }
}
