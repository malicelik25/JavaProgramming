package day03_EscapeSequences; // it is Package name of this class

import java.security.spec.RSAOtherPrimeInfo;

public class Println_VS_Print2 {

    public static void main(String[] args) { //main method

        System.out.println("Knock Knock"); //first it prints Knock Knock, then it appends a new line
        System.out.println("Who is this?");

        System.out.println("This is Java");

        System.out.println("----------------------");

        System.out.print("Knock Knock"); // prints Knock Knock, does not appends new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("------------------------");

        System.out.println("Hello everyone, how are you all today? Today we will learn escape Sequences and the next week we will learn Variables");

        System.out.println("--------------------------");

        System.out.print("Hello everyone, how are you all today? ");
        System.out.print("Today we will learn Escape Sequences ");
        System.out.print("and the next week we will learn Variables");

        System.out.println();


    }


}

/*
Topics:
println method
print method
Comments
 */