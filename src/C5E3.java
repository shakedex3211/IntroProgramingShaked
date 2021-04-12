import java.util.Scanner;

public class C5E3 {
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

//      ** Calculation To Variables **

//      ** Set Pelet String **
        peletString = (number1 % 2 == 0)? "Even" : "Odd";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
