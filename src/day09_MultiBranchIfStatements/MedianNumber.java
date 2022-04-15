package day09_MultiBranchIfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10, b = 15, c = 20;


        //                     a=15, b= 10, c= 20    a= 15, c= 10, b= 20 (example)
        boolean aIsTheMedian = (a > b && a < c) || (a > c && a < b);
        /*
        in order for 'a' to be the median number
        1. if 'c' is the maximum number & 'b' is the minimum number, then 'a' is the median number
        2. if 'b' is the maximum number & 'c' is the minimum number, then 'a' is the median number
         */
        boolean bIsTheMedian = (b > a && b < c) || (b < a && b > c);
        boolean cIsTheMedian = !aIsTheMedian && !bIsTheMedian;     //(c > a && c < b) || (c < a && c > b);

        if (aIsTheMedian) { //if a is the median number
            System.out.println(a + " is the median number");
        }
        if (bIsTheMedian) { //if b is the median number
            System.out.println(b + " is the median number");
        }
        if (cIsTheMedian) { //if c is the median
            System.out.println(c + " is the median number");
        }

    }

}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */