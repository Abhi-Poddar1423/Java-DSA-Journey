package CO4_PatternPrinting;

public class C05_PyramidPattern {
        public static void main(String[] args) {

            // Outer loop controls rows.
            for (int i = 1; i <= 5; i++) {

                // Print spaces before stars.
                // Spaces decrease in every row.
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print("  ");
                }

                // Print stars.
                // Formula gives 1, 3, 5, 7, 9 stars.
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }

                // Move to next row.
                System.out.println();
            }
        }
    }

