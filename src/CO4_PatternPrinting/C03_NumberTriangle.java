package CO4_PatternPrinting;

public class C03_NumberTriangle {
        public static void main(String[] args) {

            // Outer loop controls rows.
            for (int i = 1; i <= 5; i++) {

                // Inner loop prints numbers.
                for (int j = 1; j <= i; j++) {

                    // Print the column number.
                    System.out.print(j + " ");
                }

                // Move to next row.
                System.out.println();
            }
        }
    }

