import java.util.Scanner;

public class C6E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number: ");
        number =  scanner.nextInt();

//      ** Calculation To Variables **

//      ** Set Pelet String **
        peletString = ((number < 0) ? "Negetive"
                                      : (number == 0) ? "Zero" : "Positve");

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
