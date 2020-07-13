package AirplaneTicket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int point;
        double price;
        double priceFood;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ticket type: ");
        String ticket = scanner.next();

        First seat = null;
        if (ticket.equals("economy")) {
            seat = new Economy();
            point = 3;
            price = 1000;
        } else if (ticket.equals("business")) {
            seat = new Business();
            point = 4;
            price = 1500;
        } else if (ticket.equals("first")) {
            seat = new First();
            point = 5;
            price = 2000;
        } else {
            throw new IllegalArgumentException("Invalid class");
        }

        try {
            //check price
            System.out.println(">> Your seat is " + ticket + " class, price " + price + " baht.");

            //pay ticket
            System.out.print("Please enter the amount you want to price: ");
            double pay = scanner.nextDouble();
            if (pay < price){
                throw new IllegalArgumentException("You don't have enough money.");
            }
            seat.moneyCard(pay-price);
            System.out.println(">> Your money card has " + seat.getMoney());

            //check weight
            System.out.print("Please inform the weight of the baggage: ");
            double weight = scanner.nextDouble();
            seat.checkWeight(weight);
            if (ticket.equals("first") && weight > 40){
                throw new IllegalArgumentException("Baggage can not exceed 40 kg.");
            }
            //food
            System.out.println(">> Food: spaghetti(200) steak(300) fired-rice(100)");
            System.out.print("Please enter food do you want to eat: ");
            String food = scanner.next();
            if (food.equals("spaghetti")){
                priceFood = 200;
            }
            else if (food.equals("steak")){
                priceFood = 300;
            }
            else if (food.equals("fired-rice")){
                priceFood = 100;
            }
            else{
                throw new IllegalArgumentException("Invalid food, we will bring mistakes to improve.");
            }
            if (ticket.equals("first")){
                priceFood = 0;
            }

            seat.spendCard(priceFood);
            System.out.println("-------------------------------------");
            System.out.println("Your change " + seat.getMoney() + " baht.");
            //check star
            seat.checkStar(point);
            System.out.println("From the purchase, our airline has " + seat.getStar() + " stars.");

            System.out.println("Thank you for trusting our airline.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
