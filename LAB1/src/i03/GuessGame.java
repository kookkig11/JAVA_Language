package i03;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int player;
        //int target;
        Scanner input = new Scanner(System.in);
        System.out.print("Guess: ");
        player = input.nextInt();
        //target = (int)(Math.random()*100)+0;

        checkGuess check = new checkGuess(player);
        check.random();

        System.out.println("<Random Number: " + check.getRandom() + ">");
        System.out.println(check.result());
    }
}
