import java.util.Scanner;

public class C8E22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1, cell1 = 1, cell2 = 1, temp;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number9: ");
        number1 = scanner.nextInt();

        System.out.println(cell1);
//      ** Calculation To Variables **
        while (cell2 < number1){
            temp = cell2;
            cell2+= cell1;
            cell1 = temp;
            System.out.println(cell2);
        }

//      ** Set Pelet String **
        peletString = " ";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
