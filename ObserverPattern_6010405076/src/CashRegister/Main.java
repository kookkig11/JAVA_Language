package CashRegister;

public class Main {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        FilePurchase filePurchase = new FilePurchase();
        GuiDisplay guiDisplay = new GuiDisplay();

        cashRegister.registerObserver(filePurchase);
        cashRegister.registerObserver(guiDisplay);

        cashRegister.recordPurchase(60);
        cashRegister.recordPurchase(40);
        cashRegister.calculateTax();
        cashRegister.enterPayment(200);
        double change = cashRegister.giveChange();

        cashRegister.recordPurchase(25);
        cashRegister.recordPurchase(105);
        cashRegister.calculateTax();
        cashRegister.enterPayment(200);
        change = cashRegister.giveChange();
    }
}
