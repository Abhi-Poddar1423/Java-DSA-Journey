# 🧠 Java Methods (Functions) — Memory Notes

> **Goal:** Don't just memorize methods. Visualize what happens when a method is called.

---

# 1. What is a Method?

A **method** is a named block of code that performs a specific task.

Instead of writing the same logic again and again, we write it once inside a method and call it whenever we need it.

Think of a method like a **machine**:

```text
Input → Method → Processing → Output
```

### Example

```java
static int add(int a, int b) {
    return a + b;
}
```

This method:

1. Receives two numbers.
2. Adds them.
3. Returns the result.

---

# 2. Why Do We Use Methods?

Methods help us:

* Avoid code repetition
* Organize code
* Reuse code
* Make programs easier to understand
* Break large problems into smaller problems
* Make debugging easier

### Without a Method

```java
int a = 10;
int b = 20;

System.out.println(a + b);

int x = 30;
int y = 40;

System.out.println(x + y);
```

The same addition logic is repeated.

### With a Method

```java
static int add(int a, int b) {
    return a + b;
}
```

Now we can reuse it:

```java
System.out.println(add(10, 20));
System.out.println(add(30, 40));
```

---

# 3. Anatomy of a Method

Look at this method:

```java
static int add(int a, int b) {
    return a + b;
}
```

Break it into parts:

```text
static       int       add       (int a, int b)
  │           │         │              │
  │           │         │              └── Parameters
  │           │         └───────────────── Method Name
  │           └─────────────────────────── Return Type
  └─────────────────────────────────────── Modifier
```

The code inside `{ }` is called the **method body**.

```java
{
    return a + b;
}
```

The method body contains the actual logic performed by the method.

---

# 4. Basic Method Syntax

```java
modifier returnType methodName(parameters) {

    // Method body

}
```

### Example

```java
static int square(int n) {

    return n * n;
}
```

Here:

```text
static       → modifier
int          → return type
square       → method name
int n        → parameter
return n*n   → method body
```

---

# 5. The Most Important Memory Rule ⭐

Whenever a method is called:

> **Java creates a new stack frame for that method call.**

The stack frame contains information needed for that particular method execution.

Example:

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);
    }
}
```

When `main()` starts:

```text
STACK

┌────────────────────┐
│ main()             │
│ result             │
└────────────────────┘
```

When `add(10, 20)` is called:

```text
STACK

┌────────────────────┐
│ add()              │
│ a = 10             │
│ b = 20             │
├────────────────────┤
│ main()             │
│ result             │
└────────────────────┘
```

`add()` calculates:

```text
10 + 20 = 30
```

Then:

```java
return 30;
```

After the method finishes:

```text
STACK

┌────────────────────┐
│ main()             │
│ result = 30        │
└────────────────────┘
```

The `add()` stack frame is removed after the call finishes.

### Important

Think:

```text
Method Call
     ↓
New Stack Frame
     ↓
Method Executes
     ↓
Return
     ↓
Frame Removed
```

---

# 6. Parameters vs Arguments

This is very important.

### Method Declaration

```java
static int add(int a, int b)
```

Here:

```text
a → Parameter
b → Parameter
```

### Method Call

```java
add(10, 20);
```

Here:

```text
10 → Argument
20 → Argument
```

### Easy Way to Remember

| Parameter                              | Argument                               |
| -------------------------------------- | -------------------------------------- |
| Variable defined in method declaration | Actual value passed during method call |
| `a`, `b`                               | `10`, `20`                             |
| Acts like an empty box                 | Value placed into the box              |

Visualize:

```text
add(10, 20)

a → 10
b → 20
```

---

# 7. The Four Basic Types of Methods

There are two questions to ask:

```text
Does the method take input?
        ↓
Does the method return output?
```

This gives four basic types.

---

## Type 1 — No Input, No Return

```java
static void greet() {

    System.out.println("Hello");
}
```

Call:

```java
greet();
```

The method receives nothing and returns nothing.

```text
Input  → No
Output → No
```

---

## Type 2 — Input, No Return

```java
static void greet(String name) {

    System.out.println("Hello " + name);
}
```

Call:

```java
greet("Vivek");
```

Here:

```text
Input  → Yes
Output → No
```

---

## Type 3 — No Input, Return

```java
static int getNumber() {

    return 10;
}
```

Call:

```java
int number = getNumber();
```

Here:

```text
Input  → No
Output → Yes
```

---

## Type 4 — Input and Return ⭐

```java
static int multiply(int a, int b) {

    return a * b;
}
```

Call:

```java
int result = multiply(5, 4);
```

Here:

```text
Input  → Yes
Output → Yes
```

This pattern is extremely common in programming.

---

# 8. Understanding `void`

`void` means:

> **The method does not return a value.**

Example:

```java
static void printMessage() {

    System.out.println("Done");
}
```

Correct:

```java
printMessage();
```

Incorrect:

```java
int x = printMessage();
```

Why?

Because `printMessage()` does not return a value.

```text
void method
    ↓
