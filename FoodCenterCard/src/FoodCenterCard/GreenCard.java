package FoodCenterCard;

public class GreenCard extends FoodCard {

    @Override
    public void topUp(double money) throws IllegalAccessException {
        super.topUp(money);
        if (money > 200) {
            super.topUp(((int) (money / 200)) * 10);
        }
    }
}
