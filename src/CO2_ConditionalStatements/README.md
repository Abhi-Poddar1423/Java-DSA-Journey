# ☕ CO1.5 — CONDITIONAL STATEMENTS IN JAVA

> **Condition → Check → Make a Decision → Execute Code**

---

# 📚 1. WHAT IS A CONDITIONAL STATEMENT?

A **conditional statement** is used to make decisions in a Java program.

In simple words:

> **A conditional statement checks a condition and decides which code should run.**

### 🌍 Real-Life Example

Imagine you are checking your exam result:

```text
If marks >= 40
    ↓
You Passed

Otherwise
    ↓
You Failed
```

Java can make the same type of decision.

---

# 🎯 2. WHY DO WE USE CONDITIONAL STATEMENTS?

Programs often need to make decisions.

For example:

```text
Check age
Check marks
Check balance
Check password
Check temperature
Choose a menu option
```

### 🌍 Real-Life Examples

```text
ATM
→ If balance is sufficient → Allow withdrawal

College
→ If attendance >= 75% → Allow exam

Online Shopping
→ If amount >= ₹500 → Free delivery

Login
→ If password is correct → Allow login
```

So, conditional statements help a program **behave differently according to different situations**.

---

# 🧩 3. TYPES OF CONDITIONAL STATEMENTS

Java provides different ways to make decisions:

```text
             CONDITIONAL STATEMENTS
                       │
        ┌──────────────┼──────────────┐
        ↓              ↓              ↓
       if           if-else        else-if
        │
        ↓
    Nested if
        │
        ↓
     switch
```

We will learn:

```text
1. if
2. if-else
3. else-if
4. Nested if
5. switch
```

---

# 🟢 4. `if` STATEMENT

## What is `if`?

The `if` statement executes a block of code **only when the condition is true**.

### Why do we use it?

We use `if` when we want to perform an action only if something is true.

---

## 🌍 Real-Life Example

Suppose an ATM checks your balance.

```text
If balance is enough
        ↓
Allow withdrawal
```

---

## 📌 Syntax

```java
if (condition) {
    // code to execute
}
```

---

## 💻 Small Program

```java
int balance = 5000;
int withdrawal = 2000;

if (balance >= withdrawal) {
    System.out.println("Withdrawal successful.");
}
```

### 📤 Output

```text
Withdrawal successful.
```

### 🧠 How does it work?

```text
balance = 5000
withdrawal = 2000

5000 >= 2000 ?
       ↓
      true
       ↓
Execute if block
       ↓
Withdrawal successful.
```

Because the condition is `true`, Java executes the code inside `if`.

---

# 🟡 5. `if-else` STATEMENT

## What is `if-else`?

`if-else` is used when there are **two possible outcomes**.

```text
If condition is true
        ↓
     Do this

Otherwise
        ↓
     Do that
```

### Why do we use it?

We use `if-else` when we need to choose between **two options**.

---

## 🌍 Real-Life Example

Checking whether a student passed:

```text
If marks >= 40
      ↓
   Passed

Otherwise
      ↓
   Failed
```

---

## 📌 Syntax

```java
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

---

## 💻 Small Program

```java
int marks = 35;

if (marks >= 40) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```

### 📤 Output

```text
Failed
```

### 🧠 How does it work?

```text
marks = 35

35 >= 40 ?
     ↓
   false
     ↓
Execute else block
     ↓
