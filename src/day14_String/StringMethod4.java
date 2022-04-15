package day14_String;

public class StringMethod4 {

    public static void main(String[] args) {

        String str = "Cydeo";

        str = str.repeat(4); //"CydeoCydeoCydeoCydeo"

        System.out.println(str);

        String s1 = "Wooden Spoon ";
        s1 = s1.repeat(100);
        System.out.println(s1);

        System.out.println("---------------------------");

        System.out.println("FADY\n".repeat(15)); //FADY
                                                //FADY...

        System.out.println("--------------------------");

        String name = "Java";

        System.out.println((name + " ").repeat(5));


    }


}
