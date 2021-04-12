import java.util.Scanner;

public class C8E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;
        int min = Integer.MAX_VALUE;

//      ** Output Data Set
        String peletString;

//      ** Input **
        do {
            System.out.println("Enter Denominator: ");
            number = scanner.nextInt();
            if (number > 0 && min > number){
                min = number;
            }

        } while (number <= 0);

//      ** Input Test **

//      ** Calculation To Variables **

//      ** Set Pelet String **
            peletString = "Min Number: " + min;

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
