package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter true or false:");

        boolean result = input.nextBoolean();
        input.close();
*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name =scan.next();  // reads the until a space

        System.out.println("name = " + name); // Java
        scan.close();


    }

}
