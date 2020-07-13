package i05;

public class Hangman{
    private String word;
    private String result;
    private int life;
    private String keeper;
    private int countTrue;

    public Hangman(String word, int life){
        this.word = word;
        this.result = "";
        this.keeper = "";
        this.countTrue = 0;
        for (int i = 0; i < word.length(); i++){
            result += '-';
        }
        this.life = life;
    }

    public int showAmount(){
        return word.length();
    }

    public boolean check(char character) throws Exception {
        String temp = "";
        boolean isContain = false;
        if (this.keeper.contains("" + character)){
            throw new Exception("Duplicate character");
        }
        this.keeper += character;
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
        return isContain;
    }

    public int getLife(){
        return life;
    }

    public String getResult(){
        return result;
    }

    public boolean checkWin() {
        boolean win = false;
        if (countTrue == this.word.length()){
            win = true;
        }
        else{
            win = false;

        }
        return win;
    }
}
