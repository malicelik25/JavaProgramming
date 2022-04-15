package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85;
        boolean a = score >= 90 && score <= 100;   //false
        boolean b = score >= 80 && score <= 89;   //true   //   boolean b = score >=80 && !a <=89; another way
        boolean c = score >= 70 && score <= 79;  //false  //  boolean c = !a && !b score >=70;
        boolean d = score >= 60 && score <= 69; //false  // boolean e = !a && !b && !c score >=60
        boolean f = score >= 0 && score <= 59; //false  // boolean e = !a && !b && !c && !d score >= 0;

        if (a) {      //if the student made an A
            System.out.println("Excellent");
        }

        if (b) {    //if the student made aB
            System.out.println("Great");
        }

        if (c) {   //if the student made a C
            System.out.println("Good");
        }

        if (d) {  //if the student made a D
            System.out.println("Passed");
        }

        if (f) {   //if the student made F
            System.out.println("Failed");
        }


    }

}
/*

   90 --- 100 ==> Excellent
   80 --- 89 ==> Great
   70 --- 79 ==> Good
   60 --- 69 ==> Passed
   0 --- 59 ==> Failed

 */