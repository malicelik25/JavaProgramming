package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D.length - 1; i >= 0; i--) { // i: index number of 1D arrays starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) { // i: index number of elements starting from 0 to last index

                System.out.print(arr2D[i][j] + " ");


            }
            System.out.println();

        }

        System.out.println("--------------------------------");

        for (int a = 0; a < arr2D.length; a++) { // i: indexes of each 1D array started from 0

            for (int b = arr2D[a].length - 1; b >= 0; b--) { // j: indexes of each element starting from last index

                System.out.print(arr2D[a][b] + " ");

            }

            System.out.println();

        }

        System.out.println("-----------------------");

        for (int c = arr2D.length - 1; c >= 0; c--) {

            for (int d = arr2D[c].length - 1; d >= 0; d--) {

                System.out.print(arr2D[c][d] + " ");
            }

            System.out.println();

        }


    }


}
/*
task1:
9 10 11 12 13
4 5 6 7 8
1 2 3

task2:
3 2 1
8 7 6 5 4
13 12 11 10 9

task3:
13 12 11 10 9
8 7 6 5 4
3 2 1
 */