Failed
```

Since the condition is false, Java executes the `else` block.

---

# 🟠 6. `else-if` STATEMENT

## What is `else-if`?

`else-if` is used when we have **multiple conditions**.

### Why do we use it?

Suppose we want to give different grades according to marks.

There are more than two possibilities:

```text
90+ → A
80+ → B
70+ → C
60+ → D
Below 60 → F
```

For this type of decision, we can use `else-if`.

---

## 🌍 Real-Life Example

A college grading system:

```text
Marks >= 90 → Grade A
Marks >= 80 → Grade B
Marks >= 70 → Grade C
Marks >= 60 → Grade D
Otherwise   → Grade F
```

---

## 📌 Syntax

```java
if (condition1) {

} else if (condition2) {

} else if (condition3) {

} else {

}
```

---

## 💻 Small Program

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 80) {
    System.out.println("Grade B");
} else if (marks >= 70) {
    System.out.println("Grade C");
} else if (marks >= 60) {
    System.out.println("Grade D");
} else {
    System.out.println("Grade F");
}
```

### 📤 Output

```text
Grade B
```

### 🧠 How does it work?

Java checks the conditions from **top to bottom**.

```text
marks = 85

85 >= 90 ? → false

85 >= 80 ? → true
              ↓
          Grade B
```

Once Java finds a `true` condition, it executes that block and skips the remaining conditions.

---

# 🔵 7. NESTED `if`

## What is Nested `if`?

A **nested if** means using an `if` statement inside another `if` statement.

```text
if
 ↓
   if
    ↓
   code
```

### Why do we use it?

We use nested `if` when the second condition should be checked **only after the first condition is true**.

---

## 🌍 Real-Life Example

Suppose a college checks whether a student can appear in an exam:

```text
Is the student registered?
        ↓
      Yes
        ↓
Is attendance >= 75%?
        ↓
      Yes
        ↓
Allow exam
```

---

## 📌 Syntax

```java
if (condition1) {

    if (condition2) {
        // code
    }

}
```

---

## 💻 Small Program

```java
boolean registered = true;
int attendance = 80;

if (registered) {

    if (attendance >= 75) {
        System.out.println("You can appear in the exam.");
    }

}
```

### 📤 Output

```text
You can appear in the exam.
```

### 🧠 How does it work?

First Java checks:

```text
registered == true ?
        ↓
      true
        ↓
Check second condition
        ↓
attendance >= 75 ?
        ↓
      true
        ↓
Allow exam
```

The second `if` is checked only because the first condition was true.

---

# 🟣 8. `switch` STATEMENT

## What is `switch`?

`switch` is used when we want to choose **one option from multiple fixed choices**.

### Why do we use it?

It is useful when one value can have different fixed options.

---

## 🌍 Real-Life Example

Imagine a food-ordering system:

```text
1 → Pizza
2 → Burger
3 → Sandwich
4 → Pasta
```

The user chooses a number, and the program performs the corresponding action.

This can be handled using `switch`.

---

## 📌 Syntax

```java
switch (value) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

---

## 💻 Small Program

```java
int choice = 2;

switch (choice) {

    case 1:
        System.out.println("Pizza");
        break;

    case 2:
        System.out.println("Burger");
        break;

    case 3:
        System.out.println("Sandwich");
        break;

    case 4:
        System.out.println("Pasta");
        break;

    default:
        System.out.println("Invalid choice");
}
```

### 📤 Output

```text
Burger
```

### 🧠 How does it work?

```text
choice = 2

       ↓
   switch(2)
       ↓
case 1 → No
       ↓
case 2 → Yes
       ↓
    Burger
       ↓
     break
```

Java finds the matching `case` and executes its code.

---

# 🛑 9. `break` IN `switch`

## What is `break`?

`break` tells Java to **stop the switch statement**.

### Example

```java
case 1:
    System.out.println("Pizza");
    break;
```

After executing this case, Java leaves the `switch`.

### Simple idea

```text
case matches
     ↓
execute code
     ↓
break
     ↓
exit switch
```

---

# ⚪ 10. `default` IN `switch`

## What is `default`?

`default` runs when **none of the cases match**.

### 🌍 Real-Life Example

If a food menu has options 1–4 and the user enters 7:

```text
1 → Pizza
2 → Burger
3 → Sandwich
4 → Pasta
7 → Invalid choice
```

### 💻 Program

```java
int choice = 7;