Does some work
    ↓
Returns nothing
```

---

# 9. Understanding `return`

The `return` statement has two important jobs:

1. It sends a value back to the caller.
2. It immediately terminates the current method.

Example:

```java
static int square(int n) {

    return n * n;
}
```

Call:

```java
int result = square(5);
```

Execution:

```text
square(5)

n = 5

5 × 5
  ↓
 25
  ↓
return 25
```

The value `25` goes back to the caller.

---

# 10. `return` Immediately Ends the Method

Example:

```java
static int test() {

    return 10;

    // This code will never execute
}
```

Once Java reaches:

```java
return 10;
```

the method ends immediately.

Think:

```text
return
  ↓
Send value back
  ↓
Exit method
```

---

# 11. Local Variables

A variable created inside a method is called a **local variable**.

Example:

```java
static int add(int a, int b) {

    int sum = a + b;

    return sum;
}
```

During execution:

```text
add()

a = 10
b = 20
sum = 30
```

These variables belong to that particular method call.

Think of a method as a room:

```text
┌──────────────────────┐
│       add()          │
│                      │
│ a = 10               │
│ b = 20               │
│ sum = 30             │
│                      │
└──────────────────────┘
```

When the method finishes, its local execution data is no longer available to the caller.

---

# 12. Understanding Scope

**Scope** means:

> The region of a program where a variable can be accessed.

Example:

```java
static void test() {

    int x = 10;

    System.out.println(x);
}
```

`x` can be accessed inside `test()`.

But this is invalid outside the method:

```java
static void test() {

    int x = 10;
}

System.out.println(x);
```

Why?

Because `x` is a local variable of `test()`.

```text
test()
│
├── x = 10  ← accessible here
│
└── method ends

outside test()
│
└── x is not accessible
```

---

# 13. Methods Calling Other Methods

One method can call another method.

This allows us to divide a large problem into smaller pieces.

Example:

```java
static int square(int n) {

    return n * n;
}

static int calculate(int x) {

    return square(x) + 10;
}
```

Suppose:

```java
calculate(5);
```

Execution:

```text
main()
   ↓
calculate(5)
   ↓
square(5)
   ↓
5 × 5 = 25
   ↓
return 25
   ↓
calculate()
   ↓
25 + 10 = 35
   ↓
return 35
```

This type of method chaining becomes very important in **DSA and larger programs**.

---

# 14. Understanding the Call Stack

Whenever a method is called, its execution is placed on the **call stack**.

Example:

```text
main()
  ↓
methodA()
  ↓
methodB()
```

The stack looks like:

```text
        STACK

┌──────────────┐
│ methodB()    │ ← Top
├──────────────┤
│ methodA()    │
├──────────────┤
│ main()       │
└──────────────┘
```

When `methodB()` finishes:

```text
        STACK

┌──────────────┐
│ methodA()    │ ← Top
├──────────────┤
│ main()       │
└──────────────┘
```

Then `methodA()` finishes:

```text
        STACK

┌──────────────┐
│ main()       │
└──────────────┘
```

This follows:

> **LIFO — Last In, First Out**

Think about a stack of plates:

```text
Top

[ Plate 3 ] ← Last placed → First removed
[ Plate 2 ]
[ Plate 1 ]
```

The same basic idea applies to the call stack.

---

# 15. Static Methods

You will often see:

```java
static void hello() {

    System.out.println("Hello");
}
```

For now, remember:

> **A static method belongs to the class rather than to an individual object.**

Therefore, another static method such as `main()` can call it directly from the same class.

Example:

```java
class Main {

    static void hello() {

        System.out.println("Hello");
    }

    public static void main(String[] args) {

        hello();
    }
}
```

Execution:

```text
main()
  ↓
hello()
  ↓
"Hello"
```

Later, when learning **OOP**, you will understand the difference between static and instance methods more deeply.

---

# 16. Methods and Arrays

A method can receive an array as a parameter.

Example:

```java
static int findMax(int[] arr) {

    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {

        if (arr[i] > max) {
            max = arr[i];
        }
    }

    return max;
}
```

Call:

```java
int[] numbers = {10, 40, 20, 90, 30};

int max = findMax(numbers);
```

Conceptually:

```text
numbers
   │
   ▼
┌────┬────┬────┬────┬────┐
│ 10 │ 40 │ 20 │ 90 │ 30 │
└────┴────┴────┴────┴────┘
   ▲
   │
  arr
