package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        System.out.println(set);

        //Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>(set);// changing set to list

        System.out.println(list);

        //List<String> names = null;

        //System.out.println(names.size()); NullPointerException


        System.out.println("--------------------------------------------");

        //pop();==> LIFO 'Stack'

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars);

        ((Stack<Character>) chars).pop();//it is not a list method that's why we casted. It is only for Stack

        System.out.println("chars = " + chars);


        //poll();==> FIFO 'Any Queue'

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);


    }


}
