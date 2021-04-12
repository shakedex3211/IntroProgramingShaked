import java.util.Scanner;

public class C8E10 {
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
        while (number < 10)
            number /= 10;

//      ** Set Pelet String **
            peletString = "Most Left Digit is: " + number;

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
