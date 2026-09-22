# 🔄 CO1.6 — LOOPS IN JAVA

---

# 📌 1. What is a Loop?

A **loop** is used to execute a block of code repeatedly until a particular condition becomes false.

### 🧠 Simple Example

Suppose you want to print:

```text
Hello
Hello
Hello
Hello
Hello
```

Without a loop, you would write `System.out.println()` five times.

With a loop, you can write it once and repeat it.

### 🌍 Real-Life Example

Imagine you have to climb **10 stairs**.

You repeatedly perform:

```text
Take one step
   ↓
Check next step
   ↓
Take one step
   ↓
Repeat
```

This is similar to how a loop works.

---

# 📌 2. Why Do We Use Loops?

Loops are useful when we need to perform the same task multiple times.

For example:

* Print numbers from 1 to 10
* Print a message 100 times
* Calculate the sum of numbers
* Print multiplication tables
* Process elements of an array
* Reverse a number
* Count digits
* Find factorial
* Check palindrome
* Check Armstrong number

### Without Loop

```java
// System.out.println(1);
// System.out.println(2);
// System.out.println(3);
// System.out.println(4);
// System.out.println(5);
```

### With Loop

```java
// for (int i = 1; i <= 5; i++) {
//     System.out.println(i);
// }
```

Much shorter and easier.

---

# 📌 3. Types of Loops in Java

Java mainly provides three loops:

| Loop       | Best Used When                         |
| ---------- | -------------------------------------- |
| `for`      | Number of repetitions is known         |
| `while`    | Condition is more important than count |
| `do-while` | Code must execute at least once        |

---

# 🟢 4. for Loop

## What is a `for` Loop?

The `for` loop is generally used when we **know how many times** we want to execute the code.

### Syntax

```java
// for (initialization; condition; update) {
//     // code
// }
```

There are three important parts:

```text
Initialization → Condition → Update
```

---

# 💻 5. Small Program — Print 1 to 5

```java
// public class PrintNumbers {
// 
//     public static void main(String[] args) {
// 
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(i);
//         }
//     }
// }
```

### Output

```text
1
2
3
4
5
```

---

# 🔍 6. Full Explanation of for Loop

Look at this line:

```java
// for (int i = 1; i <= 5; i++)
```

It contains three parts.

## 1️⃣ Initialization

```java
// int i = 1
```

We create a variable `i` and give it the starting value `1`.

```text
i = 1
```

---

## 2️⃣ Condition

```java
// i <= 5
```

Java checks whether `i` is less than or equal to `5`.

If true → loop runs.

If false → loop stops.

---

## 3️⃣ Update

```java
// i++
```

`i++` means:

```text
i = i + 1
```

So the value increases by one every time.

---

# 🔄 7. How the Loop Works

The execution happens like this:

```text
i = 1
 ↓
1 <= 5 → true
 ↓
Print 1
 ↓
i++
 ↓
i = 2
 ↓
2 <= 5 → true
 ↓
Print 2
 ↓
i++
 ↓
...
 ↓
i = 5
 ↓
5 <= 5 → true
 ↓
Print 5
 ↓
i++
 ↓
i = 6
 ↓
6 <= 5 → false
 ↓
STOP
```

### ⭐ Important Formula

```text
Initialization
      ↓
Condition
      ↓
   Body
      ↓
   Update
      ↓
Condition
      ↓
Repeat
```

---

# 🟡 8. for Loop — Print Even Numbers

```java
// public class EvenNumbers {
// 
//     public static void main(String[] args) {
// 
//         for (int i = 2; i <= 10; i += 2) {
//             System.out.println(i);
//         }
//     }
// }
```

### Output

```text
2
4
6
8
10
```

### Explanation

Here:

```java
// i += 2
```

means:

```java
// i = i + 2
```

So values become:

```text
2 → 4 → 6 → 8 → 10
```

---

# 🔵 9. while Loop

## What is a `while` Loop?

A `while` loop executes a block of code **as long as the condition is true**.

### Syntax

```java
// while (condition) {
//     // code
// }
```

### Important Point

In a `while` loop, the condition is checked **before** executing the loop body.

Therefore, it is called an:

> **Entry-Controlled Loop**

---

# 💻 10. Small Program — Print 1 to 5 Using while

```java
// public class WhileExample {
// 
//     public static void main(String[] args) {
// 
//         int i = 1;
// 
//         while (i <= 5) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }
```

### Output

```text
1
2
3
4
5
```

