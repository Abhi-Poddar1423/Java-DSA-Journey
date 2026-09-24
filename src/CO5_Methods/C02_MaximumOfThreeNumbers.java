package CO5_Methods;
import java.util.Scanner;
public class C02_MaximumOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        System.out.print("Enter third number:");
        int c = sc.nextInt();

        int max = Math.max(a,Math.max(b,c));

        System.out.println("Maximum number is: " + max);

      sc.close();
    }
}
