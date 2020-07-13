package FoodCenterCard;

public class Main {
    public static void main(String[] args) {
        BlueCard blueCard = new BlueCard();
        try {
            blueCard.topUp(250);
            blueCard.spend(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(blueCard.getBalance());
    }
}
