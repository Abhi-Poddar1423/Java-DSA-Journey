package CO4_PatternPrinting;
import java.util.Scanner;
public class C10_FlippedTriangle {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take the number of rows from the user.
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            // Outer loop runs first.
            // It controls the number of rows.
            for (int i = n; i >= 1; i--) {

                // Inner loop runs after the outer loop.
                // It prints stars in each row.
                for (int j = 1; j <= i; j++) {

                    // Print one star.
                    System.out.print("* ");
                }

                // Inner loop is finished.
                // Move to the next line.
                System.out.println();
            }

            sc.close();
        }
    }

