package day38_Inheritance.carTask;

public class Toyota extends Car {


    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }


    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

    //@Override//if it is compiler error then it is not override(right click generate and override)shortcut
    public void start(){
        System.out.println("Twist the key to ignition to start " + brand + " " + model);
    }

}
