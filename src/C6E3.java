import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class C6E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int number2;
        int number3;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number 1: ");
        number1 =  scanner.nextInt();
        System.out.println("Enter Number 2: ");
        number2 =  scanner.nextInt();
        System.out.println("Enter Number 3: ");
        number3 =  scanner.nextInt();

//      ** Calculation To Variables **

//      ** Set Pelet String **
        peletString = "MAx Number is : " + Math.max(number1, Math.max(number2,number3));

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
