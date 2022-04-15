package day34_GarbageCollection_AccesModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static {//runs first before everything, and only runs one time

        System.out.println("Static Block 1");

    }

    static {

        System.out.println("Static Block 2");

    }

    static {

        System.out.println("Static Block 3");

    }


}
