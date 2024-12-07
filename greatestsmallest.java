//Here's the complete implementation of the getSmallestAndLargest function in Java:
import java.util.Scanner;

public class greatestsmallest {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k); // Initialize smallest to the first substring
        String largest = s.substring(0, k);  // Initialize largest to the first substring

        // Loop through all substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            // Compare and update smallest and largest
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
                 System.out.println("the smallest element in string is :"+smallest);
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
                System.out.println("the greatest or largest element in string is :"+largest);
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = scan.next();
        System.out.println("enter the integer like how the string have to cutted:");
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}