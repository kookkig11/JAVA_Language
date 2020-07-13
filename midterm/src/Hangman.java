// elab-source: Hangman.java
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
public class Hangman implements GuessingGame {
    private String answer;
    private String guess;
    private String result;
    private int wrong;
    private int correct;

    public void setAnswer(String ans){
        result = "";
        answer = ans.toLowerCase();
        for (int i = 0; i < answer.length(); i++) {
            result+="_";
        }
    }

    public void guess(String s){
        guess = s;
    }

    public String getOutput(){
        String tmp = "";
        String ans = "";
        boolean isContain = FALSE;
        if (guess.length() > 1){
            return "One character only";
        }

        for (int i = 0; i < answer.length(); i++) {
            if (guess.charAt(0)==answer.charAt(i)){
                tmp += guess.charAt(0);
                correct++;
                isContain = TRUE;
            }
            else{
                tmp += result.charAt(i);
            }
        }

        if (isContain == FALSE){
            wrong++;
        }
        result = tmp;

        for (int i = 0; i < result.length(); i++) {
            if (i == result.length()-1){
                ans+=result.charAt(i);
            }
            else{
                ans+=result.charAt(i)+" ";
            }
        }

        return ans;
    }

    public boolean isWon() {
        if (correct == answer.length())
            return TRUE;
        else
            return FALSE;
    }

    public boolean isLost(){
        if (wrong >= 6)
            return TRUE;
        else
            return FALSE;
    }
}
