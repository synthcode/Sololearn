import java.util.*;

public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        if (i < 1) {
            System.out.println("shh");
        } else if (i <= 10) {
            for (int j = 0; j < i; ++j) {
                System.out.print("Ra!");
            }
        } else {
            System.out.println("High Five");
        }
    }
}