# 🚦 CO2 — CONDITIONAL STATEMENTS IN JAVA

> **Condition → Decision → Action**

Conditional statements are used to make decisions in a Java program based on conditions.

---

# 📌 1. What are Conditional Statements?

Conditional statements allow a program to execute different code depending on whether a condition is **true** or **false**.

### 🌍 Real-Life Example

```text
If it is raining
    → Take an umbrella
Otherwise
    → Don't take an umbrella
```

---

# 📚 2. Types of Conditional Statements

| Statement    | Purpose                               |
| ------------ | ------------------------------------- |
| `if`         | Execute code when a condition is true |
| `if-else`    | Choose between two conditions         |
| `if-else-if` | Handle multiple conditions            |
| Nested `if`  | `if` inside another `if`              |
| `switch`     | Handle multiple fixed choices         |
| Ternary `?:` | Short form of `if-else`               |

---

# 🟢 3. if Statement

Used when code should execute only if a condition is true.

### Syntax

```java
if (condition) {
    // code
}
```

### Example

```java
int number = 10;

if (number > 0) {
    System.out.println("Positive Number");
}
```

**Output:**

```text
Positive Number
```

---

# 🟡 4. if-else Statement

Used when there are two possible outcomes.

### Syntax

```java
if (condition) {
    // true
} else {
    // false
}
```

### Example — Even or Odd

```java
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

**Output:**

```text
Odd
```

---

# 🔵 5. if-else-if Statement

Used when multiple conditions need to be checked.

### Syntax

```java
if (condition1) {

} else if (condition2) {

} else {

}
```

### Example — Grade

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A+");
} else if (marks >= 80) {
    System.out.println("Grade A");
} else if (marks >= 70) {
    System.out.println("Grade B");
} else {
    System.out.println("Need Improvement");
}
```

**Output:**

```text
Grade A
```

> Java checks conditions from **top to bottom** and executes the first true condition.

---

# 🟣 6. Nested if

An `if` statement inside another `if` statement is called a **nested if**.

### Syntax

```java
if (condition1) {

    if (condition2) {
        // code
    }
}
```

### Example

```java
boolean usernameCorrect = true;
boolean passwordCorrect = true;

if (usernameCorrect) {

    if (passwordCorrect) {
        System.out.println("Login Successful");
    }
}
```

**Output:**

```text
Login Successful
```

---

# ⚙️ 7. Comparison Operators

Comparison operators are commonly used inside conditions.

| Operator | Meaning               |
| -------- | --------------------- |
| `>`      | Greater than          |
| `<`      | Less than             |
| `>=`     | Greater than or equal |
| `<=`     | Less than or equal    |
| `==`     | Equal to              |
| `!=`     | Not equal to          |

### Example

```java
int a = 10;
int b = 20;

System.out.println(a < b);
```

**Output:**

```text
true
```

---

# ⚠️ 8. `=` vs `==`

### `=`

Assignment operator.

```java
int number = 10;
```

Means: **Assign 10 to number.**

### `==`

Comparison operator.

```java
if (number == 10)
```

Means: **Check whether number is equal to 10.**

### Remember

```text
=   → Assign
==  → Compare
```

---

# 🔗 9. Logical Operators

Logical operators are used to combine conditions.

| Operator | Meaning |   |    |
| -------- | ------- | - | -- |
| `&&`     | AND     |   |    |
| `        |         | ` | OR |
| `!`      | NOT     |   |    |

### AND `&&`

Both conditions must be true.

```java
int age = 22;

if (age >= 18 && age <= 60) {
    System.out.println("Age is valid");
}
```

### OR `||`

At least one condition must be true.

```java
int day = 7;

if (day == 6 || day == 7) {
    System.out.println("Weekend");
}
```

### NOT `!`

Reverses the result.

```java
boolean rain = false;

if (!rain) {
    System.out.println("No Rain");
}
```

---

# 🟢 10. switch Statement

`switch` is useful when there are multiple **fixed choices**.

### Syntax

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

### Example — Day

```java
int day = 2;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

**Output:**

```text
Tuesday
```

### `break`

`break` stops the execution of the `switch` after the matching case.

---

# 🟠 11. Ternary Operator

The ternary operator is a short form of `if-else`.

### Syntax

```java
condition ? trueValue : falseValue;
```

### Example

```java
int number = 8;

String result = (number % 2 == 0) ? "Even" : "Odd";

System.out.println(result);
```

**Output:**

```text
Even
```

### Formula

```text
condition ? valueIfTrue : valueIfFalse
```

---

# 📊 12. Quick Comparison

| Statement    | Best Used For              |
| ------------ | -------------------------- |
| `if`         | One condition              |
| `if-else`    | Two choices                |
| `if-else-if` | Multiple conditions        |
| Nested `if`  | Condition inside condition |
| `switch`     | Multiple fixed choices     |
| Ternary      | Short `if-else`            |

---

# 🧪 13. Practice Problems

### Beginner

1. Check positive or negative
2. Check even or odd
3. Check zero
4. Find greater number
5. Check pass or fail
6. Check voting eligibility

### Intermediate

7. Greatest of two numbers
8. Greatest of three numbers
9. Check leap year
10. Check divisibility by 5
11. Check divisibility by 5 and 11
12. Check vowel or consonant
13. Check triangle validity
14. Calculate grade
15. Calculate electricity bill

### Switch

16. Day of week
17. Month number
18. Simple calculator
19. Menu-based program
20. Number to word

### Ternary

21. Even or odd
22. Positive or negative
23. Greatest of two
24. Pass or fail
25. Eligible or not eligible

---
