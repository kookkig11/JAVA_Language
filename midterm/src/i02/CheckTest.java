package i02;
// elab-source: CheckTest.java

public class CheckTest {
    private String answer;
    private int numAnswer;
    private int numStudent;
    private int correct;
    private double total;
    private double avg;

    public void setAnswer(String ans){
        answer = ans;
        numAnswer = answer.length();
    }

    public void setNumStudent(int n){
        numStudent = n;
    }

    public void setDefault(){
        correct = 0;
    }
    
    public void checkStudent(String student) {
        for (int i = 0; i < numAnswer; i++) {
            if (answer.charAt(i) == student.charAt(i)) {
                correct++;
            }
        }
        total+=correct;
    }

    public double findAverage(){
        avg = total/numStudent;
        return avg;
    }

    public int getCorrect() {
        return correct;
    }

    public int getNumAnswer() {
        return numAnswer;
    }
}
