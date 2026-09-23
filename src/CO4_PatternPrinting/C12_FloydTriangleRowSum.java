package CO4_PatternPrinting;
import java.util.Scanner;
public class C12_FloydTriangleRowSum {

        public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);

                    // Take number of rows from the user.
                    System.out.print("Enter number of rows: ");
                    int n = sc.nextInt();

                    // Start printing numbers from 1.
                    int num = 1;

                    // Outer loop controls the rows.
                    for (int i = 1; i <= n; i++) {

                        // Sum starts from 0 for each row.
                        int sum = 0;

                        // Inner loop controls numbers in the row.
                        for (int j = 1; j <= i; j++) {

                            // Print the current number.
                            System.out.print(num + " ");

                            // Add number to the row sum.
                            sum = sum + num;

                            // Increase number by 1.
                            num++;
                        }

                        // Print the sum of this row.
                        System.out.println("= " + sum);
                    }

                    sc.close();
                }
            }


