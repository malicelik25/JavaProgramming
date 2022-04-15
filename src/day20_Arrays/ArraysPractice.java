package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // store the elements: 10, 20, 50, 70
        int[] number = {10, 20, 50, 70}; // size : 4

        System.out.println(Arrays.toString(number));

        System.out.println("-----------------------------");
        //create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[0] = 50;
        scores[3] = 80;
        scores[1] = 60;
        scores[4] = 90;
        scores[2] = 70;


        System.out.println(Arrays.toString(scores)); // [50, 60, 70, 80, 90]


    }


}
