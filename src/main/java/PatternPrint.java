//Task: 06

public class PatternPrint {
    public static void main(String[] args){
        generatePattern(5);
    }

    public static void generatePattern(int input){
        if(input == 1){
            System.out.println(input);
            return;
        }

        for(int i = input; i > 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
