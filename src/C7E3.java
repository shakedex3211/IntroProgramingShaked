import java.awt.*;
import java.util.Scanner;

public class C7E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int x,y,a,b,c,d,e,f;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter A: ");
        a = scanner.nextInt();
        System.out.println("Enter B: ");
        b = scanner.nextInt();
        System.out.println("Enter C: ");
        c = scanner.nextInt();
        System.out.println("Enter D: ");
        d = scanner.nextInt();
        System.out.println("Enter E: ");
        e = scanner.nextInt();
        System.out.println("Enter F: ");
        f = scanner.nextInt();

//      ** Input Test **
        if (a == 0 || e ==0 || b == 0 || d == 0 ||
                (a*e) -(b*d) == 0)
            System.out.println("Equation has no solution");
        else {

//      ** Calculation To Variables **


//      ** Set Pelet String **
            peletString = "X: " + ((c*e)-(b*f))/((a*e)-(b*d)) + '\n'
                          + "Y: " + (a*f-c*d)/(a*e-b*d);

//      ** Output **
            System.out.println(peletString);
        }
        scanner.close();
    }
}
