package CO2_ConditionalStatement;

import java.util.Scanner;
public class JO10_CheckMagnitude {
    /*
                 CHECK MAGNITUDE IN JAVA

DEFINITION:

Magnitude means the distance of a number from zero.

In simple words:

Magnitude = Absolute value of a number

Examples:

Number       Magnitude
  10            10
  -10           10
   0             0

LOGIC

If number is negative:
    magnitude = -number

Otherwise:
    magnitude = number

SYNTAX

magnitude = (number < 0) ? -number : number;

Here:

condition      → number < 0
if true        → -number
if false       → number

*/

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take number from user
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Check whether number is negative
            // If negative, convert it to positive
            // Otherwise, keep the number unchanged
            int magnitude = (number < 0) ? -number : number;

            // Display magnitude
            System.out.println("Magnitude = " + magnitude);

            sc.close();
        }
    }


