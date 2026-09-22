package CO2_ConditionalStatements;
import java.util.Scanner;
public class JO4_GreaterFourNumber {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter First number:");
       int n1 = sc.nextInt();

       System.out.print("Enter Second Number:");
       int n2 = sc.nextInt();

       System.out.print("Enter Third Number:");
       int n3 = sc.nextInt();

       System.out.print("Enter Fourth Number:");
       int n4 = sc.nextInt();

       if(n1 >= n2 && n1 >= n3 && n1 >= n4){
           System.out.println(n1 + " is Greatest");
       } else if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
           System.out.println(n2 + " is Greatest");
       } else if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
           System.out.println(n3 + " is Greatest");
       }else {
           System.out.println(n4 + " is Greatest");
       }


   }

}
