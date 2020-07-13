package Problem1;

public class Main {

    public static void main(String[] args) {
        Implementor1 im = new Implementor1();
        im.data = 0;
        im.method1();

        Face1 f1 = im;
        f1.method1();
    }
}

