import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        
        int[] rotateList = new int[n];
        
        for (int index = 0; index < n; index++) {
            rotateList[(index+k)%n] = in.nextInt();
            //System.out.println("rotateList["+(index+k)%n+"] = " + rotateList[(index+k)%n]);
        }
        
        for (int index = 0; index < q; index++) {
            System.out.println(rotateList[in.nextInt()]);
        }
        
    }
}