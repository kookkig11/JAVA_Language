package HangmanGame;

import java.util.ArrayList;

public class Hangman {
    private String word;
    private int life;
    private String result;
    private String keeper;
    private int countTrue;


    public Hangman(){
        life = 6;
        countTrue = 0;
        word = "science";
        keeper = "";
        result = "";;
        for (int i = 0; i < word.length(); i++) {
            result += '-';
        }
    }

    public String getAmount(){
        return Integer.toString(word.length());
    }

    public void checkGuess(char guess) throws Exception {
        if (life > 0){
            String tmp = "";
            boolean isContain = false;
            if (keeper.contains("" + guess)) {
                throw new Exception("Duplicate character");
            }
            keeper += guess;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    tmp += guess;
                    countTrue++;
                    isContain = true;
                } else {
                    tmp += result.charAt(i);
                }
            }
            result = tmp;
            if (!isContain) {
                life--;
            }
        }
    }

    public String getLife(){
        return Integer.toString(life);
    }

    public String hang(){
        if (life >= 6){
            return "-----+\n|\n|\n|\n|_________";
        }
        else if (life == 5){
            return "-----+\n|    O\n|\n|\n|_________";
        }
        else if (life == 4){
            return "-----+\n|    O\n|    |\n|\n|_________";
        }
        else if (life == 3){
            return "-----+\n|    O\n|   /|\n|\n|_________";
        }
        else if (life == 2){
            return "-----+\n|    O\n|   /|\\\n|\n|_________";
        }
        else if (life == 1){
            return "-----+\n|    O\n|   /|\\\n|   /\n|_________";
        }
        else if (life == 0){
            return "-----+\n|    O\n|   /|\\\n|   / \\\n|_________";
        }
        else{
            return "";
        }
    }

    public String getResult(){
        return result;
    }

    public String checkWin(){
        if (countTrue == word.length()){
            return "YOU WIN!!";
        }
        else if (life > 0){
            return "";
        }
        else {
            return "YOU LOSE!!";
        }
    }
}
