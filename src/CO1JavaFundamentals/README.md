# ☕ Java Fundamentals

> **Learn the basics of Java step by step and build a strong programming foundation.**

---

# 📚 Topics Covered

1. [Variables](#1-variables)
2. [Data Types](#2-data-types)
3. [Type Casting](#3-type-casting)
4. [Operators](#4-operators)
5. [Input and Output](#5-input-and-output)

---

# 1. 📦 Variables

## What is a Variable?

A **variable** is a named memory location used to store a value.

In simple words:

> **A variable is like a container that stores data.**

### Example

```java
int age = 20;
```

Here:

* `int` → Data Type
* `age` → Variable Name
* `20` → Value
* `=` → Assignment Operator

---

## Variable Syntax

```java
dataType variableName = value;
```

Example:

```java
String name = "Abhishek";
int age = 20;
double marks = 85.5;
```

---

## Declaration

Declaration means creating a variable by specifying its type and name.

```java
int age;
```

---

## Initialization

Initialization means giving an initial value to a variable.

```java
int age = 20;
```

We can also do it separately:

```java
int age;
age = 20;
```

---

## Reassignment

A variable's value can be changed.

```java
int age = 20;

age = 21;
```

Now:

```text
age = 21
```

---

## Variable Naming Rules

### Allowed

```java
studentName
studentAge
totalMarks
student_1
```

### Not Allowed

```java
1age          // Cannot start with a digit
student age   // Spaces are not allowed
class         // Java keyword
```

Java is case-sensitive:

```java
age
Age
```

These are different variable names.

---

## Constants

A constant is a value that should not be changed.

Use the `final` keyword:

```java
final double PI = 3.14159;
```

Constants are commonly written in uppercase.

```java
final int MAX_VALUE = 100;
```

---

## Types of Variables

Java has three main types of variables:

1. **Local Variable**
2. **Instance Variable**
3. **Static Variable**

---

## Declaration vs Initialization vs Assignment

| Concept        | Meaning                | Example         |
| -------------- | ---------------------- | --------------- |
| Declaration    | Creates a variable     | `int age;`      |
| Initialization | Gives initial value    | `int age = 20;` |
| Assignment     | Gives or changes value | `age = 25;`     |

---

# 2. 🔢 Data Types

## What is a Data Type?

A **data type** specifies what type of value a variable can store.

Example:

```java
int age = 20;
double percentage = 85.5;
char grade = 'A';
boolean passed = true;
```

---

## Types of Data Types

Java data types are mainly divided into:

```text
                 DATA TYPES
                     │
          ┌──────────┴──────────┐
          ↓                     ↓
     PRIMITIVE             NON-PRIMITIVE
          │                     │
      8 types             Reference Types
```

---

## Primitive Data Types

Java has **8 primitive data types**:

| Data Type |          Size | Used For                |
| --------- | ------------: | ----------------------- |
| `byte`    |        1 byte | Small integers          |
| `short`   |       2 bytes | Small/medium integers   |
| `int`     |       4 bytes | Whole numbers           |
| `long`    |       8 bytes | Large integers          |
| `float`   |       4 bytes | Decimal numbers         |
| `double`  |       8 bytes | Precise decimal numbers |
| `char`    |       2 bytes | Single character        |
| `boolean` | JVM-dependent | `true` / `false`        |

---

## Non-Primitive Data Types

Examples:

```text
String
Array
Class
Object
Interface
```

These are reference types.

---

## Common Primitive Types

### `int`

Used for whole numbers.

```java
int age = 20;
```

### `double`

Used for decimal values.

```java
double price = 99.99;
```

### `char`

Used for a single character.

```java
char grade = 'A';
```

### `boolean`

Stores only:

```text
true
false
```

Example:

```java
boolean isStudent = true;
```

---

## String

`String` stores a sequence of characters.

```java
String name = "Abhishek";
```

> `String` is **not a primitive data type**. It is a class in Java.

---

## Array

An array stores multiple values of the same type.

```java
int[] marks = {80, 85, 90};
```

Array indexing starts from `0`.

```text
marks[0] → 80
marks[1] → 85
marks[2] → 90
```

---

## Primitive vs Non-Primitive

| Primitive               | Non-Primitive          |
| ----------------------- | ---------------------- |
| Basic data types        | Reference types        |
| 8 types                 | Many types             |
| Stores a value          | Stores a reference     |
| `int`, `double`, `char` | `String`, Array, Class |

---

# 3. 🔄 Type Casting

## What is Type Casting?

**Type Casting** means converting a value from one data type to another data type.

Example:

```java
int number = 10;

double value = number;
```

Here:

```text
int → double
```

---

## Types of Type Casting

There are two main types:

1. **Widening Type Casting**
2. **Narrowing Type Casting**

---

## Widening Type Casting

Widening means converting a smaller data type into a larger data type.

```text
Small → Large
```

Example:

```java
int number = 10;

double value = number;
```

This is usually automatic.

### Flow

```text
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
```

---

## Narrowing Type Casting

Narrowing means converting a larger data type into a smaller data type.

```text
Large → Small
```

It requires explicit casting.

### Syntax

```java
smallDataType variable = (smallDataType) value;
```

Example:

```java
double number = 10.75;

int value = (int) number;

System.out.println(value);
```

Output:

```text
10
```

The decimal part is removed.

---

## Widening vs Narrowing

| Feature   | Widening          | Narrowing      |
| --------- | ----------------- | -------------- |
| Direction | Small → Large     | Large → Small  |
| Example   | `int → double`    | `double → int` |
| Casting   | Usually automatic | Explicit       |
| Data Loss | Generally no      | Possible       |

---

## Explicit Casting

Explicit casting means manually specifying the target data type.

```java
double marks = 85.75;

int result = (int) marks;
```

Here:

```java
(int)
```

is the explicit cast.

---

## Type Casting in Division

Without casting:

```java
int a = 10;
int b = 3;

double result = a / b;

System.out.println(result);
```

Output:

```text
3.0
```

Because:

```text
int / int = int
```

With casting:

```java
int a = 10;
int b = 3;

double result = (double) a / b;

System.out.println(result);
```

Output:

```text
3.3333333333333335
```

---

## String to int

String to `int` is called **parsing**, not primitive type casting.

```java
String number = "500";

int value = Integer.parseInt(number);
```

---

# 4. ➕ Operators

## What is an Operator?

An **operator** is a symbol used to perform an operation on values or variables.

Example:

```java
int a = 10;
int b = 5;

int sum = a + b;
```

Here:

```text
+ → Operator
a → Operand
b → Operand
```

---

## Types of Operators in Java

```text
Operators
   │
   ├── Arithmetic
   ├── Assignment
   ├── Relational
   ├── Logical
   ├── Unary
   ├── Increment / Decrement
   ├── Ternary
   └── Bitwise
```

---

## 4.1 Arithmetic Operators

Arithmetic operators are used for mathematical calculations.

| Operator | Meaning             | Example |
| -------- | ------------------- | ------- |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus / Remainder | `a % b` |

### Example

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Output:

```text
13
7
30
3
1
```

---

## 4.2 Assignment Operators

Assignment operators are used to assign or update values.

| Operator | Example  | Meaning     |
| -------- | -------- | ----------- |
| `=`      | `a = 10` | Assign      |
| `+=`     | `a += 5` | `a = a + 5` |
| `-=`     | `a -= 5` | `a = a - 5` |
| `*=`     | `a *= 5` | `a = a * 5` |
| `/=`     | `a /= 5` | `a = a / 5` |
| `%=`     | `a %= 5` | `a = a % 5` |

Example:

```java
int score = 50;

score += 10;

System.out.println(score);
```

Output:

```text
60
```

---

## 4.3 Relational Operators

Relational operators compare two values.

The result is always:

```text
true
```

or

```text
false
```

| Operator | Meaning                  |
| -------- | ------------------------ |
| `==`     | Equal to                 |
| `!=`     | Not equal to             |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |

Example:

```java
int age = 20;

System.out.println(age >= 18);
```

Output:

```text
true
```

---

## 4.4 Logical Operators

Logical operators are used to combine conditions.

| Operator | Meaning |   |    |
| -------- | ------- | - | -- |
| `&&`     | AND     |   |    |
| `        |         | ` | OR |
| `!`      | NOT     |   |    |

### AND `&&`

Both conditions must be true.

```java
int age = 20;

System.out.println(age >= 18 && age <= 60);
```

### OR `||`

At least one condition must be true.

```java
int age = 20;

System.out.println(age < 18 || age > 60);
```

### NOT `!`

Reverses the result.

```java
boolean isStudent = true;

System.out.println(!isStudent);
```

Output:

```text
false
```

---

## 4.5 Unary Operators

Unary operators work with one operand.

Common unary operators:

```text
+
-
!
++
--
```

Example:

```java
int a = 10;

System.out.println(-a);
```

Output:

```text
-10
```

---

## 4.6 Increment and Decrement Operators

### Increment `++`

Increases the value by `1`.

```java
int a = 10;

a++;

System.out.println(a);
```

Output:

```text
11
```

### Decrement `--`

Decreases the value by `1`.

```java
int a = 10;

a--;

System.out.println(a);
```

Output:

```text
9
```

---

## 4.7 Ternary Operator

The ternary operator is a short form of `if-else`.

### Syntax

```java
condition ? valueIfTrue : valueIfFalse;
```

Example:

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";

System.out.println(result);
```

Output:

```text
Adult
```

---

## 4.8 Bitwise Operators

Bitwise operators work at the bit level.

| Operator | Meaning              |            |
| -------- | -------------------- | ---------- |
| `&`      | Bitwise AND          |            |
| `        | `                    | Bitwise OR |
| `^`      | Bitwise XOR          |            |
| `~`      | Bitwise NOT          |            |
| `<<`     | Left Shift           |            |
| `>>`     | Right Shift          |            |
| `>>>`    | Unsigned Right Shift |            |

Example:

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

---

## Operator Quick Revision

```text
+  -  *  /  %     → Arithmetic
=  += -= *= /=    → Assignment
== != > < >= <=   → Relational
&& || !           → Logical
++ --             → Increment / Decrement
? :               → Ternary
& | ^ ~ << >> >>> → Bitwise
```

---

# 5. ⌨️ Input and Output

## What is Input?

**Input** means taking data from the user.

Example:

```java
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();
```

---

## What is Output?

**Output** means displaying information on the screen.

Java commonly uses:

```java
System.out.print();
System.out.println();
System.out.printf();
```

---

# Output Methods

## `print()`

Prints output on the same line.

```java
System.out.print("Hello ");
System.out.print("Java");
```

Output:

```text
Hello Java
```

> `print()` → Same line

---

## `println()`

Prints output and moves to the next line.

```java
System.out.println("Hello");
System.out.println("Java");
```

Output:

```text
Hello
Java
```

> `println()` → New line

---

## `printf()`

Used for formatted output.

```java
String name = "Abhishek";
int age = 20;
double marks = 85.50;

System.out.printf("Name: %s%n", name);
System.out.printf("Age: %d%n", age);
System.out.printf("Marks: %.2f%n", marks);
```

Output:

```text
Name: Abhishek
Age: 20
Marks: 85.50
```

---

# Scanner Class

Java provides the `Scanner` class to take input from the user.

First import it:

```java
import java.util.Scanner;
```

Create a Scanner object:

```java
Scanner sc = new Scanner(System.in);
```

---

## Common Scanner Methods

| Method             | Used For          |
| ------------------ | ----------------- |
| `nextInt()`        | Integer           |
| `nextDouble()`     | Double            |
| `nextFloat()`      | Float             |
| `nextLong()`       | Long              |
| `nextShort()`      | Short             |
| `nextByte()`       | Byte              |
| `next()`           | Single word/token |
| `nextLine()`       | Complete line     |
| `nextBoolean()`    | Boolean           |
| `next().charAt(0)` | Character         |

---

## Taking String Input

```java
System.out.print("Enter your name: ");

String name = sc.nextLine();

System.out.println("Your name is: " + name);
```

---

## Taking Integer Input

```java
System.out.print("Enter your age: ");

int age = sc.nextInt();

System.out.println("Age: " + age);
```

---

## Taking Double Input

```java
System.out.print("Enter your percentage: ");

double percentage = sc.nextDouble();

System.out.println("Percentage: " + percentage);
```

---

## Taking Character Input

Scanner does not have a direct `nextChar()` method.

Use:

```java
char character = sc.next().charAt(0);
```

Example:

```java
System.out.print("Enter a character: ");

char character = sc.next().charAt(0);

System.out.println("Character: " + character);
```

---

## Taking Boolean Input

```java
System.out.print("Enter true or false: ");

boolean value = sc.nextBoolean();

System.out.println("Value: " + value);
```

---

# Simple Input Program

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
```

### Output

```text
Enter first number: 10
Enter second number: 20
Sum = 30
```

---

# 🧠 Quick Revision

```text
VARIABLE
→ Stores data

DATA TYPE
→ Defines what type of data can be stored

TYPE CASTING
→ Converts one data type into another

OPERATOR
→ Performs an operation

INPUT
→ Takes data from the user

OUTPUT
→ Displays data on the screen
```

---

# 🚀 Java Fundamentals Completed

```text
Java Fundamentals
       │
       ├── Variables
       ├── Data Types
       ├── Type Casting
       ├── Operators
       └── Input & Output
```

> **Next Step → Conditional Statements**