---

# 🔍 11. Full Explanation of while Loop

First:

```java
// int i = 1;
```

Starting value is `1`.

Then:

```java
// while (i <= 5)
```

Java checks the condition.

If:

```text
i <= 5
```

is true, the body executes.

Then:

```java
// i++;
```

increases the value.

---

# 🔄 12. while Loop Flow

```text
Initialize i
     ↓
Check condition
     ↓
  True?
  ↙    ↘
Yes     No
 ↓       ↓
Body    Stop
 ↓
Update
 ↓
Condition again
```

---

# ⚠️ 13. Important: Update in while Loop

Always remember to update the loop variable when required.

Correct:

```java
// int i = 1;
// 
// while (i <= 5) {
//     System.out.println(i);
//     i++;
// }
```

If you forget:

```java
// int i = 1;
// 
// while (i <= 5) {
//     System.out.println(i);
// }
```

`i` will always remain `1`.

Therefore:

```text
1 <= 5
```

will always be true.

This creates an **infinite loop**.

---

# 🟠 14. do-while Loop

## What is a `do-while` Loop?

A `do-while` loop executes the code **at least once**, even if the condition is false.

### Syntax

```java
// do {
//     // code
// } while (condition);
```

### Important Point

The condition is checked **after** executing the loop body.

Therefore, `do-while` is called an:

> **Exit-Controlled Loop**

---

# 💻 15. Small Program — do-while

```java
// public class DoWhileExample {
// 
//     public static void main(String[] args) {
// 
//         int i = 1;
// 
//         do {
//             System.out.println(i);
//             i++;
//         } while (i <= 5);
//     }
// }
```

### Output

```text
1
2
3
4
5
```

---

# 🔍 16. Full Explanation of do-while

Starting value:

```text
i = 1
```

Java first executes:

```java
// System.out.println(i);
```

Then:

```java
// i++;
```

Only after that, Java checks:

```java
// while (i <= 5);
```

So the order is:

```text
Body
 ↓
Update
 ↓
Condition
 ↓
Repeat
```

---

# ⭐ 17. Most Important Difference: while vs do-while

Consider:

```java
// int i = 10;
```

and condition:

```java
// i <= 5
```

The condition is already false.

### while

```java
// while (i <= 5) {
//     System.out.println(i);
// }
```

Output:

```text
No output
```

Because the condition is checked first.

### do-while

```java
// do {
//     System.out.println(i);
// } while (i <= 5);
```

Output:

```text
10
```

Because the body executes once before checking the condition.

---

# 🧠 18. Easy Difference

```text
while
 ↓
Check → Execute

do-while
 ↓
Execute → Check
```

### Remember:

> **while = condition first**

> **do-while = execution first**

---

# 🟣 19. Loop Control Statements

Java provides important statements to control loops:

1. `break`
2. `continue`

---

# 🛑 20. break Statement

## What is `break`?

`break` immediately terminates the loop.

### 💻 Small Program

```java
// public class BreakExample {
// 
//     public static void main(String[] args) {
// 
//         for (int i = 1; i <= 5; i++) {
// 
//             if (i == 3) {
//                 break;
//             }
// 
//             System.out.println(i);
//         }
//     }
// }
```

### Output

```text
1
2
```

### Explanation

When:

```java
// i == 3
```

becomes true:

```java
// break;
```

executes.

The loop stops immediately.

```text
1 → print
2 → print
3 → break
STOP
```

---

# ⏭️ 21. continue Statement

## What is `continue`?

`continue` skips the current iteration and moves to the next iteration.

### 💻 Small Program

```java
// public class ContinueExample {
// 
//     public static void main(String[] args) {
// 
//         for (int i = 1; i <= 5; i++) {
// 
//             if (i == 3) {
//                 continue;
//             }
// 
//             System.out.println(i);
//         }
//     }
// }
```

### Output

```text
1
2
4
5
```

### Explanation

When `i == 3`:

```java
// continue;
```

runs.

So `3` is skipped.

```text
1 → print
2 → print
3 → skip
4 → print
5 → print
```

---

# 🔥 22. break vs continue

| `break`        | `continue`              |
| -------------- | ----------------------- |
| Stops the loop | Skips current iteration |
| Loop ends      | Loop continues          |
| Used to exit   | Used to skip            |

### Easy Trick

```text
break
 ↓
STOP LOOP

continue
 ↓
SKIP THIS ROUND
```

---

# 📌 23. Nested Loops

