import java.util.Scanner;

public class C9E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int atzeret=1;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Number 1: ");
        number1 = scanner.nextInt();

//      ** Calculation To Variables **
        for (int i =1; i<= number1; i++){
            atzeret*=i;
        }
//      ** Set Pelet String **
        peletString = "Atzeret N:"+number1+" Is :"+atzeret;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
