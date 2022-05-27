package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {

    public static void main(String[] args) {

        //create a function that cab check if the integer is an array of integer, return boolean

        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if (each == b) {
                    result = true;
                    break;
                }
            }

            return result;
        };

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean r1 = contains.test(arr, 11);

        System.out.println(r1);


        System.out.println("----------------------------------");
        // create a function that can check if two string are anagram

        //                                 a=bac, b=cab
        BiPredicate<String, String> anagram = (a, b) -> {
            String[] arr1 = a.split("");//[b, a, c]
            String[] arr2 = b.split("");//[c, a, b]
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println("----------------------------------");
        // create a function that can print the given string for given numbers of times
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (Integer i = 0; i < n; i++) {
                System.out.println(s);
            }
        };

        printMultipleTimes.accept("Java", 5);

        System.out.println("----------------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : " + v);
        }

         */

        scrumTeam1.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("--------------------------------------------");

        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> {
            return a > b ? a : b;
        };

        int max = maxNum.apply(100, 200);

        System.out.println(max);

        //2. create a function that can merge two integer arrays into a list

        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : x) {
                result.add(each);
            }

            for (int each : y) {
                result.add(each);
            }

            return result;
        };

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};

        List<Integer> nums = merge.apply(arr1, arr2);
        System.out.println(nums);

    }

}
