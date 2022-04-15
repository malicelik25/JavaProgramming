package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Ali";
        String lastName = "Celik";
        int age = 29;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // Full name of the person is ---------
        System.out.println("Full name of the person is "+ fullName+ ".");

        //--- is --- years old.
        System.out.println(fullName + " is " + age + " years old.");

        //Fullname is JobTitle, works at companyName
        System.out.println(fullName + " is " + jobTitle + " works at "+ companyName + ", " + fullName + "' salary is " + salary);



    }



}
