//Task: 14

import java.util.Scanner;
public class CheckIPAddress {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the IP Address: ");
        String ip = sc.nextLine();

        boolean isValid = ipChecker(ip);
        if(isValid){
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
    }

    public static boolean ipChecker(String ip){
        boolean isValid = false;
        String[] blocks = ip.split("[.]");
        //System.out.println(Arrays.toString(blocks));
        if(blocks.length != 4){
            return false;
        }

        int num = -1;
        for(int i = 0; i < blocks.length; i++){
            try{
                num = Integer.parseInt(blocks[i]);
            } catch(Exception e){
                return false;
            }

            if(i == 0){
                if(num < 10){
                    return false;
                } else {
                    isValid = true;
                }
            } else {
                if(num >= 0){
                    isValid = true;
                } else {
                    return false;
                }
            }
        }
        return isValid;
    }
}
