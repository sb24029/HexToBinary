/*This code converts hex digits to Binary, I used switch case because i needed a default statement if the user didn't put in 
any other value than hexadecimal.
 */
import java.util.Scanner;
public class HexToBinary {


    public static void main(String args[]) {
        System.out.println("Please enter Hexadecimal number : ");
        Scanner sc = new Scanner(System.in);

        String hex = sc.next();

        for (int i = 0; i < hex.length(); i++) {
            char hexVal = hex.charAt(i);
            String binary ="";
            switch (hexVal) {
                case '0':
                    binary = "0000";
                    break;
                case '1':
                    binary = "0001";
                    break;
                case '2':
                    binary = "0010";
                    break;
                case '3':
                    binary = "0011";
                    break;
                case '4':
                    binary = "0100";
                    break;
                case '5':
                    binary = "0101";
                    break;
                case '6':
                    binary = "0110";
                    break;
                case '7':
                    binary = "0111";
                    break;
                case '8':
                    binary = "1000";
                    break;
                case '9':
                    binary = "1001";
                    break;
                case 'A':
                case 'a':
                    binary = "1010";
                    break;
                case 'B':
                case 'b':
                    binary = "1011";
                    break;
                case 'C':
                case 'c':
                    binary = "1100";
                    break;
                case 'D':
                case 'd':
                    binary = "1101";
                    break;
                case 'E':
                case 'e':
                    binary = "1110";
                    break;
                case 'F':
                case 'f':
                    binary = "1111";
                    break;
                    default: binary = "Invalid number";
                    break;
            }
            if(binary.equalsIgnoreCase("Invalid number")){
                System.out.println("Number is invalid");
            }
            else {
                System.out.printf(binary);
            }
        }


    }
}