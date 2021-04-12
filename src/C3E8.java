import java.util.Scanner;

public class C3E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;
        int sumDigits;

//      ** Output Data Set
        String peletString;

//      ** Input **
        do {
            System.out.println("Enter 2 Digit Number: ");
            number = scanner.nextInt();

        } while (number > 99 || number < 10);

//      ** Calculation To Variables **
        sumDigits = 0;
        while (number > 0 ){
            sumDigits += number % 10;
            number /= 10;
        }


//      ** Set Pelet String **
        peletString = "Sum of the Digits is : " + sumDigits;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
