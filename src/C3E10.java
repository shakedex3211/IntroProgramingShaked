import java.util.Scanner;

public class C3E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number;
        int even;

//      ** Output Data Set
        String peletString;

//      ** Input **

        System.out.println("Enter Number: ");
        number = ((int) scanner.nextDouble());

//      ** Calculation To Variables **
        even = (number % 2 == 0)? number+2 : number+1;

//      ** Set Pelet String **
        peletString = "Next Even Number : " + even;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
