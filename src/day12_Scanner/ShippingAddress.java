package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        String building = input.next();

        input.nextLine();

        System.out.println("Enter your street name:");
        String street = input.nextLine();

        System.out.println("Enter your city name:");
        String city = input.nextLine();

        System.out.println("Enter your state name:");
        String state = input.next();
                                                            // no need to use (input.nextLine) between the same (input.next)
        System.out.println("Enter your zip code:");        // we only use (nextLine) method after the other method
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country name:");
        String countryName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("countryName = " + countryName);


    }

}
/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
4. Enter your State ( next() )
6. Enter your zip code ( next() )

Display the shipping address

 */