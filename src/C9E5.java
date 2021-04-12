import java.util.Scanner;

public class C9E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int number1;
        int sum=0;

//      ** Output Data Set
        String peletString;

//      ** Input **
        for (int i =1; i<= 100; i++){
//            System.out.println("Enter Number: ");
//            number1 = scanner.nextInt();
            number1 = (int) (Math.random()*100);
            sum += (i%3==0)? number1 : 0;
        }


//      ** Calculation To Variables **

//      ** Set Pelet String **
        peletString = "Sum to N:"+sum;

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
