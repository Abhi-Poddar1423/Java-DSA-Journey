package CO2_Conditionals;
import java.util.Scanner;
public class CO2_CheckDivisibilityTest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        // Check divisibility by both 5 and 11
        if(num % 5 ==0 && num % 11 == 0){
            System.out.println(num + " is Divisible by 5 and 11");
        }else {
            System.out.println(num + " is not Divisible by 5 and 11");
        }
    }
}
