package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("----------------");

        String s1 = "Cydeo School";

        s1 = StringUtility.reverse(s1);
        System.out.println(s1);

        System.out.println("---------------");

        String word = "Civic";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println(palindrome);

        System.out.println("--------------");

        String[] names = {"Anna", "Java", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("-----------------");

        String s2 = "aaaaabbbbbbccccddddd";

        String nonDup = StringUtility.removeDuplicate(s2);

        System.out.println(nonDup);

    }

}
