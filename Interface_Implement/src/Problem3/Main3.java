package Problem3;

public class Main3 {
    public static void main(String[] args) {
        Implementor3 im = new Implementor3();

        im.method1();

        im.method2();

        Face3_1 f1 = im; //interface3_1 เชื่อมกับclass implement
        f1.method1();

        Face3_2 f2 = im; //interface3_2 เชื่อมกับclass implement
        f2.method2();

        ((Implementor3) f1).method2(); //f1ดึงข้อมูลจากclass implement
        ((Face3_1) f2).method1(); //f2ดึงข้อมูลจากFace3_1 และFace3_1ดึงจากclass implementอีกที
    }
}

