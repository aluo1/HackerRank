import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String binString = Integer.toBinaryString(n);
        int consecutiveOne = 0;
        int maxConsecutiveOne = 0;
        
        //System.out.println(Integer.toBinaryString(439));
        for (int i = 0; i < binString.length(); i++) {
            if (binString.charAt(i)=='1') {
                consecutiveOne++;
                //System.out.println("binString.charAt("+i+")");
                //System.out.println("now consecutiveOne = "+consecutiveOne);
            } else {
                maxConsecutiveOne = maxConsecutiveOne > consecutiveOne ? maxConsecutiveOne : consecutiveOne;
                consecutiveOne = 0;
            }
        }
        
        maxConsecutiveOne = maxConsecutiveOne > consecutiveOne ? maxConsecutiveOne : consecutiveOne;
        System.out.println(maxConsecutiveOne);
    }
}