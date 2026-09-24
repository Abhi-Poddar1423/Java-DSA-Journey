package CO5_Methods;
import java.util.Scanner;
public class C07_NCRAndNPR {

        // Method to calculate factorial
        static int factorial(int n) {

            int fact = 1;

            // Calculate factorial of n
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            // Return factorial value
            return fact;
        }

        // Method to calculate NCR
        public static int ncr(int n, int r) {

            // Formula: nCr = n! / (r! * (n-r)!)
            return factorial(n) / (factorial(r) * factorial(n - r));
        }

        // Method to calculate NPR
        static int npr(int n, int r) {

            // Formula: nPr = n! / (n-r)!
            return factorial(n) / factorial(n - r);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Taking n from the user
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            // Taking r from the user
            System.out.print("Enter r: ");
            int r = sc.nextInt();

            // Calling NCR method
            int combination = ncr(n, r);

            // Calling NPR method
            int permutation = npr(n, r);

            // Displaying results
            System.out.println("NCR = " + combination);
            System.out.println("NPR = " + permutation);
        }
    }



    /*
    factorial() is a helper method that calculates
    the factorial of a given number and returns it.

    Instead of writing the factorial logic again and again,
    we simply call this method whenever we need n!, r!,
    or (n-r)!.
*/

/*
    nPr() calculates the number of permutations.

    Formula:
    nPr = n! / (n-r)!

    Here, order matters, so different arrangements
    are counted separately.
*/

/*
    nCr() calculates the number of combinations.

    Formula:
    nCr = n! / (r! * (n-r)!)

    Here, order does not matter, so different
    arrangements of the same group are counted only once.
*/

/*
    In the main() method, we take n and r as input
    from the user and then call the nPr() and nCr()
    methods to get the required results.
*/

