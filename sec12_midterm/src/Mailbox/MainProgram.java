package Mailbox;
// elab-source: Mailbox.MainProgram.java
// elab-mainclass: Mailbox.MainProgram

import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        // initialize Mailbox.MailBox object
        MailBox mailBox = new MailBox();

        System.out.println("Welcome to Comsi Condominium");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please select menu [I] = insert mail ; [C] = check total mail ; [G] = get mail ; [E] = exit");
            String command = sc.next();
            if(command.toLowerCase().charAt(0) == 'i'){
                System.out.println("Please enter [roomNumber numberOfMail] e.g. 14019 5");
                int room = sc.nextInt();
                int mail = sc.nextInt();
                try {
                    mailBox.insertMail(room, mail);
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
            else if(command.toLowerCase().charAt(0) == 'c'){
                System.out.println("Please enter [roomNumber] e.g. 14019");
                int room = sc.nextInt();
                try {
                    System.out.println("Total Mail in Your Mailbox.MailBox : " + mailBox.checkMail(room));
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
            else if (command.toLowerCase().charAt(0) == 'g'){
                System.out.println("Please enter [roomNumber] e.g. 14019");
                int room = sc.nextInt();
                try{
                    mailBox.getMail(room);
                } catch (IllegalArgumentException | IllegalStateException e){
                    System.out.println(e.getMessage());
                }
            }
            else if(command.toLowerCase().charAt(0 )== 'e'){
                break;
            }
        }
    }

}