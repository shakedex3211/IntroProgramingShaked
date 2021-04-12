import java.util.Scanner;

public class C6E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;

//      ** Output Data Set
        String peletString;

//      ** Input **
        do {
            System.out.println("Enter Number 1: ");
            number1 = scanner.nextInt();
        } while (number1 > 0 && number1 < 10_000);

//      ** Calculation To Variables **
        while (number1 > 0) {
            System.out.println(number1%10);
            number1 /= 10;
        }

//      ** Set Pelet String **
        peletString = "Done";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
