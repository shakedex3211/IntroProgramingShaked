import java.util.Scanner;

public class C3E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length;
        int width;

        System.out.println("Enter Length: ");
        length = scanner.nextInt();
        System.out.println("Enter Width: ");
        width = scanner.nextInt();


        System.out.println("Room Area : "+  length * width);
        System.out.println("Room Scope : "+  ((length*2) + (width*2)));

        scanner.close();
    }
}
