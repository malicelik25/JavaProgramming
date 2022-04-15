package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] classMates = {"Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik", "Mali Celik"};

        for (String each : classMates) {
            String initial = each.charAt(0) + "" + each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);
        }


    }


}
