package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        //distinct()
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6));
        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);

        System.out.println("------------------------------");

        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        System.out.println("------------------------------");


        //skip()
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list1 = list1.stream().skip(5).collect(Collectors.toList());

        System.out.println(list1);

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        nums = Arrays.stream(nums).skip(4).toArray();

        System.out.println(Arrays.toString(nums));


        System.out.println("------------------------------");


        //limit()
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list2 = list2.stream().limit(7).skip(3).collect(Collectors.toList());//we skipped first 3 and limitted 7

        System.out.println(list2);

        System.out.println("------------------------------");


        //map()
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list3 = list3.stream().map(p -> p * 10).collect(Collectors.toList());

        System.out.println(list3);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        days = days.stream().map(p -> p.substring(0, 3)).collect(Collectors.toList());

        System.out.println(days);

        System.out.println("------------------------------");


        //filter()
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> evens = list4.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());

        System.out.println(evens);

        System.out.println("------------------------------");

        //count()
        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long countJava = names.stream().filter(p -> p.equalsIgnoreCase("java")).count();

        System.out.println(countJava);

        System.out.println("------------------------------");


        //forEach()
        names.stream().filter(p -> p.equalsIgnoreCase("java")).forEach(p -> System.out.println(p));


        System.out.println("------------------------------");


        //allMatch(), anyMatch(), nonMatch()
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        boolean r1 = list5.stream().allMatch(p -> p % 2 == 0);//not all numbers can be divide by 2

        System.out.println(r1);

        boolean r2 = list5.stream().anyMatch(p -> p > 20);

        System.out.println(r2);

        boolean r3 = list5.stream().noneMatch(p -> p % 3 == 0);

        System.out.println(r3);

    }

}
