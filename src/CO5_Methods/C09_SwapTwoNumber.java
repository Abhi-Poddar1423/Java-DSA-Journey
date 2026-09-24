package CO5_Methods;
import java.util.Scanner;
public class C09_SwapTwoNumber {
      /*
        Since Java is pass by value, swapping the values
        inside a method will not change the original
        variables in the main() method.

        So, we swap the values directly in the main()
        method to get the desired result.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("---- After Swapping ----");
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

        sc.close();
    }
}
