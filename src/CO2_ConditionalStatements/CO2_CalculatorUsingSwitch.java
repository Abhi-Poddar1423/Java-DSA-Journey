package CO2_ConditionalStatements;

import java.util.Scanner;
public class CO2_CalculatorUsingSwitch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double n1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        double n2 = sc.nextInt();

        // Take operator

        System.out.print("Enter Operator(+,-,*,/ %,)");
        char operator = sc.next().charAt(0);

        // Select operation based on operator
        switch (operator){

            case '+':
                System.out.println("Result = " +(n1 + n2));
                break;
            case '-':
                System.out.println("Result = " +(n1 - n2));
                break;
            case '*':
                System.out.println("Result = " +(n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                System.out.println("Result = " + (n1 / n2));
            } else {
                System.out.println("Cannot divide by zero");
            }
                break;

            // Invalid operator
            default:
                System.out.println("Invalid Operator");
            case '%':
                System.out.println("Result = " +(n1 % n2));
                break;






        }


    }
}
