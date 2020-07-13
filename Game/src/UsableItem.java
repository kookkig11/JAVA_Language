public class UsableItem extends Item{
    private int hp;
    private int damage;
    private int defense;

    UsableItem(String name, double price, int hp, int defense, int damage) {
        super(name, price);
        this.hp = hp;
        this.defense = defense;
        this.damage = damage;
    }

    int getHp(){
        return hp;
    }

    int getDefense(){
        return defense;
    }

    int getDamage(){
        return damage;
    }
}
