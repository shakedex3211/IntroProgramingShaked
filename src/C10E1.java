import java.util.Scanner;

public class C10E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        boolean isRaising = true;

//      ** Output Data Set
        String peletString;

//      ** Input **
//        System.out.println("Enter Number1: ");
//        number1 = scanner.nextInt();


//      ** Calculation To Variables **
        for (int i=0; i< 100 && isRaising; i++){
            number1 = (int) Math.random()*100;
            isRaising = (number1 > (int) Math.random()*100)? true : false;
        }

//      ** Set Pelet String **
        peletString = (isRaising)? "Raising" : "Nah";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
