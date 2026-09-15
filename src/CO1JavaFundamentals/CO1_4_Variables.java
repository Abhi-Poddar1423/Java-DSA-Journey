package CO1JavaFundamentals;

import java.util.Scanner;

public class CO1_4_Variables {

    // 1. INSTANCE VARIABLES

    String studentName;
    int studentAge;

    // 2. STATIC VARIABLE

    static String college = "CGC University";

    public static void main(String[] args) {

        // 3. DECLARATION

        int age;
        // 4. INITIALIZATION / ASSIGNMENT

        age = 20;

        System.out.println("Age: " + age);


        // 5. DECLARATION + INITIALIZATION

        String name = "Abhishek";
        double marks = 85.5;
        char grade = 'A';
        boolean passed = true;

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);



        // 6. MULTIPLE VARIABLES

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);



        // 7. VARIABLE REASSIGNMENT

        age = 21;

        System.out.println("Updated Age: " + age);



        // 8. VARIABLES IN CALCULATIONS


        int sum = a + b;
        int difference = b - a;
        int multiplication = a * b;
        int division = b / a;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        // 9. UPDATING A VARIABLE

        int score = 50;

        score = score + 10;

        System.out.println("Updated Score: " + score);

        // Short form
        score += 10;

        System.out.println("Score after += 10: " + score);

        // 10. CONSTANT USING final

        final double PI = 3.14159;
       final int MAX_MARKS = 100;

        System.out.println("PI: " + PI);
        System.out.println("Maximum Marks: " + MAX_MARKS);

        // PI = 4.5;          // ERROR
        // MAX_MARKS = 200;  // ERROR

        // 11. CASE-SENSITIVE VARIABLES


        int number = 100;
        int Number = 200;

        System.out.println("number: " + number);
        System.out.println("Number: " + Number);

        // 12. CAMEL CASE NAMING


        String studentName = "Rahul";
        int studentAge = 20;
        double totalMarks = 450;

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Total Marks: " + totalMarks);

        // 13. LOCAL VARIABLE


        int localVariable = 500;

        System.out.println("Local Variable: " + localVariable);

        // 14. INSTANCE VARIABLE


        CO1_4_Variables student = new CO1_4_Variables();

        student.studentName = "Abhishek";
        student.studentAge = 20;

        System.out.println("Instance Name: " + student.studentName);
        System.out.println("Instance Age: " + student.studentAge);

        // 15. STATIC VARIABLE


        System.out.println("College: " + CO1_4_Variables.college);

        // 16. VARIABLE SCOPE

        int outsideValue = 100;

        if (true) {

            int insideValue = 200;

            System.out.println("Outside Value: " + outsideValue);
            System.out.println("Inside Value: " + insideValue);
        }

        // insideValue cannot be accessed here


        // 17. USER INPUT USING VARIABLES


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        System.out.print("Enter your marks: ");
        double userMarks = sc.nextDouble();

        System.out.println("Your Age: " + userAge);
        System.out.println("Your Marks: " + userMarks);



        // 18. STRING CONCATENATION


        System.out.println(
                "My name is " + name +
                        " and my age is " + userAge
        );

        // 19. REAL-LIFE STUDENT INFORMATION SYSTEM


        String finalStudentName = "Abhishek";
        int finalStudentAge = 20;
        int rollNumber = 101;
        double percentage = 85.5;
        char finalGrade = 'A';
        boolean finalPassed = true;

        System.out.println("\n===== STUDENT INFORMATION =====");

        System.out.println("Name: " + finalStudentName);
        System.out.println("Age: " + finalStudentAge);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + finalGrade);
        System.out.println("Passed: " + finalPassed);


        // 20. AREA CALCULATION


        int length = 10;
        int width = 5;

        int area = length * width;

        System.out.println("Rectangle Area: " + area);



        // 21. DEFAULT VALUES


        CO1_4_Variables obj = new CO1_4_Variables();

        System.out.println("\n===== DEFAULT VALUES =====");

        System.out.println("Default String: " + obj.studentName);
        System.out.println("Default int: " + obj.studentAge);

        /*
         * Instance variables automatically get default values.
         *
         * int     -> 0
         * double  -> 0.0
         * boolean -> false
         * char    -> '\u0000'
         * Object  -> null
         */


        // 22. IMPORTANT VARIABLE NAMING RULES

        // Correct examples:

        int age1 = 20;
        int student_1 = 30;
        int $value = 100;

        System.out.println(age1);
        System.out.println(student_1);
        System.out.println($value);

        // Wrong examples:

        // int 1age = 20;           // Cannot start with number
        // int student age = 20;    // Spaces not allowed
        // int class = 10;          // Keyword cannot be used



        // 23. DECLARATION vs INITIALIZATION vs ASSIGNMENT


        // Declaration
        int newAge;

        // Initialization / First Assignment
        newAge = 20;

        System.out.println("Initial Age: " + newAge);

        // Reassignment
        newAge = 25;

        System.out.println("New Age: " + newAge);



        // 24. FINAL COMPLETE EXAMPLE

    System.out.println("\n===== COMPLETE EXAMPLE =====");

        String studentS = "Abhishek";
        int ageValue = 20;
        double percentageValue = 85.5;
        char gradeValue = 'A';
        boolean isPassed = true;

        System.out.println("Student: " + student);
        System.out.println("Age: " + ageValue);
        System.out.println("Percentage: " + percentageValue);
        System.out.println("Grade: " + gradeValue);
        System.out.println("Passed: " + isPassed);


        sc.close();
    }
}