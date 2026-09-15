package CO1JavaFundamentals;

//============================================================
//        CO1.3 - FIRST JAVA PROGRAM
//============================================================
//
//Topic:
//First Java Program
//
//------------------------------------------------------------
//1. INTRODUCTION
//------------------------------------------------------------
//
//After learning what Java is and understanding JDK, JRE and
//JVM, the next step is to write our first Java program.
//
//The most basic Java program is:
//
//    Hello World
//
//This program simply displays a message on the screen.
//
//------------------------------------------------------------
//2. FIRST JAVA PROGRAM
//------------------------------------------------------------
//
//Example:
//
    public class CO1_3_FirstJavaProgram {

        public static void main(String[] args) {

            System.out.println("Hello World");

        }
    }
//
//Output:
//
//    Hello Java
//
//------------------------------------------------------------
//3. UNDERSTANDING THE PROGRAM
//------------------------------------------------------------
//
//Let's understand each part of the program.
//
//------------------------------------------------------------
//3.1 PACKAGE
//------------------------------------------------------------
//   package CO1JavaFundamentals;

//The package is used to organize Java classes.
//
//Here:
//
//    co1JavaFundamentals
//        ↓
//    co1_3_first_java_program
//
//The package name should normally be written in lowercase.
//
//------------------------------------------------------------
//3.2 CLASS
//------------------------------------------------------------
//
//    public class CO1_3_FirstJavaProgram
//
//A class is a blueprint/container where Java code is written.
//
//Here the class name is:
//
//    CO1_3_FirstJavaProgram
//
//Important rule:
//
//If a class is declared as public, the Java file name should
//match the class name.
//
//Therefore:
//
//    Class:
//    CO1_3_FirstJavaProgram
//
//    File:
//    CO1_3_FirstJavaProgram.java
//
//------------------------------------------------------------
//3.3 PUBLIC
//------------------------------------------------------------
//
//    public
//
//public is an access modifier.
//
//It means that the class or method can be accessed from
//outside its class/package depending on the context.
//
//For our first program, public allows the main class and
//main method to be accessible to the Java runtime.
//
//------------------------------------------------------------
//3.4 CLASS
//------------------------------------------------------------
//
//    class
//
//class is a Java keyword used to define a class.
//
//Example:
//
//    class Student {
//    }
//
//Here, Student is a class.
//
//------------------------------------------------------------
//3.5 MAIN METHOD
//------------------------------------------------------------
//
//    public static void main(String[] args)
//
//The main() method is the starting point of a normal Java
//application.
//
//When we run a Java program, execution starts from:
//
//    main()
//
//------------------------------------------------------------
//3.6 PUBLIC IN MAIN METHOD
//------------------------------------------------------------
//
//    public static void main(String[] args)
//
//The main method is public so that the Java runtime can
//access and invoke it.
//
//------------------------------------------------------------
//3.7 STATIC
//------------------------------------------------------------
//
//    static
//
//static means the main method belongs to the class rather
//than requiring an object of the class to be created first.
//
//Because main() is static, the JVM can call it without
//creating an object of the class.
//
//------------------------------------------------------------
//3.8 VOID
//------------------------------------------------------------
//
//    void
//
//void means that the method does not return a value.
//
//The main() method does not return any value, so we use:
//
//    void
//
//------------------------------------------------------------
//3.9 MAIN
//------------------------------------------------------------
//
//    main
//
//main is the name of the method from which execution of a
//standard Java application begins.
//
//Example:
//
//    public static void main(String[] args)
//
//------------------------------------------------------------
//3.10 STRING
//------------------------------------------------------------
//
//    String
//
//String is a class in Java used to represent a sequence of
//characters.
//
//Example:
//
//    "Hello Java"
//
//is a String.
//
//------------------------------------------------------------
//3.11 STRING[] ARGS
//------------------------------------------------------------
//
//    String[] args
//
//This represents an array of String values.
//
//It is used to receive command-line arguments when a Java
//program is started from the command line.
//
//Example:
//
//    java CO1_3_First_Java_Program Hello
//
//Here, "Hello" can be received through args.
//
//For our basic program, we do not need to use args directly.
//
//------------------------------------------------------------
//4. SYSTEM.OUT.PRINTLN()
//------------------------------------------------------------
//
//    System.out.println("Hello Java");
//
//This statement displays text on the console.
//
//Let's break it down:
//
//    System
//       ↓
//    out
//       ↓
//    println()
//
//System:
//    A predefined Java class.
//
//out:
//    A standard output stream.
//
//println():
//    A method used to print something and then move the
//    cursor to the next line.
//
//Example:
//
//    System.out.println("Hello Java");
//
//Output:
//
//    Hello Java
//
//------------------------------------------------------------
//5. PRINTLN VS PRINT
//------------------------------------------------------------
//
//println():
//
//    System.out.println("Hello");
//    System.out.println("Java");
//
//Output:
//
//    Hello
//    Java
//
//
//print():
//
//    System.out.print("Hello");
//    System.out.print("Java");
//
//Output:
//
//    HelloJava
//
//Difference:
//
//    println() → prints and moves to a new line
//    print()   → prints without moving to a new line
//
//------------------------------------------------------------

//------------------------------------------------------------


//        --------------------------------------------------------------
//        7. SEMICOLON
//------------------------------------------------------------
//
//Most Java statements end with a semicolon:
//
//        ;
//
//Example:
//
//        System.out.println("Hello Java");
//
//The semicolon tells Java that the statement has ended.
//
//------------------------------------------------------------
//        8. CURLY BRACES
//------------------------------------------------------------
//
//Java uses curly braces:
//
//        {
//        }
//
//to define blocks of code.
//
//        Example:
//
//public class CO1_3_FirstJavaProgram {
//
//    public static void main(String[] args) {
//
//        System.out.println("Hello Java");
//
//    }
//}
//
//The first pair belongs to the class and the second pair
//        belongs to the main method.
//
//------------------------------------------------------------
//        15. HOW TO RUN A JAVA PROGRAM
//------------------------------------------------------------
//
//        After compilation, run the class using:
//
//java CO1_3_First_Java_Program
//
//Do NOT write:
//
//java CO1_3_First_Java_Program.java
//
//when using the traditional compile-then-run approach.
//
//Instead:
//
//javac CO1_3_First_Java_Program.java
//
//then:
//
//java CO1_3_First_avaProgram
//
//------------------------------------------------------------
//        16. COMPLETE EXECUTION FLOW
//------------------------------------------------------------
//
//CO1_3_First_Java_Program.java
//                 |
//                         ↓
//javac
//                 |
//                         ↓
//CO1_3_First_Java_Program.class
//                 |
//                         ↓
//JVM
//                 |
//                         ↓
//main() method
//                 |
//                         ↓
//                         System.out.println()
//                 |
//                         ↓
//Hello Java
//


//------------------------------------------------------------
//        23. FINAL PROGRAM
//------------------------------------------------------------
//
//
//
//public class CO1_3_First_Java_Program {
//
//    public static void main(String[] args) {
//
//        System.out.println("Hello Java");
//
//    }
//}
//
//
//============================================================
//                    END OF CO1.3
//============================================================
//
//