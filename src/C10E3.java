import java.util.Scanner;

public class C10E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1=0, sum=0;
        boolean isCorrect = true;

//      ** Output Data Set
        String peletString;

//      ** Input **
//        System.out.println("Enter Number1: ");
//        number1 = scanner.nextInt();


//      ** Calculation To Variables **
        for (int i=0; i< 365 && isCorrect; i++){
            number1 = (int) Math.random()*100;
            isCorrect = (number1 <40 && number1 > -5);
        }

//      ** Set Pelet String **
        peletString = (isCorrect)? "Corect " : "Incorrect";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
