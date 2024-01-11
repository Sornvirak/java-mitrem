package examTask1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        Scanner scanner = new Scanner(System.in);
        String shortDate = scanner.nextLine();
        scanner.close();

        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8, 10));

        String monthName = getMonthName(month);

        String dayOfWeek = getDayOfWeek(year, month, day);

        System.out.println(dayOfWeek + ", " + monthName + " " + day + ", " + year);
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }

    private static String getDayOfWeek(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        return sdf.format(date);
    }

}