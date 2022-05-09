package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        // WebDriver driver = (WebDriver) new ChromeDriver();

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //Dog dog = (Dog)animal; // downcasting
        //dog.bark();

        System.out.println(animal.getName());
        //System.out.println(dog.getName());

        //animal.bark();
        ((Dog) animal).bark(); // downcasting


        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());


        System.out.println("-------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        //cat.Meow();

        ((Cat) animal2).Meow();

        //((Dog)animal2).bark();//ClassCastException if we do not have IS A relationship

        System.out.println("------------------------------------");

        Employee employee = new Tester("Ali", 29, 'M', 100, "SDET", 50000);

        ((Tester) employee).bugReport();

        //((Tester)employee).unitTest(); There is no IS A relation

        //((Developer)employee).unitTest();//Does not work because object type is 'Tester'//It will give us 'ClassCastException'

        //Driver driver = (Driver) employee; // Line 1
        Person person = (Person) employee; // Line 2
        //Teacher teacher = (Teacher) employee; //Line 3

        System.out.println("-------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
        //s1.volume();//not every shape has volume. We do not have volume method in Circle

        //((Cube) s1).volume();//There is IS A relationship between Cube and volume interface but there is no IS A relationship between Circle(Object type) and Cube

    }

}
