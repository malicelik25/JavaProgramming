package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;//if we do not use constructor we will get compile error
    final static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        //pi = 4.14; final variables can not be reassigned
        //pi = 5.4;

        final String name;

        name = "Java";

        //name = "Wooden Spoon"; it can only be initialize one time

        System.out.println(name);

        System.out.println("--------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthDay = "June/01";// final variable can not be reassigned
        System.out.println(obj.birthDay);

        System.out.println("---------------------------");

        //FinalVariable.name = "Python";//if static variable is not 'final' we can always reassign
        System.out.println(FinalVariable.name);

    }


}
