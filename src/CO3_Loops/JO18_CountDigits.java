package CO3_Loops;
import java.util.Scanner;
public class JO18_CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number;");
        // Taking number from user
        int n = sc.nextInt();
        // Variable to count digits
        int count = 0;
        // Special case: 0 has one digit
        if(n == 0){
            count = 1;

        }  // Continue until all digits are removed
        while (n != 0){
            // Remove the last digit
            n = n / 10;
            // Increase digit count
            count++;
        } // Print total number of digits
        System.out.println("Digits = " + count);
    }

}
