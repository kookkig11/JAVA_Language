class X {
    Y b = new Y();

    X() {
        System.out.print("X");
    }
}

class Y {
    Y() {
        System.out.print("Y");
    }
}

public class Z extends X { //ดึงข้อมูลจากxก่อน
    Y y = new Y();

    Z() {
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}