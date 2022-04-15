package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Mercedes", "AMG", "Red", 2020, 100000);

        System.out.println(car1);


        Car car2 = new Car();

        car2.setInfo("Toyota", "Camry", "Black", 2021, 35000);

        System.out.println(car2);


        Car car3 = new Car();

        car3.setInfo("BMW", "335is", "Blue", 2020, 45000);

        System.out.println(car3);


        //    Car[] cars = {car1, car2, car3};

        ArrayList<Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : cars) {
            System.out.println(each.brand + " : " + each.price);
        }


        System.out.println("-----------------------");

        /*
        BMW: 2005 ~ 2008
        Toyota: 1995 ~ 1997
         */

        cars.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        cars.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);


    }


}
