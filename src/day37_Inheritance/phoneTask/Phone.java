package day37_Inheritance.phoneTask;

public class Phone {// parent class: only contains the common features of all the sub class

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery = true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    //static {
        //hasBattery = true;
    //}//not always mandatory. the best time to use if your variable needs several steps to set it.

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
