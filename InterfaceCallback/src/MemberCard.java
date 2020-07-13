public class MemberCard implements Measurable{
    private int point;
    private double totalCost;

    public MemberCard(int point) {
        this.point = point;
    }

    public void addCost(double cost){
        this.totalCost += cost;
        this.point = (int)this.totalCost/10;
    }

    public int getPoint() {
        return point;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public double getMeasure() {
        return point;
    }
}
