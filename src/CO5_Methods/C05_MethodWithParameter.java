package CO5_Methods;
import java.util.Scanner;
public class C05_MethodWithParameter {
    // User-defined method with two parameters.
    // 'void' means the method does not return any value.
    public static void sum(int a, int b){

        // Adding the two parameters.
        int result = a+b;
        // Printing the sum
        System.out.println("Sum = " + result);
    }
    public static void main(String[] args){

        // Creating Scanner object to take input from the use
        Scanner sc = new Scanner(System.in);

        // Taking first number from the user
        System.out.print("Enter first number:");
        int n1 = sc.nextInt();
        // Taking second number from the user
        System.out.print("Enter second number:");
        int n2 = sc.nextInt();

        // Calling the method and passing the two numbers.
        sum(n1,n2);
    }
}
