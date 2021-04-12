import java.util.Scanner;

public class C8E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int denominator;
        int max;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Denominator: ");
        denominator = scanner.nextInt();
        System.out.println("Enter Max Value: ");
        max = scanner.nextInt();

//      ** Input Test **

//      ** Calculation To Variables **
        for (int i = 0; i <= max; i++)
            if (i % denominator == 0 && denominator != 0)
                System.out.println(i);

//      ** Set Pelet String **
            peletString = " ";

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
