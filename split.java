import java.util.Scanner;

public class split {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string :");

        // Read the input string
        String s = scanner.nextLine();
        scanner.close();

        // Split the string into tokens using a regular expression
        String[] tokens = s.trim().split("[ !,?._'@]+");

        // If the input string is empty, handle the edge case
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            // Print the number of tokens
            System.out.println(tokens.length);

            // Print each token
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
/*output:
enter the string :
he is very ? hi how are you? +hi mame
9
he
is
very
hi
how
are
you
+hi
mame*/
