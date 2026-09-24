package CO5_Methods;

public class C10__MethodOverloading {
    /*
     * Method Overloading:
     *
     * Same method name
     * +
     * Different parameter list
     *
     * Here, both methods are named sum(),
     * but Java can distinguish them because
     * their parameter lists are different.
     */

    // sum() with 2 parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum() with 3 parameters
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        // Java sees sum(5, 9)
        // → Matches sum(int, int)
        // → Returns 14
        int result = sum(5, 9);

        System.out.println(result);

        // Java sees sum(7, 8, 9)
        // → Matches sum(int, int, int)
        // → Returns 24
        System.out.println(sum(7, 8, 9));
    }
}

/*
================================================================================
                    🧠 MEMORY + EXECUTION POV
================================================================================

IMPORTANT:
Method Overloading is resolved at COMPILE TIME.

Java looks at:
    1. Method name
    2. Number of arguments
    3. Type of arguments
    4. Order of argument types

It uses these to decide which overloaded method should be called.

--------------------------------------------------------------------------------
STEP 1 — PROGRAM STARTS
--------------------------------------------------------------------------------

Java starts executing:

    main()

A Stack Frame for main() is created.

STACK:

┌─────────────────────────┐
│ main()                  │
└─────────────────────────┘


--------------------------------------------------------------------------------
STEP 2 — FIRST METHOD CALL
--------------------------------------------------------------------------------

Java reaches:

    int result = sum(5, 9);

Java checks the overloaded sum() methods:

    sum(int a, int b)
    sum(int a, int b, int c)

Arguments:

    5 → int
    9 → int

So Java finds:

    sum(int, int)

The 3-parameter version does NOT match.

IMPORTANT:
Java decides this method during COMPILE TIME.


--------------------------------------------------------------------------------
STEP 3 — sum(int, int) STARTS EXECUTING
--------------------------------------------------------------------------------

A new Stack Frame is created for:

    sum(int a, int b)

The values are passed to the parameters:

    a = 5
    b = 9

STACK:

┌─────────────────────────┐
│ sum()                   │
│ a = 5                   │
│ b = 9                   │
├─────────────────────────┤
│ main()                  │
│ result = ?              │
└─────────────────────────┘


--------------------------------------------------------------------------------
STEP 4 — METHOD EXECUTES
--------------------------------------------------------------------------------

Java executes:

    return a + b;

Which becomes:

    return 5 + 9;

Therefore:

    return 14;


--------------------------------------------------------------------------------
STEP 5 — METHOD FRAME IS REMOVED
--------------------------------------------------------------------------------

The sum() method finishes.

Its Stack Frame is removed.

The value 14 is returned to main().

STACK:

┌─────────────────────────┐
│ main()                  │
│ result = 14             │
└─────────────────────────┘

Now:

    System.out.println(result);

prints:

    14


--------------------------------------------------------------------------------
STEP 6 — SECOND METHOD CALL
--------------------------------------------------------------------------------

Java reaches:

    System.out.println(sum(7, 8, 9));

Java again checks the overloaded methods:

    sum(int, int)
    sum(int, int, int)

Arguments:

    7 → int
    8 → int
    9 → int

The matching method is:

    sum(int, int, int)

So Java chooses the 3-parameter version.


--------------------------------------------------------------------------------
STEP 7 — sum(int, int, int) STARTS
--------------------------------------------------------------------------------

A new Stack Frame is created.

The parameters receive:

    a = 7
    b = 8
    c = 9

STACK:

┌─────────────────────────┐
│ sum()                   │
│ a = 7                   │
│ b = 8                   │
│ c = 9                   │
├─────────────────────────┤
│ main()                  │
│ result = 14             │
└─────────────────────────┘


--------------------------------------------------------------------------------
STEP 8 — METHOD EXECUTES
--------------------------------------------------------------------------------

Java executes:

    return a + b + c;

Which becomes:

    return 7 + 8 + 9;

Therefore:

    return 24;


--------------------------------------------------------------------------------
STEP 9 — RETURN TO main()
--------------------------------------------------------------------------------

The sum() Stack Frame is removed.

24 is returned to main().

Then:

    System.out.println(24);

prints:

    24


--------------------------------------------------------------------------------
                    🔥 FINAL EXECUTION FLOW
--------------------------------------------------------------------------------

                    PROGRAM STARTS
                           ↓
                         main()
                           ↓
                  main() Stack Frame
                           ↓
                    sum(5, 9) called
                           ↓
              Java checks overloaded methods
                           ↓
                  sum(int, int) selected
                           ↓
                  New sum() Stack Frame
                           ↓
                    a = 5, b = 9
                           ↓
                    return 5 + 9
                           ↓
                       return 14
                           ↓
                  sum() frame removed
                           ↓
                   result = 14
                           ↓
                       print 14
                           ↓
                   sum(7, 8, 9) called
                           ↓
              Java checks overloaded methods
                           ↓
              sum(int, int, int) selected
                           ↓
                  New sum() Stack Frame
                           ↓
                a = 7, b = 8, c = 9
                           ↓
                  return 7 + 8 + 9
                           ↓
                       return 24
                           ↓
                  sum() frame removed
                           ↓
                       print 24
                           ↓
                    main() finishes
                           ↓
                    PROGRAM ENDS


================================================================================
                    🧠 WHAT I SHOULD REMEMBER
================================================================================

METHOD OVERLOADING:

    Same method name
            +
    Different parameter list


For example:

    sum(int, int)
    sum(int, int, int)


Java does NOT use the return type to distinguish overloaded methods.

This is NOT valid overloading:

    int sum(int a, int b)
    double sum(int a, int b)

because the parameter lists are exactly the same.


The most important memory concept:

    Method Overloading
            ↓
    Java identifies the correct method
            ↓
        COMPILE TIME
            ↓
    Then during execution
            ↓
    The selected method gets its own Stack Frame
            ↓
    Parameters receive values
            ↓
    Method executes
            ↓
    return sends the result back
            ↓
    Stack Frame is removed
            ↓
    Caller continues execution


🧠 MEMORY HOOK:

"Same name doesn't confuse Java.

Java looks at the arguments and finds the
matching parameter list BEFORE the program runs."

================================================================================
*/

