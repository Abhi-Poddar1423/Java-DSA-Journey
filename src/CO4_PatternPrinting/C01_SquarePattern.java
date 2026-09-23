package CO4_PatternPrinting;

public class C01_SquarePattern {

        public static void main(String[] args) {

            // Outer loop runs FIRST.
            // It controls the number of rows.
            for (int i = 1; i <= 5; i++) {

                // After the outer loop starts,
                // the inner loop runs completely.
                // It controls the columns/stars.
                for (int j = 1; j <= 5; j++) {

                    // Print one star
                    // print() keeps the cursor on the same line.
                    System.out.print("* ");
                }

                // Inner loop is finished for this row.
                // Move the cursor to the next line.
                System.out.println();
            }
        }
    }

