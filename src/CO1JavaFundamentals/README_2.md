# ☕ CO1.4 — VARIABLES IN JAVA

> **Topic:** Variables in Java
> **Level:** Java Fundamentals
> **Course:** Java Programming

---

# 📌 1. What is a Variable?

A **variable** is a named memory location used to store data.

In simple words:

> A variable is like a **container that stores a value**.

### Example

```java
// int age = 20;
```

Here:

* `int` → Data Type
* `age` → Variable Name
* `20` → Value
* `=` → Assignment Operator

### 🌍 Real-Life Example

Think of a variable like a **labelled box**:

```text
// Box Label  → age
// Box Value  → 20
```

So:

```java
// int age = 20;
```

means we created a variable named `age` that stores the value `20`.

---

# 🎯 2. Why Do We Use Variables?

Variables are used to:

* Store data
* Reuse data
* Change data during program execution
* Perform calculations
* Process user input
* Make programs dynamic and flexible

### Example

```java
// int marks = 85;

// System.out.println(marks);
```

### Output

```text
// 85
```

Instead of writing `85` everywhere, we can simply use:

```java
// marks
```

---

# 📝 3. Variable Syntax

### Basic Syntax

```java
// dataType variableName = value;
```

### Examples

```java
// int age = 20;

// String name = "Abhishek";

// double price = 99.99;
```

### General Structure

```text
// Data Type + Variable Name + = + Value
```

---

# 📌 4. Declaration of a Variable

**Declaration** means creating a variable by specifying its data type and name.

### Syntax

```java
// dataType variableName;
```

### Example

```java
// int age;
```

Here:

* `int` → Data Type
* `age` → Variable Name

At this point, the variable has been declared but no value has been assigned to it.

---

# 📌 5. Initialization of a Variable

**Initialization** means assigning an initial value to a variable.

### Example

```java
// int age = 20;
```

We can also do it separately:

```java
// int age;
// age = 20;
```

* First line → Declaration
* Second line → Assignment / Initialization

---

# 📌 6. Declaration + Initialization

We can declare and initialize a variable in one statement.

```java
// int age = 20;
```

### More Examples

```java
// String name = "Abhishek";

// double salary = 25000.50;

// char grade = 'A';

// boolean isStudent = true;
```

---

# 🔄 7. Assigning a New Value

The value of a variable can be changed.

```java
// int age = 20;

// age = 21;
```

Initially:

```text
// age = 20
```

After assignment:

```text
// age = 21
```

### Example

```java
// int marks = 80;

// System.out.println(marks);

// marks = 90;

// System.out.println(marks);
```

### Output

```text
// 80
// 90
```

---

# 🧩 8. Data Type of a Variable

Every variable has a **data type**.

The data type tells Java what kind of value the variable can store.

| Data Type | Used For         | Example      |
| --------- | ---------------- | ------------ |
| `int`     | Integer numbers  | `20`         |
| `double`  | Decimal numbers  | `99.99`      |
| `char`    | Single character | `'A'`        |
| `boolean` | True/False       | `true`       |
| `String`  | Text             | `"Abhishek"` |

### Example

```java
// int age = 20;

// double price = 99.99;

// char grade = 'A';

// boolean passed = true;

// String name = "Abhishek";
```

---

# 📦 9. Multiple Variables

We can create multiple variables in a program.

```java
// String name = "Abhishek";
// int age = 20;
// double percentage = 85.5;
// char grade = 'A';
```

### Printing Variables

```java
// System.out.println(name);
// System.out.println(age);
// System.out.println(percentage);
// System.out.println(grade);
```

---

# 📌 10. Declaring Multiple Variables

We can declare multiple variables of the same data type in one statement.

```java
// int a, b, c;
```

We can also initialize them:

```java
// int a = 10, b = 20, c = 30;
```

However, for better readability, separate lines are usually recommended:

```java
// int a = 10;
// int b = 20;
// int c = 30;
```

---

# 📛 11. Variable Naming Rules

Java has specific rules for naming variables.

### Rule 1 — Allowed Characters

Variable names can contain:

* Letters
* Digits
* Underscore `_`
* Dollar sign `$`

### Examples

```java
// age
// studentAge
// student_1
// $value
```

---

### Rule 2 — Cannot Start With a Digit

❌ Incorrect:

```java
// int 1age = 20;
```

✅ Correct:

```java
// int age1 = 20;
```

---

### Rule 3 — No Spaces

❌ Incorrect:

```java
// int student age = 20;
```

✅ Correct:

```java
// int studentAge = 20;
```

or

```java
// int student_age = 20;
```

---

### Rule 4 — Keywords Cannot Be Used

❌ Incorrect:

```java
// int class = 10;
```

`class` is a Java keyword.

✅ Correct:

```java
// int classNumber = 10;
```

---

### Rule 5 — Java Is Case-Sensitive

```java
// int age = 20;
// int Age = 30;
```

These are two different variables.

```text
// age ≠ Age
```

---

# 🐫 12. Java Naming Convention

The recommended naming convention for variables is **camelCase**.

### Examples

```java
// studentName
// studentAge
// totalMarks
// accountBalance
// mobileNumber
```

### Avoid

```java
// StudentName
// STUDENTNAME
```

---

# 🔒 13. Constants

