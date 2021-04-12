import java.util.Scanner;

public class C8E23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number: ");
        number1 = scanner.nextInt();

//      ** Calculation To Variables **
        for (int i =0; i< number1 / 2 + 1; i++){
            if (number1 % i == 0){
                System.out.println(i);
            }
        }
//      ** Set Pelet String **
        peletString = " ";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
