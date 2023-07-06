import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int imax = sc.nextInt();
        sc.close();
        
        int sum = 0;
        for (int i = 3; i < imax; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.print(sum);
    }
}