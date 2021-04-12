import java.io.InputStream;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class C1E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a;
        String b;
        System.out.println("Enter Input 1 : ");
        a = scanner.nextLine();
        System.out.println("Enter Input 2 : ");
        b = scanner.nextLine();
        System.out.println("Value a: "+a+ '\n' + "Value b: " + b);

        scanner.close();
    }
}
