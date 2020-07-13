package i04;

import java.util.Scanner;

public class MasterMind {
    public static void main(String[] args) {
        String player1, player2;
        Scanner target = new Scanner(System.in);
        Scanner guess = new Scanner(System.in);
        System.out.print("Target: ");
        player1 = target.next();
        System.out.print("Guess: ");
        player2 = guess.next();

        checkMastermind game = new checkMastermind(player1, player2);
        game.check();

        System.out.println("Digit: " + game.getDigit());
        System.out.println("Position: " + game.getPosition());
        System.out.println(game.result());
    }
}

