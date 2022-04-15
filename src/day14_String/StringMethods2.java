package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");// "Python is fun, I love learning Python"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";

        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace("Python", "").replace("   ", " ");
        //we deleted the spaces as well
        System.out.println("sentence = " + sentence);  // "Java Java C# C# C++ C++"

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java"); //C# is fun, Java is cool
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");// "jeve
        System.out.println("s3 = " + s3);

        System.out.println("------------------------------------");

        String result1 = "Java Java Java";
        result1 = result1.replaceFirst("Java", "Python"); // Python Java Java
        System.out.println("result1 = " + result1);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo"); //"Javo"
        System.out.println("result3 = " + result3);


    }


}
