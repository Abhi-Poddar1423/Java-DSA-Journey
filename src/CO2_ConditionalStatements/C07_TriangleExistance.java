package CO2_ConditionalStatements;
import java.util.Scanner;
public class C07_TriangleExistance {
    /*
              TRIANGLE EXISTENCE

DEFINITION:

Triangle Existence means checking whether three given sides
can form a valid triangle.

For three sides a, b and c to form a triangle:

    a + b > c
    a + c > b
    b + c > a

All three conditions must be TRUE.

SYNTAX / LOGIC


if (a + b > c && a + c > b && b + c > a) {
    // Triangle exists
}
else {
    // Triangle does not exist
}

IMPORTANT:

&& means AND.

All three conditions must be true.

Example:

a = 3
b = 4
c = 5

3 + 4 > 5  → TRUE
3 + 5 > 4  → TRUE
4 + 5 > 3  → TRUE

Therefore, triangle exists.

*/

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take three sides as input
            System.out.print("Enter side a: ");
            int a = sc.nextInt();

            System.out.print("Enter side b: ");
            int b = sc.nextInt();

            System.out.print("Enter side c: ");
            int c = sc.nextInt();

            // Check whether the three sides can form a triangle
            if (a + b > c && a + c > b && b + c > a) {

                // All conditions are true
                System.out.println("Triangle Exists");

            } else {

                // At least one condition is false
                System.out.println("Triangle Does Not Exist");
            }

            sc.close();
        }
    }
