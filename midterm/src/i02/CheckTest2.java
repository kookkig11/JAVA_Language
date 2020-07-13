package i02;

public class CheckTest2 {
    private String answer;
    private int numAnswer;
    private int numStudent;
    private int correct;
    private int[] check;

    public void setAnswer(String ans){
        answer = ans;
        numAnswer = answer.length();
    }

    public void setNumStudent(int n){
        numStudent = n;
    }

    public void checkStudent(String student) {
        check = new int[numAnswer];
        for (int i = 0; i < numAnswer; i++) {
            if (answer.charAt(i) == student.charAt(i)) {
                correct++;
            }
            check[i]+=correct;
        }
    }

    public int getCorrect(int i){
        return check[i-1];
    }

    public int getNumAnswer() {
        return numAnswer;
    }
}
