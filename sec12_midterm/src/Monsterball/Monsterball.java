package Monsterball;
// elab-source: Monsterball.Monsterball.java
public class Monsterball {
    private String type;
    private float price;
    private float sell;
    private double value;

    public Monsterball(String type, float price, float sell, double value) {
        this.type = type;
        this.price = price;
        this.sell = sell;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public float getSell() {
        return sell;
    }

    public double getValue() {
        return value;
    }

    public String toString(){
        return "MonsterBall{type='" + getType() + "', price=" + getPrice() + ", sellFor=" + getSell() + ", ballValue=" + getValue() + "}";
        //ใช้แค่type,price,... ไม่ได้ เพราะรับเข้ามาในconstructorเฉยๆ returnค่าไม่ได้
    }
}
