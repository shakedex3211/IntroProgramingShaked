import java.util.Scanner;

public class C8E24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1, max1 = 0;
        int number2;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter Number 2: ");
        number2 = scanner.nextInt();

//      ** Calculation To Variables **
        for (int i =0; i< Math.max(number1,number2) / 2 + 1; i++){
            if (number1 % i == 0 && number2 % i == 0){
                max1 = (max1 < i ) ? i : max1;
            }
        }
//      ** Set Pelet String **
        peletString = "Max Div Number: " + max1 ;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
