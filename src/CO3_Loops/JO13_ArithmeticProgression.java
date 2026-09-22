package CO3_Loops;
import java.util.Scanner;
public class JO13_ArithmeticProgression {

        public static void main(String[] args) {

            // Scanner is used to take input from the user
            Scanner sc = new Scanner(System.in);

            // 'a' represents the first term of the AP
            // Example: In 2, 5, 8, 11 → first term = 2
            int a = sc.nextInt();

            // 'd' represents the common difference
            // Common difference = 5 - 2 = 3
            int d = sc.nextInt();

            // 'n' represents the total number of terms
            // Example: If n = 5, we print 5 terms
            int n = sc.nextInt();

            // for loop is used to generate all AP terms
            // i starts from 0 and runs until i becomes n
            for (int i = 0; i < n; i++) {

                // AP formula:
                // nth term = a + (i × d)
                //
                // We use i instead of n here because
                // the first term starts from i = 0
                int term = a + (i * d);

                // Print the current AP term
                System.out.print(term + " ");
            }
        }
    }

