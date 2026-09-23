package CO3_Loops;
import java.util.Scanner;

public class C10_ReverseNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        // Variable to store reversed number
        int reverse = 0;
        // Loop continues until all digits are removed
        while(n != 0){
            // Get the last digit of the number
            int digit = n % 10;
            // Add the digit to reverse
            reverse = reverse * 10 + digit;
            // Remove the last digit
            n = n / 10;
        }
        // Print reversed number
        System.out.println("Reverse = " + reverse);

    }
}
