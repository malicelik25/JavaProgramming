package day20_Arrays;

import java.util.Arrays;

public class ArraysPracticeMonths {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(Arrays.toString(months));

        System.out.println("------------------------------------------");

        int number = 7;

        if (number < 1 || number > 12) {
            System.err.println("Invalid number");
        }
        for (int i = 0; i < months.length; i++) { //i: represents the index numbers of array starting from 0
            System.out.println(months[i]);
        }

        System.out.println("------------------------------");

        for (int i = months.length - 1; i >= 0; i--) { //i: represents the index numbers of array starting from last index
            System.out.println(months[i]);
        }


    }


}
