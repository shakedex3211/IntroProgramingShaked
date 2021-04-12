import java.util.Scanner;

public class C8E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number: ");
        number = scanner.nextInt();

//      ** Input Test **

//      ** Calculation To Variables **

//      ** Set Pelet String **
            peletString = "Digit Length is: " + Integer.toString(number).length();

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
