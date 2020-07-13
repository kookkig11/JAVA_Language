package i05;

import java.util.Scanner;

public class Hangmangame {
    public static void main(String[] args) {
        String word;
        char guess;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter word: ");
        word = input.next();

        Hangman hangman = new Hangman(word,6);
        System.out.println("Amount word: " + hangman.showAmount());
        System.out.println("Life: " + hangman.getLife());
        System.out.println("Result: " + hangman.getResult());

        System.out.println("--------------------------------");

        boolean checks = true; //not win
        while (checks) {
            System.out.print("Enter guess: ");
            guess = input2.next().charAt(0);

            try {
                System.out.println("Your guess is " + hangman.check(guess));
            } catch (Exception e) {
                System.out.println("Exception occur: " + e.getMessage());
                e.printStackTrace();
            }
            System.out.println("Life: " + hangman.getLife());
            System.out.println("Result: " + hangman.getResult());


            if (hangman.getLife() == 5){
                System.out.println("      O ");
            }
            else if (hangman.getLife() == 4){
                System.out.println("      O ");
                System.out.println("      | ");
            }
            else if (hangman.getLife() == 3){
                System.out.println("      O ");
                System.out.println("     /| ");
            }
            else if (hangman.getLife() == 2){
                System.out.println("      O ");
                System.out.println("     /|\\");
            }
            else if (hangman.getLife() == 1){
                System.out.println("      O ");
                System.out.println("     /|\\");
                System.out.println("     /  ");
            }
            else if (hangman.getLife() == 0){
                System.out.println("      O ");
                System.out.println("     /|\\");
                System.out.println("     / \\");
                System.out.println(">>>>>>>>>> YOU LOSE!! <<<<<<<<<<");
                checks = false;
            }
            if (hangman.checkWin() == true){
                System.out.println(">>>>>>>>>> YOU WIN!!! <<<<<<<<<<");
                checks = false;
            }
            System.out.println("--------------------------------");
        }
    }
}