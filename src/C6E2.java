import java.util.Scanner;

public class C6E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int number2;
        int number3;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number 1: ");
        number1 =  scanner.nextInt();
        System.out.println("Enter Number 2: ");
        number2 =  scanner.nextInt();
        System.out.println("Enter Number 3: ");
        number3 =  scanner.nextInt();

//      ** Calculation To Variables **

//      בשאלה רשום
//      אם המספר השני גדול מהראשון והשלישי גדול מהשני בלבד
//        משהו לא הגיוני בתנאי - בחיים לא אצליח - אבל מנוסח פה בדרך השלילה

//      ** Set Pelet String **
        peletString = ((number3 > number1) ? "Nope" : (number1 > number2) ? "Nope" : "Increasing");

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
