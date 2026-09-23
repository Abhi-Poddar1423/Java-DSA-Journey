package CO3_Loops;

public class C08_ASCIIValue {
    public static void main(String[] args){
        // Loop from A to Z
        for(char ch = 'A'; ch <= 'Z'; ch++){
            // Convert character into integer
            int ascii = ch;
            // Print character and ASCII value
            System.out.println(ch + " = " + ascii);
        }
    }
}
