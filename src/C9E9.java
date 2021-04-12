import java.util.Scanner;

public class C9E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1, number2, min,max;
        int sum=0;

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
        for (int i=min; i<=max; i++)
           System.out.println("Y=x^2 +5 : " + (Math.pow(i,2)+5.0));


//      ** Set Pelet String **
        peletString = "Sum: " + sum;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
