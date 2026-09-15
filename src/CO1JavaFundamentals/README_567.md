# ☕ CO1.5 — DATA TYPES IN JAVA

> **Topic:** Data Types in Java
---
# 📌 1. WHAT IS A DATA TYPE?

A **Data Type** specifies what type of value a variable can store.

### 💡 Example

```java
int age = 20;
double salary = 25000.50;
char grade = 'A';
boolean isStudent = true;
```

Here:

* `int` → stores integer numbers
* `double` → stores decimal numbers
* `char` → stores a single character
* `boolean` → stores `true` or `false`

---

# 📚 2. TYPES OF DATA TYPES IN JAVA

Java Data Types are mainly divided into **two categories**:

```text
                    DATA TYPES
                        │
              ┌─────────┴─────────┐
              ↓                   ↓
         Primitive          Non-Primitive
         Data Types         Data Types
```

### 1️⃣ Primitive Data Types

Java has **8 primitive data types**:

```text
byte
short
int
long
float
double
char
boolean
```

### 2️⃣ Non-Primitive Data Types

Examples:

```text
String
Array
Class
Object
Interface
```

---

# 🟢 3. PRIMITIVE DATA TYPES

Primitive data types are the **basic built-in data types** provided by Java.

Java has **8 primitive data types**.

| Data Type |           Size | Example   | Use                   |
| --------- | -------------: | --------- | --------------------- |
| `byte`    |         1 byte | `100`     | Small integers        |
| `short`   |        2 bytes | `10000`   | Small/medium integers |
| `int`     |        4 bytes | `50000`   | Whole numbers         |
| `long`    |        8 bytes | `500000L` | Large integers        |
| `float`   |        4 bytes | `10.5f`   | Decimal values        |
| `double`  |        8 bytes | `10.5`    | More precise decimals |
| `char`    |        2 bytes | `'A'`     | Single character      |
| `boolean` | JVM-dependent* | `true`    | True/false values     |

> **Note:** Java does not define a fixed storage size for `boolean`; its representation is JVM-dependent.

---

# 🔢 4. BYTE DATA TYPE

`byte` is used to store **small integer values**.

### 📌 Size

```text
1 byte = 8 bits
```

### 📌 Range

```text
-128 to 127
```

### 💻 Example

```java
byte age = 20;

System.out.println(age);
```

### 📤 Output

```text
20
```

### 🧠 Real-Life Example

A `byte` can be useful when working with a large amount of small numerical data where memory efficiency matters.

---

# 🔢 5. SHORT DATA TYPE

`short` is used to store integer values larger than `byte` but smaller than `int`.

### 📌 Size

```text
2 bytes
```

### 📌 Range

```text
-32,768 to 32,767
```

### 💻 Example

```java
short marks = 25000;

System.out.println(marks);
```

### 📤 Output

```text
25000
```

---

# 🔢 6. INT DATA TYPE

`int` is the **most commonly used integer data type** in Java.

### 📌 Size

```text
4 bytes
```

### 📌 Range

```text
-2,147,483,648
to
2,147,483,647
```

### 💻 Example

```java
int age = 20;

System.out.println(age);
```

### 📤 Output

```text
20
```

### 🧠 Real-Life Example

```java
int students = 500;
```

Here, `int` stores the number of students.

---

# 🔢 7. LONG DATA TYPE

`long` is used to store **very large integer values**.

### 📌 Size

```text
8 bytes
```

### 📌 Range

```text
-9,223,372,036,854,775,808
to
9,223,372,036,854,775,807
```

### 💻 Example

```java
long population = 1400000000L;

System.out.println(population);
```

### 📤 Output

```text
1400000000
```

### ⚠️ Important

When using a large integer literal with `long`, use `L` at the end:

```java
long number = 100000L;
```

---

# 🔢 8. FLOAT DATA TYPE

`float` is used to store **decimal numbers**.

### 📌 Size

```text
4 bytes
```

### 💻 Example

```java
float price = 99.99f;

System.out.println(price);
```

### 📤 Output

```text
99.99
```

### ⚠️ Important

A float value usually requires `f` or `F`:

```java
float value = 10.5f;
```

Without `f`, a decimal literal is treated as `double` by default.

---

# 🔢 9. DOUBLE DATA TYPE

`double` is used to store **decimal values with greater precision than float**.

### 📌 Size

```text
8 bytes
```

### 💻 Example

```java
double salary = 25000.75;

System.out.println(salary);
```

### 📤 Output

```text
25000.75
```

### 🧠 Important

Decimal values are treated as `double` by default.

Therefore:

```java
double value = 10.5;
```

is valid.

---

# 🔤 10. CHAR DATA TYPE

`char` is used to store a **single character**.

### 📌 Size

```text
2 bytes
```

Java `char` represents a **16-bit Unicode code unit**.

### 💻 Example

```java
char grade = 'A';

System.out.println(grade);
```

### 📤 Output

```text
A
```

### ⚠️ Important

A `char` value is written inside **single quotes**:

```java
char letter = 'A';
```

Not:

```java
char letter = "A";
```

---

# ✅ 11. BOOLEAN DATA TYPE

`boolean` is used to store only **two logical values**:

```text
true
false
```

### 💻 Example

```java
boolean isStudent = true;

System.out.println(isStudent);
```

### 📤 Output

```text
true
```

### 🧠 Real-Life Example

```java
boolean isLoggedIn = true;
```

This can represent whether a user is logged in.

---

# 🔵 12. NON-PRIMITIVE DATA TYPES

Non-primitive data types are also called **reference types**.

Examples include:

```text
String
Array
Class
Object
Interface
```

Unlike primitive types, reference variables store a **reference to an object**.

---

# 📝 13. STRING

`String` is used to store a **sequence of characters**.

### 💻 Example

```java
String name = "Abhishek";

System.out.println(name);
```

### 📤 Output

```text
Abhishek
```

### ⚠️ Important

`String` is **not a primitive data type**.

It is a **class** in Java.

---

# 📦 14. ARRAY

An **Array** is used to store multiple values of the same type.

### 💻 Example

```java
int[] marks = {80, 85, 90};

System.out.println(marks[0]);
```

### 📤 Output

```text
80
```

Array indexing starts from:

```text
0
```

Therefore:

```text
marks[0] → 80
marks[1] → 85
marks[2] → 90
```

---

# 🏗️ 15. CLASS

A **Class** is a blueprint for creating objects.

### 💻 Example

```java
class Student {

    String name;
    int age;
}
```

Here:

```text
Student
```

is a class.

---

# 🧑‍💻 16. OBJECT

An **Object** is an instance of a class.

### 💻 Example

```java
class Student {

    String name;
    int age;
}

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Abhishek";
        student.age = 20;

        System.out.println(student.name);
        System.out.println(student.age);
    }
}
```

### 📤 Output

```text
Abhishek
20
```

---

# 🔌 17. INTERFACE

An **Interface** is a reference type that can define a contract that classes can implement.

### 💻 Example

```java
interface Vehicle {

    void start();
}
```

A class can implement the interface:

```java
class Car implements Vehicle {

    public void start() {

        System.out.println("Car started");
    }
}
```

---

# ⚖️ 18. PRIMITIVE VS NON-PRIMITIVE

| Primitive               | Non-Primitive                          |
| ----------------------- | -------------------------------------- |
| Basic data types        | Reference types                        |
| 8 types                 | Many types                             |
| Stores a value          | Stores a reference to an object        |
| Examples: `int`, `char` | Examples: `String`, Array, Class       |
| Built into Java         | Includes classes/interfaces and arrays |

---

# 
---

# 📝 21. IMPORTANT POINTS

* Java has **8 primitive data types**.
* `byte` uses **1 byte**.
* `short` uses **2 bytes**.
* `int` uses **4 bytes**.
* `long` uses **8 bytes**.
* `float` uses **4 bytes**.
* `double` uses **8 bytes**.
* `char` uses **2 bytes**.
* `char` represents a **16-bit Unicode code unit**.
* `boolean` stores only `true` or `false`.
* `String` is **not a primitive data type**.
* Arrays are **reference types**.
* A class is a **blueprint for objects**.
* An object is an **instance of a class**.
* Decimal literals are `double` by default.
* Use `f`/`F` for float literals.
* Use `L`/`l` for large `long` literals.

---

# 🎯 22. ONE-LINE REVISION

```text
                    JAVA DATA TYPES
                          │
             ┌────────────┴────────────┐
             ↓                         ↓
        PRIMITIVE                NON-PRIMITIVE
             │                         │
      ┌──────┴──────┐          ┌───────┴────────┐
      ↓             ↓          ↓       ↓        ↓
   Numeric       Others      String   Array    Class
      │
 ┌────┴──────────────┐
 ↓                   ↓
Integer           Decimal
 ↓                   ↓
byte              float
short             double
int
long

Others:
char
boolean
```
# ☕ CO1.6 — TYPE CASTING IN JAVA

> **Topic:** Type Casting:
# 📌 1. WHAT IS TYPE CASTING?

