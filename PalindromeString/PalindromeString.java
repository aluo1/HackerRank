import java.io.*;
import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int strLength = A.length();
        boolean isPalindrome = true;
        
        for (int i = 0; i < strLength/2; i++) {
            if (A.charAt(i) != A.charAt(strLength-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}