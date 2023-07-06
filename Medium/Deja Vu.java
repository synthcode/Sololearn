import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Program
{
    public static void
      main(String[] args) {
        Scanner sc
          = new Scanner(System.in);
        String input = sc.nextLine();

        Map<Character, Integer> m = new
          HashMap<Character, Integer>();
        
        for (Character c :
               input.toCharArray()) {
            Integer i
              = m.getOrDefault(c, 0);
            m.put(c, i + 1);
        }
        
        String output = "Unique";
        for (Map.Entry<Character,
              Integer> entry :
                m.entrySet()) {
            if (entry.getValue() > 1) {
                output = "Deja Vu";
                break;
            }
        }
        
        System.out.println(output);
    }
}