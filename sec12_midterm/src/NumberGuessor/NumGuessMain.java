package NumberGuessor;
// elab-source: NumberGuessor.NumGuessMain.java
// elab-mainclass: NumberGuessor.NumGuessMain

import java.util.Scanner;
public class NumGuessMain {
    public static void main(String[] args) {
        int player;
        int target;
        int n;
        NumGuess guess = new NumGuess();
        Scanner scanner = new Scanner(System.in);

        target = scanner.nextInt();
        guess.getTarget(target);

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            player = scanner.nextInt();
            System.out.println(guess.result(player));
        }
    }
}
