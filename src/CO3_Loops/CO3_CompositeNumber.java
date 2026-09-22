package CO3_Loops;
import java.util.Scanner;
public class CO3_CompositeNumber {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Taking input
            int n = sc.nextInt();

            // Variable to check composite number
            boolean composite = false;

            // Check divisors from 2 to n-1
            for (int i = 2; i < n; i++) {

                // If n is divisible by i
                if (n % i == 0) {
                    composite = true;
                    break;
                }
            }

            // Display result
            if (composite) {
                System.out.println("Composite Number");
            } else {
                System.out.println("Not a Composite Number");
            }
        }
    }

