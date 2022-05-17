package day50_Collections_Map;

import java.util.*;

public class IterablePractice2_Interview {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercan", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulia", "Christina"));

        //remove all the names "ahmed"

        names.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println("names = " + names);

        System.out.println("-------------------------------------------");

        /*
        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);
         *///with while loop

        /*
        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        for(Iterator<String> i=names2.iterator(); i.hasNext() ;  ){
            if(i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }


        System.out.println(names2);
         *///with for loop

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 100, 90, 89, 79, 50));

        Iterator<Integer> q = set.iterator();

        while (q.hasNext()) {
            if (q.next() % 2 == 0) {
                q.remove();
            }
        }

        System.out.println("set = " + set);


    }


}