```

The parameter `arr` refers to the same array object.

This becomes very important when learning **arrays and DSA**.

---

# 17. Methods and Strings

Strings can also be passed to methods.

Example:

```java
static void greet(String name) {

    System.out.println("Hello " + name);
}
```

Call:

```java
greet("Vivek");
```

Conceptually:

```text
name
 ↓
"Vivek"
```

Output:

```text
Hello Vivek
```

---

# 18. Complete Method Example

Let's combine the important concepts.

```java
public class Main {

    static int multiply(int a, int b) {

        int result = a * b;

        return result;
    }

    public static void main(String[] args) {

        int answer = multiply(5, 4);

        System.out.println(answer);
    }
}
```

### Execution

First:

```text
main()
```

Then:

```java
multiply(5, 4);
```

A new stack frame is created:

```text
┌─────────────────────┐
│ multiply()          │
│                     │
│ a = 5               │
│ b = 4               │
│ result = 20         │
└─────────────────────┘
```

Then:

```java
return result;
```

which means:

```text
return 20
```

The value goes back to `main()`:

```text
answer = 20
```

Then:

```java
System.out.println(answer);
```

Output:

```text
20
```

---

# 19. Common Beginner Mistakes

## Mistake 1 — Forgetting `return`

Wrong:

```java
static int add(int a, int b) {

    a + b;
}
```

Correct:

```java
static int add(int a, int b) {

    return a + b;
}
```

Because the return type is `int`, the method must return an integer value on every valid execution path.

---

## Mistake 2 — Returning a Value from `void`

Wrong:

```java
static void greet() {

    return 10;
}
```

A `void` method does not return a value.

Correct:

```java
static void greet() {

    System.out.println("Hello");
}
```

---

## Mistake 3 — Using a Local Variable Outside Its Scope

Wrong:

```java
static void test() {

    int x = 5;
}

System.out.println(x);
```

`x` is local to `test()` and cannot be accessed there.

---

## Mistake 4 — Mixing Parameters and Arguments

Method:

```java
add(int a, int b)
```

Call:

```java
add(5, 10);
```

Remember:

```text
a, b    → Parameters

5, 10   → Arguments
```

---

# 20. Method Memory Visualization

Whenever you see:

```java
static int multiply(int a, int b) {

    int result = a * b;

    return result;
}
```

Visualize:

```text
main()
   │
   │ calls
   ▼
┌──────────────────────┐
│ multiply(5, 4)       │
│                      │
│ a = 5                │
│ b = 4                │
│ result = 20          │
│                      │
│ return 20            │
└──────────────────────┘
   │
   │
   ▼
main receives 20
```

After returning:

```text
multiply() frame
      ↓
   removed

main()
  ↓
answer = 20
```

---

# 🧠 My Method Memory Cheat Code

Whenever I see a method, I ask these five questions:

```text
1. What is the method name?
          ↓
2. What input does it receive?
          ↓
3. What happens inside its stack frame?
          ↓
4. What work does it perform?
          ↓
5. What does it return?
```

For example:

```java
static int multiply(int a, int b) {

    int result = a * b;

    return result;
}
```

My mental visualization should be:

```text
main()
   ↓
multiply(5, 4)
   ↓
New Stack Frame
   ↓
a = 5
b = 4
result = 20
   ↓
return 20
   ↓
Stack Frame finishes
   ↓
main receives 20
```

---

# ⭐ The One Diagram I Should Never Forget

```text
                    main()
                      │
                      │ calls
                      ▼
          ┌────────────────────────┐
          │    multiply(5, 4)      │
          │                        │
          │    a = 5               │
          │    b = 4               │
          │    result = 20         │
          │                        │
          │    return 20           │
          └────────────────────────┘
                      │
                      ▼
                main receives 20
```

---

# 🔁 One-Line Revision

* A **method** is a named block of reusable logic.
* Methods help avoid code repetition and organize programs.
* A method can receive **parameters** and return a value.
* **Parameters** are variables in the method declaration.
* **Arguments** are actual values passed during a method call.
* `void` means the method does not return a value.
* `return` sends a value back and immediately ends the current method.
* Local variables have **local scope**.
* Method calls use the **call stack** for execution.
* The call stack follows **LIFO — Last In, First Out**.
* `static` methods belong to the class.
* Arrays and Strings can be passed to methods.
* Methods can call other methods.
* **Don't just memorize a method — visualize its execution.**

---

# 🎯 Final Memory Rule

> **Method Call → Stack Frame → Parameters & Local Variables → Processing → Return → Frame Finishes**

### Learn → Visualize → Code → Practice → Repeat 🔁

**That's how I want to understand Java Methods.** ☕
