package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);


        for (Integer each : list) {

            int frequency = 0;
            for (Integer element : list) {
                if (element == each) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                frequency++;
                System.out.println(each);
                break;
            }
        }


    }

}
