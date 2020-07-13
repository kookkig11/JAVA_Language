package AirplaneTicket;

public class Business extends First{
    @Override
    public void checkStar(int point){
        super.checkStar(point);
    }

    @Override
    public void checkWeight(double weight) throws IllegalAccessException{
        super.checkWeight(weight);
        if (weight > 30){
            throw new IllegalArgumentException("Baggage can not exceed 30 kg.");
        }
    }

    @Override
    public void moneyCard(double change) throws IllegalAccessException{
        super.moneyCard(change);
    }

    @Override
    public void spendCard(double food) throws IllegalAccessException{
        super.spendCard(food*0.5);
    }
}
