package day44_Abstraction.animalTask;

public final class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats deer");

    }

    @Override
    public void hunt() { // public is the only access modifier we can give when we override interface
        System.out.println(getName() + " hunts deer");
    }
}
