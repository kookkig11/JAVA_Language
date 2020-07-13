package i03;

public class checkGuess {
    private int target;
    private int player;

    public checkGuess(int player){
        this.player = player;
    }

    public void random(){
        target = (int)(Math.random()*100)+0; //function random number
    }

    public int getRandom(){
        return  target;
    }

    public String result(){
        if (player == target){
            return "Your guess is equal target.";
        }
        else if (player > target){
            return "Your guess is more than target.";
        }
        else{
            return "Your guess is less than target.";
        }
    }

}
