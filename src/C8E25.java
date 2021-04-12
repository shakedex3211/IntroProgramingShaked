import java.util.Scanner;

public class C8E25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int number2;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter Number 2: ");
        number2 = scanner.nextInt();

//      ** Calculation To Variables **
        for (int i =number1; i< number2; i++){
            System.out.println(i);
        }
//      ** Set Pelet String **
        peletString = " ";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
