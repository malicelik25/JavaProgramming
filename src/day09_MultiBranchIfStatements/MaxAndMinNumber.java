package day09_MultiBranchIfStatements;

public class MaxAndMinNumber {

    public static void main(String[] args) {

        int a = 15;
        int b = 20;

        boolean aIsMax = a > b;
        boolean bIsMax = b > a;

        if (aIsMax) {
            System.out.println(a + " is the maximum number");
        } else {
            System.out.println(b + " is the maximum number");
        }


        System.out.println("--------------------------");


        int c = 10;
        int d = 9;

        if (c < d) {
            System.out.println(c + " is the minimum number");
        } else {
            System.out.println(d + " is the minimum number");
        }


    }


}
