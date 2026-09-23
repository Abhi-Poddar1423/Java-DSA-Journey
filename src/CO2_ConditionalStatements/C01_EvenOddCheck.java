package CO2_ConditionalStatements;
import java.util.Scanner;
public class C01_EvenOddCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        
        if (num % 2 ==0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd8");
            
        }
    }
        
}
