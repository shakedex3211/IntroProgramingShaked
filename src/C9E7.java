import java.util.Scanner;

public class C9E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int sum=0;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number: ");
        number1 = scanner.nextInt();

//      ** Calculation To Variables **
        for (int i=0; i<=number1; i++)
           System.out.print(i + ", ");
        System.out.println("");
        for (int i=0; i<=number1; i++)
            System.out.print(i*2 + ", ");


//      ** Set Pelet String **
        peletString = " ";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
