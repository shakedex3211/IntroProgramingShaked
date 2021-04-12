import java.util.Scanner;

public class C10E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1=0, sum=0;
        boolean isEqual = false;

//      ** Output Data Set
        String peletString;

//      ** Input **
//        System.out.println("Enter Number1: ");
//        number1 = scanner.nextInt();


//      ** Calculation To Variables **
        for (int i=0; i< 1000; i++){
            number1 = (int) Math.random()*100;
            sum+= number1;
            isEqual = (sum == number1)? true : false;
        }

//      ** Set Pelet String **
        peletString = (isEqual)? "Equal " + number1 : "Nah";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
