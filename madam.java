/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A , print Yes if it is a palindrome, print No otherwise. 

Constraints

 A will consist at most 50 lower case english letters. 
Sample Input

madam
Sample Output

Yes */
import java.io.*;
import java.util.*;

public class madam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String A = sc.next(); // Read the input string
        sc.close(); // Close the scanner
        
        // Reverse the string
        String reversed = new StringBuilder(A).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/*output:
enter the string:
madam
Yes */
