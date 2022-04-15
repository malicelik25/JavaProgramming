package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'F', 3, "Small", "White");

        System.out.println(dog1);

        dog1.bark();
        //dog1.scratch(); not in dog class

        Cat cat1 = new Cat("Love", "Siamese", 'F', 2, "Large", "Black");

        System.out.println(cat1);

        cat1.scratch();
        //cat1.bark(); not in cat class

        Parrot parrot1 = new Parrot("Evliya", "Sultan", 'F', 2, "Small", "Yellow");

        System.out.println(parrot1);

        parrot1.sing();
        //parrot1.bark(); not in parrot class

    }

}