**Type Casting** means converting a value from one data type to another data type.

### 💡 Example

```java
int number = 10;
double value = number;
```

Here:

```text
int → double
```

The integer value `10` is automatically converted into double value `10.0`.

---

# 📚 2. TYPES OF TYPE CASTING

There are mainly **two types of type casting** in Java:

### 1️⃣ Widening Type Casting

### 2️⃣ Narrowing Type Casting

---

# 🟢 3. WIDENING TYPE CASTING

**Widening Type Casting** means converting a **smaller data type into a larger data type**.

### 💡 Example

```text
int → double
```

Widening casting is usually performed **automatically by Java**.

### 📌 Syntax

```java
largeDataType variable = smallDataTypeValue;
```

### 💻 Example

```java
int number = 10;

double value = number;
```

Here:

```text
int → double
```

No explicit casting is required.

---

## 🔄 WIDENING TYPE CASTING FLOW

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

> **Small Data Type → Large Data Type**

---

## 💻 Widening Example

```java
int number = 100;

double value = number;

System.out.println(number);
System.out.println(value);
```

### 📤 Output

```text
100
100.0
```

---

# 🔴 4. NARROWING TYPE CASTING

**Narrowing Type Casting** means converting a **larger data type into a smaller data type**.

### 💡 Example

```text
double → int
```

Unlike widening, **narrowing requires explicit casting**.

### 📌 Syntax

```java
smallDataType variable = (smallDataType) value;
```

### 💻 Example

```java
double number = 10.75;

int value = (int) number;
```

### 📤 Output

```text
10
```

Here, the decimal part **`.75` is removed**.

---

## 🔄 NARROWING TYPE CASTING FLOW

```text
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
```

> **Large Data Type → Small Data Type**

⚠️ **Narrowing can cause data loss.**

---

# ⚖️ 5. DIFFERENCE BETWEEN WIDENING AND NARROWING

| Feature    | Widening          | Narrowing             |
| ---------- | ----------------- | --------------------- |
| Conversion | Small → Large     | Large → Small         |
| Example    | `int → double`    | `double → int`        |
| Casting    | Usually automatic | Explicit              |
| Safety     | Generally safer   | May cause data loss   |
| Syntax     | No cast required  | `(dataType)` required |

---

# ✏️ 6. EXPLICIT CASTING

When we **manually specify the data type**, it is called **Explicit Casting**.

### 📌 Syntax

```java
(dataType) value
```

### 💻 Example

```java
double marks = 85.75;

int result = (int) marks;
```

Here:

```java
(int)
```

is the **explicit cast**.

### 📤 Result

```text
85
```

The decimal portion is removed.

---

# 🔢 7. TYPE CASTING WITH INTEGER AND DOUBLE

## 🟢 A. INT → DOUBLE

```java
int number = 100;

double value = number;

System.out.println("Integer Value : " + number);
System.out.println("Double Value  : " + value);
```

### 📤 Output

```text
Integer Value : 100
Double Value  : 100.0
```

This is **Widening Type Casting**.

---

## 🔴 B. DOUBLE → INT

```java
double marks = 85.75;

int integerMarks = (int) marks;

System.out.println("Original Value : " + marks);
System.out.println("After Casting  : " + integerMarks);
```

### 📤 Output

```text
Original Value : 85.75
After Casting  : 85
```

This is **Narrowing Type Casting**.

---

# 🔤 8. CHAR → INT

A `char` can be widened to an `int`.

### 💻 Example

```java
char letter = 'A';

int numberValue = letter;

System.out.println("Character : " + letter);
System.out.println("Integer   : " + numberValue);
```

### 📤 Output

```text
Character : A
Integer   : 65
```

### 🧠 Why?

Java uses **Unicode values** for characters.

For example:

```text
'A' → 65
'B' → 66
'C' → 67
```

---

# 🔤 9. INT → CHAR

An `int` can be explicitly converted into a `char`.

### 💻 Example

```java
int asciiValue = 66;

char character = (char) asciiValue;

System.out.println("Integer   : " + asciiValue);
System.out.println("Character : " + character);
```

### 📤 Output

```text
Integer   : 66
Character : B
```

This requires **explicit casting**.

---

# ➗ 10. TYPE CASTING IN DIVISION

Type casting is very useful when performing division.

### ❌ Without Casting

```java
int a = 10;
int b = 3;

double result = a / b;

System.out.println(result);
```

### 📤 Output

```text
3.0
```

Why?

Because:

```text
int / int = int
10 / 3 = 3
```

The decimal part is lost before the result is stored in `double`.

---

