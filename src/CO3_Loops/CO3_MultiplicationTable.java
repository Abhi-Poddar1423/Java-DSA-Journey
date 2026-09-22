package CO3_Loops;
import java.util.Scanner;
public class CO3_MultiplicationTable {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));

        }

    }
}
