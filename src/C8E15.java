import java.util.Scanner;

public class C8E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number, tempNumber, position;
        int reversedNumber = 0;
        boolean isPolindrom = true;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number: ");
        number = scanner.nextInt();
        tempNumber = number;

//      ** Calculation To Variables **
        position = Integer.toString(number).length();
        while (tempNumber > 0){
            reversedNumber += tempNumber % 10 *(Math.pow(10,--position));
            tempNumber/=10;
        }

        while ( number > 0 && isPolindrom){
            if (number % 10 != reversedNumber % 10){
                isPolindrom = false;
            }

            number /=10;
            reversedNumber /=10;
        }

//      ** Set Pelet String **
        peletString = "Polindrom Number: " + ((isPolindrom) ? "Yes" : "No");

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
