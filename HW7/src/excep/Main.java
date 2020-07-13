package excep;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        ExceptionThrower t = new ExceptionThrower();


        // Problem 1
        int i = 10;

        try {
            i++;
            t.bombing();
            i++;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(i);

        // Problem 2
        try{
            i = 20;
            t.bombing();
            i++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            i++;
        }

        System.out.println(i);

        // Problem 3
        try {
            i = 30;
            t.normal();
            i++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            i++;
        }

        System.out.println(i);

        // Problem 4
        i = 40;
        try {
            t.bombRunner();
        } catch (Exception e) {
            System.out.println(i);
        }
        // Problem 5
        try {
            i = 50;
            try {
                t.bombing();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Catch 50-1");
            }
            i++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Catch 50-2");
        } finally {
            i++;
        }
        System.out.println(i);

        // Problem 6
        try {
            i = 60;
            try {
                t.bombing();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Catch 60-1");
                t.bombing();
            }
            i++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Catch 60-2");
        } finally { //ไม่เกิดcatch = else
            i++;
        }
        System.out.println(i);

        // Problem 7
        try {
            Handler handler = new FileHandler("OutFile.log");
            Logger.getLogger("DemoLog").addHandler(handler);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Logger.getLogger("DemoLog").log(Level.WARNING, "Nothing happen");

        Logger.getLogger("DemoLog").setLevel(Level.SEVERE);

        Logger.getLogger("DemoLog").log(Level.WARNING, "Warning happen");

        Logger.getLogger("DemoLog").setLevel(Level.ALL);

        Logger.getLogger("DemoLog").log(Level.WARNING, "Warning is back");

        try {
            i = 70;
            t.ioBombing();
            i++;
        } catch (IOException e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "70-1", e);
        } catch (Exception e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "70-2", e);
        } finally {
            i++;
        }
        System.out.println(i);

        // Problem 8
        try {
            i = 80;
            t.ioBombing();
            i++;
        } catch (IOException e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "80-2", e);
        } catch (Exception e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "80-1", e);
        } finally {
            i++;
        }
        System.out.println(i);

        // Problem 9
        try {
            i = 90;
            t.ioBombing();
            i++;
        } catch (IOException e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "90-1", e);
        } catch (Exception e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "90-2", e);
        } finally {
            i++;
        }
        System.out.println(i);

        // Problem 10
        try {
            i = 100;
            t.ioBombing();
            i++;
        } catch (IOException e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "100-1", e);
        } catch (Exception e) {

            Logger.getLogger("DemoLog").log(Level.SEVERE, "100-2", e);
        } finally {
            i++;
        }
        System.out.println(i);

        // Problem 11
        try {
            i = 110;
            t.bombRunner();
            t.ioBombing();
            i++;
        } catch (IOException e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "110-1", e);
        } catch (RuntimeException e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "110-2", e);
        } finally {
            i++;
        }
        System.out.println(i);

        // Problem 12
        i = 120;
        try {
            i++;
            try {
                i++;
                t.ioBombing();
                i++;
            } catch (IOException e) {
                Logger.getLogger("DemoLog").log(Level.SEVERE, "120-1", e);
                t.bombRunner();
            }
        } catch (RuntimeException e) {
            Logger.getLogger("DemoLog").log(Level.SEVERE, "120-2", e);
        }

        System.out.println(i);

        System.out.println("End");
    }
}
