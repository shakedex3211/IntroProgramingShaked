import java.sql.Savepoint;
import java.util.Scanner;

public class C8E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number, index;
        int max = 0, savedIndex = 0;

//      ** Output Data Set
        String peletString;

//      ** Input **
        for (index = 0; index < 100; index++) {
            System.out.println("Set Number " + index + " of 100:");
            number = scanner.nextInt();

            if (max < number){
                savedIndex = index;
                max = number;
            }
        }

//      ** Input Test **

//      ** Calculation To Variables **

//      ** Set Pelet String **
            peletString = "Index of Highest number: " + savedIndex;

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
