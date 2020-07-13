class Parents {
    private void method1()
    {
        System.out.println("Parents's method1()");
    }
    public void method2()
    {
        System.out.println("Parents's method2()");
        method1();
    }
}
class Child extends Parents {
    public void method1(){
        System.out.println("Child's method1()");
    }
    public static void main(String args[]){
        Parents p = new Child();
        p.method2();
    }

}