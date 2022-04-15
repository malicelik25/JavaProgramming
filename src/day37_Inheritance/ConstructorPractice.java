package day37_Inheritance;

class A{

    public A(int a){//if parent classes constructor default we do not have to use super keyword.
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        super(9);
        System.out.println("B");
    }
}

public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();

        System.out.println(obj);

    }
}
