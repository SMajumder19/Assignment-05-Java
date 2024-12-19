//Task: 15

public class QuestionAllocation {
    public static void main(String[] args){
        printDistribution(15);
    }

    public static void printDistribution(int questions){
        for(int marksF = 1, marksT = questions - 1; ((marksF < questions) && (marksT > 0)); marksF++, marksT--){
            if(((marksF * 5) + (marksT * 10)) == 100){
                System.out.println("5 marks question is " + marksF);
                System.out.println("10 marks question is " + marksT);
                return;
            }
        }

        System.out.println("Invalid number of questions of both 5 & 10 marks for total 100 marks!");
    }
}
