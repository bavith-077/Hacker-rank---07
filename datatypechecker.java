/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.
Input Format

The first line contains an integer, , denoting the number of test cases.
Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

Output Format

For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.*/
import java.util.Scanner;

public class Datatypechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            try {
                long n = scanner.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n >= -128 && n <= 127) System.out.println("* byte");
                if (n >= -32768 && n <= 32767) System.out.println("* short");
                if (n >= -2147483648L && n <= 2147483647L) System.out.println("* int");
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
/*output:
7272 can be fitted in:
* short
* int
* long*/

