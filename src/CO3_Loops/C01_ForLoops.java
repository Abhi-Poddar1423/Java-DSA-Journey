package CO3_Loops;
import java.util.Scanner;
public class C01_ForLoops {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            System.out.println(i);
        }

    }
}
