import java.util.Scanner;

public class YearDaysCalculator {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год в формате уууу: ");
        int year = scanner.nextInt();
        int days = getDaysInYear(year);
        System.out.println("Количество дней " + days);
    }
}
