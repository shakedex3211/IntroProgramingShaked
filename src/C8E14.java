import java.util.Scanner;

public class C8E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;
        int reversedNumber = 0;
        int tempNumber;
        int position;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number: ");
        number = scanner.nextInt();

//      ** Calculation To Variables **
        position = Integer.toString(number).length();
        while (number > 0){
            reversedNumber += number % 10 *(Math.pow(10,--position));
            number/=10;
        }
//      ** Set Pelet String **
        peletString = "Reversed number : " + reversedNumber;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
