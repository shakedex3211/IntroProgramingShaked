import java.util.Scanner;

public class C5E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int number2;
        String result;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number 1: ");
        number1 = ((int) scanner.nextDouble());
        System.out.println("Enter Number 2: ");
        number2 = ((int) scanner.nextDouble());

//      ** Calculation To Variables **

//      ** Set Pelet String **
        peletString = "First Number is "
                        + ((number1 % number2 == 0) ? "Devided" : "Not Devided")
                        + " Second number"
                        + '\n'
                        + "Second number is "
                        + ((number2 % number1 == 0) ? "Devided" : "Not Devided")
                        + " First number";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
