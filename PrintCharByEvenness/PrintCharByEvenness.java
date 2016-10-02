import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintCharByEvenness {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        /* Get rid of the \n at the first line. */
        scanner.nextLine();
        
        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine();
            
            StringBuilder evenCharacters = new StringBuilder();
            StringBuilder oddCharacters = new StringBuilder();
            
            for (int j = 0; j < input.length(); j++) {
                char chr = input.charAt(j);
                if (j == 0 || j % 2 == 0) {
                    evenCharacters.append(chr);
                } else {
                    oddCharacters.append(chr);
                }
            }
            
            System.out.println(evenCharacters.toString() + " " + oddCharacters.toString());
        }
        
    }
}
