package NumberGuessor;
// elab-source: NumberGuessor.NumGuess.java

public class NumGuess {
    private int target;
    private int player;

    public void getTarget(int target){
        this.target = target;
    }

    public String result(int player){
        if (player == target){
            return "correct";
        }
        else if (player > target){
            return "too high";
        }
        else{
            return "too low";
        }
    }
}
