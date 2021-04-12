import java.util.Scanner;

public class C3E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;

//      ** Output Data Set
        String topRightDigit;

//      ** Input **
        System.out.println("Enter 4 Digit Number: ");
        number = scanner.nextInt();

//      ** Calculation To Variables **
        topRightDigit = "2nd Right Digit: " + ((number / 10 )% 10);

//      ** Output **
        System.out.println(topRightDigit) ;

        scanner.close();
    }
}
