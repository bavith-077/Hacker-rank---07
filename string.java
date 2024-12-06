/*Share


You said:
"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations: 

Sum the lengths of A and B . 
Determine if  Ais lexicographically larger than B (i.e.: does B come before A  in the dictionary?). 
Capitalize the first letter in A and B and print them on a single line, separated by a space. 
Input Format

The first line contains a string A . The second line contains another string B. The strings are comprised of only lowercase English letters. 

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B . 
For the second line, write Yes if A is lexicographically greater than  B otherwise print No instead. 
For the third line, capitalize the first letter in both A and B  and print them on a single line, separated by a space. 

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String  is A "hello" and B  is "java". 

 has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B  and the answer is No. 

When you capitalize the first letter of both  A and  B and then print them separated by a space, you get "Hello Java".  */
import java.util.Scanner;
public class string{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string :");
        String str1 = sc.nextLine();
        System.out.println("enter the second string:");
        String str2 = sc.nextLine();
        int Totallength = str1.length()+str2.length();
        System.out.println("the total length of the String is "+Totallength);
        if(str1.compareTo(str2)<0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        String capitalizestr1 = str1.substring(0,1).toUpperCase()+str1.substring(1);
        String capitalizestr2 = str2.substring(0,1).toUpperCase()+str2.substring(1);
        System.out.println(capitalizestr1+" "+capitalizestr2);

        
    }

}
/*output:
enter the first string :
bavith 
enter the second string:
mariyan 
the total length of the String is 13
yes
Bavith Mariyan */