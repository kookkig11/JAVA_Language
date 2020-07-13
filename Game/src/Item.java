public class Item {
    private String name;
    private int amount;
    private double price;

    Item(String name, double price){
        this.name = name;
        amount = 0;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public void addItem(int quantity){
        amount+=quantity;
    }

    public void useItem(int quantity){
        amount-=quantity;
    }
}
