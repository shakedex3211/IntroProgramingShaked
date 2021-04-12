import java.util.Scanner;

public class C3E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        int movieLengthMin;

//      ** Output Data Set
        String movieLengthMinHour;

//      ** Input **
        System.out.println("Enter Movie Legnth In Min: ");
        movieLengthMin = scanner.nextInt();

//      ** Calculation To Variables **
        movieLengthMinHour = "Hours: " + (movieLengthMin / 60) + '\n' + "Minutes: " + (movieLengthMin % 60);

//      ** Output **
        System.out.println("Movie : "+  movieLengthMinHour );

        scanner.close();
    }
}
