import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner sc
          = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs
          = input.split(" ");

        for (String s : inputs) {
            //System.out.println(s);
            Integer i
              = Integer.parseInt(s);
            if (i % 2 == 0) {
                System.out.print(
                    s + " ");
            }
        }
    }
}