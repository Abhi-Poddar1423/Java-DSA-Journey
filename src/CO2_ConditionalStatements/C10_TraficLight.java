package CO2_ConditionalStatements;
import java.util.Scanner;
public class C10_TraficLight {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take traffic light color
            System.out.print("Enter traffic light color: ");
            String color = sc.next().toLowerCase();

            switch (color) {

                case "red":
                    System.out.println("STOP");
                    break;

                case "yellow":
                    System.out.println("WAIT");
                    break;

                case "green":
                    System.out.println("GO");
                    break;

                default:
                    System.out.println("Invalid Color");
            }

            sc.close();
        }
    }

