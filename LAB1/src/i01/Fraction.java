package i01;

public class Fraction {
    private int numerator1;
    private int denominator1;
    private int numerator2;
    private int denominator2;
    private int resultNum;
    private int resultDeno;

    public Fraction(int numerator1, int denominator1, int numerator2, int denominator2){
        this.numerator1 = numerator1;
        this.denominator1 = denominator1;
        this.numerator2 = numerator2;
        this.denominator2 = denominator2;
    }

    public void addFraction() {
        if (denominator1 == denominator2) {
            resultNum = numerator1 + numerator2;
            resultDeno = denominator1;
        }
        else{
            resultNum = (numerator1*denominator2) + (numerator2*denominator1);
            resultDeno = denominator1 * denominator2;
        }
    }

    public int getResultNum(){
        return resultNum;
    }

    public int getResultDeno(){
        return resultDeno;
    }
}
