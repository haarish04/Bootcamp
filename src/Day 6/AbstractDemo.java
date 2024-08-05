abstract class A {
    abstract void m1();
    void m2(){
        System.out.println("m2");
    }    
}

abstract class B extends A{
    abstract void m3();
    void m1(){
        System.out.println("m1");
    }
}

class C extends B{
    void m3(){
        System.out.println("m3");
    }
}

public class AbstractDemo{
    public static void main(String[] args) {
        A ob1 = new C();
        ob1.m1();
        ob1.m2();
    }


}
