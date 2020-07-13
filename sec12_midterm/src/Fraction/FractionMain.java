package Fraction;
// elab-source: Fraction.FractionMain.java
// elab-mainclass: Fraction.FractionMain

import java.util.Scanner;
public class FractionMain {
    public static void main(String[] args) {
        // 1.รับ input
        // 2.สร้าง object
        // 3.ส่งค่าให้ object
        // 4.แสดงผลลัพธ์จาก object
        /*ไม่ทำในmain
            1.การคำนาณ
            2.การเปรียบเทียบ */
        /*ไม่ทำในModel
            1.รับinput
            2.print
         */

        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();  //nextรับจนกว่าจะเจอspace
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        Fraction fraction = new Fraction(a, b);
        Fraction fraction1 = new Fraction(c, d);
        Fraction result = fraction.add(fraction1);
        System.out.println(result.toString());
    }
}
