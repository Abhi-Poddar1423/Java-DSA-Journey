package CO2_ConditionalStatements;
import java.util.Scanner;
public class JO9_CheckLeapYear {
   public  static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Year: ");
       int year = sc.nextInt();

       if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)){
           System.out.println(year + " is Leap Year");
       } else {
           System.out.println(year + " is not Leap Year");
       }
    }
}
