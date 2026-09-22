package CO2_Conditionals;
import java.util.Scanner;
public class CO2_PositiveNegativeCheck {
   public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("Postive Number");
        } else if (num<0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("ZERO");
        }


    }
}
