import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RegExJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> matchedNames = new ArrayList<String>();

        // Regular Expression
        String matchingPostfix = ".+@gmail.com";
        // Pattern
        Pattern matchingPattern = Pattern.compile(matchingPostfix);
        Matcher matcher;
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            matcher = matchingPattern.matcher(emailID);
            if (matcher.find()) {
                // System.out.println(matcher.group());       
                matchedNames.add(firstName);
            }      
        }
        
        Collections.sort(matchedNames);
        for (String name: matchedNames) {
            System.out.println(name);
        }
    }
}

