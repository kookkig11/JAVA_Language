package InternetCafe;

// elab-source: InternetCafe.InternetCafeMemberCard.java
public class InternetCafeMemberCard implements Pointable {
    private String name;
    private int points;
    private int hour;

    public InternetCafeMemberCard(String name){
        this.name = name;
    }

    public void addScore(double score){
        hour+=score;
        points = hour/2;
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
        return "InternetCafe.InternetCafeMemberCard{name='" + name + "', totalHour=" + hour + ", point=" + getPoint() + "}";
    }
}
