package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println("--------------------------------");

        for (int a = 1; a <= 10; a++) { // print all even numbers 1--10 (skip the odd numbers)
            if (a % 2 == 1) { //1, 3, 5, 7, 9
                continue; //Skip
            }
            System.out.print(a + " ");
        }

        System.out.println("----------------------------");
        //print all odd numbers between 1--10 (skip the even numbers

        for (int b = 1; b <= 10; b++) {
            if (b % 2 == 0) {
                continue;
            }
            System.out.print(b + " ");
        }


    }

}
