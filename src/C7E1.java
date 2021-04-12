import java.util.Scanner;

public class C7E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int grade;
        int number2;
        int number3;
        int max, min, middle;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Grade: ");
        grade = scanner.nextInt();

//      ** Calculation To Variables **

//      ** Set Pelet String **
        if (grade < 55)
            peletString = "בלתי מספיק";
        else if (grade < 64)
            peletString = "מספיק";
        else if (grade < 74)
            peletString = "כמעט טוב";
        else if (grade < 84)
            peletString = "טוב";
        else if (grade < 94)
            peletString = "טוב מאוד";
        else
            peletString = "מצויין";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
