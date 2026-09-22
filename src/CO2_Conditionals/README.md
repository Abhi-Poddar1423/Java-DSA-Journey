# 🚦 CO1.5 — CONDITIONAL STATEMENTS IN JAVA

> **Condition → Decision → Action**

Conditional statements are used to make decisions in a Java program based on conditions.

---

# 📌 1. What are Conditional Statements?

A conditional statement allows a program to execute different code depending on whether a condition is **true** or **false**.

### 🌍 Real-Life Example

```text
If it is raining
    ↓
Take an umbrella

Otherwise
    ↓
Don't take an umbrella
```

---

# 📚 2. Types of Conditional Statements

| Statement    | Purpose                               |
| ------------ | ------------------------------------- |
| `if`         | Execute code when a condition is true |
| `if-else`    | Choose between two possibilities      |
| `if-else-if` | Check multiple conditions             |
| Nested `if`  | `if` inside another `if`              |
| `switch`     | Handle multiple fixed choices         |
| Ternary `?:` | Short form of `if-else`               |

---

# 🟢 3. if Statement

The `if` statement executes a block of code only when the condition is true.

### Syntax

```java
if (condition) {
    // code
}
```

### Example — Check Positive Number

```java
int number = 10;

if (number > 0) {
    System.out.println("Positive Number");
}
```

### Output

```text
Positive Number
```

### Explanation

* `number = 10` stores `10` in the variable.
* `number > 0` checks whether the number is greater than `0`.
* `10 > 0` is `true`.
* Therefore, the code inside `if` executes.

### Logic

```text
number = 10
     ↓
number > 0 ?
     ↓
   true
     ↓
Positive Number
```

---

# 🟡 4. if-else Statement

`if-else` is used when there are two possible outcomes.

### Syntax

```java
if (condition) {
    // true
} else {
    // false
}
```

### Example — Check Even or Odd

```java
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### Output

```text
Odd
```

### Explanation

* `number = 7`
* `%` operator gives the remainder.
* `7 % 2 = 1`
* Condition `1 == 0` is `false`.
* Therefore, the `else` block executes.
* Output is `Odd`.

### Logic

```text
number
   ↓
number % 2 == 0 ?
   ↓
 ┌───────┴───────┐
Yes              No
 ↓                ↓
Even             Odd
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

### Example — Grade Check

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

### Output

```text
Grade A
```

### Explanation

* `marks = 85`
* First condition: `85 >= 90` → `false`
* Second condition: `85 >= 80` → `true`
* Therefore, `Grade A` is printed.
* Once a condition becomes true, remaining conditions are skipped.

### Logic

```text
85 >= 90 ?
    ↓ No
85 >= 80 ?
    ↓ Yes
Grade A
```

---

# 🟣 6. Nested if

An `if` statement inside another `if` statement is called a **Nested if**.

### Syntax

```java
if (condition1) {

    if (condition2) {
        // code
    }
}
```

### Example — Login Check

```java
boolean usernameCorrect = true;
boolean passwordCorrect = true;

if (usernameCorrect) {

    if (passwordCorrect) {
        System.out.println("Login Successful");
    }
}
```

### Output

```text
Login Successful
```

### Explanation

* `usernameCorrect = true` means the username is correct.
* First `if` checks the username.
* If username is correct, the second `if` checks the password.
* `passwordCorrect = true`, so the second condition is also true.
* Therefore, `Login Successful` is printed.

### Logic

```text
Username correct?
       ↓
      Yes
       ↓
Password correct?
       ↓
      Yes
       ↓
Login Successful
```

---

# ⚙️ 7. Comparison Operators

Comparison operators are commonly used in conditions.

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

### Output

```text
true
```

### Explanation

`a < b` means:

```text
Is 10 less than 20?
```

Yes, so the result is `true`.

---

# ⚠️ 8. `=` vs `==`

This is an important beginner concept.

### `=` Assignment Operator

```java
int number = 10;
```

It assigns `10` to `number`.

```text
number ← 10
```

### `==` Comparison Operator

```java
if (number == 10)
```

It checks whether `number` is equal to `10`.

```text
Is number equal to 10?
```

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

---

## 9.1 AND Operator `&&`

Both conditions must be true.

### Example

```java
int age = 22;

if (age >= 18 && age <= 60) {
    System.out.println("Age is valid");
}
```

### Explanation

```text
age >= 18 → true
age <= 60 → true

true && true → true
```

Therefore:

```text
Age is valid
```

---

## 9.2 OR Operator `||`

At least one condition must be true.

### Example

```java
int day = 7;

if (day == 6 || day == 7) {
    System.out.println("Weekend");
}
```

### Explanation

```text
day == 6 → false
day == 7 → true

false || true → true
```

Therefore:

```text
Weekend
```

---

## 9.3 NOT Operator `!`

The `!` operator reverses the result.

### Example

```java
boolean rain = false;

if (!rain) {
    System.out.println("No Rain");
}
```

### Explanation

```text
rain = false
!rain = true
```

Therefore:

```text
No Rain
```

### Remember

```text
!true  → false
!false → true
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

### Example — Day Check

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

### Output

```text
Tuesday
```

### Explanation

* `day = 2`
* `switch` compares the value with each `case`.
* `case 1` → No match.
* `case 2` → Match found.
* Therefore, `Tuesday` is printed.
* `break` stops the switch after the matching case.

### Logic

```text
day = 2
   ↓
case 1 → No
case 2 → Yes
   ↓
Tuesday
   ↓
break
```

---

# 🟠 11. Ternary Operator

The ternary operator is a short form of `if-else`.

### Syntax

```java
condition ? trueValue : falseValue;
```

### Example — Even or Odd

```java
int number = 8;

String result = (number % 2 == 0) ? "Even" : "Odd";

System.out.println(result);
```

### Output

```text
Even
```

### Explanation

First, the condition is checked:

```text
8 % 2 == 0
```

```text
8 % 2 = 0
```

So the condition is `true`.

Therefore:

```text
true  → "Even"
false → "Odd"
```

`result` stores `"Even"`.

### Logic

```text
number % 2 == 0 ?
       ↓
 ┌─────┴─────┐
True        False
 ↓             ↓
Even          Odd
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

## Beginner

1. Check positive or negative
2. Check even or odd
3. Check zero
4. Find greater number
5. Check pass or fail
6. Check voting eligibility

## Intermediate

7. Greatest of two numbers
8. Greatest of three numbers
9. Check leap year
10. Check divisibility by 5
11. Check divisibility by 5 and 11
12. Check vowel or consonant
13. Check triangle validity
14. Calculate grade
15. Calculate electricity bill

## Switch

16. Day of week
17. Month number
18. Simple calculator
19. Menu-based program
20. Number to word

## Ternary

21. Even or odd
22. Positive or negative
23. Greatest of two
24. Pass or fail
25. Eligible or not eligible

---
