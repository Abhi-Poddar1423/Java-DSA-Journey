package CO3_Loops;
import java.util.Scanner;

public class CO3_PalindromeNumber {



//    1. 🔄 Palindrome Number ⭐
//    Definition
//
//    A number is called a Palindrome if it remains the same when reversed.
//
//    Examples:
//
//            121 → 121  → Palindrome
//            1221 → 1221 → Palindrome
//            123 → 321 → Not Palindrome


        public static void main(String[] args) {

            // Scanner is used to take input from the user
            Scanner sc = new Scanner(System.in);

            // Taking number from user
            int n = sc.nextInt();

            // Store the original number
            // because n will change inside the loop
            int original = n;

            // Variable to store the reversed number
            int reverse = 0;

            // Loop continues until all digits are processed
            while (n != 0) {

                // Get the last digit
                // Example: 121 % 10 = 1
                int digit = n % 10;

                // Add the digit to the reversed number
                // Example: reverse = 0 * 10 + 1 = 1
                reverse = reverse * 10 + digit;

                // Remove the last digit from n
                // Example: 121 / 10 = 12
                n = n / 10;
            }

            // Compare original number with reversed number
            if (original == reverse) {

                // If both are same, number is palindrome
                System.out.println("Palindrome Number");

            } else {

                // If both are different, number is not palindrome
                System.out.println("Not a Palindrome Number");
            }
        }
    }

