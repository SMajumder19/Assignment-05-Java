//Task: 08

public class CountFromString {
    public static void main(String[] args){
        String input = "I am a SQA Engineer";
        countWord(input);
        countChars(input);
        countTypes(input);
    }

    public static void countWord(String input){
        char[] characters = input.toCharArray();
        char current = ' ';
        char previous = ' ';
        int word = 0;
        for(char character : characters){
            current = character;
            if((previous == ' ') && (current != ' ')){
                word++;
            }
            previous = current;
        }

        System.out.println("Words: " + word);
    }

    public static void countChars(String input){
        char[] characters = input.toCharArray();
        int chars = 0;
        for(char character : characters){
            if(character != ' '){
                chars++;
            }
        }

        System.out.println("Chars: " + chars);
    }

    public static void countTypes(String input){
        char[] characters = input.toLowerCase().toCharArray();
        int vowel = 0;
        int consonant = 0;
        int ascii = 0;
        for(char character : characters){
            ascii = (int)character;
            if((ascii >= 97) && (ascii <= 122)){
                if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowel: " + vowel);
        System.out.println("Consonant: " + consonant);
    }
}
