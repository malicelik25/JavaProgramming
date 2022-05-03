package day45_Abstraction.shape;

public class Cube extends Shape{

    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0){
            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side * side;
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }
}
