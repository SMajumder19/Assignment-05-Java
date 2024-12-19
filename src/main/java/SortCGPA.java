//Task: 02

public class SortCGPA {
    public static void main(String[] args){
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        printSortedCGPA(cgpa);
    }

    public static void printSortedCGPA(double[] cgpa){
        double max = -1.0;
        int maxIndex = -1;
        for(int i = 0; i < cgpa.length; i++){
            max = cgpa[i];
            maxIndex = i;
            for(int j = i + 1; j < cgpa.length; j++){
                if(cgpa[j] > max){
                    max = cgpa[j];
                    maxIndex = j;
                }
            }
            if(max != cgpa[i]){
                cgpa[maxIndex] = cgpa[i];
                cgpa[i] = max;
            }
        }

        for(double item : cgpa){
            System.out.println(item);
        }

        //System.out.println(Arrays.toString(cgpa));
    }
}
