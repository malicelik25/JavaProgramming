package day06_PrimitiveTypeCasting;
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "Ali"
			 		birthDay = 15
			 	    birthMonth = "January"
			 	    birthYear = 1993;

			 	output:
			 		Ali was born on April/25/1995.

 */
public class BirthDay {

    public static void main(String[] args) {

        String name ="Ali";
        int birthDay =15;
        String birthMonth ="January";
        int birthYear =1993;

        //name was born on month/day/year.

        System.out.println(name + " was born on " + birthMonth + "/" + birthDay +
                "/" + birthYear + ".");

        System.out.println("-------------------------------------------");

        //My favorite book is "bookName"

        String bookName = "Harry Potter";

        System.out.println("My favorite book is " + "\"" + bookName + "\"" );




    }



}
