package day11_Switch_Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        int number = 5;
        String result = "";
        if (number >= 0 && number <= 9) {

            if (number == 0) {
                result = "Zero";
            } else if (number == 1) {
                result = "One";
            } else if (number == 2) {
                result = "Two";
            } else if (number == 3) {
                result = "Three";
            } else if (number == 4) {
                result = "Four";
            } else if (number == 5) {
                result = "Five";
            } else if (number == 6) {
                result = "Six";
            } else if (number == 7) {
                result = "Seven";
            } else if (number == 8) {
                result = "Eight";
            } else {
                result = "Nine";
            }


        } else {
            result = "Invalid Number";
        }

        System.out.println(result);

        System.out.println("-----------------------------");

        //with Ternaries solution

        String result1 = (number >= 0 && number <= 9) ?
                (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two" : (number == 3) ? "Three"
                        : (number == 4) ? "Four" : (number == 5) ? "Five" : (number == 6) ? "Six" : (number == 7) ?
                        "Seven" : (number == 8) ? "Eight" : "Nine" : "Invalid Number";

        System.out.println(result1);

    }


}