A loop inside another loop is called a **nested loop**.

### Structure

```text
Outer Loop
    ↓
 Inner Loop
    ↓
 Repeat
```

---

# 💻 24. Small Program — Nested Loop

```java
// public class NestedLoop {
// 
//     public static void main(String[] args) {
// 
//         for (int i = 1; i <= 2; i++) {
// 
//             for (int j = 1; j <= 3; j++) {
//                 System.out.println("i = " + i + ", j = " + j);
//             }
//         }
//     }
// }
```

### Output

```text
i = 1, j = 1
i = 1, j = 2
i = 1, j = 3
i = 2, j = 1
i = 2, j = 2
i = 2, j = 3
```

### 🔍 Logic

For every one iteration of the outer loop, the inner loop completes all its iterations.

```text
i = 1
 ↓
j = 1
j = 2
j = 3

i = 2
 ↓
j = 1
j = 2
j = 3
```

# 🔢 25. Important Loop Concept — Counter

A variable used to count loop iterations is called a **counter**.

Example:

```java
// for (int i = 1; i <= 10; i++) {
//     System.out.println(i);
// }
```

Here:

```text
i = counter
```

It changes like:

```text
1 → 2 → 3 → 4 → ... → 10
```

---

# 🔄 26. `i++`, `i--`, `i += 2`

These are commonly used in loops.

### `i++`

```text
i = i + 1
```

### `i--`

```text
i = i - 1
```

### `i += 2`

```text
i = i + 2
```

### `i *= 2`

```text
i = i * 2
```

---

# 💻 27. Small Program — Reverse Counting

```java
// public class ReverseCounting {
// 
//     public static void main(String[] args) {
// 
//         for (int i = 5; i >= 1; i--) {
//             System.out.println(i);
//         }
//     }
// }
```

### Output

```text
5
4
3
2
1
```

### Logic

Starting:

```text
i = 5
```

Condition:

```text
i >= 1
```

Update:

```text
i--
```

Therefore:

```text
5 → 4 → 3 → 2 → 1
```

---

# ♾️ 28. Infinite Loop

An infinite loop is a loop that never stops.

Example:

```java
// while (true) {
//     System.out.println("Hello");
// }
```

The condition is always:

```text
true
```

Therefore, the loop continues forever.

### ⚠️ Be Careful

Infinite loops can make a program run continuously until it is stopped.

---

# 🧠 29. How to Choose the Correct Loop?

Use this simple decision process:

```text
Do I know how many times to repeat?
          |
        YES
          ↓
       for loop

          NO
          ↓
Is condition checked before execution?
          |
        YES
          ↓
      while loop

          NO
          ↓
Must execute at least once?
          |
        YES
          ↓
    do-while loop
```

---

# 📊 30. for vs while vs do-while

| Feature           | for              | while            | do-while        |
| ----------------- | ---------------- | ---------------- | --------------- |
| Condition         | Before           | Before           | After           |
| Minimum execution | 0                | 0                | 1               |
| Best for          | Known count      | Condition-based  | At least once   |
| Type              | Entry-controlled | Entry-controlled | Exit-controlled |

---

# 🎯 31. Important Loop Programs for Practice

After understanding the basics, practice these **one by one**:

### ⭐ Beginner

1. Print 1 to N
2. Print N to 1
3. Print even numbers
4. Print odd numbers
5. Print multiplication table
6. Find sum of numbers
7. Count numbers

### ⭐ Intermediate

8. Find factorial
9. Find sum of digits
10. Count digits
11. Reverse a number
12. Check palindrome number
13. Check Armstrong number
14. Check prime number
15. Print Fibonacci series
16. Find factors of a number

### ⭐ Placement Practice

17. Find GCD
18. Find LCM
19. Check perfect number
20. Check strong number
21. Check composite number
22. Print prime numbers in a range
23. Find largest digit
24. Find smallest digit
25. Calculate power without using `Math.pow()`
26. 
# 🏆 32. Golden Rule

Whenever you see a loop problem, first identify:

```text
1. Starting value?
2. Ending condition?
3. How will the value change?
4. How many times should it repeat?
5. Should the condition be checked before or after execution?
```

Then choose:

```text
Known repetitions → for

Condition-based → while

Must execute once → do-while
```
### 33. Final Takeaway
```text
Loops are one of the most important foundations of Java programming.

If you understand:

Initialization
↓
Condition
↓
Body
↓
Update
↓
Repeat

you can solve many beginner and placement problems.
```
