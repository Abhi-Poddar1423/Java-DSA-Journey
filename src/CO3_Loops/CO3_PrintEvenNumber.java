package CO3_Loops;
import java.util.Scanner;
public class CO3_PrintEvenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number");
        int num = sc.nextInt();

        for(int i = 1; i<= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
