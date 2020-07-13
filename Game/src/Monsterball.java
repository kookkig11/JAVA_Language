public class Monsterball extends Item{
    private int exp;

    Monsterball(String name, double price, int exp) {
        super(name, price);
        this.exp = exp;
    }

    public int getExp(){
        return exp;
    }
}
