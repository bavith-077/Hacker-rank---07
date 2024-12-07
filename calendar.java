/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getday, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor. 

Example
month = 8
day = 14
year=2017



The method should return monday as the day on that date.

image

Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year
Returns

string: the day of the week in capital letters
Input Format

A single line of input containing the space separated month, day and year, respectively, in  MM,DD,YYYY  format.


Constraints
2000<years<3000


Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August 5th  2015 was WEDNESDAY. */
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Solution {

    public static String findDay(int month, int day, int year) {
        // Create a LocalDate object
        LocalDate date = LocalDate.of(year, month, day);
        // Get the day of the week as an enum
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        // Return the day in uppercase letters
        return dayOfWeek.toString();
    }

    public static void main(String[] args) {
        // Example usage
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month");
        int month = sc.nextInt();
         System.out.println("enter the day");
        int day = sc.nextInt();
         System.out.println("enter the year");
        int year = sc.nextInt();
        System.out.println(findDay(month, day, year)); // Output: WEDNESDAY
    }
}
