package i01;

import java.util.Scanner; //input

public class PrintFraction {
    public static void main(String[] args) {
        int numerator1, denominator1; //fraction1
        int numerator2, denominator2; //fraction2

        //input
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Numerator1 = ");
        numerator1 = input1.nextInt();
        System.out.print("Denominator1 = ");
        denominator1 = input1.nextInt();
        System.out.print("Numerator2 = ");
        numerator2 = input2.nextInt();
        System.out.print("Denominator2 = ");
        denominator2 = input2.nextInt();

        //function
        Fraction fraction = new Fraction(numerator1, denominator1, numerator2, denominator2);
        fraction.addFraction();

        //print
        System.out.print("Result = ");
        System.out.println(fraction.getResultNum() + "/" + fraction.getResultDeno());
    }
}
