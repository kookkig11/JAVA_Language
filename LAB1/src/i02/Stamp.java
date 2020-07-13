package i02;

import java.util.Scanner;

public class Stamp {
    public static void main(String[] args) {
        double cost;
        Scanner input = new Scanner(System.in);

        System.out.print("Cost: ");
        cost = input.nextDouble();

        Calculate calculate = new Calculate(cost);
        calculate.add(cost);
        System.out.print("Get stamp: " + calculate.toStamp());
    }
}
