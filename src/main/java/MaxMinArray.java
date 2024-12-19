//Task: 04

import java.util.Random;
public class MaxMinArray {
    public static void main(String[] args){
        Random random = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt();
        }

        printArray(numbers);

        int minimum = findMinimum(numbers);
        int maximum = findMaximum(numbers);
        //System.out.println(Arrays.toString(numbers));
        System.out.println("Minimum number from the array: " + minimum);
        System.out.println("Maximum number from the array: " + maximum);
    }

    public static void printArray(int[] array){
        for (int item : array) {
            System.out.println(item);
        }
    }

    public static int findMinimum(int[] array){
        int minimum = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
        }

        return minimum;
    }

    public static int findMaximum(int[] array){
        int maximum = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maximum){
                maximum = array[i];
            }
        }

        return maximum;
    }
}
