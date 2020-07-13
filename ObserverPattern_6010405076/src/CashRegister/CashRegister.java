package CashRegister;


import java.util.ArrayList;

public class CashRegister implements Subject{
    private double purchase;
    private double payment;
    private ArrayList<Observer> observers;

    public CashRegister(){
        this.purchase = 0;
        this.payment = 0;
        this.observers = new ArrayList<>();
    }

    public void recordPurchase(float amount){
        purchase += amount;
        notifyObservers(amount);
    }

    public void calculateTax() {
        purchase = purchase + (purchase * 0.07);
    }

    public void enterPayment(float amount){
        payment += amount;
    }

    public  double giveChange(){
        double change = payment = purchase;
        purchase = 0;
        payment = 0;
        payment = 0;
        return change;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(float purchase) {
        for (Observer o : observers) {
            o.update(purchase);
        }
    }
}
