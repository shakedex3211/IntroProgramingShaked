import java.util.Scanner;

public class C8E20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1, i = 1;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number9: ");
        number1 = scanner.nextInt();

//      ** Calculation To Variables **
        for (i = 1; i < number1 && i*i!=number1; i++){

        }

//      ** Set Pelet String **
        peletString = "Shoresh Number: " + i;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
