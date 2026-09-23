package CO4_PatternPrinting;

public class C06_InvertedPyramid {
        public static void main(String[] args) {

            // Outer loop controls rows.
            for (int i = 5; i >= 1; i--) {

                // Print spaces.
                // Spaces increase as stars decrease.
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print("  ");
                }

                // Print stars.
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }

                // Move to next row.
                System.out.println();
            }
        }
    }

