// elab-source: WordMath.java
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
public class WordMath implements GuessingGame {
    private String answer;
    private String guess;
    private int correct;

    public void setAnswer(String ans){
        answer = ans;
    }

    public void guess(String s){
        guess = s;
    }

    public String getOutput(){
        if (guess.length() > answer.length()){
            return "Length not match";
        }

        correct = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (guess.charAt(i) == answer.charAt(i)){
                correct++;
            }
        }

        if (correct == answer.length()){
            return "";
        }

        return "Match " + correct;
    }

    public boolean isWon() {
        if (correct == answer.length())
            return TRUE;
        else
            return FALSE;
    }

    public boolean isLost(){
        return FALSE;
    }
}
