package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //               bca
        //               235

        String[] arr = str.split("");//split() method turns the string to array
        // Collections.frequency()

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {// each: characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }

        System.out.println(result);


    }


}
/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */