import java.util.Scanner;

public class C8E17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1, number2;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter Number2: ");
        number2 = scanner.nextInt();

//      ** Calculation To Variables **

//      ** Set Pelet String **
        peletString = "Pow Number: " + Math.pow(number1,number2);

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
