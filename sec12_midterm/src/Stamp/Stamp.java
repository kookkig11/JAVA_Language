package Stamp;
// elab-source: Stamp.java

public class Stamp {
    private  double cost;
    private double total = 0;

    public void add(double cost){
        total += cost;
    }

    public int toStamp(){
        return (int)total/50;
    }
}