## ✅ With Casting

```java
int a = 10;
int b = 3;

double result = (double) a / b;

System.out.println(result);
```

### 📤 Output

```text
3.3333333333333335
```

Here:

```text
int → double
```

So Java performs decimal division.

---

# 🔄 11. STRING TO INT

**String to int is NOT traditional type casting.**

It is called **Parsing / Conversion**.

### 💡 Example

```text
String:
"500"

int:
500
```

We use:

```java
Integer.parseInt()
```

to convert a `String` into an `int`.

### 💻 Example

```java
String numberString = "500";

int convertedNumber = Integer.parseInt(numberString);

System.out.println("String  : " + numberString);
System.out.println("Integer : " + convertedNumber);
```

### 📤 Output

```text
String  : 500
Integer : 500
```

### ⚠️ Important

```text
String → int
```

is **Parsing / Conversion**, not primitive type casting.

---

# 
# 🚨 14. IMPORTANT POINTS 

* **Widening = Small → Large**
* **Narrowing = Large → Small**
* Widening is usually **automatic**.
* Narrowing requires **explicit casting**.
* Explicit casting uses **`(dataType)`**.
* Narrowing may cause **data loss**.
* `double → int` removes the decimal part.
* `char → int` can happen automatically.
* `int → char` requires explicit casting.
* `String → int` uses **`Integer.parseInt()`**.
* `String → int` is **parsing/conversion**, not primitive type casting.
* In `int / int`, the result is an **integer**.
* Casting one operand to `double` can produce a **decimal result**.

---

# 🎯 15. ONE-LINE REVISION

```text
TYPE CASTING
     │
     ├── Widening → Small → Large → Automatic
     │
     └── Narrowing → Large → Small → Explicit
---

# 🧠 REAL-LIFE EXAMPLE

Suppose you have:

```text
₹100
```

and you want to represent it in a format that can store decimal values:

```text
100 → 100.0
```

This is similar to **Widening Type Casting**.

But if you have:

```text
₹100.75
```

and convert it to:

```text
₹100
```

the `.75` is lost.

This is similar to **Narrowing Type Casting**.

> **Widening usually preserves the value, while narrowing may lose information.**
# ☕ CO1.8 — INPUT AND OUTPUT IN JAVA

> **Topic:** Input and Output
---
# 📌 1. WHAT IS INPUT AND OUTPUT?

## 🟢 INPUT

**Input** means taking data from the user.

### 💡 Example

```java
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();
```

Here, the user enters a name and Java stores it in the `name` variable.

---

## 🔵 OUTPUT

**Output** means displaying information on the screen.

Java commonly uses:

```text
System.out.print()
System.out.println()
System.out.printf()
```

---

# 📚 2. INPUT AND OUTPUT IN JAVA

```text
                  INPUT & OUTPUT
                        │
              ┌─────────┴─────────┐
              ↓                   ↓
            INPUT               OUTPUT
              │                   │
           Scanner        ┌───────┼────────┐
                          ↓       ↓        ↓
                        print   println   printf
```

---

# 🖥️ 3. OUTPUT USING `print()`

`System.out.print()` displays output **without moving the cursor to the next line**.

### 📌 Syntax

```java
System.out.print("message");
```

### 💻 Example

```java
System.out.print("Hello ");
System.out.print("Java");
```

### 📤 Output

```text
Hello Java
```

### 🧠 Remember

> **`print()` → Same line**

---

# 🖥️ 4. OUTPUT USING `println()`

`System.out.println()` displays output and **moves the cursor to the next line**.

### 📌 Syntax

```java
System.out.println("message");
```

### 💻 Example

```java
System.out.println("Welcome to Java");
System.out.println("Learning Input and Output");
```

### 📤 Output

```text
Welcome to Java
Learning Input and Output
```

### 🧠 Remember

> **`println()` → Prints and moves to the next line**

---

# 🖥️ 5. OUTPUT USING `printf()`

`System.out.printf()` is used to display **formatted output**.

### 📌 Syntax

```java
System.out.printf("format", value);
```

### 💻 Example

```java
String name = "Abhishek";
int age = 20;
double marks = 85.50;

