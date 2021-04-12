import java.util.Scanner;

public class C9E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1, sum = 0;

//      ** Output Data Set
        String peletString;

//      ** Input **
//        System.out.println("Enter Number1: ");
//        number1 = scanner.nextInt();


//      ** Calculation To Variables **
        for (int i=0; i< 100; i++){
            number1 = (int) Math.random()*100;
            sum += (number1 % 2 == 0)? number1 : 0;
        }

//      ** Set Pelet String **
        peletString = " Sum: " + sum;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
