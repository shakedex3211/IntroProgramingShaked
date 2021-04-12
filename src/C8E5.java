import java.util.Scanner;

public class C8E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;
        int sum = 0;

//      ** Output Data Set
        String peletString;

//      ** Input **
        do {
            System.out.println("Enter Denominator: ");
            number = scanner.nextInt();
            if (number < 0)
                sum += number;

        } while (number != -99);

//      ** Input Test **

//      ** Calculation To Variables **

//      ** Set Pelet String **
            peletString = " " + sum;

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
