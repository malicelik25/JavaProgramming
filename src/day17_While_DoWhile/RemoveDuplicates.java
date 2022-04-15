package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if (result.contains(""+ch)) { //("") to make String because contains only used for String
                continue;
            }
            result += ch;
        }

        System.out.print(result);


    }


}
