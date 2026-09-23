package CO4_PatternPrinting;

public class C02_StarTriangle {
        public static void main(String[] args) {

            // Outer loop runs first.
            // It controls the number of rows.
            for (int i = 1; i <= 5; i++) {

                // Inner loop runs after outer loop.
                // It prints stars according to row number.
                for (int j = 1; j <= i; j++) {

                    // Print one star
                    System.out.print("* ");
                }

                // Inner loop is finished.
                // Move to the next line.
                System.out.println();
            }
        }
    }

