package CO3_Loops;
import java.util.Scanner;
public class CO3_PrintPrimeNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");

        int n = sc.nextInt();
        boolean prime = true;

        if(n < 2){
            prime = false;
        }
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }
}
