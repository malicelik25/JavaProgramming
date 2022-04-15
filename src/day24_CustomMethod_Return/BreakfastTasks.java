package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("mali", "celik");
        System.out.println("---------------");
        domain("malicelik527@gmail.com");
        System.out.println("---------------");
        String[] emails = {"josh@gmail.com", "Jim@yhoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("--------------");
        nameOfMonth(10);
        System.out.println("--------------");
        nameOfDay(5);

    }

    //1. Create a method that can display the initials of the person.  initials()
    public static void initials(String firstName, String lastName) {
        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        initials = initials.toUpperCase();

        System.out.println("initials = " + initials);
    }

    //2. Create a method that can display the domain of the email.
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("domain = " + domain);
    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {

        String name = "";

        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ? "April"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                    : (number == 9) ? "September" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }

        System.out.println("Month name = " + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {

        String name = "";
        if (number > 0 && number <= 7) {
            name = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday"
                    : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            name = "Invalid number";
        }
        System.out.println("Day name = " + name);
    }

    //5. Create a method that can print how many days a month has


}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */