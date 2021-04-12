import java.util.Scanner;

public class C8E16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1, number2, i1,i2;
        int calculateNumbers = 0;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter Number2: ");
        number2 = scanner.nextInt();

//      ** Calculation To Variables **

//      ** Set Pelet String **
        peletString = "Multiple Number: " + Math.multiplyExact(number1,number2);

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
