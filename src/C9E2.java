import java.util.Scanner;

public class C9E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int number2;
        int min,max;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter Number 2: ");
        number2 = scanner.nextInt();

//      ** Calculation To Variables **
        min = Math.min(number1,number2);
        max = Math.max(number1,number2);
        for (int i =min; i<= max; i++){
            System.out.println("Min: "+i+" To Max: "+max--);
        }
//      ** Set Pelet String **
        peletString = " ";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
