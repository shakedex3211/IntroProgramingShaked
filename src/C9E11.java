import java.util.Scanner;

public class C9E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1, number2, min, max;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter Number2: ");
        number2 = scanner.nextInt();
        min = Math.min(number1,number2);
        max = Math.max(number1,number2);

//      ** Calculation To Variables **
        for (int i=min; i<= max; i++)
            System.out.print(i +", ");
        System.out.println();
        for (int i=max; i>= min; i--)
            System.out.print(i +", ");

//      ** Set Pelet String **
        peletString = " ";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
