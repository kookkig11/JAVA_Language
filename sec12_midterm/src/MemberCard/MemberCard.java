package MemberCard;

// elab-source: MemberCard.InternetCafe.InternetCafeMemberCard.java
public class MemberCard implements Pointable{
    private String name;
    private int points;
    private double price;

    public MemberCard(String name){
        this.name = name;
    }

    public void addScore(double score){
        price+=score;
        points = (int)price/250;
    }

    public void usePoint(int point){
        if (getPoint() >= point){
            points -= point;
        }
    }

    public int getPoint(){
        return points;
    }

    public String getInfo(){
        return "MemberCard.MemberCard{name='" + name + "', totalPurchase=" + price + ", point=" + getPoint() + "}";
    }
}
