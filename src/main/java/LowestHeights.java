//Task: 07

public class LowestHeights {
    public static void main(String[] args){
        int[] heights = {52, 49, 54, 50, 48, 53, 55, 47, 56, 51};
        printLowestHeights(heights);
    }

    public static void printLowestHeights(int[] heights){
        int min = -1;
        int minIndex = -1;
        for(int i = 0; i < heights.length; i++){
            min = heights[i];
            minIndex = i;
            for(int j = i + 1; j < heights.length; j++){
                if(heights[j] < min){
                    min = heights[j];
                    minIndex = j;
                }
            }
            if(min != heights[i]){
                heights[minIndex] = heights[i];
                heights[i] = min;
            }
        }

        //System.out.println(Arrays.toString(heights));
        System.out.println(heights[0] + "\n" + heights[1]);
    }
}
