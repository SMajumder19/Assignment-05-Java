//Task: 01

public class SecondHighest {
    public static void main(String[] args){
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        int secondHighestIndex = findSecondHighest(cgpa);

        if(secondHighestIndex == -1){
            System.out.println("Second highest score does not exist!");
        } else {
            System.out.println("Student No: " + (secondHighestIndex + 1) + " achieved the 2nd highest score!");
            System.out.println("The 2nd highest score is: " + cgpa[secondHighestIndex]);
        }
    }

    public static int findSecondHighest(double[] array){
        double max = Integer.MIN_VALUE;
        double secondMax = Integer.MIN_VALUE;
        int maxIndex = -1;
        int secondMaxIndex = -1;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                secondMax = max;
                secondMaxIndex = maxIndex;
                max = array[i];
                maxIndex = i;
            } else if((array[i] > secondMax) && (array[i] != max)){
                secondMax = array[i];
                secondMaxIndex = i;
            }
        }

        return secondMaxIndex;
    }
}
