import java.util.Arrays;
import java.util.Scanner;

public class C10E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int votes[] = new int[5], number1;
        boolean isCorrect = true;

//      ** Output Data Set
        String peletString;

//      ** Input **
//        System.out.println("Enter Number1: ");
//        number1 = scanner.nextInt();
        for (int i=0; i<5;i++)
            votes[i] = 0;

//      ** Calculation To Variables **
        for (int i=0; i< 170 && isCorrect; i++){
            do{
                number1 = (int) (Math.random()*10);
            } while (number1 >4 || number1 == 0);

            votes[number1]++;
        }

//      ** Set Pelet String **
        peletString = "Vote 1: " + votes[1]
                    + '\n' + "Vote 2: " + votes[2]
                    + '\n' + "Vote 3: " + votes[3]
                    + '\n' + "Vote 4: " + votes[4];

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
