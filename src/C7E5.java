import java.awt.*;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

public class C7E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      ** Input Data Set **
        YearMonth yearMonth;
        int year;
        int month;

//      ** Output Data Set
        String peletString;

//      ** Input **
        System.out.println("Enter Year: ");
        year = scanner.nextInt();
        System.out.println("Enter Year: ");
        month = scanner.nextInt();
        yearMonth = YearMonth.of(year,month);


//      ** Input Test **

//      ** Calculation To Variables **


        peletString = "Number of Days: " + yearMonth.lengthOfMonth();


//      ** Set Pelet String **

//      ** Output **
            System.out.println(peletString);

        scanner.close();
    }
}
