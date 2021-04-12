import java.util.Scanner;

public class C7E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int number2;
        int number3;
        int max, min, middle;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter Number2: ");
        number2 = scanner.nextInt();
        System.out.println("Enter Number3: ");
        number3 = scanner.nextInt();

//      ** Calculation To Variables **
        max = Math.max(number1,Math.max(number2,number3));
        min = Math.min(number1,Math.min(number2,number3));
        middle = (number1 + number2 + number3) - max - min;

//      ** Set Pelet String **
        peletString = "Biggest: " + max + '\n' + "Middle: " + middle + "Smallest: " + min;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
