package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        // find the max number between 100 & 200
        int max = maxNumber(100, 200);

        System.out.println(max);


        // multiply the max number by 2
        int multiplication = max * 2;
        System.out.println(multiplication);


    }

    public static int maxNumber(int num1, int num2) {

        int result = 0;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;

    }


}
