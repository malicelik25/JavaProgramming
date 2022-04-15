package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("Galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(987456321);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("---------------------------");

        samsung.call(911);
        samsung.text(321654987);
        samsung.freeze();

        System.out.println("--------------------------");

        nokia.call(321654987);
        nokia.text(213987654);
        nokia.selfDefence();

        System.out.println("------------------------");

        System.out.println(Phone.hasBattery);//we can call static variable through the method name
        System.out.println(Iphone.hasBattery);//we can call static variable through the method name
        System.out.println(Samsung.hasBattery);//we can call static variable through the method name
        System.out.println(Nokia.hasBattery);//we can call static variable through the method name


    }


}
