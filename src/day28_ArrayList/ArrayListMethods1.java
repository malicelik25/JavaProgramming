package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {
//      Add method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//3
        numbers.add(40);//4
        numbers.add(50);//6
        numbers.add(60);//7

        numbers.add(2, 25);//going to shift to index 2
        numbers.add(5, 45);//going to shift to index 5
        System.out.println(numbers);

        //size method
        System.out.println(numbers.size());

        int lasIndex = numbers.size() - 1;

        System.out.println("lasIndex = " + lasIndex);

        System.out.println("-----------------------");

        //get method
        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("-----------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----------------------");


        //set method
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");// replace
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("-------------------");

        //remove method
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Hulya");
        employees.add("Ali");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(employees.size() - 1);

        //employees.remove(employees.indexOf("Ali")); // removes the given object from arraylist

        boolean r2 = employees.remove("Hulya");// removes the given object from arraylist


        System.out.println(employees);

        boolean r1 = employees.remove("Neira");

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


    }


}
