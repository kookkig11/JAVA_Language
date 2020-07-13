package MasterMind;
// elab-source: MasterMind.MastermindMain.java
// elab-mainclass: MasterMind.MastermindMain

import java.util.Scanner;
public class MastermindMain {
    public static void main(String[] args) {
        int target, player;
        Scanner scanner = new Scanner(System.in);
        target = scanner.nextInt();
        player = scanner.nextInt();

        Mastermind game = new Mastermind(target, player);

        if (game.getPosition()==4 && game.getDigit()==4){
            /* ถ้าเป็นstring ใช้equals() เปรียบเทียบได้
            boolean name = mrA.equals(mrB); */
            System.out.println("Congratulations, you just mastered my mind!!");
        }
        else{
            System.out.println(game.getDigit() + " " + game.getPosition());
        }
    }
}
