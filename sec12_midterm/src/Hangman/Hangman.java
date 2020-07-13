package Hangman;// elab-source: Hangman.Hangman.java

public class Hangman {
    private String word;
    private String result;
    private int life;
    private int countTrue;
    boolean win;

    public void setTarget(String word){
        this.word = word;
    }

    public String getTarget(){
        return word;
    }

    public void Default(){
        this.result = "";
        this.countTrue = 0;
        for (int i = 0; i < word.length(); i++){
            result += '-';
        }
        this.life = 6;
    }

    public void check(char character){
        String temp = "";
        boolean isContain = false;
        for (int i = 0; i < this.word.length(); i++){
            if (this.word.charAt(i) == character){
                temp += character;
                countTrue++;
                isContain = true;
            }
            else{
                temp += this.result.charAt(i);
            }
        }
        if (!isContain) this.life--;
        this.result = temp;
    }

    public int getLife(){
        return life;
    }

    public String getResult(){
        return result;
    }

    public boolean checkWin() {
        win = false;
        if (countTrue == this.word.length()){
            win = true;
        }
        else{
            win = false;

        }
        return win;
    }

    public String toString(){
        if (win == false){
            return "You lose, the answer is ";
        }
        else{
            return "Congratulations, you win";
        }
    }
}
