package CO2_ConditionalStatements;
import java.util.Scanner;
public class C11_TernaryOperator {
     /*
Ternary Operator:

The ternary operator is used to make a decision between
two values based on a condition.

It is called "ternary" because it has 3 parts:

1. Condition
2. Value when condition is TRUE
3. Value when condition is FALSE

Operator symbols:

?
*/
//      Syntax: result = (condition) ? valueIfTrue : valueIfFalse;


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int marks = sc.nextInt();

            // Ternary Operator
            String result = (marks >= 40) ? "Pass" : "Fail";

            System.out.println(result);
        }
    }


