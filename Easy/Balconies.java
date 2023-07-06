import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] aptA = sc.nextLine().split(",");
        String[] aptB = sc.nextLine().split(",");
        
        Integer aptAArea = Integer.parseInt(aptA[0]) * Integer.parseInt(aptA[1]);
        
        Integer aptBArea = Integer.parseInt(aptB[0]) * Integer.parseInt(aptB[1]);
        
        if (aptAArea >= aptBArea) {
            System.out.println("Apartment A");
        }
        else {
            System.out.println("Apartment B");
        }
    }
}