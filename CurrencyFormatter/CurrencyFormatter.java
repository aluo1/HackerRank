import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usdFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String usd = usdFormatter.format(payment);
        System.out.println("US format = " + usd);
        
        NumberFormat inrFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String inr = inrFormatter.format(payment);
        System.out.println("India format = "+inr);
        
                
        NumberFormat cnyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String cny = cnyFormatter.format(payment);
        System.out.println("CHINA format = "+cny);
    }
}