switch (choice) {

    case 1:
        System.out.println("Pizza");
        break;

    case 2:
        System.out.println("Burger");
        break;

    case 3:
        System.out.println("Sandwich");
        break;

    default:
        System.out.println("Invalid choice");
}
```

### 📤 Output

```text
Invalid choice
```

---

# 🔗 11. CONDITIONS WITH RELATIONAL OPERATORS

Conditional statements commonly use relational operators.

```text
==    Equal to
!=    Not equal to
>     Greater than
<     Less than
>=    Greater than or equal to
<=    Less than or equal to
```

### 💻 Example

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible");
}
```

### 🧠 How it works

```text
age = 20

20 >= 18
   ↓
 true
   ↓
Eligible
```

---

# 🔗 12. CONDITIONS WITH `&&`

`&&` means **AND**.

Both conditions must be true.

### 🌍 Real-Life Example

To enter an exam:

```text
Registered = Yes
AND
Attendance >= 75%
```

Both must be true.

### 💻 Program

```java
boolean registered = true;
int attendance = 80;

if (registered && attendance >= 75) {
    System.out.println("Allowed for exam.");
}
```

### 🧠 How it works

```text
registered          → true
attendance >= 75    → true

true && true
     ↓
    true
     ↓
Allowed for exam.
```

---

# 🔗 13. CONDITIONS WITH `||`

`||` means **OR**.

At least one condition must be true.

### 🌍 Real-Life Example

Suppose a student can get a discount if:

```text
Marks >= 90
OR
Student has a scholarship
```

### 💻 Program

```java
int marks = 92;
boolean scholarship = false;

if (marks >= 90 || scholarship) {
    System.out.println("Discount available.");
}
```

### 🧠 How it works

```text
marks >= 90       → true
scholarship       → false

true || false
     ↓
    true
     ↓
Discount available.
```

---

# 🔗 14. `!` NOT OPERATOR

`!` reverses a boolean value.

```text
true  → false
false → true
```

### 🌍 Real-Life Example

If it is **not raining**, you can go outside.

### 💻 Program

```java
boolean raining = false;

if (!raining) {
    System.out.println("You can go outside.");
}
```

### 🧠 How it works

```text
raining = false

!false
  ↓
 true
  ↓
You can go outside.
```

---

# 🧪 15. SMALL PRACTICE PROGRAM — POSITIVE, NEGATIVE OR ZERO

```java
int number = -5;

if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

### Output

```text
Negative
```

### How it works

```text
number = -5

-5 > 0 ? → false

-5 < 0 ? → true

      ↓
  Negative
```

---

# 🧪 16. SMALL PRACTICE PROGRAM — EVEN OR ODD

```java
int number = 8;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### Output

```text
Even
```

### How it works

The `%` operator gives the remainder.

```text
8 % 2 = 0
```

So:

```text
0 == 0
  ↓
true
  ↓
Even
```

---

# 📊 17. WHICH ONE SHOULD I USE?

| Situation                          | Use         |
| ---------------------------------- | ----------- |
| One condition                      | `if`        |
| Two possible outcomes              | `if-else`   |
| Multiple conditions                | `else-if`   |
| Condition inside another condition | Nested `if` |
| Multiple fixed choices             | `switch`    |

---

# 🔄 19. HOW CONDITIONAL STATEMENTS WORK

The basic idea is always:

```text
              START
                ↓
         Check the condition
                ↓
        ┌───────┴───────┐
        ↓               ↓
      TRUE            FALSE
        ↓               ↓
   Execute code     Other path
        ↓               ↓
        └───────┬───────┘
                ↓
             Continue
```

# 🚀 CO1.5 COMPLETED

```text
Conditional Statements
        │
        ├── if
        ├── if-else
        ├── else-if
        ├── Nested if
        ├── switch
        ├── break
        ├── default
        └── Logical Conditions
```

> **Next → Loops**
