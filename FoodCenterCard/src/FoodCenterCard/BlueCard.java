package FoodCenterCard;

public class BlueCard extends FoodCard {

    private int point;

    @Override
    public void topUp(double money) throws IllegalAccessException {
        super.topUp(money);
        point += ((int) (money / 200)) * 10;
    }

    @Override
    public void spend(double purchase) throws IllegalAccessException {
        super.spend(purchase);
        point += ((int) (purchase / 50)) * 2;
    }

    public void usePoint(int point) throws IllegalAccessException {
        if (point > this.point)
            throw new IllegalArgumentException("point is insufficient");
        this.point -= point;
    }

    public int getPoint() {
        return point;
    }
}