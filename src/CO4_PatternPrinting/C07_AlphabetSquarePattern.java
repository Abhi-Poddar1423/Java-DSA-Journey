package CO4_PatternPrinting;
import java.util.Scanner;
public class C07_AlphabetSquarePattern {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of Alphabet Square: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    System.out.print((char)(i + 64) + " ");
                }
                System.out.println();
            }
            sc.close();
        }
    }

