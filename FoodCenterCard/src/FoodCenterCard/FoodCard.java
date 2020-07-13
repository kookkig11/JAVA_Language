package FoodCenterCard;

public class FoodCard {
    private double balance;

    public void topUp(double money) throws IllegalAccessException {
        if (money < 0)
            throw new IllegalArgumentException("money must be positive");
        balance += money;
    }

    public void spend(double purchase) throws IllegalAccessException {
        if (purchase > balance)
            throw new IllegalArgumentException("balance is insufficient");
        balance -= purchase;
    }

    public double getBalance() {
        return balance;
    }
}