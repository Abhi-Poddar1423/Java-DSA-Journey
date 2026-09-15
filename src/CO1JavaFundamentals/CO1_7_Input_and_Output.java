package CO1JavaFundamentals;

/*
              CO1.8 - INPUT AND OUTPUT

INPUT:
Input means taking data from the user.

OUTPUT:
Output means displaying information on the screen.

In Java, we commonly use:

OUTPUT:
    System.out.print()
    System.out.println()
    System.out.printf()

INPUT:
    Scanner class
*/

import java.util.Scanner;

public class CO1_7_Input_and_Output {

    public static void main(String[] args) {

        //
        // 1. OUTPUT USING print()
        // --------------------------------------------------
        // print() displays output but does not move
        // the cursor to the next line.

        System.out.print("Hello ");
        System.out.print("Java");

        // Output:
        // Hello Java


        // --------------------------------------------------
        // 2. OUTPUT USING println()
        // --------------------------------------------------
        // println() displays output and moves the cursor
        // to the next line.

        System.out.println("\nWelcome to Java");
        System.out.println("Learning Input and Output");


        // --------------------------------------------------
        // 3. OUTPUT USING printf()
        // --------------------------------------------------
        // printf() is used to display formatted output.

        String name = "Abhishek";
        int age = 20;
        double marks = 85.50;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Marks: %.2f%n", marks);


        // --------------------------------------------------
        // 4. TAKING INPUT USING SCANNER
        // --------------------------------------------------
        // Scanner is used to take input from the user.

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter your age: ");
        int studentAge = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Percentage: " + percentage);


        // --------------------------------------------------
        // 5. TAKING DIFFERENT TYPES OF INPUT
        // --------------------------------------------------

        System.out.print("\nEnter an integer: ");
        int number = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble();

        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        System.out.print("Enter true or false: ");
        boolean value = sc.nextBoolean();

        System.out.println("\nEntered Values:");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimalNumber);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + value);


        // --------------------------------------------------
        // 6. SIMPLE CALCULATION USING INPUT
        // --------------------------------------------------

        System.out.print("\nEnter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum = " + sum);


        // Close Scanner
        sc.close();
    }
}


