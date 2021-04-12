import java.util.Scanner;

public class C9E6 {
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
            sum += Math.pow(number1,i);

//      ** Set Pelet String **
        peletString = "Sum to N:"+sum;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
