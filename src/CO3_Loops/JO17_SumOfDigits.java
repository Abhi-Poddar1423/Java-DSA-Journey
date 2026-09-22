package CO3_Loops;
import java.util.Scanner;
public class JO17_SumOfDigits {

        public static void main(String[] args) {

            // Scanner is used to take input
            Scanner sc = new Scanner(System.in);

            // Take number from user
            int n = sc.nextInt();

            // Variable to store the sum
            int sum = 0;

            // do-while loop executes at least once
            do {

                // Get the last digit
                // 1234 % 10 = 4
                int digit = n % 10;

                // Add the digit to sum
                // First: 0 + 4 = 4
                sum = sum + digit;

                // Remove the last digit
                // 1234 / 10 = 123
                n = n / 10;

                // Continue until all digits are removed
            } while (n != 0);

            // Display the final sum
            System.out.println("Sum of digits = " + sum);
        }
    }
