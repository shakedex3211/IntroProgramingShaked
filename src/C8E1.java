import java.time.YearMonth;
import java.util.Scanner;

public class C8E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int top;
        int month;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Top: ");
        top = scanner.nextInt();

//      ** Input Test **

//      ** Calculation To Variables **
        for (int i =1; i<=top; i++)
            System.out.println(i);

//      ** Set Pelet String **
            peletString = " ";

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
