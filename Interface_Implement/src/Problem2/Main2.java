package Problem2;

public class Main2 {
    public static void main(String[] args) {
        Implementor2 im = new Implementor2();
        im.method1();
        im.method2();

        Face2 f = new Implementor2_2();
        f.method1();
        f.method2();
    }
}
