package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);
/*
        char tenthChar = word.charAt(2);

        System.out.println("tenthChar = " + tenthChar);
*/


        System.out.println("-------------------------");

        String s1 = "Batch 25 is the best batch";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);  //total number of character

        char lastChar = s1.charAt(s1.length() - 1);

        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();  //"WOODEN SPOON"

        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);

    }


}
