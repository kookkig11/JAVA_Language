package Problem2;

public interface Face2 {
    void method1();

    default void method2(){
        System.out.println("Face2 method2");
    }
}
