import java.util.ArrayList;

public class GameCharacter {
    private String name;
    private int hp;
    private int damage;
    private int defense;
    private double money;
    private int level;
    private int exp;
    private ArrayList<Item> items;
    private ArrayList<Skill> skills;

    GameCharacter(String name, int hp, int damage, int defense, int money){
        //begin
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.money = money;
        level = 1;
        exp = 0;

        items = new ArrayList<>();
        skills = new ArrayList<>();
    }

    private void addLevel(){
        level = 1;
        while (exp >= 100){
            level++;
            exp-=100;
        }
    }

    public void receiveItems(Item item, int quantity){
        //check if there is item in the bag
        for (Item checkItem : items){
            if (checkItem.getName().equals(item.getName())){
                checkItem.addItem(quantity);
            }
        }

        items.add(item);
        item.addItem(quantity);
    }

    public void buy(Item itemToBuy, int quantity){
        if (money >= itemToBuy.getPrice()*quantity){
            money-=(itemToBuy.getPrice()*quantity);

            for (Item checkItem : items){
                if (checkItem.getName().equals(itemToBuy.getName())){
                    checkItem.addItem(quantity);
                }
            }
            items.add(itemToBuy);
            itemToBuy.addItem(quantity);
        }
        else{
            throw new IllegalArgumentException("Not enough money!");
        }
    }

    public void sell(Item itemToSell, int quantity){
        for (Item checkItem : items){
            if (checkItem.getName().equals(itemToSell.getName())){
                if (checkItem.getAmount() < quantity) {
                    throw new IllegalArgumentException("Not enough item!");
                }

                money+=(checkItem.getPrice()*quantity);
                checkItem.useItem(quantity);

                if (checkItem.getAmount() == 0) {
                    items.remove(checkItem);
                }
            }
        }
        throw new IllegalArgumentException("No this item in your inventory!");
    }

    public void learnSkill(Skill skill){
        for (Skill checkSkill : skills){
            if (checkSkill.getName().equals(skill.getName())){
                checkSkill.addLevel();
            }
        }

        skills.add(skill);
    }

    public void useItem(UsableItem usableItem){
        for (Item checkItem : items){
            if (checkItem.getName().equals(usableItem.getName())){
                hp+=usableItem.getHp();
                damage+=usableItem.getDamage();
                defense+=usableItem.getDefense();
                usableItem.useItem(1);

                if (checkItem.getAmount() == 0){
                    items.remove(checkItem);
                }
            }
        }
        throw new IllegalArgumentException("No this item in your inventory!");
    }

    public void catchBy(Monsterball ball){
        for (Item checkItem : items) {
            if (checkItem.getName().equals(ball.getName())) {
                exp+=ball.getExp();
                addLevel();
                ball.useItem(1);

                if (checkItem.getAmount() == 0) {
                    items.remove(checkItem);
                }
            }
        }
        throw new IllegalArgumentException("No this item in your inventory!");
    }

    public void castSpell(Skill skill){
        if (!skill.isActive()) {
            throw new IllegalArgumentException("Unable to use skill!");
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public double getMoney() {
        return money;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public String toString(){
        return "- player -\nname: " + getName() +
                "\nlevel: " + getLevel() +
                "\nexp: " + getExp() +
                "\nmoney: " + getMoney() +
                "\nhp: " + getHp() +
                "\ndamage: " + getDamage() +
                "\ndefense: " + getDefense() +
                "\nitems: " + items.toString() +
                "\nskill: " + skills.toString() + "\n";
    }
}