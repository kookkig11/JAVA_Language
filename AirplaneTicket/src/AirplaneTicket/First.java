package AirplaneTicket;

public class First {
    private double weightBag;
    private double money;
    protected double star = 5;

    public void checkStar(int point){
        star+=point;
        star/=2;
    }
    public double getStar(){
        return star;
    }

    public void checkWeight(double weight) throws IllegalAccessException{
        if (weight < 0){
            throw new IllegalArgumentException("weight must be positive");
        }
        weightBag+=weight;
        //error
        /*
        if (weight > 40){
            throw new IllegalArgumentException("Baggage can not exceed 40 kg.");
        }
        */
    }

    public void moneyCard(double change) throws IllegalAccessException{
        money+=change;
    }

    public double getMoney(){
        return money;
    }

    public void spendCard(double food) throws IllegalAccessException{
        if (food > money){
            throw new IllegalArgumentException("Your card don't have enough money.");
        }
        money-=food;
    }
}