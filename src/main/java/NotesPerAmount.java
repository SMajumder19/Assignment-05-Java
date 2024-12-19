//Task: 05

import java.util.Scanner;
public class NotesPerAmount {
    public static void main(String[] args){
        int[] notes = {1000,500,200,100,50,20,10,5,2,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        int amount = sc.nextInt();

        if(amount <= 0){
            System.out.println("This is not a valid amount!");
        } else {
            notesCount(notes, amount);
        }
    }

    public static void notesCount(int[] notes, int amount){
        int remaining = amount;
        for(int i = 0; ((i < notes.length) && (remaining != 0)); i++){
            if(remaining / notes[i] > 0){
                System.out.println(notes[i] + " " + (remaining / notes[i]));
                remaining = remaining % notes[i];
            }
        }
    }
}
