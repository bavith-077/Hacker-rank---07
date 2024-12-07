/*Given a double-precision number,payment , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows: 

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where formatted payment  is payment  formatted according to the appropriate Locale's currency. 

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting payment . 

Constraints
0<=payments<=10^9

Output Format

On the first line, print US: u where u is payment  formatted for US currency.
On the second line, print India: i where i is payment  formatted for Indian currency.
On the third line, print China: c where c is payment formatted for Chinese currency.
On the fourth line, print France: f, where f is payment  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of  payment formatted according to the four countries' respective 
currencies.*/
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: a single double-precision number denoting payment
        double payment = scanner.nextDouble();  // Read the payment from user input

        // Format for US currency
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        usFormat.setMinimumFractionDigits(2);  // Ensure 2 decimal places
        usFormat.setMaximumFractionDigits(2);  // Ensure 2 decimal places
        String usFormatted = usFormat.format(payment);

        // Format for India currency (English Locale for India)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        indiaFormat.setMinimumFractionDigits(2);  // Ensure 2 decimal places
        indiaFormat.setMaximumFractionDigits(2);  // Ensure 2 decimal places
        String indiaFormatted = indiaFormat.format(payment);

        // Format for China currency
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        chinaFormat.setMinimumFractionDigits(2);  // Ensure 2 decimal places
        chinaFormat.setMaximumFractionDigits(2);  // Ensure 2 decimal places
        String chinaFormatted = chinaFormat.format(payment);

        // Format for France currency
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        franceFormat.setMinimumFractionDigits(2);  // Ensure 2 decimal places
        franceFormat.setMaximumFractionDigits(2);  // Ensure 2 decimal places
        String franceFormatted = franceFormat.format(payment);

        // Print the formatted values
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
        
        // Close the scanner
        scanner.close();
    }
}