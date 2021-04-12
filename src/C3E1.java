import java.io.InputStream;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class C3E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int sum;
        System.out.println("Enter Number 1 : ");
        a = scanner.nextInt();
        System.out.println("Enter Number 2 : ");
        b = scanner.nextInt();
        System.out.println("Enter Number 3 : ");
        c = scanner.nextInt();

        sum = a+b+c;
        System.out.println("Sum : "+sum + '\n' + "AVG: " + sum/3);

        scanner.close();
    }
}
