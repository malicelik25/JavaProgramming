package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firsName = "cyDEo";
        String lastName = "SCHOOL";

        firsName = firsName.substring(0, 1).toUpperCase() + firsName.substring(1).toLowerCase();
        //                  C               +       ydeo ==>    "Cydeo"

        //  firsName = (""+ firsName.charAt(0) ).toUpperCase() + firsName.substring(1).toLowerCase();
        //                 "C"                                  + "ydeo"   ==> Cydeo


        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firsName);
        System.out.println(lastName);

        String fullName = firsName + " " + lastName;

        System.out.println(fullName);

    }

}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */