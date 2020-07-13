package i06;

import java.util.Scanner;
public class Monsterball {
    public static void main(String[] args) {
        String type, price, sell, value;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);

        System.out.print("Enter Ball Type: ");
        type = input1.next();
        System.out.print("Enter Price: ");
        price = input2.next();
        System.out.print("Enter Sell: ");
        sell = input3.next();
        System.out.print("Enter Ball Value: ");
        value = input4.next();

        KeepBall keepBall = new KeepBall(type, price, sell, value);
        Information information = new Information();
        information.addBall(keepBall);
    }
}
