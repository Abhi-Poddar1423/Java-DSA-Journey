package CO4_PatternPrinting;

public class C04_RightAlignedTriangle {
        public static void main(String[] args) {

            // Outer loop controls rows.
            for (int i = 1; i <= 5; i++) {

                // Print spaces before stars.
                // Spaces decrease as rows increase.
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print("  ");
                }

                // Print stars.
                // Stars increase with each row.
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                // Move to next row.
                System.out.println();
            }
        }
    }

