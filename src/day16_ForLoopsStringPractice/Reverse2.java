package day16_ForLoopsStringPractice;

public class Reverse2 {

    public static void main(String[] args) {

        String word = "Java Programming";
        String result = "";

        for (int i = word.length()-1; i >= 0; i--) {
            result += word.charAt(i);
        }

        System.out.println(result);


    }


}
