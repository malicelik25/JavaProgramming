package day34_GarbageCollection_AccesModifiers;

public class StaticMembers {

    public static int num = 100;

    public static void method(){

    }

    static {

    }


}


class A{ // outer class can not be static class

    static class B{// inner class

        public static void method1(){

        }

    }
               // class can be static if only in another class(it has to be nested class) "Muhtar does not recommend" to use "we do not have to use in framework"
}

class C{

    public static void main(String[] args) {
        A.B.method1();

    }


}

class X{


}
class Y{


}

class Z{
    static class Q { //only class Q can be static class because it is the only inner class

    }
}

