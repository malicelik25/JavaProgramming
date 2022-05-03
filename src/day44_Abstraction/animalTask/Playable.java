package day44_Abstraction.animalTask;

public interface Playable {

    static boolean isFriendly = true; // static is the only variable that we can use( we do not have to give 'static'
    //static and final by default

    /*
    public static void method1(){ // we can call the static variable only
        System.out.println(isFriendly);
    }

     */

    public abstract void play(); //public is the only one access modifier we can give in the interface,
    // abstract method only the method we can give, that's why it gives gray(we do not have to use 'public and abstract'



}
