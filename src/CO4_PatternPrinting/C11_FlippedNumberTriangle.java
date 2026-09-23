package CO4_PatternPrinting;
import java.util.Scanner;
public class C11_FlippedNumberTriangle {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take number of rows from the user.
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            // Outer loop runs first.
            // It controls the number of rows.
            // i decreases, so the triangle gets smaller.
            for (int i = n; i >= 1; i--) {

                // Inner loop runs after the outer loop.
                // It prints numbers from 1 to i.
                for (int j = 1; j <= i; j++) {

                    // Print the current number.
                    System.out.print(j + " ");
                }

                // Inner loop is finished.
                // Move to the next row.
                System.out.println();
            }

            sc.close();
        }
    }

