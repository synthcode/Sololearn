import java.util.*;

public class Program
{
    public static void main (
      String[] args) {
        Scanner sc
          = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sbuf
          = new StringBuffer(s);
        sbuf.reverse();
        s = sbuf.toString();
        
        int sum = 0;
        for (int i = 0;
               i < s.length(); ++i) {
            int k = Character.
                      getNumericValue(
                        s.charAt(i));
            if (i % 2 == 1) {
                k *= 2;
                if (k > 9) k -= 9;
            }
            sum += k;
        }
        
        if (s.length() == 16
              && sum % 10 == 0) {
            System.out.println("valid");
        } else {
            System.out.println(
              "not valid");
        }
        
        sc.close();
    }
}