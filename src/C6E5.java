import java.util.Scanner;

public class C6E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int salary;
        double tax = 0;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Salary: ");
        salary = scanner.nextInt();

//      ** Calculation To Variables **
        if (salary < 23_000)
            tax += salary * 0.1;
        else if (salary < 74_000)
                tax += 23_000 * 0.1 + (salary - 23_000) * 0.2;
        else if (salary < 100_000)
                tax += 23_000 * 0.1 + (salary - 23_000) * 0.2 + (salary - 74_000) * 0.3;
        else if (salary < 200_000)
                tax += 23_000 * 0.1 + (salary - 23_000) * 0.2 + (salary - 74_000) * 0.3 + (salary - 100_000) * 0.4;
        else    tax += 23_000 * 0.1 + (salary - 23_000) * 0.2 + (salary - 74_000) * 0.3 + (salary - 100_000) * 0.4 + (salary - 200_000) * 0.5;





//      ** Set Pelet String **
        peletString = "Done";

//      ** Output **
        System.out.println(peletString) ;

        scanner.close();
    }
}
