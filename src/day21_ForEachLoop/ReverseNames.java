package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] classMates = {"Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik"};

        for (String each : classMates) { // each: "Mali Celik", "Mali Celik, ...

            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            System.out.println(reverse);
        }


    }


}
