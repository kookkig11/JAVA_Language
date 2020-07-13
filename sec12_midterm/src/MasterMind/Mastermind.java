package MasterMind;
// elab-source: MasterMind.Mastermind.java

public class Mastermind {
    private String target;
    private String guess;
    private int digit;
    private int position;

    public Mastermind(int target, int guess) {
        this.target = Integer.toString(target);
        this.guess = Integer.toString(guess);
    }
    //แปลงintเป็นstring = Integer.toString(int);
    //แปลงstringเป็นint = Integer.parseInt(string);

    public int getDigit(){
        digit = 0;
        for (int i = 0; i < 4; i++) {
            if (target.contains(guess.charAt(i)+"")){ //เช็คว่าguess[i]มีในtargetมั้ย?
                digit++;
            }
        }
        return digit;
    }

    public int getPosition(){
        position = 0;
        for (int i = 0; i < 4; i++) {
            if (target.charAt(i) == guess.charAt(i)){
                position++;
            }
        }
        return position;
    }
}
