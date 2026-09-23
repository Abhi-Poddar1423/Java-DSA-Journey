package CO2_ConditionalStatements;

import java.util.Scanner;
public class C03_CheckInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer:");
       double number = sc.nextDouble();

        if (number % 1 == 0){
            System.out.println((int)number + " ais a integer");
        }
        else {
            System.out.println(number + " it is not a Integer");
        }
    }
}
