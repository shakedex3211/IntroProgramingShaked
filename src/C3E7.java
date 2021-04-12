import java.util.Scanner;

public class C3E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;

//      ** Output Data Set
        String peletString;

//      ** Input **
        do {
            System.out.println("Enter 3 Digit Number: ");
            number = scanner.nextInt();

        } while (number > 999 || number < 100);




//      ** Calculation To Variables **
        peletString = "Hunderds Number is : " + ((number / 100 )% 10);

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
