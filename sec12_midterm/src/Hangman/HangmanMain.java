package Hangman;// elab-source: Hangman.HangmanMain.java
// elab-mainclass: Hangman.HangmanMain/

import java.util.Scanner;
public class HangmanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target;
        char guess;
        Hangman hangman = new Hangman();

        target = scanner.next();
        hangman.setTarget(target);
        hangman.Default();
        //begin
        System.out.println(hangman.getLife() + " " + hangman.getResult());

        //guess
        while (hangman.getLife() > 0 || hangman.checkWin() != true){
            guess = scanner.next().charAt(0);
            hangman.check(guess);
            System.out.println(hangman.getLife() + " " + hangman.getResult());
            if (hangman.getLife() == 0){
                System.out.println(hangman.toString() + hangman.getTarget());
                break;
            }
            else if (hangman.checkWin() == true){
                System.out.println(hangman.toString());
                break;
            }
        }
    }
}
