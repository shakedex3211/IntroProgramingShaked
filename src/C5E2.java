import java.util.Scanner;

public class C5E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int number2;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number 1: ");
        number1 = ((int) scanner.nextDouble());
        System.out.println("Enter Number 2: ");
        number2 = ((int) scanner.nextDouble());

//      ** Calculation To Variables **

//      ** Set Pelet String **
        peletString = "Max number is : " + Integer.max(number1,number2);

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
