package day06_PrimitiveTypeCasting;

public class ArithmeticOperator {

    public static void main(String[] args) {

        System.out.println("12" + 1); //121 Concatenation
        System.out.println(10 + 20); //30, Addition
        System.out.println(100 - 50); //50, subtraction
        System.out.println(10 * 6); //60, multiplication

                        /*
                        in math:
                            10/4 = 2.5

                         in java:
                         10/4 = 2
                         100/3 = 33

        %: Remainder
                         */

        System.out.println(100 / 3);  //33
        System.out.println(10.0 / 4);    //2.5
        System.out.println(10 / 4.0);  //2.5
        System.out.println(10d / 4);  //2.5

        int a = 100;
        double b = a / 6;  //16.0
        System.out.println(b); //16.0

        double c = (double) a / 6; //16.6666 or  a/6d;
        System.out.println(c);
        System.out.println(100D);


    }


}
/*
+: Addition
-: Subtract
*: Multiplication
/: Division




                              integer / integer----integer
                              decimal / integer----decimal
                              integer / decimal----decimal
                              decimal / decimal----decimal
 */
