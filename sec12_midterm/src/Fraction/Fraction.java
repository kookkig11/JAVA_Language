package Fraction;
//elab-source: Fraction.Fraction.java

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other){
        int q = this.denominator*other.denominator;
        int p = this.numerator*other.denominator + this.denominator*other.numerator;
        return new Fraction(p,q);
    }

    public String toString(){
        return numerator + "/" + denominator;
    }
}
