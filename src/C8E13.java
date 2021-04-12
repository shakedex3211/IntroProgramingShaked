import java.util.Enumeration;
import java.util.Scanner;

public class C8E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int x, dig, index = 0;

//      ** Output Data Set

//      ** Input **
        System.out.println("Enter Number x: ");
        x = scanner.nextInt();
        System.out.println("Enter Number dig: ");
        dig = scanner.nextInt();

//      ** Input Test **

//      ** Calculation To Variables **
        while (x > 0){
            if (x % 10 == dig)
                index++;
            x /= 10;
        }

//      ** Set Pelet String **
        String peletString = "Dig Show " + index
                + " Times in " + x;

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
