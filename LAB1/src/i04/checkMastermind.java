package i04;

public class checkMastermind {
    private String target;
    private String guess;
    private int digit;
    private int position;

    public checkMastermind(String target, String guess) {
        this.target = target;
        this.guess = guess;
    }

    public void check() {
        //check position
        digit = 0;
        position = 0;
        for (int i = 0; i < 4; i++) {
            if (target.charAt(i) == guess.charAt(i)){
                position++;
            }
        }

        //check digit
        //delete same information
        int n = 4;
        char[] x = new char[n];
        for (int i = 0; i < n; i++) {
            boolean checks = true;
            for (int j = 0; j < i; j++) {
                if (guess.charAt(i) == x[j]){
                    n--;
                    checks = false;
                }
            }
            if (checks){
                x[i] = guess.charAt(i);
            }
        }
        //loop check
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if (x[i] == target.charAt(j)){
                    digit++;
                }
            }
        }
    }

    public int getDigit(){
        return digit;
    }

    public int getPosition(){
        return position;
    }

    public String result(){
        if (position == 4){
            return "Congratulations, you just mastered my mind!!";
        }
        else{
            return "";
        }
    }
}