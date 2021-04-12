import java.io.InputStream;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class C1E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a;
        String b;
        int Index;
        System.out.println("Enter Input: ");
        a = scanner.nextLine();

        for (Index = 0; Index < 3; Index++)
            System.out.println("Time: " + Index + '\n' + " Value a: "+a);

        scanner.close();
    }
}
