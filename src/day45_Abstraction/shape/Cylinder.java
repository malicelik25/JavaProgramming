package day45_Abstraction.shape;

public class Cylinder extends Shape{

    private double radius;
    private int height;
    private final double pi = 3.14;

    public Cylinder(double radius, int height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
