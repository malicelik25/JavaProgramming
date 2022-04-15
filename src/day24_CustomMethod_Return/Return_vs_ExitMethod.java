package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {
        nameOfMonth(50);

        System.out.println("Hello World");
    }

    public static void nameOfMonth(int number) {

        String name = "";

        if (number < 1 || number > 12) {// if number is invalid
            System.out.println("Invalid");
            return; // exits nameOfMonth method(we are not using the 'return' only for return method. It is not returning the value here)
        }
        name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ? "April"
                : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                : (number == 9) ? "September" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";


        System.out.println("Month name = " + name);
    }



}
