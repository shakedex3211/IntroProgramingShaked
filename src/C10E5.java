import java.util.Scanner;

public class C10E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int votes[] = new int[3], number1, index;
        boolean isCorrect = true;

//      ** Output Data Set
        String peletString;

//      ** Input **
//        System.out.println("Enter Number1: ");
//        number1 = scanner.nextInt();
        for (int i=0; i<3;i++)
            votes[i] = 0;

//      ** Calculation To Variables **
        for (int i=0; i< 1000 && isCorrect; i++){
            number1 = (int) (Math.random()*1000);
            index = (number1 >= 2000) ? 2 : (number1 >1000) ? 1 : 0;

            votes[index]++;
        }

//      ** Set Pelet String **
        peletString = "Vote 1: " + votes[0]
                    + '\n' + "Vote 2: " + votes[1]
                    + '\n' + "Vote 3: " + votes[2];

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
