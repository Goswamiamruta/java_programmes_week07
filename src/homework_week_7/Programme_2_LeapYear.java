package homework_week_7;

/**
 * 2.Write a java program to input any year like (ex. 2007 and find out if it is leap year or not?
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        int year = 2007;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + "is a leap year.");
        } else {
            System.out.println(year + "is not a leap year.");
        }
    }
}