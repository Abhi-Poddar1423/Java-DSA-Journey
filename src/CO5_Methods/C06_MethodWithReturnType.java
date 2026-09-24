package CO5_Methods;
import java.util.Scanner;
public class C06_MethodWithReturnType {

        // User-defined method with two parameters.
        // 'int' means the method will return an integer value.
        static int sum(int a, int b) {

            // Adding a and b, then returning the result.
            return a + b;
        }

        public static void main(String[] args) {

            // Creating Scanner object to take input.
            Scanner sc = new Scanner(System.in);

            // Taking first number from the user.
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            // Taking second number from the user.
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Calling the method and storing the returned value.
            int result = sum(num1, num2);

            // Printing the result.
            System.out.println("Sum = " + result);
        }
    }

