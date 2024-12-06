/*Given a string, S , and two indices, Start and End , print a substring consisting of all characters in the inclusive range from Start to End-1. You'll find the String class' substring method helpful in completing this challenge.*/
import java.util.Scanner;
public class startend{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String S = sc.nextLine();
        System.out.print("enter the starting position :");
        int Start = sc.nextInt();
        System.out.print("enter the Ending position :");
        int End = sc.nextInt();
        String cut = S.substring(Start,End);
        System.out.println("the String is :"+cut);
    }
}
/*output:
enter the string: bavith mariyan
enter the starting position :3
enter the Ending position :8
the String is :ith m */