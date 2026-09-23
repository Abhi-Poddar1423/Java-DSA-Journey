package CO1JavaFundamentals;

public class C06_Operators {
        public static void main(String[] args) {


            // 1. ARITHMETIC OPERATORS
//            -------------------------------------

            int a = 20;
            int b = 6;

            // + : Adds two values
            System.out.println("Addition = " + (a + b));

            // - : Subtracts the second value from the first value
            System.out.println("Subtraction = " + (a - b));

            // * : Multiplies two values
            System.out.println("Multiplication = " + (a * b));

            // / : Divides the first value by the second value
            System.out.println("Division = " + (a / b));

            // % : Returns the remainder after division
            System.out.println("Remainder = " + (a % b));



            // 2. UNARY OPERATORS
            // -----------------------------------

            int x = 5;

            // ++ : Increases the value by 1
            x++;
            System.out.println("Increment = " + x);

            // -- : Decreases the value by 1
            x--;
            System.out.println("Decrement = " + x);

            // + : Unary plus indicates a positive value
            int positive = +x;
            System.out.println("Unary Plus = " + positive);

            // - : Unary minus changes the sign of a value
            int negative = -x;
            System.out.println("Unary Minus = " + negative);

            // ! : Logical NOT reverses a boolean value
            boolean value = true;
            System.out.println("Logical NOT = " + (!value));



            // 3. ASSIGNMENT OPERATORS
            // ------------------------------------

            int num = 10;

            // = : Assigns the right-side value to the left-side variable
            num = 20;
            System.out.println("= : " + num);

            // += : Adds the right value and assigns the result
            num += 5;
            System.out.println("+= : " + num);

            // -= : Subtracts the right value and assigns the result
            num -= 5;
            System.out.println("-= : " + num);

            // *= : Multiplies and assigns the result
            num *= 2;
            System.out.println("*= : " + num);

            // /= : Divides and assigns the result
            num /= 2;
            System.out.println("/= : " + num);

            // %= : Finds remainder and assigns the result
            num %= 3;
            System.out.println("%= : " + num);



            // 4. RELATIONAL / COMPARISON OPERATORS
            //--------------------------------------------

            int p = 10;
            int q = 20;

            // == : Checks whether two values are equal
            System.out.println("Equal to = " + (p == q));

            // != : Checks whether two values are not equal
            System.out.println("Not equal to = " + (p != q));

            // > : Checks whether left value is greater than right value
            System.out.println("Greater than = " + (p > q));

            // < : Checks whether left value is smaller than right value
            System.out.println("Less than = " + (p < q));

            // >= : Checks whether left value is greater than or equal to right value
            System.out.println("Greater than or equal = " + (p >= q));

            // <= : Checks whether left value is smaller than or equal to right value
            System.out.println("Less than or equal = " + (p <= q));



            // 5. LOGICAL OPERATORS
            // -------------------------------

            int age = 20;
            boolean hasID = true;

            // && : Returns true only when both conditions are true
            System.out.println("Logical AND = " + (age >= 18 && hasID));

            // || : Returns true when at least one condition is true
            System.out.println("Logical OR = " + (age >= 18 || hasID));

            // ! : Reverses the boolean result
            System.out.println("Logical NOT = " + !(age >= 18));



            // 6. BITWISE OPERATORS
            // ---------------------------------------

            int m = 5;  // Binary: 0101
            int n = 3;  // Binary: 0011

            // & : Performs AND operation bit by bit
            System.out.println("Bitwise AND = " + (m & n));

            // | : Performs OR operation bit by bit
            System.out.println("Bitwise OR = " + (m | n));

            // ^ : Performs XOR operation bit by bit
            System.out.println("Bitwise XOR = " + (m ^ n));

            // ~ : Reverses every bit of the number
            System.out.println("Bitwise NOT = " + (~m));



            // 7. SHIFT OPERATORS
            // --------------------------------

            int number = 8;

            // << : Shifts bits to the left
            System.out.println("Left Shift = " + (number << 1));

            // >> : Shifts bits to the right
            System.out.println("Right Shift = " + (number >> 1));

            // >>> : Unsigned right shift
            System.out.println("Unsigned Right Shift = " + (number >>> 1));



            // 8. TERNARY OPERATOR
            // ---------------------------------

            int marks = 75;

            // ?: : Short form of a simple if-else statement
            String result = (marks >= 40) ? "Pass" : "Fail";

            System.out.println("Ternary Result = " + result);



            // 9. instanceof OPERATOR
            // ----------------------------------

            String name = "Java";

            // instanceof : Checks whether an object belongs to a particular type
            System.out.println("instanceof Result = " + (name instanceof String));
        }
    }
