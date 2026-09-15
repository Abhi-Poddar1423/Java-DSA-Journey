package CO1JavaFundamentals;

/*
              CO1.6 - TYPE CASTING

    WHAT IS TYPE CASTING?
------------------------------------------------------------

Type Casting means converting a value from one data type
to another data type.

In simple words:

Example:

    int number = 10;
    double value = number;

Here:

    int → double

The integer value 10 is converted into double value 10.0.



1. TYPES OF TYPE CASTING

There are mainly two types of type casting in Java:

    1. Widening Type Casting
    2. Narrowing Type Casting

2. WIDENING TYPE CASTING
----------------------------------------------

Widening means converting a smaller data type into a
larger data type.

Example:

    int → double

Widening casting is usually performed automatically by Java.

Syntax:

    largeDataType variable = smallDataTypeValue;

Example:

    int number = 10;
    double value = number;

Here:

    int → double

No explicit casting is required.

------------------------------------------------------------
WIDENING TYPE CASTING FLOW
------------------------------------------------------------

    byte
      ↓
    short
      ↓
    int
      ↓
    long
      ↓
    float
      ↓
    double

Small data type → Large data type

Example:


    int number = 100;

    double value = number;

Output:

    100
    100.0



3. NARROWING TYPE CASTING

  --> Narrowing means converting a larger data type into a
      smaller data type.

Example:

    double → int

Unlike widening, narrowing requires explicit casting.

Syntax:

    smallDataType variable = (smallDataType) value;

Example:

    double number = 10.75;

    int value = (int) number;

Output:

    10

The decimal part .75 is removed.

------------------------------------------------------------
NARROWING TYPE CASTING FLOW
------------------------------------------------------------

    double
      ↓
    float
      ↓
    long
      ↓
    int
      ↓
    short
      ↓
    byte

Large data type → Small data type

Narrowing can cause data loss.



4. DIFFERENCE BETWEEN WIDENING AND NARROWING


WIDENING:

    Small → Large

    Example:
    int → double

    Usually automatic

    Generally safer


NARROWING:

    Large → Small

    Example:
    double → int

    Requires explicit casting

    May cause data loss



5. EXPLICIT CASTING


 --> When we manually specify the data type, it is called
    explicit casting.

Syntax:

    (dataType) value

Example:

    double marks = 85.75;

    int result = (int) marks;

Here:

    (int)

is the explicit cast.

Result:

    85



6. TYPE CASTING WITH INTEGER AND DOUBLE
*/

public class CO1_6_Type_Casting {

    public static void main(String[] args) {

        // 1. WIDENING TYPE CASTING
        // int → double


        int number = 100;

        // Java automatically converts int into double
        double value = number;

        System.out.println("Widening Type Casting:");
        System.out.println("Integer Value : " + number);
        System.out.println("Double Value  : " + value);



        // 2. NARROWING TYPE CASTING
        // double → int


        double marks = 85.75;

        // Explicitly converting double into int
        int integerMarks = (int) marks;

        System.out.println("\nNarrowing Type Casting:");
        System.out.println("Original Value : " + marks);
        System.out.println("After Casting  : " + integerMarks);


        // 3. CHAR → INT


        char letter = 'A';

        // char can be widened to int
        int numberValue = letter;

        System.out.println("\nCharacter to Integer:");
        System.out.println("Character : " + letter);
        System.out.println("Integer   : " + numberValue);

        // 4. INT → CHAR


        int asciiValue = 66;

        // Explicitly converting int into char
        char character = (char) asciiValue;

        System.out.println("\nInteger to Character:");
        System.out.println("Integer   : " + asciiValue);
        System.out.println("Character : " + character);

        // 5. TYPE CASTING IN DIVISION


        int a = 10;
        int b = 3;

        // Without casting, int / int gives an integer result.
        // Casting a to double gives a decimal result.
        double result = (double) a / b;

        System.out.println("\nType Casting in Division:");
        System.out.println("Result: " + result);

        // 6. STRING TO INT

        /*
        String to int is NOT traditional type casting.

        It is called parsing/conversion.

        String:
            "500"

        Integer:
            500

        Integer.parseInt() converts the String into int.
        */

        String numberString = "500";

        int convertedNumber = Integer.parseInt(numberString);

        System.out.println("\nString to Integer:");
        System.out.println("String  : " + numberString);
        System.out.println("Integer : " + convertedNumber);
    }
}

