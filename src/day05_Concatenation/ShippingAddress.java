package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {


       /* String name = "James King",                 //more USABLE
                buildingNumber = "11821B",          //more USABLE
                buildingName = "Jonas Branch Dr",    //more USABLE
                city = "McLean",                      //more USABLE
                zipCode = "22031A";                    //more USABLE

        */
        String name = "James King";
        String buildingNumber = "11821B";
        String streetName = "Jonas Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "22031A";


       /*System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" +
                     city + ", " + state + " " + zipCode);

       */


        String address = name + "\n" + buildingNumber + " " + streetName + "\n" +
                city + ", " + state + " " + zipCode;
        System.out.println(address);


    }


}
