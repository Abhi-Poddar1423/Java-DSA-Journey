package CO1JavaFundamentals;

/*
                CO1.5 - DATA TYPES

WHAT ARE DATA TYPES?
------------------------------------------------------------

Data Type tells Java what type of value a variable can store.

Examples:
    int     → Integer numbers
    double  → Decimal numbers
    char    → Single character
    boolean → true or false
    String  → Text

Java Data Types are mainly divided into:

1. Primitive Data Types
2. Non-Primitive / Reference Data Types

Primitive Data Types:
    byte
    short
    int
    long
    float
    double
    char
    boolean

*/

public class CO1_5_Data_Types {

    public static void main(String[] args) {

        // 1. BYTE
        // byte stores small integer values.
        byte age = 20;

        System.out.println("Byte: " + age);

        // 2. SHORT
        // short stores larger integer values than byte.
        short year = 2026;

        System.out.println("Short: " + year);

        // 3. INT
        // int is commonly used to store whole numbers.
        int marks = 85;

        System.out.println("Int: " + marks);

        // 4. LONG
        // long is used for very large integer values.
        // 'L' is written at the end of a long literal.
        long population = 1400000000L;

        System.out.println("Long: " + population);

        // 5. FLOAT
        // float stores decimal values.
        // 'f' is required for a float literal.
        float percentage = 85.5f;

        System.out.println("Float: " + percentage);

        // 6. DOUBLE
        // double stores decimal values with higher precision
        // than float.
        double price = 999.99;

        System.out.println("Double: " + price);

        // 7. CHAR
        // char stores a single character.
        // Character is written inside single quotes.
        char grade = 'A';

        System.out.println("Char: " + grade);

        // 8. BOOLEAN
        // boolean stores only true or false.
        boolean isPassed = true;

        System.out.println("Boolean: " + isPassed);

        // 9. STRING
        // String is a reference type used to store text.
        // String is written inside double quotes.
        String name = "Abhishek";

        System.out.println("String: " + name);

        // 10. USING DIFFERENT DATA TYPES TOGETHER

        int subjectMarks = 90;
        double average = 87.5;
        char section = 'A';
        boolean passed = true;
        String studentName = "Rahul";

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + subjectMarks);
        System.out.println("Average: " + average);
        System.out.println("Section: " + section);
        System.out.println("Passed: " + passed);
    }
}


