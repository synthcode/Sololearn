import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Program
{
    public static void main(String[] args) {
        Scanner sc
          = new Scanner(System.in);
        String input = sc.nextLine();
        Date date = new Date(input);
        SimpleDateFormat dateFormat
          = new SimpleDateFormat("d/M/yyyy");
        String output
          = dateFormat.format(date);
        System.out.println(output);
    }
}