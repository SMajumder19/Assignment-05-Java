//Task: 03

import java.util.Scanner;

public class FindingCGPA {
    public static void main(String[] args){
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the CGPA: ");
        double input = sc.nextDouble();

        double[] sortedCGPA = sortArray(cgpa);
        //System.out.println(Arrays.toString(sortedCGPA));

        boolean isPresent = findCGPA(sortedCGPA, input);
        if(isPresent){
            System.out.println("The given CGPA is present!");
        } else {
            System.out.println("The given CGPA is not present!");
        }
    }

    public static double[] sortArray(double[] array){
        double min = -1.0;
        int minIndex = -1;
        for(int i = 0; i < array.length; i++){
            min = array[i];
            minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
        }

        return array;
    }

    public static boolean findCGPA(double[] sortedArray, double goal){
        int low  = 0;
        int high = sortedArray.length - 1;
        int mid = -1;

        while(low <= high){
            mid = low + ((high - low) / 2);

            if(sortedArray[mid] == goal){
                return true;
            }

            if(goal > sortedArray[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

}
