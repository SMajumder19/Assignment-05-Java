//Task: 09

import java.util.Scanner;
public class BinaryCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        String input = sc.nextLine();

        binaryChecker(input);
    }

    public static void binaryChecker(String input){
        char[] digits = input.toCharArray();
        boolean isBinary = true;

        for(char digit : digits){
            if((digit != '0') && (digit != '1')){
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary);
    }
}
