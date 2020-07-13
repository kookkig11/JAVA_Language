package i02;

public class Calculate {
    private  double cost;
    private int stamp;

    public Calculate(double cost){
        this.cost = cost;
    }

    public void add(double cost){
        stamp = (int)cost/50;
    }

    public int toStamp(){
        return stamp;
    }
}
