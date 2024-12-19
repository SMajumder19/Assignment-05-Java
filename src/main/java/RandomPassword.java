//Task: 10

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String digit = "0123456789";
        String special = "!@#$%^&*";

        String password = generatePassword(capital, small, digit, special);
        System.out.println(password);
    }

    public static String generatePassword(String capital, String small, String digit, String special){
        Random random = new Random();
        String mandatory = "" + capital.charAt(random.nextInt(capital.length())) +
                small.charAt(random.nextInt(small.length())) +
                digit.charAt(random.nextInt(digit.length())) +
                special.charAt(random.nextInt(special.length()));
        String remaining = "";
        String combined = capital + small+ digit + special;
        for(int i = 0; i < 4; i++){
            remaining += combined.charAt(random.nextInt(combined.length()));
        }
        String password = mandatory + remaining;
        //System.out.println(password);

        char[] characters = password.toCharArray();
        int index = -1;
        char temp = ' ';
        //using fisher-yates shuffle algorithm
        for(int i = characters.length - 1; i > 0; i--){
            index = random.nextInt(i + 1);
            temp = characters[i];
            characters[i] = characters[index];
            characters[index] = temp;
        }

        String randomPass = new String(characters);
        return randomPass;
    }

}
