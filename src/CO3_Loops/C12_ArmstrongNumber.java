package CO3_Loops;
import java.util.Scanner;
public class C12_ArmstrongNumber {

//    Armstrong Number ⭐
//    Definition
//
//    An Armstrong number is a number where the sum of each digit raised to the power of the number of digits is equal to the original number.
//
//            Example:
//
//            153
//
//            153 has 3 digits.
//
//            So:
//
//            1³ + 5³ + 3³
//            = 1 + 125 + 27
//            = 153

        public static void main(String[] args) {

            // Scanner is used to take input from the user
            Scanner sc = new Scanner(System.in);

            // Taking number from user
            int n = sc.nextInt();

            // Store the original number
            // because n will change inside the loops
            int original = n;

            // Variable to count the number of digits
            int digits = 0;

            // Temporary variable used for counting digits
            int temp = n;

            // Count the number of digits
            while (temp != 0) {

                // Remove the last digit
                temp = temp / 10;

                // Increase digit count
                digits++;
            }

            // Variable to store the Armstrong sum
            int sum = 0;

            // Reset temp to original number
            temp = n;

            // Process every digit
            while (temp != 0) {

                // Get the last digit
                int digit = temp % 10;

                // Calculate digit raised to the number of digits
                sum = sum + (int) Math.pow(digit, digits);

                // Remove the last digit
                temp = temp / 10;
            }

            // Compare Armstrong sum with original number
            if (sum == original) {

                // If both are same, it is an Armstrong number
                System.out.println("Armstrong Number");

            } else {

                // Otherwise, it is not an Armstrong number
                System.out.println("Not an Armstrong Number");
            }
        }
    }

