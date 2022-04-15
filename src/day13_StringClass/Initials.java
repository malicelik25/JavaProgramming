package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your firs name");
        String firsName = scan.next(); //Java

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firsName.charAt(0);
        char l = lastName.charAt(0);

        String initial = f + "." + l;

        System.out.println("initial = " + initial);


    }

}
