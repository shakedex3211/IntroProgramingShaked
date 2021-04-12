import java.util.Scanner;

public class C5E5 {
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
        peletString = ((number1 == number2) ?
                            "Even"
                          : "Min number: " + Integer.min(number1,number2)
                            + '\n' + "Max number:" + Integer.max(number1,number2));

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
