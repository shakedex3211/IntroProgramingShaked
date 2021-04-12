import java.util.Scanner;

public class C8E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number, sumDigits = 0;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number: ");
        number = scanner.nextInt();

//      ** Input Test **

//      ** Calculation To Variables **
        while (number > 0){
            sumDigits += number %10;
            number /= 10;
        }

//      ** Set Pelet String **
            peletString = "Sum Digits: " + sumDigits;

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
