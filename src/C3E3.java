import java.util.Scanner;

public class C3E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diameter;
        int depth;

        double radius;
        double area;
        double capacity;

//      ** Input **
        System.out.println("Enter Diameter: ");
        depth = scanner.nextInt();
        System.out.println("Enter Depth: ");
        diameter = scanner.nextInt();

//      ** Calculation To Variables **
        radius = diameter /2;
        area = Math.PI * Math.pow(radius, 2);
        capacity = area * depth;

//      ** Output **
        System.out.println("Room Capacity : "+  capacity );

        scanner.close();
    }
}
