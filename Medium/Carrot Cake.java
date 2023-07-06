import java.util.Scanner;

public class Program
{
    public static void main(
        String[] args
    ) {
        Scanner sc
          = new Scanner(System.in);
        int carrots = sc.nextInt();
        int boxes = sc.nextInt();
        
        int remaining = carrots % boxes;
        int toBuy = 7 - remaining;
        
        if (toBuy <= 0) {
            System.out.println(
                "Cake Time"
            );
        } else {
            System.out.format(
                "I need to buy %d more", 
            toBuy);
        }
    }
}