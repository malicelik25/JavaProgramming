package day44_Abstraction.animalTask;

public final class Cat extends Animal{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats cat food");
    }

    public void Meow(){
        System.out.println(getName() + " is meowing");
    }
}
