package AirplaneTicket;

public class Economy extends First{
    private double weightBag;
    private double money;

    @Override
    public void checkStar(int point){
        super.checkStar(point);
    }

    @Override
    public void checkWeight(double weight) throws IllegalAccessException{
        super.checkWeight(weight);
        if (weight > 20){
            throw new IllegalArgumentException("Baggage can not exceed 20 kg.");
        }
    }

    @Override
    public void moneyCard(double change) throws IllegalAccessException{
        super.moneyCard(change);
    }

    @Override
    public void spendCard(double food) throws IllegalAccessException{
        super.spendCard(food);
    }
}
