import java.util.Scanner;

public class C5E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        String name;
        int salary;
        double presentRaise = 1;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Name: ");
        name =  scanner.next();
        System.out.println("Enter Salary: ");
        salary = ((int) scanner.nextDouble());

//      ** Calculation To Variables **
        presentRaise += (salary * 0.1 + salary < 6000) ? 0.1 : 0.05;

//      ** Set Pelet String **
        peletString = "Salary: " + salary
                      + '\n'
                      + "Salary after bonus: "
                      + (salary + (salary * presentRaise));
//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