System.out.printf("Name: %s%n", name);
System.out.printf("Age: %d%n", age);
System.out.printf("Marks: %.2f%n", marks);
```

### 📤 Output

```text
Name: Abhishek
Age: 20
Marks: 85.50
```

---

# 🔤 6. COMMON `printf()` FORMAT SPECIFIERS

| Specifier | Used For              | Example            |
| --------- | --------------------- | ------------------ |
| `%s`      | String                | `"Abhishek"`       |
| `%d`      | Integer               | `20`               |
| `%f`      | Floating-point number | `85.50`            |
| `%.2f`    | Decimal with 2 digits | `85.50`            |
| `%c`      | Character             | `'A'`              |
| `%b`      | Boolean               | `true`             |
| `%n`      | New line              | Moves to next line |

### 💡 Example

```java
String name = "Abhishek";
int age = 20;
double marks = 85.5;
char grade = 'A';
boolean passed = true;

System.out.printf("Name: %s%n", name);
System.out.printf("Age: %d%n", age);
System.out.printf("Marks: %.2f%n", marks);
System.out.printf("Grade: %c%n", grade);
System.out.printf("Passed: %b%n", passed);
```

---

# ⌨️ 7. TAKING INPUT USING `SCANNER`

Java provides the **Scanner class** to take input from the user.

First, import Scanner:

```java
import java.util.Scanner;
```

Then create a Scanner object:

```java
Scanner sc = new Scanner(System.in);
```

### 🧠 Meaning

```text
Scanner
   ↓
Used to take input

System.in
   ↓
Takes input from keyboard
```

---

# 📝 8. TAKING STRING INPUT

For taking a complete line of text, use:

```java
nextLine()
```

### 💻 Example

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter your name: ");

String name = sc.nextLine();

System.out.println("Your name is: " + name);
```

### 📤 Example Output

```text
Enter your name: Abhishek
Your name is: Abhishek
```

---

# 🔢 9. TAKING INTEGER INPUT

For taking an integer, use:

```java
nextInt()
```

### 💻 Example

```java
System.out.print("Enter your age: ");

int age = sc.nextInt();

System.out.println("Age: " + age);
```

### 📤 Example Output

```text
Enter your age: 20
Age: 20
```

---

# 🔢 10. TAKING DOUBLE INPUT

For taking a decimal number, use:

```java
nextDouble()
```

### 💻 Example

```java
System.out.print("Enter your percentage: ");

double percentage = sc.nextDouble();

System.out.println("Percentage: " + percentage);
```

### 📤 Example Output

```text
Enter your percentage: 85.5
Percentage: 85.5
```

---

# 🔤 11. TAKING CHARACTER INPUT

Scanner does not have a direct `nextChar()` method.

We can take a character using:

```java
sc.next().charAt(0);
```

### 💻 Example

```java
System.out.print("Enter a character: ");

char character = sc.next().charAt(0);

System.out.println("Character: " + character);
```

### 📤 Example Output

```text
Enter a character: A
Character: A
```

### 🧠 How It Works

```text
sc.next()
    ↓
Takes a String

.charAt(0)
    ↓
Takes the first character
```

---

# ✅ 12. TAKING BOOLEAN INPUT

For taking `true` or `false`, use:

```java
nextBoolean()
```

### 💻 Example

```java
System.out.print("Enter true or false: ");

boolean value = sc.nextBoolean();

System.out.println("Value: " + value);
```

### 📤 Example Output

```text
Enter true or false: true
Value: true
```

---

# 📊 13. COMMON SCANNER METHODS

| Scanner Method     | Input Type          | Example      |
| ------------------ | ------------------- | ------------ |
| `nextInt()`        | Integer             | `25`         |
| `nextDouble()`     | Double              | `85.5`       |
| `nextFloat()`      | Float               | `10.5`       |
| `nextLong()`       | Long                | `100000L`    |
| `nextShort()`      | Short               | `1000`       |
| `nextByte()`       | Byte                | `100`        |
| `next()`           | Single token/String | `Hello`      |
| `nextLine()`       | Complete line       | `Hello Java` |
| `next().charAt(0)` | Character           | `A`          |
| `nextBoolean()`    | Boolean             | `true`       |

---

# 🧮 14. SIMPLE CALCULATION USING INPUT

We can take numbers from the user and perform calculations.

### 💻 Example

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
int firstNumber = sc.nextInt();

System.out.print("Enter second number: ");
int secondNumber = sc.nextInt();

int sum = firstNumber + secondNumber;

System.out.println("Sum = " + sum);

sc.close();
```

### 📤 Output

```text
Enter first number: 10
Enter second number: 20
Sum = 30
```
# ⚖️ 19. PRINT VS PRINTLN VS PRINTF

| Method      | Purpose          | New Line?         |
| ----------- | ---------------- | ----------------- |
| `print()`   | Prints output    | ❌ No              |
| `println()` | Prints output    | ✅ Yes             |
| `printf()`  | Formatted output | Depends on format |



        


