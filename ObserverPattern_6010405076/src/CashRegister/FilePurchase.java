package CashRegister;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePurchase implements Observer {

    @Override
    public void update(float purchase) {
        File filePurchase = new File("src/CashRegister/6010405476.txt");
        try {
            if (filePurchase.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(filePurchase, true));
            bf.write((int) purchase + "");
            bf.newLine();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
