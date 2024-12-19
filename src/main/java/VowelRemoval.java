//Task: 11

public class VowelRemoval {
    public static void main(String[] args){
        String output = removeVowels("I am a SQA Engineer");
        System.out.println(output);
    }

    public static String removeVowels(String input){
        char[] characters = input.toLowerCase().toCharArray();
        String output = "";

        for(char character : characters){
            if((character != 'a') && (character != 'e') && (character != 'i') && (character != 'o') && (character != 'u')){
                output = output + character;
            }
        }

        return output;
    }
}
