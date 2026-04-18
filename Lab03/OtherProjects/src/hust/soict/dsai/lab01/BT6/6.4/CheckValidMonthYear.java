package hust.soict.dsai.lab01.BT6;
import java.util.Scanner;
public class CheckValidMonthYear {

    public static int getMonth(String input) {
        input = input.toLowerCase().replace(".", "");

        switch (input) {
            case "january": case "jan": case "1": return 1;
            case "february": case "feb": case "2": return 2;
            case "march": case "mar": case "3": return 3;
            case "april": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug": case "8": return 8;
            case "september": case "sep": case "9": return 9;
            case "october": case "oct": case "10": return 10;
            case "november": case "nov": case "11": return 11;
            case "december": case "dec": case "12": return 12;
            default: return -1;
        }
    }

    public static int getYear(String input) {
        if (!input.matches("\\d+")) return -1;
        int year = Integer.parseInt(input);
        if (year < 0) return -1;
        return year;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month;
        do {
            System.out.print("Nhap thang: ");
            String mInput = sc.nextLine();
            month = getMonth(mInput);

            if (month == -1) {
                System.out.println("Thang 0 hop le, nhap lai!");
            }

        } while (month == -1);

        int year;
        do {
            System.out.print("Nhap nam: ");
            String yInput = sc.nextLine();
            year = getYear(yInput);

            if (year == -1) {
                System.out.println("Nam 0 hop le, nhap lai!");
            }

        } while (year == -1);

        // xử lý số ngày
        if (isLeapYear(year)) {
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12)
                System.out.println("Thang " + month + " nam " + year + " co 31 ngay.");
            else if (month == 2)
                System.out.println("Thang 2 nam " + year + " co 29 ngay.");
            else
                System.out.println("Thang " + month + " nam " + year + " co 30 ngay.");
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12)
                System.out.println("Thang " + month + " nam " + year + " co 31 ngay.");
            else if (month == 2)
                System.out.println("Thang 2 nam " + year + " co 28 ngay.");
            else
                System.out.println("Thang " + month + " nam " + year + " co 30 ngay.");
        }
    }
}
