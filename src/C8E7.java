import java.util.Scanner;

public class C8E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;
        int max = 0;

//      ** Output Data Set
        String peletString;

//      ** Input **
        do {
            System.out.println("Enter Denominator: ");
            number = scanner.nextInt();
            if (number > 0 && max < number){
                max = number;
            }

        } while (number <= 0);

//      ** Input Test **

//      ** Calculation To Variables **

//      ** Set Pelet String **
            peletString = "Max Number: " + max;

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
