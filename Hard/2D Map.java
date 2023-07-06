import java.util.Scanner;
import java.lang.Math;

public class Program
{
    public static void main(
      String[] args) {
        Scanner sc
          = new Scanner(System.in);
        String input = sc.nextLine();
        
        // column, row
        int[] p1 = {-1, -1};
        int[] p2 = {-1, -1};
        
        for (int i = 0;
               i < input.length(); ++i) {
            if ((i + 1) % 6 == 0) {
                continue;
            } else if (
                input.charAt(i) == 'P') {
                if (p1[0] == -1) {
                    p1[0] = (i + 1) % 6;
                    p1[1] = i / 6 + 1;
                } else {
                    p2[0] = (i + 1) % 6;
                    p2[1] = i / 6 + 1;
                    break;
                }
            }
        }
        
        int moves
          = Math.abs(p2[0] - p1[0])
              + (p2[1] - p1[1]);
        System.out.println(moves);
    }
}