A **constant** is a value that should not be changed after it is assigned.

In Java, constants are commonly created using:

```java
// final
```

### Example

```java
// final double PI = 3.14159;
```

After assigning the value, we cannot reassign it.

❌ Incorrect:

```java
// PI = 4.5;
```

### Constant Naming Convention

Constants are commonly written in uppercase letters.

```java
// final int MAX_VALUE = 100;

// final double PI = 3.14159;
```

---

# 🧱 14. Types of Variables in Java

Java variables can be classified into three main types:

1. **Local Variable**
2. **Instance Variable**
3. **Static Variable**

---

# 📍 15. Local Variable

A **local variable** is declared inside a method, constructor, or block.

### Example

```java
// public static void main(String[] args) {

//     int age = 20;

//     System.out.println(age);
// }
```

Here, `age` is a local variable.

It can be used only within its scope.

---

# 🏠 16. Instance Variable

An **instance variable** is declared inside a class but outside methods, constructors, or blocks.

### Example

```java
// class Student {

//     String name;
//     int age;

// }
```

Here:

```text
// name
// age
```

are instance variables.

Each object of the class can have its own copy of instance variables.

---

# 🏫 17. Static Variable

A **static variable** is declared using the keyword:

```java
// static
```

It belongs to the **class rather than individual objects**.

### Example

```java
// class Student {

//     static String college = "ABC College";

// }
```

Here, `college` is a static variable.

A static variable is commonly shared by all objects of the class.

---

# 🎯 18. Variable Scope

**Scope** means the area of the program where a variable can be accessed.

### Example

```java
// public static void main(String[] args) {

//     int age = 20;

//     System.out.println(age);

// }
```

The variable `age` can be accessed inside its scope.

### Block Scope Example

```java
// if (true) {

//     int marks = 90;

//     System.out.println(marks);

// }
```

The variable `marks` is available only inside that block.

---

# ⏳ 19. Variable Lifetime

**Lifetime** means how long a variable exists during program execution.

| Variable | Lifetime                             |
| -------- | ------------------------------------ |
| Local    | During execution of its method/block |
| Instance | As long as its object exists         |
| Static   | Associated with the class            |

---

# ⚙️ 20. Default Values

Instance and static variables receive default values if they are not explicitly initialized.

| Data Type | Default Value |
| --------- | ------------- |
| `int`     | `0`           |
| `double`  | `0.0`         |
| `char`    | `'\u0000'`    |
| `boolean` | `false`       |
| Reference | `null`        |

### ⚠️ Important

Local variables **do NOT automatically receive default values**.

A local variable must be initialized before it is used.

❌ Incorrect:

```java
// int age;

// System.out.println(age);
```

This causes a compilation error.

✅ Correct:

```java
// int age = 20;

// System.out.println(age);
```

---

# 💾 21. Variables and Memory

When we create a variable, Java needs memory to store its value.

### Example

```java
// int age = 20;
```

Conceptually:

```text
// Variable Name
//       ↓
//      age
//       ↓
// Stored Value
//       ↓
//      20
```

The exact memory representation is managed by Java and the JVM.

---

# 💻 22. Variables with Different Data Types

### Program

```java
// public class VariablesExample {

//     public static void main(String[] args) {

//         int age = 20;

//         double price = 99.99;

//         char grade = 'A';

//         boolean passed = true;

//         String name = "Abhishek";

//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(price);
//         System.out.println(grade);
//         System.out.println(passed);
//     }
// }
```

### Output

```text
// Abhishek
// 20
// 99.99
// A
// true
```

---

# 🔄 24. Updating Variables

Variables can be updated during program execution.

```java
// int score = 50;

// score = score + 10;

// System.out.println(score);
```

### Output

```text
// 60
```

### Short Form

```java
// score += 10;
```

Both represent the same basic idea.

---

# ⌨️ 25. Variables with User Input

Variables can store values entered by the user.

### Example

```java
// import java.util.Scanner;

// Scanner sc = new Scanner(System.in);

// System.out.print("Enter your age: ");
// int age = sc.nextInt();

// System.out.println("Your age is: " + age);
```

If the user enters:

```text
// 20
```

### Output

```text
// Enter your age: 20
// Your age is: 20
```

---

# 🔗 26. String Concatenation with Variables

The `+` operator can be used to combine Strings and variables.

### Example

```java
// String name = "Abhishek";
// int age = 20;

// System.out.println("My name is " + name);
// System.out.println("My age is " + age);
```

### Output

```text
// My name is Abhishek
// My age is 20
```

---

# 🔁 27. Variable Reassignment

**Reassignment** means giving a new value to an existing variable.

### Example

```java
// int number = 10;

// number = 50;
```

The value changes:

```text
// Before → 10
// After  → 50
```

---

# 📚 28. Declaration vs Initialization vs Assignment

| Concept            | Meaning                             | Example         |
| ------------------ | ----------------------------------- | --------------- |
| **Declaration**    | Creates variable with type and name | `int age;`      |
| **Initialization** | Gives initial value                 | `int age = 20;` |
| **Assignment**     | Gives/replaces value                | `age = 25;`     |

### Remember

```java
// int age;       // Declaration

// int age = 20;  // Declaration + Initialization

// age = 25;      // Assignment
```

---
# 🚀 CO1.4 Completed

