package Stamp;
// elab-source: StampMain.java
// elab-mainclass: StampMain

import java.util.Scanner;

public class StampMain {
    public static void main(String[] args) {
        int n;
        double cost;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Stamp stamp = new Stamp();
        for (int i = 0; i < n; i++) {
            cost = scanner.nextDouble();
            stamp.add(cost);
        }
        System.out.println(stamp.toStamp());
    }
}
