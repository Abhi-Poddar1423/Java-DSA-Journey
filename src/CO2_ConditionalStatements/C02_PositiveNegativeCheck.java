package CO2_ConditionalStatements;
import java.util.Scanner;
public class C02_PositiveNegativeCheck {
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
