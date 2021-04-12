import java.util.Scanner;

public class C7E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int year;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Year: ");
        year = scanner.nextInt();

//      ** Input Test **

//      ** Calculation To Variables **
        peletString = ((year % 4 == 0
                        && (year % 100 != 0 || (year % 100 != 0 && year % 400 == 0)))
                        ? "Pregnant" : "Non") ;

//      ** Set Pelet String **

            peletString = " ";

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
