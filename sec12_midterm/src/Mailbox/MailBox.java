package Mailbox;
// elab-source: MailBox.java

import java.util.Arrays;

public class MailBox {
    int[] roomNumber = new int[120];

    public void insertMail(int room, int mail){
        if (!haveRoom(room)){
            throw new IllegalArgumentException("Invalid Room Number");
        }
        roomNumber[index(room)] += mail;
    }

    //check this condo have room
    public boolean haveRoom(int room){
        return room >= 14010 && room <= 14129;
    }


    //set array i
    public int index(int room){
        return room - 14010;
    }

    public int checkMail(int room){
        if (!haveRoom(room)){
            throw new IllegalArgumentException("Invalid Room Number");
        }
        return roomNumber[index(room)];
    }

    public void getMail(int room){
        if (!haveRoom(room)){
            throw new IllegalArgumentException("Invalid Room Number");
        }
        int mail = roomNumber[index(room)];
        if (mail == 0){
            throw new IllegalStateException("Not Found Mail in Room " + room);
        }
        //get mail
        roomNumber[index(room)] = 0;
    }
}
