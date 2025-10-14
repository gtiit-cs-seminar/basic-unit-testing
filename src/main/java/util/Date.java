package util;

/**
 * Date utility class.
 * Provides utility methods for date-related operations.
 *
 */
public class Date {

    /**
     * Determines if a given year is a leap year.
     * A year is a leap year if it is divisible by 4,
     * except for end-of-century years, which must be divisible by 400.
     * The Gregorian calendar reform started in 1582, so years before that are not considered.
     *
     * @param year The year to check (must be 1582 or later)
     * @return true if the year is a leap year, false otherwise
     * @throws IllegalArgumentException if the year is less than 1582
     */
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            throw new IllegalArgumentException("Year must be 1582 or later");
        }
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

    /**
     * Calculates the number of days from January 1, 1980 to January 1 of the given year.
     *
     * @param year The target year (must be 1980 or later)
     * @return The number of days from January 1, 1980 to January 1 of the given year
     * @throws IllegalArgumentException if the year is less than 1980
     */
    public static int numberOfDaysSince1980(int year) {
        //TODO: Implement this method, and replace the line below
        return 0;
    }


}