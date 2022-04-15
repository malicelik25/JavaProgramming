package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte num1 = (byte) averageScore; //explicit casting: larger type to small type(manually)
        short num2 = (short) averageScore; //explicit casting: larger type to small type(manually)
        int num3 = (int) averageScore; //explicit casting: larger type to small type(manually)
        float num4 = averageScore; //no casting
        double num5 = averageScore; //implicit casting
        long num6 = (long) averageScore;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }


}
