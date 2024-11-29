/*Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.*/
import java.util.Scanner;
public class nextline{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer:");
        int i =sc.nextInt();
        System.out.println("enter the double:");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("enter the String:");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(d);
        System.out.println(i);
    }
}
/*output:
enter the integer:
7
enter the double:
6.77
enter the String:
bavith 
bavith
6.77
7*/