package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100; // static & final by default
    static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){ we can not have constructor in Interface
        this.a = a;
    }

     */

    /*
    static {
        b = 100; //we can not have static block in Interface
    }

     */

    /*
    public void method1(){
        System.out.println("Instance method");
    }

     */

    static void method2(){
        System.out.println("Static method");
    }

    void method3();//abstract method

    default void method4(){
        System.out.println("Default method");
    }

    //without default & static we are not able to use method with body
}

class Test implements PropertiesOfInterface {
    @Override
    public void method3(){

    }

    public static void main(String[] args) {
        new Test().method4();
    }
}
