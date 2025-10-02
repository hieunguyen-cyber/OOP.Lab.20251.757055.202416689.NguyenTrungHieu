package Lab01;
import java.util.*;

public class daysInMonth {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] monthNames = {"January","February","March","April","May","June",
                               "July","August","September","October","November","December"};

        while (true) {
            System.out.print("Enter month (name/abbr/number): ");
            String monthInput = sc.next();
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            if (year < 0) {
                System.out.println("Invalid year. Try again.");
                continue;
            }

            int month = -1;
            // Check number
            try {
                month = Integer.parseInt(monthInput);
            } catch (NumberFormatException e) {}

            // Check string
            if (month == -1) {
                for (int i = 0; i < 12; i++) {
                    if (monthNames[i].equalsIgnoreCase(monthInput) ||
                        monthNames[i].substring(0,3).equalsIgnoreCase(monthInput) ||
                        monthNames[i].substring(0,3).concat(".").equalsIgnoreCase(monthInput)) {
                        month = i + 1;
                        break;
                    }
                }
            }

            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Try again.");
                continue;
            }

            int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
            int days = daysInMonth[month-1];
            if (month == 2 && isLeapYear(year)) days = 29;

            System.out.println("Month " + monthNames[month-1] + " " + year + " has " + days + " days.");
            break;
        }
        sc.close();
    }
}