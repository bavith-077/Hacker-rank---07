/*You are given an integer n , you have to convert it into a string. 

Please complete the partially completed code in the editor. If your code successfully converts n  into a string  s the code will print "Good job". Otherwise it will print "Wrong answer". 

n can range between -100 to 100  inclusive. 

Sample Input 0

100
Sample Output 0

Good job*/
import java.util.Scanner;
public class convertstring{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if(n==Integer.parseInt(s)){
            System.out.println("good job");
        }
        else{
            System.out.println("Wrong answer");
        }

    }
}
/*output:
enter the number 
7
good job */